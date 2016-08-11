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
}
