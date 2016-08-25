package Validators;


/**
 * Character Validator 
 * @author mickey
 */
public class CharValidator {
    
    /**
     * This method verifies if a given string is word only - for names
     * @param str
     * @return
     */
    public static boolean isWord (String str){
        for (int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))) return false;
        }
        
        return true;
    }
    
    /**
     * This method confirms if a given string is number only
     * @param str
     * @return
     */
    public static boolean isNumber (String str){
        for (int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))) return false;
        }
        
        return true;
    }
}
