package models.users;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.*;

@Entity
//A.S.-----------------------------------------------------------------------------------------------------------
@DiscriminatorValue("admin")

// Administrator inherits from the User class
public class Administrator extends User{

	public Administrator(String email, String role, String fName, String lName, String password, String password2)
	{
		super(email, role, fName, lName, password, password2);
	}
	
} 
