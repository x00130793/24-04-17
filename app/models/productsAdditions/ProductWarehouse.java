package models.productsAdditions;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import com.avaje.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;
import models.users.*;
//J.T.-----------------------------------------------------------------------------------------------------------
@Entity
public class ProductWarehouse extends Model{


    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private int stockPerW;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Warehouse warehouse;

    


    // Default constructor
    public ProductWarehouse() {
        stockPerW = 0;
    }

    // public Plike(Product p) {
    // }
    
    public static Finder<Long, ProductWarehouse> find = new Finder<Long, ProductWarehouse>(ProductWarehouse.class);
    
    public static List<ProductWarehouse> findAll() {
        return ProductWarehouse.find.all();
    } 

     //Find warehouse
	public static ProductWarehouse findWarehouseProduct(String email, Long id) {
        return ProductWarehouse.find.where()
                        .eq("warehouse.email", email)
                        .eq("product.id", id)
                        .findUnique();
    }

     //Find all products in this warehouse       Will it work??????????????????????????
	public static List<Product> findProductByWarehouse(String email) {
        return Product.find.where()
                        .eq("warehouse.email", email)
                        .findList();
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product pl) {
        this.product = pl;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse w) {
        this.warehouse = w;
    }

    public int getStock(){
        return stockPerW;
    }

    public void setStock(int stock){
        this.stockPerW = stock;
    }

    // public void productAdded(Product p){
    //     product.add(p);
    //     p.getLikes().add(this);
    // }

    // public void removeWarehouse(Customer c){
    //     cus.remove(c);
    //     c.getLikes().remove(this);   
    // }

}  
