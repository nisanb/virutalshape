package Validators;
	 /**
	  * @author Mickey Shalev - 200681872 
	  * Checks whether the given email address is valid according to format:
	  * Format user_name@domain.ending.....
	  * @param email represents the email address.
	  * @return true if the email is valid, false otherwise.
	  */
public class EmailValidator{
	

	public static boolean validate (String email){	  
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
	
