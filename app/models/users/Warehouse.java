package models.users;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.*;
//Models
import models.*;
import models.shopping.*;
import models.productsAdditions.*;

@Entity

@DiscriminatorValue("warehouse")

//J.T.-----------------------------------------------------------------------------------------------------------
public class Warehouse extends User {

	//Mappings
	@OneToMany(mappedBy="warehouse", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;

	@OneToMany(mappedBy="warehouse", cascade = CascadeType.ALL)
    private List<ProductWarehouse> productWarehouses;
	



	//-----end mapping ---------
	private String street1;
	private String street2; 
	private String town;
	private String country;
	private boolean isMain = false;		//If warehouse is main all new products gets assignet to it automaticly

    

	public Warehouse(String email, String role, String fName, String lName, String password, String password2){
		super(email, role, fName, lName, password, password2);
	}

	public Warehouse(String email, String role, String fName, String lName, String password, String password2, String street1, String street2, String town, String country1) {
		super(email, role, fName, lName, password, password2);
		this.street1 = street1;
		this.street2 = street2;
		this.town = town;
		this.country = country1;
		this.isMain = false;
	}

	public static Finder<String,Warehouse> find = new Finder<String,Warehouse>(Warehouse.class);

    public static List<Warehouse> findAllWarehouses() {
        return Warehouse.find.where().orderBy("country asc").findList();
    }
	//Find main warehouse
	public static Warehouse findMain() {
        return Warehouse.find.where()
                        .eq("isMain", true)
                        .findUnique();
    }

	public static Warehouse findByName(String name) {
        return Warehouse.find.where()
                        .ilike("fName", "%" + name + "%")
                        .findUnique();
    }

	//Find all warehouses that are not main
	public static List<Warehouse> findNotMain() {
        return Warehouse.find.where()
                        .ne("isMain", true)
                        .findList();
    }
	
// can be used to see orders or something like that
		// Generate options for an HTML select control
    // public static Map<String,String> options() {
    //     LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
    //     for(Category c: Category.find.orderBy("name").findList()) {
    //         options.put(c.id.toString(), c.name);
    //     }
    //     return options;
    // }


	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public boolean isMain() {
		return isMain;
	}

	public void setMain(boolean main) {
		isMain = main;
	}

	public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }

	public List<ProductWarehouse> getProductWarehouses() {
        return productWarehouses;
    }

    public void setProductWarehouses(List<ProductWarehouse> productWarehouses) {
        this.productWarehouses = productWarehouses;
    }


}
