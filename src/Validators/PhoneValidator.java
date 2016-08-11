/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validators;

/**
 *
 * @author micke
 */
public class PhoneValidator {
    
    
//    public static void main(String[] args){
//        System.err.println(validatePhone("123-4567890"));
//    }

	public static boolean validatePhone (String number){	  
	    if (number == null)  return false;
	    
		    // Assigning the email format regular expression
		    String num = number.toString();
		    String numberPattern = "^\\d{2,3}\\-\\d{7,10}";
		    
		    if (num.matches(numberPattern)){
		    	return true;
		    }
		    
		    return false;
	}
       

}
