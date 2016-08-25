package core;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import utils.Bookable;
import utils.E_Lessons;
import utils.E_Levels;

/**
 * Class Lesson ~ represent a single Lesson in the company
 * 
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class Lesson implements Bookable, Serializable {
	// -------------------------------Class
	// Members------------------------------
	/** The lesson number */
	private int lessonNum;

	/** The lesson name */
	private E_Lessons name;

	/** The lesson date & time */
	private Date startDate;

	/** The lesson level */
	private E_Levels level;

	/** The losson's coach */
	private Coach coach;

	/** The maximum number of students for this lesson */
	private int maxStudent;

	/** The maximum number of students for this lesson */
	private Room room;

	/**
	 * The customers who registered to this lesson and boolean- if they attended
	 * the class or not
	 */
	private Map<Customer, Boolean> registered;

	// -------------------------------Constructors-----------------------------
	/**
	 * Full Constructor ~ use for initial all fields
	 * 
	 * @param lessonNum
	 * @param name
	 * @param level
	 * @param coach
	 * @param maxStudent
	 * @param startDate
	 */
	public Lesson(int lessonNum, E_Lessons name, E_Levels level,
			Date startDate, Coach coach, int maxStudent, Room room) {
		super();
		this.lessonNum = lessonNum;
		this.name = name;
		this.level = level;
		this.startDate = startDate;
		this.setCoach(coach);
		this.room = room;
		this.maxStudent = Math.min(maxStudent, room.getMaxNumOfTrainees()); 
		// logically must be minimum between the options
		this.registered = new HashMap<Customer, Boolean>();
	}

	/**
	 * Partial Constructor ~ use for initial key fields
	 * 
	 * @param lessonNum
	 */
	public Lesson(int lessonNum) {
		super();
		this.lessonNum = lessonNum;
	}

	// -------------------------------Getters And
	// Setters------------------------------

	/**
	 * @return the lesson number
	 */
	public int getLessonNum() {
		return lessonNum;
	}

	/**
	 * set lesson number
	 * 
	 * @param lessonNum
	 */
	public void setLessonNum(int lessonNum) {
		this.lessonNum = lessonNum;
	}

	/**
	 * @return the date and time of the lesson
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * set the date & time of the lesson
	 * 
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the name of the lesson
	 */
	public E_Lessons getName() {
		return name;
	}

	/**
	 * set the name of the lesson
	 * 
	 * @param name
	 */
	public void setName(E_Lessons name) {
		this.name = name;
	}

	/**
	 * @return the level of the lesson
	 */
	public E_Levels getLevel() {
		return level;
	}

	/**
	 * set the level of the lesson
	 * 
	 * @param level
	 */
	public void setLevel(E_Levels level) {
		this.level = level;
	}

	/**
	 * @return the coach of the lesson
	 */
	public Coach getCoach() {
		return coach;
	}

	/**
	 * set a coach for the lesson IF his level fits the lesson level and he
	 * knows this type (name) of lesson
	 * 
	 * @param coach
	 */
	public void setCoach(Coach coach) {
		if (coach.getLevel() >= this.level.getLevel())
			for (int i = 0; i < coach.getTypes().length; i++)
				if (coach.getTypes()[i] != null
						&& coach.getTypes()[i].equals(this.name))
					this.coach = coach;
	}

	/**
	 * @return the Max number of Student for the lesson
	 */
	public int getMaxStudent() {
		return maxStudent;
	}

	/**
	 * set the Max number of Student for the lesson
	 * 
	 * @param maxStudent
	 */
	public void setMaxStudent(int maxStudent) {
		this.maxStudent = maxStudent;
	}

	/**
	 * @return the room of the lesson
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * set the room of the lesson
	 * 
	 * @param room
	 */
	public void setRoom(Room room) {
		this.room = room;
	}

	/**
	 * @return the customer registered to the lesson
	 */
	public Map<Customer, Boolean> getRegistered() {
		return Collections.unmodifiableMap(registered);
	}

	/**
	 * set the customer registered to the lesson
	 * 
	 * @param registered
	 */
	public void setRegistered(Map<Customer, Boolean> registered) {
		this.registered = registered;
	}

	/**
	 * @return the time the lesson ends in a lesson takes 2 hours
	 */
	public Date getEndDate() {
		Date end = (Date) getStartDate().clone();
		end.setHours(end.getHours() + 2);
		return end;
	}

	// -------------------------------More Methods------------------------------

	@Override
	/**
	 * Method from interface Bookable
	 * 
	 * @return the class primary key
	 */
	public int getPrimaryKey() {
		return getLessonNum();
	}

	/**
	 * Method from interface Bookable
	 * 
	 * this method adds a customer (student in a lesson) to this lesson if there
	 * is enough space
	 * 
	 * @param obj1 as Customer
	 * @return true if the customer was added successfully, false if not
	 */
	@Override
	public boolean addCustomer(Object obj1, Object obj2) {
		if (obj1 != null && obj1 instanceof Customer) {
			Customer custToAdd = (Customer) obj1;
			Boolean attended = false;
			if (custToAdd != null && this.hasFreeSpace()) {
				if (this.registered.containsKey(custToAdd))
					return false;
				this.registered.put(custToAdd, attended);
				return true;
			}
		}
		return false;
	}

	/**
	 * Method from interface Bookable, obj2 is NOT needed for it
	 * 
	 * This method cancel a customer from the registered map, IF he exists
	 * 
	 * @param obj1 as custToAdd
	 * @return true if the customer was deleted, false other
	 */
	@Override
	public boolean cancelCustomer(Object obj1, Object obj2) {
		if (obj1 != null && obj1 instanceof Customer) {
			Customer custToCancel = (Customer) obj1;
			if (custToCancel != null)
				if (this.registered.containsKey(custToCancel))	{
					this.registered.remove(custToCancel);
					return true;
				}
		}
		return false;
	}

	/**
	 * this method check if there is an empty cell in the registered array
	 * 
	 * @return true if there id space, false other
	 */
	public boolean hasFreeSpace() {
		if (this.registered.size() < getMaxStudent())
			return true;
		return false;
	}

	// -------------------------------hashCode equals & toString------------------------------

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lessonNum;
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
		Lesson other = (Lesson) obj;
		if (lessonNum != other.lessonNum)
			return false;
		return true;
	}
        
        /**
         * Secondery toString
         * @return 
         */
        public String toString2(){
            String strDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(startDate);
            return this.lessonNum + " - " + this.name + ", " + strDate + ", " + this.coach.getnName();
        }

	@Override
	public String toString() {
		return "Lesson [lessonNum=" + lessonNum + ", name=" + name
				+ ", startDate=" + startDate.getDate() + "/"
				+ (startDate.getMonth() + 1) + "/"
				+ (startDate.getYear() + 1900) + ", level=" + level
				+ ", coach=" + coach + ", maxStudent=" + maxStudent + ", room="
				+ room.getRoomNum() + " in branch "
				+ room.getBranch().getBranchNumber() + ", registered="
				+ registered.toString().replace("[", "{").replace("]", "}") + "]\n";
	}

//	public String toString() {
//		return "Lesson [lessonNum=" + lessonNum + ", registered= " + registered.size() + " customers ]\n";
//	 }

}
