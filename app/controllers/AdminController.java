package controllers;

import controllers.security.AuthAdmin;
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
import play.mvc.Http.MultipartFormData.*;
import play.mvc.Http.MultipartFormData.FilePart;
// File upload and image editing dependencies
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

//Time formating 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.File;
import javax.inject.Inject;
import play.Logger;

import views.html.admin.*;
import views.html.admin.indexSlider.*;
import views.html.admin.warehouse.*;
import models.*;
import models.users.Warehouse;
import models.users.User;
import models.shopping.*;
import models.productsAdditions.*;

// Require Login
@Security.Authenticated(Secured.class)
// Authorise user (check if admin)
@With(AuthAdmin.class)
public class AdminController extends Controller {
//J.T.----------------------------------------------------------------------------------------------------------------------------------------------------------
    // Declare a private FormFactory instance
    private FormFactory formFactory;

    private Environment env;

    //  Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public AdminController(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    // Method returns the logged in user (or null)
    private User getUserFromSession() {
        return User.getUserById(session().get("email"));
    }

    public Result orders() {
        List<Product> productsList = Product.findAll("");
        List<ShopOrder> ord = ShopOrder.findAll();

        return ok(orders.render(env, productsList, getUserFromSession(), ord));
    }


    public Result cancelOrder(Long id){
        List<Product> productsList = Product.findAll("");
        ShopOrder.find.ref(id).delete();
        flash("Order has been cancelled");
        List<ShopOrder> ord = ShopOrder.findAll();

       return ok(orders.render(env, productsList, getUserFromSession(), ord));
    }
    @Transactional
    public Result updateStatus(Long id){
        List<Product> productsList = Product.findAll("");
        List<ShopOrder> ord = ShopOrder.findAll();
        String status = "delivered";
        ShopOrder o = ShopOrder.find.byId(id);
        o.setStatus(status);
        DateFormat day = new SimpleDateFormat("dd/MM/yyyy HH:mm a");
        String deliveryDate = day.format(new Date()).toString();
        o.setDeliveryDate(deliveryDate);
        o.update();
        
        return ok(orders.render(env, productsList, getUserFromSession(), ord));
    }


    public Result products(Long cat) {

        // Get list of all categories in ascending order
        List<Category> categories = Category.find.where().orderBy("name asc").findList();
        List<Product> productsList = new ArrayList<Product>();

        if (cat == 0) {
            // Get list of all categories in ascending order
            productsList = Product.findAll("");
        }
        else {
            // Get products for selected category
            // Find category first then extract products for that cat.
            productsList = Category.find.ref(cat).getProducts();
        }

        return ok(products.render(env, categories, productsList, getUserFromSession()));
    }

    // Render and return  the add new product page
    // The page will load and display an empty add product form
    
    public Result addProduct() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Product> addProductForm = formFactory.form(Product.class);
        Form<Factory> sizes = formFactory.form(Factory.class);

        // Render the Add Product View, passing the form object
        return ok(addProduct.render(addProductForm, getUserFromSession(), sizes));
    }

    @Transactional
    public Result addProductSubmit() {

        String saveImageMsg;

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();
        Form<Factory> sizes = formFactory.form(Factory.class).bindFromRequest();


        // Check for errors (based on Product class annotations)
        if(newProductForm.hasErrors()) {
            // Display the form again
            return badRequest(addProduct.render(newProductForm, getUserFromSession(), sizes));
        }

        if((newProductForm.get().getStock() < 0) || (newProductForm.get().getPrice() < 0)) {
            flash("fail", "Stock and price cannot be smaller than 0");
            // Display the form again
            return badRequest(addProduct.render(newProductForm, getUserFromSession(), sizes));
        }

        Warehouse w = Warehouse.findMain();
        if(w == null){
            flash("fail", "Cant add product if there is no main warehouse avilable");
            return redirect(routes.AdminController.warehouses1());
        }

        Product newProduct = newProductForm.get();

        // Save product now to set id (needed to update manytomany)
        newProduct.save();

        // Get category ids (checked boxes from form)
        // Find category objects and set categories list for this product
        for (Long cat : newProduct.getCatSelect()) {
            newProduct.getCategories().add(Category.find.byId(cat));
        }

        // Update the new Product to save categories
        newProduct.update();
        //Save new like
        Plike l = new Plike();
        l.setProduct(newProduct);
        newProduct.setPlike(l);
        newProduct.update();
        l.save();

        //Save this product to all warehouses
        List<Warehouse> wList = Warehouse.findAllWarehouses();
        for(int i = 0; i < wList.size(); i++){
            ProductWarehouse pW = new ProductWarehouse();
            pW.setWarehouse(wList.get(i));
            pW.setProduct(newProduct);
            pW.save();
        }

        //Save stock to main warehouse
        Warehouse main1 = Warehouse.findMain();
        ProductWarehouse forStock = ProductWarehouse.findWarehouseProduct(main1.getEmail(), newProduct.getId());
        forStock.setStock(newProduct.getStock());
        forStock.update();


        
        // Get image data
        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");

        // Save the image file
        saveImageMsg = saveFile(newProduct.getId(), image);

        // Set a success message in temporary flash
        flash("success", "Product " + newProduct.getName() + " has been created" + " " + saveImageMsg);
//end----------------------------------------------------------------------------------------------------------------------------------------------------------
//A.S.----------------------------------------------------------------------------------------------------------------------------------------------------------
        Factory str = sizes.get();

        if(str.getStrFormat1() != null){
            Size s = new Size();
            s.setProduct(newProduct);
            s.setSizeName(str.getStrFormat1());
            s.save();
        }
        if(str.getStrFormat2() != null){
            Size s = new Size();
            s.setProduct(newProduct);
            s.setSizeName(str.getStrFormat2());
            s.save();
        }
        if(str.getStrFormat3() != null){
            Size s = new Size();
            s.setProduct(newProduct);
            s.setSizeName(str.getStrFormat3());
            s.save();
        }
        if(str.getStrFormat4() != null){
            Size s = new Size();
            s.setProduct(newProduct);
            s.setSizeName(str.getStrFormat4());
            s.save();
        }
//end----------------------------------------------------------------------------------------------------------------------------------------------------------    
        // Redirect to the admin home
        return redirect(routes.AdminController.products(0));
    }

    // Update a product by ID
    // called when edit button is pressed
//J.T.----------------------------------------------------------------------------------------------------------------------------------------------------------    
    @Transactional
    public Result updateProduct(Long id) {
        // Retrieve the product by id
        Product p = Product.find.byId(id);
        // Create a form based on the Product class and fill using p
        Form<Product> productForm = Form.form(Product.class).fill(p);
        Form<Factory> sizes = formFactory.form(Factory.class);
        // Render the updateProduct view
        // pass the id and form as parameters
        return ok(updateProduct.render(id, productForm, getUserFromSession(), sizes));
    }

    @Transactional
    public Result updateProductSubmit(Long id) {

        String saveImageMsg;

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Product> updateProductForm = formFactory.form(Product.class).bindFromRequest();
        Form<Factory> sizes = formFactory.form(Factory.class).bindFromRequest();
        // Check for errors (based on Product class annotations)
        if(updateProductForm.hasErrors()) {
            flash("fail", "Product could not be updated");
            // Display the form again
            return badRequest(updateProduct.render(id, updateProductForm, getUserFromSession(), sizes));
        }

        Product p = updateProductForm.get();

        if((p.getStock() < 0) || (p.getPrice() < 0)) {
            flash("fail", "Stock and price cannot be smaller than 0");
            // Display the form again
            return badRequest(updateProduct.render(id, updateProductForm, getUserFromSession(), sizes));
        }
        p.setId(id);
        // Get category ids (checked boxes from form)
        // Find category objects and set categories list for this product
        List<Category> newCats = new ArrayList<Category>();
        for (Long cat : p.getCatSelect()) {
            newCats.add(Category.find.byId(cat));
        }
        p.setCategories(newCats);
        
        // update (save) this product
        p.update();

        //Update warehouses
        Warehouse wMain = Warehouse.findMain();
        ProductWarehouse pWMain;
        pWMain = ProductWarehouse.findWarehouseProduct(wMain.getEmail(), id);
        

        List<Warehouse> wList = Warehouse.findNotMain();
        int totalStockInOtherWarehouses = 0;
        //Checks how much stock of this product is in all warehouses that is not main.
        for(int i = 0; i < wList.size(); i++){
            ProductWarehouse pW = ProductWarehouse.findWarehouseProduct(wList.get(i).getEmail(), id);
            totalStockInOtherWarehouses += pW.getStock();
        }
        //Checks if new update on the stock still allows to keep products in other warehouses. If new update on stock is too small all other warehouse stock 
        //is inizilized to zero
        if(p.getStock() > totalStockInOtherWarehouses){
            pWMain.setStock(p.getStock() - totalStockInOtherWarehouses);
            pWMain.update();
        } else {
            for(int i = 0; i < wList.size(); i++){
                ProductWarehouse pW = ProductWarehouse.findWarehouseProduct(wList.get(i).getEmail(), id);
                pW.setStock(0);
                pW.update();
            }
            pWMain.setStock(p.getStock());
            pWMain.update();    
        }
        

        // Get image data
        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");

        saveImageMsg = saveFile(p.getId(), image);

        // Add a success message to the flash session
        flash("success", "Product " + updateProductForm.get().getName() + " has been updates" + " " + saveImageMsg);
//end-----------------------------------------------------------------------------------------------------------------------------------------------------------
//A.S.----------------------------------------------------------------------------------------------------------------------------------------------------------
        Factory str = sizes.get();

        List<Size> sList = Size.findBySize(id);
        for(int i = 0; i < sList.size(); i++){
            sList.get(i).delete();
        }

        if(str.getStrFormat1() != null){
            Size s = new Size();
            s.setProduct(p);
            s.setSizeName(str.getStrFormat1());
            s.save();
        }
        if(str.getStrFormat2() != null){
            Size s = new Size();
            s.setProduct(p);
            s.setSizeName(str.getStrFormat2());
            s.save();
        }
        if(str.getStrFormat3() != null){
            Size s = new Size();
            s.setProduct(p);
            s.setSizeName(str.getStrFormat3());
            s.save();
        }
        if(str.getStrFormat4() != null){
            Size s = new Size();
            s.setProduct(p);
            s.setSizeName(str.getStrFormat4());
            s.save();
        }
//end----------------------------------------------------------------------------------------------------------------------------------------------------------           
//J.T.---------------------------------------------------------------------------------------------------------------------------------------------------------
        // Return to admin home
        return redirect(controllers.routes.AdminController.products(0));
    }
    // Delete Product by id
    @Transactional
    public Result deleteProduct(Long id) {
       
        // find product by id
        Product p = Product.find.byId(id);
        Plike like = Plike.findByProduct(id);
        List<Comment> comments = Comment.findByProduct(id);

        
        // //Remove all user likes
        for(int i = 0; i < like.getCustomer().size(); i++){
            like.getCustomer().get(i).removePlike(like);
            like.getCustomer().get(i).update();
            like.update();
        }
        like.setCustomers(null);
        like.delete();
        
        //Delete product and its attributes (Like and comments)
        for(int i = 0; i < comments.size(); i++){
            comments.get(i).delete();
        }
        //Delete product
        Product.find.ref(id).delete();
        
        // Add message to flash session
        flash("success", "Product has been deleted");

        // Redirect to products page
        return redirect(routes.AdminController.products(0));
    }

    // Save an image file for products
    public String saveFile(Long id, FilePart<File> image) {
        if (image != null) {
            // Get mimetype from image
            String mimeType = image.getContentType();
            // Check if uploaded file is an image
            if (mimeType.startsWith("image/")) {
                // Create file from uploaded image
                File file = image.getFile();
                // create ImageMagick command instance
                ConvertCmd cmd = new ConvertCmd();
                // create the operation, add images and operators/options
                IMOperation op = new IMOperation();
                // Get the uploaded image file
                op.addImage(file.getAbsolutePath());
                // Resize using height and width constraints
                op.resize(300,200);
                // Save the  image
                op.addImage("public/images/productImages/" + id + ".jpg");
                // thumbnail
                IMOperation thumb = new IMOperation();
                // Get the uploaded image file
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(60);
                // Save the  image
                thumb.addImage("public/images/productImages/thumbnails/" + id + ".jpg");
                // execute the operation
                try{
                    cmd.run(op);
                    cmd.run(thumb);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "image file missing";
    }

    public Result indexSliders() {
        List<IndexSlider> list = IndexSlider.findAll();
        List<IndexSlider> iList = new ArrayList<>();
        IndexSlider activeItem = null;
        if(list.size() != 0){
           activeItem = list.get(0);
        } else {
            return redirect(routes.AdminController.addIndexSlider());
        }
        for(int i = 1; i < list.size(); i++){
                iList.add(list.get(i));
        }
        return ok(indexSliders.render(env, getUserFromSession(), iList, activeItem));
    }

    @Transactional
    public Result addIndexSlider() {

        Form<IndexSlider> addSlider = formFactory.form(IndexSlider.class);

        

        return ok(addIndexSlider.render(getUserFromSession(), addSlider));
    }

    @Transactional
    public Result addIndexSliderSubmit() {
        String saveImageMsg;


        Form<IndexSlider> sliderForm = formFactory.form(IndexSlider.class).bindFromRequest();

        // Check for errors (based on Product class annotations)
        if(sliderForm.hasErrors()) {
            // Display the form again
            return badRequest(addIndexSlider.render(getUserFromSession(), sliderForm));
        }

        IndexSlider newSlider = sliderForm.get();
        newSlider.save();


        // Get image data
        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");

        // Save the image file
        saveImageMsg = saveSliderFile(newSlider.getId(), image);

        // Set a success message in temporary flash
        flash("success", "New index page slider has been created" + " " + saveImageMsg);


        return redirect(routes.AdminController.indexSliders());
    }
    

    @Transactional
    public Result updateIndexSlider(Long id) {

        IndexSlider s = IndexSlider.find.byId(id);

        Form<IndexSlider> sliderForm = Form.form(IndexSlider.class).fill(s);
        return ok(updateIndexSlider.render(getUserFromSession(), sliderForm, id));
    }

    @Transactional
    public Result updateIndexSliderSubmit(Long id) {
        String saveImageMsg;


        Form<IndexSlider> slideForm = formFactory.form(IndexSlider.class).bindFromRequest();

        if(slideForm.hasErrors()) {
            // Display the form again
            return badRequest(updateIndexSlider.render(getUserFromSession(), slideForm, id));
        }

        IndexSlider p = slideForm.get();
        p.setId(id);

        
        p.update();

        // Get image data
        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");

        saveImageMsg = saveSliderFile(p.getId(), image);

        // Add a success message to the flash session
        flash("success", "Index slider has been updated "+ saveImageMsg);

        return redirect(routes.AdminController.indexSliders());
    }

    @Transactional
    public Result deleteIndexSlider(Long id) {

        IndexSlider.find.ref(id).delete();

        flash("success", "Index slider has been deleted");

        return redirect(routes.AdminController.indexSliders());
    }

    // Save an image files for sliders
    public String saveSliderFile(Long id, FilePart<File> image) {
        if (image != null) {

            String mimeType = image.getContentType();

            if (mimeType.startsWith("image/")) {
 
                File file = image.getFile();

                ConvertCmd cmd = new ConvertCmd();

                IMOperation op = new IMOperation();

                op.addImage(file.getAbsolutePath());

                op.addImage("public/images/slider/" + id + ".jpg");
                try{
                    cmd.run(op);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "image file missing";
    }

    public Result warehouses1() {
        List<Warehouse> wList = Warehouse.findAllWarehouses();
        return ok(warehouses1.render(wList, getUserFromSession()));
    }
    
    public Result addWarehouse() {

        Form<Warehouse> wForm = formFactory.form(Warehouse.class);

        return ok(addWarehouse.render(wForm, getUserFromSession()));
    }

    @Transactional
    public Result addWarehouseSubmit() {
        
        Form<Warehouse> wForm = formFactory.form(Warehouse.class).bindFromRequest();
        
        Warehouse newW = wForm.get();
        

        if(User.findByEmail(newW.getEmail()) != null){
            flash("fail", "Email is used already");
            return redirect(routes.AdminController.addWarehouse());
        }

        if(wForm.hasErrors()){
            flash("fail", "Email " + newW.getEmail() + "is already in our database.");
            return redirect(routes.AdminController.addWarehouse());
        }
            
            
        if (!newW.getPassword().equals(newW.getPassword2())) {
            flash("fail", "Passwords don't match");
        }

        if (newW.getPassword().equals(newW.getPassword2())){
            flash("success", "Warehouse has been added");
            newW.save();

            List<Product> pList = Product.findAll("");
            //Assign all products to new warehouse --- J.T.
            for(int i = 0; i < pList.size(); i++){
            ProductWarehouse pW = new ProductWarehouse();
            pW.setProduct(pList.get(i));
            pW.setWarehouse(newW);
            pW.save();
        }
        } else {
            flash("fail", "Passwords dont match");
            return badRequest(addWarehouse.render(wForm, getUserFromSession()));
        }
          
        

        return redirect(routes.AdminController.warehouses1());
    }
    // 
    @Transactional
    public Result updateWarehouse(String email) {
        Warehouse p = Warehouse.find.byId(email);

        Form<Warehouse> wForm = Form.form(Warehouse.class).fill(p);
        

        return ok(updateWarehouse.render(email, wForm, getUserFromSession()));
    }

    @Transactional
    public Result updateWarehouseSubmit(String email) {
        
        Form<Warehouse> updateWarehouseForm = formFactory.form(Warehouse.class).bindFromRequest();

        Warehouse w = updateWarehouseForm.get();

        if(User.findByEmail(w.getEmail()) != null){
            if(!w.getEmail().equals(email)){
            flash("fail", "Email is used alre ady");
            return redirect(routes.AdminController.updateWarehouse(email));
            }
        }
       
        Warehouse.find.ref(email).delete();
        if(updateWarehouseForm.hasErrors()){
            flash("fail", "Email " + w.getEmail() + "is already in our database.");
            return redirect(routes.AdminController.updateWarehouse(email));
        }
            
            
        if (!w.getPassword().equals(w.getPassword2())) {
            flash("fail", "Passwords don't match");
        }

        if (w.getPassword().equals(w.getPassword2())){
            flash("success", "Warehouse has been updated");
            
            w.save();
        } else {
            flash("fail", "Passwords dont match");
            return badRequest(addWarehouse.render(updateWarehouseForm, getUserFromSession()));
        }
          



        return redirect(controllers.routes.AdminController.warehouses1());
    }

    @Transactional
    public Result delWarehouse(String email) {

        Warehouse main = Warehouse.findMain();
        if(main.getEmail().equals(email)){
            flash("fail", "You cannot delete main warehouse");
            return redirect(routes.AdminController.warehouses1());
        }

        List<Product> pList = Product.findAll("");
        for(int i = 0; i < pList.size(); i++){
            ProductWarehouse mainPW = ProductWarehouse.findWarehouseProduct(main.getEmail(), pList.get(i).getId());
            ProductWarehouse pWToDelete = ProductWarehouse.findWarehouseProduct(email, pList.get(i).getId());
            mainPW.setStock(mainPW.getStock() +pWToDelete.getStock());
            mainPW.update();
        }



        Warehouse.find.ref(email).delete();

        flash("success", "All product from deleted warehouse are returned to main warehouse");

        return redirect(routes.AdminController.warehouses1());
    }

    @Transactional
    public Result setAsMain(String email) {

        List<Warehouse> list = Warehouse.findAllWarehouses();
        //Update status of all warehouses
        for(int i = 0; i < list.size(); i++){
            list.get(i).setMain(false);
            list.get(i).update();            
        }
        Warehouse w = Warehouse.find.byId(email);
        w.setMain(true);
        w.update();
        flash("success", "Warehouse status has been updated");

        return redirect(routes.AdminController.warehouses1());
    }
//end J.T.----------------------------------------------------------------------------------------------------------------------------------------------------------
        

}
