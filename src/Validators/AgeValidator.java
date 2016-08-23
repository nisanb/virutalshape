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

public class AgeValidator {

	public static boolean ValidateAge(Date birthday, int min){
		Date today = new Date();
		if (birthday.after(today)) {
			//TODO - Enter code to return error message
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
