package utils;

import java.io.Serializable;

public enum E_Periods implements Serializable {
	MONTH(1), QUARTER(3), HALF(6), YEAR(12);
	
	private final int number;
	
	E_Periods (int number){
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
	
}
