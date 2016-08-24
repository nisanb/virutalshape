package core;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import utils.E_Periods;

/**
 * Class Subscription ~ represent a single Subscription in the company Each
 * Subscription belongs to a specific customer
 *
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class Subscription implements Serializable {
    static final long serialVersionUID = 10;
    // -------------------------------Class
    // Members------------------------------
    
    /**
     * subscription number
     */
    private int number;
    
    /**
     * client owning the subscription
     */
    private Customer customer;
    
    /**
     * receptionist who created the subscription
     */
    private Receptionist receptionist;
    
    /**
     * period for subscription
     */
    private E_Periods period;
    
    /**
     * start date for subscription
     */
    private Date startDate;
    
    /**
     * the lessons this subscription is registered for
     */
    private Set<Lesson> lessons;
    
    /**
     * the workouts ordered by this subscription
     */
    private Set<Workout> workouts;
    
    // -------------------------------Constructors------------------------------
    
    /**
     * Full constructor
     *
     * @param number
     * @param customer
     * @param receptionist
     * @param period
     * @param startDate
     */
    public Subscription(int number, Customer customer,
            Receptionist receptionist, E_Periods period, Date startDate) {
        super();
        this.number = number;
        this.customer = customer;
        this.receptionist = receptionist;
        this.period = period;
        this.startDate = startDate;
        this.lessons = new HashSet<Lesson>();
        this.workouts = new HashSet<Workout>();
    }
    
    /**
     * Partial constructor
     *
     * @param number
     */
    public Subscription(int number) {
        super();
        this.number = number;
    }
    
    // -------------------------------Getters And
    // Setters------------------------------
    
    /**
     * @return the subscription number
     */
    public int getNumber() {
        return number;
    }
    
    /**
     * set the subscription number
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    /**
     * @return receptionist that sold this subscription
     */
    public Receptionist getReceptionist() {
        return receptionist;
    }
    
    /**
     * set the receptionist that sold this subscription
     *
     * @param receptionist
     */
    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }
    
    /**
     * @return the customer owning this subscription
     */
    public Customer getCustomer() {
        return customer;
    }
    
    /**
     * set the customer owning this subscription
     *
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    /**
     * set subscription start date
     *
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    /**
     * @return the subscription start date
     */
    public Date getStartDate() {
        return startDate;
    }
    
    /**
     * @return the peiod the subscription is valid for
     */
    public E_Periods getPeriod() {
        return period;
    }
    
    /**
     * set the peiod the subscription is valid for
     *
     * @param period
     */
    public void setPeriod(E_Periods period) {
        this.period = period;
    }
    
    /**
     * @return the lessons the subscription is registered to
     */
    public Set<Lesson> getLessons() {
        return Collections.unmodifiableSet(lessons);
    }
    
    /**
     * set the lessons the subscription is registered to
     *
     * @param lessons
     */
    public void setLessons(Set<Lesson> lessons) {
        this.lessons = lessons;
    }
    
    /**
     * @return the workouts scheduled for this subscription
     */
    public Set<Workout> getWorkouts() {
        return Collections.unmodifiableSet(workouts);
    }
    
    /**
     * set the workouts scheduled for this subscription
     *
     * @param workouts
     */
    public void setWorkouts(Set<Workout> workouts) {
        this.workouts = workouts;
    }
    
    // -------------------------------More Methods------------------------------
    
    /**
     * This method calculate the last date the subscription is valid for
     *
     * @return the last date the subscription is valid for
     * @see utils.E_Periods
     */
    public Date getLastDay() {
        if (this.getStartDate() != null && this.getPeriod() != null) {
            Date lastDay = (Date) this.getStartDate().clone();
            lastDay.setMonth(lastDay.getMonth() + this.getPeriod().getNumber());
            return lastDay;
        }
        return null;
    }
    
    /**
     * This method adds a lesson to the subscription's lessons set IF its new
     * for this subscription
     *
     * @param lessonToAdd
     * @return true if the lesson was added successfully, false other
     */
    public boolean addLesson(Lesson lessonToAdd) {
        if (lessonToAdd != null) {
            if (this.lessons.contains(lessonToAdd))
                return false;
            return this.lessons.add(lessonToAdd);
        }
        return false;
    }
    
    /**
     * This method delete a lesson from the lessons set of this subscription
     *
     * @param lessonToCancel
     * @return true if the lesson was deleted successfully, false other
     */
    public boolean cancelLesson(Lesson lessonToCancel) {
        if (lessonToCancel != null)
            if (this.lessons.contains(lessonToCancel))
                return this.lessons.remove(lessonToCancel);
        return false;
    }
    
    /**
     * Checks if a subscription is valid right now
     * @return
     */
    public boolean isValid(){
        if(getStartDate().before(new Date())
                && getLastDay().after(new Date())){
            return true;
        }
        return false;
    }
    
    /**
     * This method adds a workout to the subscription's workouts set IF its new
     * for this subscription
     *
     * @param workoutToAdd
     * @return true if the workout was added successfully, false other
     */
    public boolean addWorkout(Workout workoutToAdd) {
        if (workoutToAdd != null) {
            if (this.workouts.contains(workoutToAdd))
                return false;
            return this.workouts.add(workoutToAdd);
        }
        return false;
    }
    
    /**
     * This method delete a workout from the workouts set of this subscription
     * only after canceling all related objects
     *
     * @param workoutToCancel
     * @return true if the lesson was deleted successfully, false other
     */
    public boolean cancelWorkout(Workout workoutToCancel) {
        if (workoutToCancel != null)
            if (this.workouts.contains(workoutToCancel)) {
                for (Practice p : workoutToCancel.getTimeAndinstruments().keySet()) {
                    (workoutToCancel.getTimeAndinstruments().get(p)).cancelCustomer(this,
                                    workoutToCancel.getTimeAndinstruments());
                }
                if (workoutToCancel.getTimeAndinstruments().isEmpty())
                    if (this.workouts.remove(workoutToCancel)){
                        return true;
                    }
                        
            }
        return false;
    }
    
    // -------------------------------hashCode equals & toString------------------------------
    
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
        Subscription other = (Subscription) obj;
        if (number != other.number)
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Subscription [number=" + number + ", customer=" + customer
                + ", per=" + period + ", startDate=" + startDate.getDate()
                + "/" + (startDate.getMonth() + 1) + "/"
                + (startDate.getYear() + 1900) + "]\n";
    }
    
    
//	@Override
//	public String toString() {
//		return "Subscription [number=" + number + ", startDate=" + startDate.getDate()
//				+ "/" + (startDate.getMonth() + 1) + "/"
//				+ (startDate.getYear() + 1900) + " Lessons= " +lessons + " workouts= " +workouts + "]\n";
//	}
}
