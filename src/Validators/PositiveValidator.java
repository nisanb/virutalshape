package Validators;

public class PositiveValidator {
    public static boolean isPositiveNum(double num){
        if (num > 0) return true;
        else return false;
    }
    
    
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
