package core;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import comparators.WorkoutComparator;

/**
 * Workout Class
 * 
 * Can hold practices, which holds instruments and usage times
 * Workout is considered as a part of a customer subscription, and specific GYM Room
 * 
 * @author nisan
 */
public class Workout implements Serializable {
    static final long serialVersionUID = 11;

	// -------------------------------Class Members------------------------------

	/**
	 * 
	 */
	

	/**
	 * the workout number
	 */
	private int number;

	/**
	 * this TreeMap holds all of the instruments needed (ordered) for this
	 * workout, and the time they are needed for
	 * 
	 * needs to be ordered by the length of use for each Instruments and then by
	 * start time
	 */
	private Map<Practice, Instrument> timeAndinstruments;

	/**
	 * the date of the workout
	 */
	private Date date;

	/**
	 * the subscription owning this workout reservation
	 */
	private Subscription sub;

	/**
	 * the branch (number) the workout is set to be in
	 */
	private int branchNum;

	// -------------------------------Constructors-----------------------------

	/**
	 * Full constructor
	 * 
	 * @param number
	 * @param sub
	 * @param date
	 * @param branchNum
	 */
	public Workout(int number, Subscription sub, Date date, int branchNum) {
		super();
		this.number = number;
		this.sub = sub;
		this.date = date;
		this.branchNum = branchNum;
		this.timeAndinstruments = new TreeMap<Practice, Instrument>(new WorkoutComparator());
	

		
	}

	// -------------------------------Getters And
	// Setters------------------------------

	/**
	 * @return the workout number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * set the workout number
	 * 
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the Map with practice time for instruments
	 */
	public Map<Practice, Instrument> getTimeAndinstruments() {
		return Collections.unmodifiableMap(timeAndinstruments);
	}

	/**
	 * set the Map with practice time for instruments
	 * 
	 * @param timeAndinstruments
	 */
	public void setTimeAndinstruments(
			Map<Practice, Instrument> timeAndinstruments) {
		timeAndinstruments = timeAndinstruments;
	}

	/**
	 * @return the subscription for this workout
	 */
	public Subscription getSub() {
		return sub;
	}

	/**
	 * set the subscription for this workout
	 * 
	 * @param sub
	 */
	public void setSub(Subscription sub) {
		this.sub = sub;
	}

	/**
	 * @return the workout date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * set the workout date
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the branch (number) the workout is set to be in
	 */
	public int getBranchNum() {
		return branchNum;
	}

	/**
	 * set the branch (number) the workout is set to be in
	 * 
	 * @param branchNum
	 */
	public void setBranchNum(int branchNum) {
		this.branchNum = branchNum;
	}

	// -------------------------------More Methods------------------------------

	/**
	 * this method adds another instrument from start time to end time IF the
	 * times for different instruments in the same workout are not overlapping
	 * and that the new instrument order is for this workout date
	 * 
	 * @param ins
	 * @param startTime
	 * @param endTime
	 * @return true if added successfully, false other
	 */
	public boolean addInstrument(Instrument ins, Date startTime, Date endTime) {
		if (ins != null && startTime.before(endTime)
				&& startTime.getDate() == this.date.getDate()
				&& startTime.getMonth() == this.date.getMonth()
				&& startTime.getYear() == this.date.getYear()) {
			Practice newPractice = new Practice(startTime, endTime);
			for (Practice p : this.timeAndinstruments.keySet()) {
				if ((p.getStart().before(endTime) && p.getStart().after(
						startTime))
						|| p.getStart().equals(startTime)
						|| p.getEnd().equals(endTime)
						|| (p.getEnd().before(endTime) && p.getEnd().after(
								startTime)))
					return false;
			}
			if (this.timeAndinstruments.put(newPractice, ins) == null)
				return true;
			else
				System.out.println(newPractice + " "
						+ this.timeAndinstruments.put(newPractice, ins)
						+ " ===================");
		}
		return false;
	}

	/**
	 * this method cancel an instrument from this workout at a specific practice
	 * time. Hint- a customer may order the same instrument more than once
	 * during a workout
	 * 
	 * @param ins
	 * @param startTime
	 * @param endTime
	 * @return true if successfully deleted, false other
	 */
	public boolean cancelInstrument(Instrument ins, Date startTime, Date endTime) {
		if (ins != null && startTime.before(endTime)) {
			Practice newPractice = new Practice(startTime, endTime);
			if (this.timeAndinstruments.containsKey(newPractice)
					&& this.timeAndinstruments.get(newPractice).equals(ins))
				if (ins.cancelCustomer(this.sub, newPractice)) {
					this.timeAndinstruments.remove(newPractice, ins);
					return true;
				}
		}
		return false;
	}

	/**
	 * return total workout time in minutes total workout time is the sum of all
	 * workout practices
	 * 
	 * @return
	 */
	public Integer getTotalWorkoutTime() {
		int minutes = 0;
		for (Practice p : this.getTimeAndinstruments().keySet())
			minutes += p.getTimeInMinute();
		return minutes;
	}

	// -------------------------------hashCode equals &
	// toString------------------------------

	@Override
	public String toString() {
		return "Workout [number=" + number + ", TimeAndinstruments="
				+ timeAndinstruments.toString().replace("[", "{").replace("]", "}") 
				+ ", date=" + date + ", sub=" + sub + "]";
	}
        
        /**
         * Secondery toString 
         * @return 
         */
        public String toString2(){
            String strDate = new SimpleDateFormat("dd/MM/yyyy").format(date);
            return this.number + " - " + this.branchNum + " " + strDate + ", Total time: " + this.getTotalWorkoutTime();
        }
	
//	@Override
//	public String toString() {
//		return "Workout [number=" + number + ", TimeAndinstruments="
//				+ timeAndinstruments.toString().replace("[", "{").replace("]", "}") + "]\n";
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
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
		Workout other = (Workout) obj;
		if (number != other.number)
			return false;
		return true;
	}

}
