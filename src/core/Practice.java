package core;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Class Practice ~ represent a single Practice of the customer Each Practice
 * belongs to a specific Workout with a specific Instrument by a specific
 * customer in IShape
 * 
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class Practice implements Serializable{
    static final long serialVersionUID = 7;
	// -------------------------------Class Members---------------------------

	/**
	 * this practice start date& time
	 */
	private Date start;

	/**
	 * this practice end date& time
	 */
	private Date end;

	// -------------------------------Constructors-----------------------------
	/**
	 * Full constractor ~ use for initial all fields
	 * 
	 * @param start
	 * @param end
	 */
	public Practice(Date start, Date end) {
		super();
		this.start = start;
		this.end = end;
	}

	// -------------------------------Getters And
	// Setters------------------------------

	/**
	 * @return this practice start time
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * set this practice start time
	 * 
	 * @param start
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	/**
	 * @return this practice end time
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * set this practice end time
	 * 
	 * @param end
	 */
	public void setEnd(Date end) {
		this.end = end;
	}

	// -------------------------------More Methods------------------------------

	/**
	 * this method calculate the differnce between start time and end time in
	 * minutes
	 * 
	 * @return the differnce between start time and end time in minutes
	 */
	public int getTimeInMinute() {
		if (getEnd().before(getStart()))
			return 0;
		long diffInMinutes = ((getEnd().getTime() / 60000) - (getStart()
				.getTime() / 60000));
		return (int) diffInMinutes;
	}

	// ---------------------hashCode equals & toString--------------------

	@Override
	public String toString() {
		return "Practice [start=" + start + ", end=" + end
				+ ", total time in minutes= " + getTimeInMinute() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
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
		Practice other = (Practice) obj;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}

        /**
         * Returns time in minutes
         * From - To
        */
        public String getTime(){
            String str = new SimpleDateFormat("hh:mm").format(getStart());
            str += " - ";
            str += new SimpleDateFormat("hh:mm").format(getEnd());
            return str;
            
        }
        
        
}
