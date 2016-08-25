package Validators;


/**
 * Class Positive Validator
 * Checks a given string or number, if it is positive or not
 */
public class PositiveValidator {
    public static boolean isPositiveNum(double num){
        if (num > 0) return true;
        else return false;
    }
    
    /**
     * Returns wether a given string is a positive number
     * @param str2num
     * @return True if yes, false otherwise
     */
    public static boolean isPositiveStringNum (String str2num){
        try{
            int num = Integer.parseInt(str2num);
            if (num > 0){
                return true;
            }
        }catch(NumberFormatException nfe){
            //nfe.printStackTrace();
        }
        
        return false;
 
    }
    
    /**
     * Get ID from String
     * @param str
     * @return 
     */
    public static String getID(String str){
   
        //Split
        String arr[] = str.split("\\(");
        str = arr[1];
       arr= str.split("\\)");
        str = arr[0];
        
        //Return string
        return str;
    }
    
}
