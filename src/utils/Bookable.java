package utils;

/**
 * Interface Bookable for objects a customer can order - a lesson or an
 * instruments for a workout
 * 
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 *
 */
public interface Bookable{

	/**
	 * @return the entity's primary key
	 */
	public int getPrimaryKey();

	/**
	 * add a customer to the entity
	 * 
	 * @param obj1
	 * @param obj2
	 * @return
	 */
	public boolean addCustomer(Object obj1, Object obj2);

	/**
	 * cancel a customer from the entity
	 * 
	 * @param obj1
	 * @param obj2
	 * @return
	 */
	public boolean cancelCustomer(Object obj1, Object obj2);
}
