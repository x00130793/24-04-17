package models.productsAdditions;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import com.avaje.ebean.*;
import play.data.format.*;
import play.data.validation.*;
//Time formating 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import models.*;
import models.users.*;
//J.T.-----------------------------------------------------------------------------------------------------------
@Entity
public class Comment extends Model {


    @Id
    private Long id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Customer customer;

    @Constraints.Required
    private String content;

    private String commentDate;
        
    private String commentTime;




    public static Finder<Long,Comment> find = new Finder<Long,Comment>(Comment.class);

    public static List<Comment> findAll() {
        return Comment.find.all();
    }

    public static List<Comment> findByProduct(Long pId){
        return Comment.find.where()
                .eq("product.id", pId)
                .findList();
    }
    

    public Comment() {
        DateFormat day = new SimpleDateFormat("dd/MM/yyyy");
        this.commentDate = day.format(new Date()).toString();
            
        DateFormat time = new SimpleDateFormat("HH:mm a");
        this.commentTime = time.format(new Date()).toString();
    }

    public Comment(Long id, Product product, Customer customer, String content) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String d){
        this.commentDate = d;
    }

    public String getDate(){
        return commentDate;
    }

    public void setTime(String t){
        this.commentTime = t;
    }

    public String getTime(){
        return commentTime;
    }

}
