package Validators;

import java.io.Serializable;


/**
 * Email Validator Class
 * @author mickey
 */
public class EmailValidator{

        /**
        * Checks whether the given email address is valid according to format:
        * Format user_name@domain.ending.....
        * @param email represents the email address.
        */
	public static boolean validateEmail (String email){	  
	    if (email == null)  return false;
	    
		    // Assigning the email format regular expression
		    String mail = email.toString();
		    String emailPattern = "^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})";
		    
		    if (mail.matches(emailPattern)){
		    	return true;
		    }
		    
		    return false;
	}

}
	
