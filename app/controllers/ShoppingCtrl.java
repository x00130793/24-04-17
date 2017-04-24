package controllers;



import play.data.*;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.With;
import views.html.*;
import views.html.customer.*;
import views.html.customer.profileFiles.*;
import controllers.security.*;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.List;
//J.T.----------------------------------------------------------------------------------------------------------------------------------

// Import models
import models.users.*;
import models.*;
import models.shopping.*;
import models.productsAdditions.*;

// Import security controllers
@Security.Authenticated(Secured.class)
@With(CheckIfCustomer.class)
public class ShoppingCtrl extends Controller {

    private FormFactory formFactory;


    //  Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public ShoppingCtrl(FormFactory f) {
        this.formFactory = f;
    }

    List<Category> categoriesList = Category.findAll();

    // Get a user - if logged in email will be set in the session
    private User getCurrentUser() {
        return User.getUserById(session().get("email"));
    }

    private Customer getCurrentCustomer() {
        return (Customer)User.getUserById(session().get("email"));
    }

    @Transactional
    public Result showBasket(Long cat, String filters){

        return ok(basket.render(getCurrentCustomer(), User.getUserById(session().get("email")), categoriesList, cat, filters) );
    }

@Transactional
    public Result addToBasket(Long id, Long cat, String filters) {
        
        // Find the product
        Product p = Product.find.byId(id);
        
        // Get basket for logged in customer
        Customer customer = (Customer)User.getUserById(session().get("email"));
        
        // Check if item in basket
        if (customer.getBasket() == null) {
            // If no basket, create one
            customer.setBasket(new Basket());
            customer.getBasket().setCustomer(customer);
            customer.update();
        }
        // Add product to the basket and save
        customer.getBasket().addProduct(p);
        customer.update();
        
         
        // Show the basket contents     
        return ok(basket.render(customer, User.getUserById(session().get("email")), categoriesList, cat, filters));
    }

      // Add an item to the basket
    @Transactional
    public Result addOne(Long itemId, Long cat, String filters) {
        
        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);
        // Increment quantity
        item.increaseQty();
        // Save
        item.update();
        // Show updated basket
        return redirect(routes.ShoppingCtrl.showBasket(cat, filters));
    }

    @Transactional
    public Result removeOne(Long itemId, Long cat, String filters) {
        
        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);
        // Get user
        Customer c = getCurrentCustomer();
        // Call basket remove item method
        c.getBasket().removeItem(item);
        c.getBasket().update();
        // back to basket
        return ok(basket.render(c, User.getUserById(session().get("email")), categoriesList, cat, filters));
    }

    public Result placeOrder(Long cat, String filters){


        Customer c = getCurrentCustomer();
        User u = getCurrentUser();
        // Create an order instance
        ShopOrder order = new ShopOrder();


        
        

        
        
        // Associate order with customer
        order.setCustomer(c);

        //Set customer details
        order.setName(u.getfName() +" "+ u.getlName());
        order.setStreet1(c.getStreet1());
        order.setStreet2(c.getStreet2());
        order.setTown(c.getTown());
        order.setPostCode(c.getPostCode());
        order.setCountry(c.getCountry());

        // copy the basket to order
       order.setItems(c.getBasket().getBasketItems());
       

      // Save the order now to generate a new id for this order
        order.save();
        
        // Move items from basket to order
        for(OrderItem i: order.getItems()){
            // Associate with order
            i.setOrder(order);
            
            // Remove from basket
            i.setBasket(null);
            
            // update item
            i.updateProductStock();
            i.update();

        }

        // Update the order
        order.update();

        // Clear and update the shopping basket
        c.getBasket().setBasketItems(null);
        c.getBasket().update();

        //Assigns the right warehouse
        List<Warehouse> wAll = Warehouse.findNotMain();
        List<OrderItem> oList = OrderItem.findOrderItems(order.getId());
        boolean hasMatch = false;
        int matchCounter = 0;
        //Loop looks for warehouse and orders country match
        for(int i = 0; i < wAll.size(); i++){
            matchCounter = 0;
            if(wAll.get(i).getCountry() == order.getCountry()){
                //Loop checks if the match has enough products in stock to do the order. if yes match counter will increase by one
                for(int j = 0; j < oList.size(); j++){
                    ProductWarehouse pW = ProductWarehouse.findWarehouseProduct(wAll.get(i).getEmail(), oList.get(j).getProduct().getId());
                    if(pW.getStock() >= oList.get(j).getQuantity()){
                        matchCounter++;
                    }
                }
                //Checks if all products have match
                if(matchCounter == oList.size()){
                    hasMatch = true;
                    order.setWarehouse(wAll.get(i));
                    order.update();
                    //Updates stock in warehouse
                    for(int j = 0; j < oList.size(); j++){
                    ProductWarehouse pW = ProductWarehouse.findWarehouseProduct(wAll.get(i).getEmail(), oList.get(j).getProduct().getId());
                        pW.setStock(pW.getStock() - oList.get(j).getQuantity());
                        pW.update();
                    }
                    
                }                               
            } 
        }

        //If other warehouses cant make an order than main warehouse will handle it
        if(hasMatch == false){           
            Warehouse w = Warehouse.findMain();
            //Checks if main warehouse has enouth products to make an order
            for(int i = 0; i < oList.size(); i++){
                ProductWarehouse pW = ProductWarehouse.findWarehouseProduct(w.getEmail(), oList.get(i).getProduct().getId());
                //If it dosent have it it adds it from other warehouses
                if(pW.getStock() <= oList.get(i).getQuantity()){
                    for(int j = 0; j < wAll.size(); j++){
                        //It stops adding if it has enough stock
                        if(pW.getStock() <= oList.get(i).getQuantity()){
                        ProductWarehouse pWnonMain = ProductWarehouse.findWarehouseProduct(wAll.get(j).getEmail(), oList.get(i).getProduct().getId());
                        pW.setStock(pW.getStock() + pWnonMain.getStock());
                        pW.update();
                        pWnonMain.setStock(0);
                        pWnonMain.update();
                        }
                    }
                } 
                pW.setStock(pW.getStock() - oList.get(i).getQuantity());
                pW.update();
                
            }
            order.setWarehouse(w);
            order.update();
        }

        // Show order confirmed view Order
        return ok(orderConfirmed.render(c, User.getUserById(session().get("email")), categoriesList, order, cat, filters));
    }

    // Empty Basket
    @Transactional
    public Result emptyBasket(Long cat, String filters) {
        
        Customer c = getCurrentCustomer();
        c.getBasket().removeAllItems();
        c.getBasket().update();
        
        return ok(basket.render(c, User.getUserById(session().get("email")), categoriesList, cat, filters));
         
    }


    
    // View an individual order
    @Transactional
    public Result viewOrder(long id, Long cat, String filters) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render(getCurrentCustomer(), User.getUserById(session().get("email")), categoriesList, order, cat, filters));
    }


    public Result payment(Long cat, String filter){

        Form<Factory> c1 = formFactory.form(Factory.class);

        return ok(payment.render(getCurrentCustomer(), User.getUserById(session().get("email")), categoriesList, cat, filter, c1));
    }
    
    public Result paymentSubmit(Long cat, String filter) {
        Form<Factory> s1 = formFactory.form(Factory.class).bindFromRequest();
        Factory c1 = s1.get();
        
        // Customer c = (Customer) u;
        Customer currentC = getCurrentCustomer();
        currentC.setStreet1(c1.getStrFormat1());
        currentC.setStreet2(c1.getStrFormat2());
        currentC.setTown(c1.getStrFormat3());
        currentC.setPostCode(c1.getStrFormat4());
        currentC.setCountry(c1.getStrFormat5());
        currentC.update();
        

        return redirect(controllers.routes.ShoppingCtrl.placeOrder(cat, filter));
    }
//J.T. end---------------------------------------------------------------------------------------------------------------------------
}
