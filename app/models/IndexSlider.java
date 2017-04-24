package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import com.avaje.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;
import models.shopping.*;
import models.productsAdditions.*;
import models.users.*;

//J.T-----------------------------------------------------------------------------------------------
@Entity
public class IndexSlider extends Model {

    @Id
    private Long id;

    @Constraints.Required
    private String heading;

    private String heading2;

    @Constraints.Required
    private String content;

    @Constraints.Required
    private String postLink;

    public IndexSlider(){
    }

    public static Finder<Long,IndexSlider> find = new Finder<Long,IndexSlider>(IndexSlider.class);

    public static List<IndexSlider> findAll() {
        return IndexSlider.find.where().orderBy("heading asc").findList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String h) {
        this.heading = h;
    }

    public String getHeading2() {
        return heading2;
    }

    public void setHeading2(String h) {
        this.heading2 = h;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPostLink(String s){
        this.postLink = s;
    }

    public String getPostLink(){
        return postLink;
    }



}
