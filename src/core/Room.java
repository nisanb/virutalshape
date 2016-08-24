package core;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import utils.E_Rooms;

/**
 * Class Room ~ represent a single Room in the company Each room belongs to a
 * specific branch
 * 
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class Room implements Serializable {
    static final long serialVersionUID = 9;
	// -------------------------------Class
	// Members------------------------------

	/**
	 * The room number
	 */
	private int roomNum;

	/**
	 * Maximum number of trainees allowed in this room
	 */
	private int maxNumOfTrainees;

	/**
	 * Maximum number of instruments allowed in this room
	 */
	private int maxNumOfInstruments;

	/**
	 * The type of trainings the room is good for
	 */
	private E_Rooms roomType;

	/**
	 * related branch
	 */
	private Branch branch;

	/**
	 * the instruments that are in the room only rooms from type Gym can have
	 * instruments in them
	 */
	private Set<Instrument> instruments;

	/**
	 * the lessons that are assigned for this room
	 */
	private Set<Lesson> lessons;

	// -------------------------------Constructors------------------------------

	/**
	 * Full constructor
	 * 
	 * @param roomNum
	 * @param maxNumOfTrainees
	 * @param maxNumOfInstruments
	 * @param roomType
	 */
	public Room(int roomNum, int maxNumOfTrainees, int maxNumOfInstruments,
			E_Rooms roomType, Branch branch) {
		super();
		this.roomNum = roomNum;
		this.maxNumOfTrainees = maxNumOfTrainees;
		this.maxNumOfInstruments = maxNumOfInstruments;
		this.roomType = roomType;
		this.branch = branch;
		if (this.roomType == E_Rooms.GYM)
			this.instruments = new HashSet<Instrument>();
		this.lessons = new HashSet<Lesson>();
	}

	/**
	 * Partial constructor
	 * 
	 * @param roomNum
	 */
	public Room(int roomNum, int branchNum) {
		super();
		this.roomNum = roomNum;
		this.branch = new Branch(branchNum);
                this.instruments = new HashSet<Instrument>();
		this.lessons = new HashSet<Lesson>();
                 this.roomType = E_Rooms.Default;
                 this.maxNumOfInstruments=0;
                 this.maxNumOfTrainees=0;

        }
	// -------------------------------Getters And
	// Setters------------------------------

	/**
	 * @return the roomNum
	 */
	public int getRoomNum() {
		return roomNum;
	}

	/**
	 * @param roomNum
	 *            to set
	 */
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	/**
	 * @return the instruments in this room
	 */
	public Set<Instrument> getInstruments() {
		if (instruments == null)
			return null;
		return Collections.unmodifiableSet(instruments);
	}

	/**
	 * Set the instruments in this room
	 * 
	 * @param instruments
	 */
	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
	}

	/**
	 * @return the lessons in this room
	 */
	public Set<Lesson> getLessons() {
		return Collections.unmodifiableSet(lessons);
	}

	/**
	 * Set the lessons in this room
	 * 
	 * @param lessons
	 */
	public void setLessons(Set<Lesson> lessons) {
		this.lessons = lessons;
	}

	/**
	 * @return the maximum allowed number of trainees for this room
	 */
	public int getMaxNumOfTrainees() {
		return maxNumOfTrainees;
	}

	/**
	 * @param maxNumOfTrainees
	 */
	public void setMaxNumOfTrainees(int maxNumOfTrainees) {
		this.maxNumOfTrainees = maxNumOfTrainees;
	}

	/**
	 * @return the type of training this room is made for
	 */
	public E_Rooms getRoomType() {
		return roomType;
	}

	/**
	 * @param roomType
	 *            to set
	 */
	public void setRoomType(E_Rooms roomType) {
		this.roomType = roomType;
	}

	/**
	 * @return maxNumOfInstruments for this room
	 */
	public int getMaxNumOfInstruments() {
		return maxNumOfInstruments;
	}

	/**
	 * set maxNumOfInstruments for this room
	 * 
	 * @param maxNumOfInstruments
	 */
	public void setMaxNumOfInstruments(int maxNumOfInstruments) {
		this.maxNumOfInstruments = maxNumOfInstruments;
	}

	/**
	 * @return this rooms branch
	 */
	public Branch getBranch() {
		return branch;
	}

	/**
	 * set this rooms branch
	 * 
	 * @param branch
	 */
	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	// -------------------------------More Methods------------------------------

	/**
	 * This method adds a new instrument in to the instruments set of this room
	 * only IF the room type matches (GYM)
	 * 
	 * @param insToAdd
	 * @return true if instrument was added successfully, false otherwise
	 */
	public boolean addInstruments(Instrument insToAdd) {
		if (insToAdd != null) {
			if (insToAdd.getRoom() != null
					&& this.getRoomNum() == insToAdd.getRoom().getRoomNum()
					&& getRoomType() == E_Rooms.GYM)
				if (this.instruments.size() < getMaxNumOfInstruments())
					return this.instruments.add(insToAdd);
		}
		return false;
	}

	/**
	 * this method deletes an instrument from this room
	 * 
	 * @param insToDelete
	 * @return true if instrument was deleted successfully, false otherwise
	 */
	public boolean deleteInstrument(Instrument insToDelete) {
		if (insToDelete != null) {
			if (this.instruments.contains(insToDelete))
				return this.instruments.remove(insToDelete);
		}
		return false;
	}

	/**
	 * This method adds a new lesson in to the lessons array of the room only IF
	 * the room type matches (not GYM) and the time slot is free
	 * 
	 * @param les
	 * @return true if lesson was added successfully, false otherwise
	 */
	@SuppressWarnings("deprecation")
	public boolean addLessons(Lesson les) {
		if (les != null && !this.getRoomType().equals(E_Rooms.GYM)
				&& les.getRoom().equals(this) && les.getStartDate() != null) {
			Date start = les.getStartDate();
			Date endd = (Date) start.clone();
			endd.setHours(start.getHours() + 2);
			if (this.lessons.contains(les))
				return false;
			for (Lesson l : this.lessons) {
				Date lStart = l.getStartDate();
				Date lEnd = (Date) lStart.clone();
				lEnd.setHours(lStart.getHours() + 2);
				if (l != null && l.getStartDate() != null)
					if ((start.before(lEnd) && start.after(lStart))
							|| l.getStartDate().equals(start)
							|| (endd.before(lEnd) && endd.after(lStart)))
						return false;
			}
			return this.lessons.add(les);
		}
		return false;
	}

	/**
	 * This method removes a lesson if it exist & belongs to this room
	 * 
	 * @param lesson
	 * @return true if the lesson was deleted, false other
	 */
	public boolean removeLesson(Lesson lesson) {
		if (lesson != null && lesson.getRoom().equals(this))
			if (this.lessons.contains(lesson))
				return this.lessons.remove(lesson);
		return false;
	}

	// -------------------------------hashCode equals &
	// toString------------------------------

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + roomNum;
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
		Room other = (Room) obj;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (roomNum != other.roomNum)
			return false;
		return true;
	}

	@Override
        public String toString(){
            return roomType.toString()+" ("+roomNum+")";
        }
        
        
	public String toString2() {
		return "Room [roomNum=" + roomNum + ", maxNumOfTrainees="
				+ maxNumOfTrainees + ", maxNumOfInstruments="
				+ maxNumOfInstruments + ", roomType=" + roomType
				+ ", branch number=" + branch.getBranchNumber()
				+ ", instruments=" + instruments.toString().replace("[", "{").replace("]", "}") 
				+ ", lessons=" + lessons.toString().replace("[", "{").replace("]", "}") + "]";
	}

}
