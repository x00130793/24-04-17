package controllers;

import controllers.security.CheckIfWarehouse;
import controllers.security.Secured;
import play.data.*;
import play.db.ebean.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import play.api.Environment;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import play.mvc.Http.*;

//Time formating 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//J.T.-------------------------------------------------------------------------------------------------------------------------------------------------------
import views.html.warehousePages.*;
import models.*;
import models.users.Warehouse;
import models.users.User;
import models.shopping.*;
import models.productsAdditions.*;

// Require Login
@Security.Authenticated(Secured.class)
// Authorise user (check if warehouse)
@With(CheckIfWarehouse.class)
public class WarehouseController extends Controller {

    // Declare a private FormFactory instance
    private FormFactory formFactory;
    private Environment env;

    //  Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public WarehouseController(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    // Method returns the logged in user (or null)
    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }

    private String getEmailFromSession(){
        return getUserFromSession().getEmail();
    }

    private Warehouse getWarehouseFromSession(){
        return (Warehouse) getUserFromSession();
    }

    

    public Result ordersW() {
        List<ShopOrder> ord = ShopOrder.findByWarehouse(getEmailFromSession());

        return ok(ordersW.render(getUserFromSession(), ord));
    }

    public Result orderDetails(Long id){
        List<OrderItem> oList = OrderItem.findOrderItems(id);
        ShopOrder order = ShopOrder.find.byId(id);
        
        return ok(orderDetails.render(getUserFromSession(), oList, order));
    }


    public Result cancelOrder(Long id){
        ShopOrder.find.ref(id).delete();
        flash("Order has been cancelled");
        List<ShopOrder> ord = ShopOrder.findAll();

       return redirect(routes.WarehouseController.ordersW());
    }

    @Transactional
    public Result updateStatus(Long id){
        List<ShopOrder> ord = ShopOrder.findAll();
        String status = "delivered";
        ShopOrder o = ShopOrder.find.byId(id);
        o.setStatus(status);
        DateFormat day = new SimpleDateFormat("dd/MM/yyyy HH:mm a");
        String deliveryDate = day.format(new Date()).toString();
        o.setDeliveryDate(deliveryDate);
        o.update();
        
        return redirect(routes.WarehouseController.ordersW());
    }


    public Result products(Long cat) {
        
        List<Category> categories = Category.find.where().orderBy("name asc").findList();
        List<Product> productsList = new ArrayList<Product>();

        if (cat == 0) {
            productsList = Product.findAll("");
        }
        else {
            productsList = Category.find.ref(cat).getProducts();
        }
        List<ProductWarehouse> pW = new ArrayList<ProductWarehouse>();;
        for(int i = 0; i < productsList.size(); i++){
            pW.add(ProductWarehouse.findWarehouseProduct(session().get("email"), productsList.get(i).getId()));
        }
        

        return ok(products.render(env, categories, productsList, getUserFromSession(), pW, getWarehouseFromSession()));
    }

    public Result supplyWarehouse(Long id) {
        
        ProductWarehouse pw = ProductWarehouse.find.byId(id);
        List<Warehouse> wList = Warehouse.findNotMain();

        Form<Factory> f1 = formFactory.form(Factory.class);

        List<String> tmp = new ArrayList();
        for(int i = 0; i < wList.size(); i++){
            tmp.add(wList.get(i).getfName());
        }
        


        return ok(supplyWarehouse.render(getUserFromSession(), id, wList, tmp, f1));
    }


    @Transactional
    public Result supplyWarehouseSubmit(Long id) {

        //if has error return----
        List<Warehouse> wList = Warehouse.findNotMain();
            List<String> tmp = new ArrayList();
            Form<Factory> f = formFactory.form(Factory.class);
            for(int i = 0; i < wList.size(); i++){
            tmp.add(wList.get(i).getfName());
            }
        //-----------------------

        Form<Factory> f1 = formFactory.form(Factory.class).bindFromRequest();
        Factory c1 = f1.get();

        if(f1.hasErrors()) {
            flash("fail", "Something went wrong, try again");
            return badRequest(supplyWarehouse.render(getUserFromSession(), id, wList, tmp, f));
        }

        ProductWarehouse pWMain = ProductWarehouse.findWarehouseProduct(getWarehouseFromSession().getEmail(), id);
        if(c1.getIntFormat() > pWMain.getStock()){
            flash("fail", "You dont have that much stock");
            return badRequest(supplyWarehouse.render(getUserFromSession(), id, wList, tmp, f));
        } 
        if(c1.getIntFormat() < 0){
            flash("fail", "You cant assign negative stock to warehouse");
            return badRequest(supplyWarehouse.render(getUserFromSession(), id, wList, tmp, f));
        }

        Warehouse w = Warehouse.findByName(c1.getStrFormat1());
        ProductWarehouse p = ProductWarehouse.findWarehouseProduct(w.getEmail(), id);
        p.setStock(c1.getIntFormat());
        p.update();

        //Update main warehouse
        Warehouse wMain = Warehouse.findMain();
        p = ProductWarehouse.findWarehouseProduct(wMain.getEmail(), id);
        p.setStock(p.getStock() - c1.getIntFormat());
        p.update();
         

        return redirect(routes.WarehouseController.products(0));
    }
//J.T. end---------------------------------------------------------------------------------------------------------------------------


    

        

}
