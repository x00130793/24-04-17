package models.shopping;

import java.util.*;
import javax.persistence.*;
import java.util.Date;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

//Time formating 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import models.*;
import models.users.*;

//J.T.-----------------------------------------------------------------------------------------------------------
@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;
    
    private String OrderDate;
    private String deliverDate = null;
    private String orderStatus;
    
    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
    private List<OrderItem> items;
    
    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Warehouse warehouse;

    private String name;
    private String street1;
	private String street2;
    private String town;
    private String postCode;
    private String country;
    

    // Default constructor
    public  ShopOrder() {
        DateFormat day = new SimpleDateFormat("dd/MM/yyyy HH:mm a");
        OrderDate = day.format(new Date()).toString();
        orderStatus = "In Warehouse";
    }
    
    public double getOrderTotal() {
        
        double total = 0;
        
        for (OrderItem i: items) {
            total += i.getItemTotal();
        }
        return total;
    }
	
	//Generic query helper
    public static Finder<Long,ShopOrder> find = new Finder<Long,ShopOrder>(ShopOrder.class);

    
    public static List<ShopOrder> findAll() {
        return ShopOrder.find.all();
    }

    public static List<ShopOrder> findByCustomer(String email){
        return ShopOrder.find.where()                       
                        .eq("customer.email", email)
                        // .ilike("email", "%" + email + "%")
                        .findList();
    }
    //Find all orders in this warehouse
	public static List<ShopOrder> findByWarehouse(String email) {
        return ShopOrder.find.where()
                        .eq("warehouse.email", email)
                        .findList();
    }

    public static List<OrderItem> findOrderItems(Long id) {
        return OrderItem.find.where()
                        .eq("ShopOrder.id", id)
                        .findList();
    }
    

    // public static List<ShopOrder> findById(String email){
    //     return ShopOrder.find.where()                       
    //                     .eq("customer.email", email)
    //                     .ilike("email", "%" + email + "%")
    //                     .findList();
    // }

    
    
    //Delivery status and info-----------------------------------------------------
    public String getStatus(){
        return orderStatus;
    }
    public String getDeliveryDate(){
        return deliverDate;
    }
    public void setStatus(String s){
        this.orderStatus = s;
    }
    public void setDeliveryDate(String deliverDate){
        this.deliverDate = deliverDate;
    }

    //Other getters and setters----------------------
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setWarehouse(Warehouse w) {
    	this.warehouse = w;
    }
    
    public Warehouse getWarehouse(){
   	return warehouse;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

