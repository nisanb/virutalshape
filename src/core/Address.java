package core;

import java.io.Serializable;
import java.util.Arrays;
//Added Comment
import utils.E_Cities;

/**
 * Class Address ~ represent a single Address of a Branch, Employee or Customer
 * 
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class Address implements Serializable {
	// -------------------------------Class Members------------------------------
	/** The Address city */
	private E_Cities city;

	/** The Address country */
	private String country;

	/** The Address house Number */
	private int housNumber;

	/** The Address phone Number */
	private String[] phoneNumber;

	/** The Address street */
	private String street;

	// -------------------------------Constructors-----------------------------
	/**
	 * Full Constructor ~ use for initial all fields
	 * 
	 * @param city
	 * @param country
	 * @param housNumber
	 * @param phoneNumber
	 * @param street
	 */
	public Address(String country, E_Cities city, String street,
			int housNumber, String[] phoneNumber) {
		super();
		this.city = city;
		this.country = country;
		this.housNumber = housNumber;
		this.phoneNumber = new String[1];
		this.phoneNumber = phoneNumber;
		this.street = street;
	}

	// -------------------------------Getters And
	// Setters------------------------------

	/**
	 * @return the city
	 */
	public E_Cities getCity() {
		return city;
	}

	/**
	 * set the city
	 * 
	 * @param city
	 */
	public void setCity(E_Cities city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * set the country
	 * 
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the house number
	 */
	public int getHousNumber() {
		return housNumber;
	}

	/**
	 * set the hous number
	 * 
	 * @param housNumber
	 */
	public void setHousNumber(int housNumber) {
		this.housNumber = housNumber;
	}

	/**
	 * @return the phone numbers
	 */
	public String[] getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * set the phone numbers
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * set the street
	 * 
	 * @param street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	// -------------------------------More Methods------------------------------

	// -------------------------------hashCode equals &
	// toString------------------------------

	@Override
        public String toString(){
            return country+", "+street+" "+housNumber;
        }
        
        
	public String toString1() {
		return "Address [country="
				+ country
				+ ", city="
				+ city
				+ ", street="
				+ street
				+ ", housNumber="
				+ housNumber
				+ ", phoneNumber= "
				+ Arrays.toString(phoneNumber).replace("[", "{")
						.replace("]", "}") + " ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + housNumber;
		result = prime * result + Arrays.hashCode(phoneNumber);
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city != other.city)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (housNumber != other.housNumber)
			return false;
		if (!Arrays.equals(phoneNumber, other.phoneNumber))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}

}// ~ END OF Class Address
