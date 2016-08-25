package Validators;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import core.*;
import java.util.ArrayList;
//Added Comment
import java.util.Arrays;
import java.util.List;
import utils.E_Cities;
import utils.E_Types;

/**
 * This class valiges age property on given date
 * @author nisan & mickey
 */
public class AgeValidator {

    /**
     * Method to validate age given date parameters 
     * @param birthday
     * @param min
     * @return 
     */
	public static boolean ValidateAge(Date birthday, int min){
		Date today = new Date();
		if (birthday.after(today)) {
			return false;
		}
		
		long mils = today.getTime() - birthday.getTime();
		long ageInDays = TimeUnit.MILLISECONDS.toDays(mils);
		long maxAge = 100*365;
		long minAge = min*365;
		
		if (ageInDays > minAge && ageInDays < maxAge) return true;
		
		
		return false;
	}
	
}
