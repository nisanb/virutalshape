package core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import utils.CoachComperator;
import utils.Constants;

/**
 * Class Branch ~ represent a single branch of the company
 * 
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class Branch implements Serializable {

	// -------------------------------Class
	// Members------------------------------
	/**
	 * Branch's number - the key
	 */
	private int branchNumber;
	/**
	 * Branch's name
	 */
	private String branchName;

	/**
	 * All branch's coaches Should be saved in a TreeSet with CoachComperator!
	 */
	private Set<Coach> coaches;

	/**
	 * All branch's Receptionist
	 */
	private Set<Receptionist> respt;

	/**
	 * All branch's rooms
	 */
	private List<Room> rooms;

	/**
	 * Branch's address
	 */
	private Address branchAddress;

	// -------------------------------Constructors-----------------------------
	/**
	 * Full Constructor ~ use for initial all fields
	 * 
	 * @see Constants to get the maximum number of coaches
	 * @param branchNumber
	 * @param branchName
	 * @param branchAddress
	 */
	public Branch(int branchNumber, String branchName, Address branchAddress) {
		super();
		this.branchNumber = branchNumber;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
		this.coaches = new TreeSet<Coach>(new CoachComperator());
		this.respt = new HashSet<Receptionist>();
		this.rooms = new ArrayList<Room>();
	}

	/**
	 * Partial Constructor ~ use for initial key fields
	 * 
	 * @param branchNumber
	 */
	public Branch(int branchNumber) {
		super();
		this.branchNumber = branchNumber;
		this.coaches = new TreeSet<Coach>(new CoachComperator());
		this.respt = new HashSet<Receptionist>();
		this.rooms = new ArrayList<Room>();
	}

	// -------------------------------Getters And
	// Setters------------------------------
	/**
	 * @return the branch number
	 */
	public long getBranchNumber() {
		return branchNumber;
	}

	/**
	 * set the branch number
	 * 
	 * @param branchNumber
	 */
	public void setBranchNumber(int branchNumber) {
		this.branchNumber = branchNumber;
	}

	/**
	 * @return the branch name
	 */
	public String getBranchName() {
		return branchName;
	}

	/**
	 * set the branch name
	 * 
	 * @param branchName
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	/**
	 * @return the branch Receptionists
	 */
	public Set<Receptionist> getRespt() {
		return Collections.unmodifiableSet(respt);
	}

	/**
	 * set the branch Receptionists
	 * 
	 * @param respt
	 */
	public void setRespt(Set<Receptionist> respt) {
		this.respt = respt;
	}

	/**
	 * @return the branch coaches
	 */
	public Set<Coach> getCoaches() {
		return Collections.unmodifiableSet(coaches);
	}

	/**
	 * set the branch coaches
	 * 
	 * @param coaches
	 */
	public void setCoaches(Set<Coach> coaches) {
		this.coaches = coaches;
	}

	/**
	 * @return the branch rooms
	 */
	public List<Room> getRooms() {
		return Collections.unmodifiableList(rooms);
	}

	/**
	 * set the branch rooms
	 * 
	 * @param rooms
	 */
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	/**
	 * @return the branch address
	 */
	public Address getBranchAddress() {
		return branchAddress;
	}

	/**
	 * set the branch address
	 * 
	 * @param branchAddress
	 */
	public void setBranchAddress(Address branchAddress) {
		this.branchAddress = branchAddress;
	}

	// -------------------------------More Methods------------------------------

	// ------- DEAL WITH COACHES -------

	/**
	 * This method adds a new coach to the coaches set IF the given coach
	 * doesn't already exists in the Branch and there is a free position.
	 * 
	 * @param coach
	 * @return true if the coach was added successfully or false otherwise
	 */
	public boolean addCoach(Coach coach) {
		if (coach != null && coaches != null)
			if (!coaches.contains(coach) && this.coaches.size() < Constants.MAX_COACHES_FOR_BRANCH)	{
				return coaches.add(coach);
			}
		return false;
	}// ~ END OF addCoach

	/**
	 * This method removes a given coach form the coach set.
	 * 
	 * @param coach
	 * @return true if the coach removed successfully or false otherwise
	 */
	public boolean removeCoach(Coach coach) {
		if (coach != null && this.coaches != null)
			if (this.coaches.contains(coach))	{
				return this.coaches.remove(coach);
			}
		return false;
	}// ~ END OF removeCoach

	// ------- DEAL WITH RESEPTIONISTS -------
	/**
	 * This method adds a new receptionist to the receptionists set IF the given
	 * receptionist doesn't already exists in the Branch.
	 * 
	 * @param resp
	 * @return true if the resp was added successfully or false otherwise
	 */
	public boolean addReceptionist(Receptionist resp) {
		if (resp != null && this.respt != null)
			if (!this.respt.contains(resp)
					&& this.respt.size() < Constants.MAX_RESEPTIONIST_FOR_BRANCH)
				return this.respt.add(resp);
		return false;
	}// ~ END OF addReceptionist

	/**
	 * This method removes a given receptionist form the receptionist set.
	 * 
	 * @param resp
	 * @return true if the receptionist removed successfully or false otherwise
	 */
	public boolean removeReceptionist(Receptionist resp) {
		if (resp != null && this.respt != null)
			if (this.respt.contains(resp))
				return this.respt.remove(resp);
		return false;
	}// ~ END OF removeReceptionist

	// ------- DEAL WITH ROOMS -------

	/**
	 * This method adds a new room to the rooms List IF the given room doesn't
	 * already exists in the Branch.
	 * 
	 * @param room
	 * @return true if the room was added successfully or false otherwise
	 */
	public boolean addRoom(Room room) {
		if (room != null && this.rooms != null)
			if (!this.rooms.contains(room))
				return this.rooms.add(room);
		return false;
	}// ~ END OF addRoom

	/**
	 * This method removes a given room form the rooms list
	 * 
	 * @param room
	 * @return true if the room was removed successfully or false otherwise
	 */
	public boolean removeRoom(Room room) {
		if (room != null && this.rooms != null)
			if (this.rooms.contains(room))
				return this.rooms.remove(room);
		return false;
	}// ~ END OF removeRoom
	
	//helper method for maintaining the tree ordered correctly
	//call when adding/removing lessons to/from a coach
	public void reorderCoaches() {
		Set<Coach> temp = new TreeSet<Coach>(new CoachComperator());
		temp.addAll(coaches);
		this.setCoaches(temp);		
	}

	// ------------------------hashCode equals & toString-----------------------

	@Override
	public String toString() {		
		return "Branch #"+getBranchNumber()+" "+getBranchName();
	}
     
	public String toString2() {		
		return "Branch [branchNumber=" + branchNumber + ", branchName="
				+ branchName + ", coaches=" + coaches.toString().replace("[", "{").replace("]", "}") 
				+ ", respt=" + respt.toString().replace("[", "{").replace("]", "}")
				+ ", rooms=" + rooms.toString().replace("[", "{").replace("]", "}")
				+ ", branchAddress=" + branchAddress + "]";
	}

	// public String toString() {
	// return "Branch [branchNumber=" + branchNumber + ", respt=" + respt
	// + ", coaches=" + coaches + "]\n";
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + branchNumber;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Branch other = (Branch) obj;
		if (branchNumber != other.branchNumber)
			return false;
		return true;
	}

}// ~ END OF Class Branch
