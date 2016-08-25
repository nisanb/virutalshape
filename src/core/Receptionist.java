package core;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Class Receptionist ~ represent a single Receptionist of the company,
 * inheritor of Employee
 * 
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class Receptionist extends Employee implements Serializable {
static final long serialVersionUID = 8;
	// -------------------------------Class Members------------------------------
	/**
	 * All receptionist's subscriptions
	 */
	private Set<Subscription> subscriptions;

	// -------------------------------Constructors-----------------------------
	/**
	 * Partial constructor
	 * 
	 * @param empNum
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param startWorkingDate
	 * @param password
	 * @param address
	 */
	public Receptionist(int empNum, String firstName, String lastName,
			Date birthDate, Date startWorkingDate, String password,
			Address address) {
		super(empNum, firstName, lastName, birthDate, startWorkingDate,
				password, address);
		this.subscriptions = new HashSet<Subscription>();
	}
        
        
        /**
         * 
         */
        	public Receptionist(int empNum, String firstName, String lastName,
			Date birthDate, Date startWorkingDate, String password,
			Address address,Branch branch) {
		super(empNum, firstName, lastName, birthDate, startWorkingDate,
				password, address);
		this.subscriptions = new HashSet<Subscription>();
                this.setWorkBranch(branch);
	}
        
        

	/**
	 * Partial constructor
	 * 
	 * @param empNum
	 */
	public Receptionist(int empNum) {
		super(empNum);
	}

	// -------------------------------Getters And
	// Setters------------------------------

	/**
	 * @return the subscriptions this receptionist sold
	 */
	public Set<Subscription> getSubscriptions() {
		return Collections.unmodifiableSet(subscriptions);
	}

	/**
	 * set subscriptions sold by this receptionist
	 * 
	 * @param subscriptions
	 */
	public void setSubscriptions(Set<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	// -------------------------------More Methods------------------------------

	/**
	 * This method adds the given Subscription to this receptionist's
	 * subscriptions set IFF the given Subscription doesn't already exist.
	 * 
	 * @param subToAdd
	 * @return true if this subscription was successfully added or false
	 *         otherwise
	 */
	public boolean addSubscription(Subscription subToAdd) {
		if (subToAdd != null)
			if (this.getEmployeeNumber() == subToAdd.getReceptionist()
					.getEmployeeNumber())
				if (!this.subscriptions.contains(subToAdd))
					return this.subscriptions.add(subToAdd);
		return false;
	}

	/**
	 * This method removes an existing Subscription from the subscriptions set
	 * IFF the Subscription exists.
	 * 
	 * @param subToDelete
	 * @return true if this Subscription removed successful or false otherwise
	 */
	public boolean removeSubscription(Subscription subToDelete) {
		if (subToDelete != null)
			if (this.subscriptions.contains(subToDelete))
				return this.subscriptions.remove(subToDelete);
		return false;
	}

	/**
	 * This method counts the number of subscriptions the receptionist handled
	 * in January of this year. Hint! Check the start date of the related
	 * subscriptions and count only the subscriptions with the relevant dates.
	 * 
	 * @return the number of this January subscriptions the receptionist handled
	 */
	public int getNumberOfThisYearJanuaryAssignments() {
		int count = 0;
		for (Subscription s : this.subscriptions)
			if (s.getStartDate().getMonth() == 0
					&& s.getStartDate().getYear() == new Date().getYear())
				count++;
		return count;
	}

	// -------------------------------hashCode equals &
	// toString------------------------------

	// inherited from employee

}
