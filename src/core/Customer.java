package core;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import utils.Constants;

/**
 * Class Customer ~ represent a single Customer of the company
 *
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class Customer implements Serializable {
    // -------------------------------Class
    // Members------------------------------
    /**
     * Customer's id number - the key
     */
    private String id;
    
    /**
     * Customer's First name
     */
    private String firstName;
    
    /**
     * Customer's Sure name
     */
    private String lastName;
    
    /**
     * Customer's Date of birth
     */
    private Date birthDate;
    
    /**
     * Customer's Password for entering the system
     */
    private String password;
    
    /**
     * Customer's Email
     */
    private URL email;
    
    /**
     * Customer's Address
     */
    private Address customerAddress;
    
    /**
     * Customer's subscriptions
     */
    private List<Subscription> subs;
    
    // -------------------------------Constructors-----------------------------
    
    /**
     * Full Constructor ~ use for initial all fields
     *
     * @param id
     * @param firstName
     * @param lastName
     * @param birthDate
     * @param password
     * @param email
     * @param customerAddress
     * @param sub
     */
    public Customer(String id, String firstName, String lastName,
            Date birthDate, String password, URL email, Subscription sub,
            Address customerAddress) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.password = password;
        this.email = email;
        this.customerAddress = customerAddress;
        this.subs = new ArrayList<Subscription>();
        this.subs.add(sub);
    }
    
    /**
     * Partial Constructor ~ use for initial all fields
     *
     * @param id
     * @param firstName
     * @param lastName
     * @param birthDate
     * @param password
     * @param email
     * @param customerAddress
     */
    public Customer(String id, String firstName, String lastName,
            Date birthDate, String password, URL email, Address customerAddress) {
        super();
        this.setId(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.password = password;
        this.email = email;
        this.customerAddress = customerAddress;
        this.subs = new ArrayList<Subscription>();
    }
    
    /**
     * Partial Constructor ~ use for initial key fields
     *
     * @param id
     */
    public Customer(String id) {
        super();
        this.setId(id);
        this.subs = new ArrayList<Subscription>();
    }
    
    // ----------------------------Getters And
    // Setters---------------------------
    
    /**
     * @return the customer id
     */
    public String getId() {
        return id;
    }
    
    /**
     * set the customer id
     *
     * @param id
     */
    public void setId(String id) {
        if (checkId(id) != "0")
            this.id = id;
    }
    
    /**
     * @return the customer first name
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * set the customer first name
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * @return the customer last name
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * set the customer last name
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * @return the customer birth date
     */
    public Date getBirthDate() {
        return birthDate;
    }
    
    /**
     * set the customer birth date
     *
     * @param birthDate
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    /**
     * @return the customer password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * set the customer password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * @return the customer email
     */
    public URL getEmail() {
        return email;
    }
    
    /**
     * set the customer email
     *
     * @param email
     */
    public void setEmail(URL email) {
        this.email = email;
    }
    
    /**
     * @return the customer address
     */
    public Address getCustomerAddress() {
        return customerAddress;
    }
    
    /**
     * set the customer address
     *
     * @param customerAddress
     */
    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }
    
    /**
     * @return the customer Subscriptions array
     */
    public List<Subscription> getSubs() {
        return Collections.unmodifiableList(subs);
    }
    
    /**
     * set the customer Subscriptions array
     *
     * @param subs
     */
    public void setSubs(ArrayList<Subscription> subs) {
        this.subs = subs;
    }
    
    // -------------------------------More Methods------------------------------
    
    /**
     * This method adds a new Subscription to the subs ArrayList IF the given
     * sub doesn't already exists in the customer's subs ArrayList.
     *
     * @param sub
     * @return true if this sub was successfully added or false otherwise
     */
    public boolean addSubscription(Subscription sub) {
        if (sub != null)
            if (sub.getCustomer() != null
                    && this.id.equals(sub.getCustomer().getId()))
                if (!this.subs.contains(sub))
                    return this.subs.add(sub);
        return false;
    }
    
    /**
     * This method removes an existing subscription from the subs ArrayList IF
     * the sub exists, after deleting him from all related lessons. Hint! A
     * customer might have more than 1 subscription
     *
     * @param sub
     * @return true if this sub was removed successfully or false otherwise
     */
    public boolean removeSubscription(Subscription sub) {
        if (sub != null)	{
            if (sub.getCustomer() != null
                    && this.id.equals(sub.getCustomer().getId()))
                if (this.subs.contains(sub)) {
                    // the subscription exists - sub should be delete!
                    Subscription subToDelete = this.subs.get(this.subs
                            .indexOf(sub));
                    this.subs.remove(subToDelete);
                    if (this.subs.size() >= 1
                            && !subToDelete.getLessons().isEmpty()) {
                        // add all possible lessons to another subscription and
                        // delete them from the subToDelete
                        // check if there is another sub that fits them
                        
                        //move possible lessons
                        ArrayList<Lesson> temp = new ArrayList<Lesson>(
                                subToDelete.getLessons());
                        for (Lesson l : temp)	{
                            boolean changed = false;
                            for (Subscription s : this.subs)
                                if (!changed && l.getStartDate().after(s.getStartDate())
                                        && l.getStartDate().before(s.getLastDay())) {
                                    Subscription subTo = this.subs
                                            .get(this.subs.indexOf(s));
                                    if (subTo.addLesson(l))	{
                                        if (subToDelete.cancelLesson(l))
                                            changed=true;
                                    }
                                }
                        }
                        // add all possible workouts to another subscription and
                        // delete them from the subToDelete
                        // check if there is another sub that fits them
                        
                        //move possible lessons
                        ArrayList<Workout> tempW = new ArrayList<Workout>(
                                subToDelete.getWorkouts());
                        for (Workout w : tempW)	{
                            boolean changed = false;
                            for (Subscription s : this.subs)
                                if (!changed && w.getDate().after(s.getStartDate())
                                        && w.getDate().before(s.getLastDay())) {
                                    Subscription subTo = this.subs
                                            .get(this.subs.indexOf(s));
                                    if (subTo.addWorkout(w))
                                        if (subToDelete.cancelWorkout(w))
                                            changed=true;
                                }
                        }
                    }
                    // cancel left lessons in subToDelete
                    //only if lesson is in the future
                    HashSet<Lesson> cloneL = new HashSet<>(
                            subToDelete.getLessons());
                    if (!cloneL.isEmpty()) {
                        Iterator<Lesson> it = cloneL.iterator();
                        while (it.hasNext()) {
                            Lesson l = (Lesson) it.next();
                            Set<Lesson> tempLes=new HashSet<Lesson>(subToDelete.getLessons());
                            tempLes.remove(l);
                            subToDelete.setLessons(tempLes);
                            if (l.getStartDate().after(new Date()))	{
                                Map<Customer, Boolean> tempReg = new HashMap<>(l.getRegistered());
                                tempReg.remove(this);
                                l.setRegistered(tempReg);
                            }
                        }
                    }
                    // cancel left Workouts in subToDelete
                    HashSet<Workout> cloneW = new HashSet<>(
                            subToDelete.getWorkouts());
                    if (!cloneW.isEmpty()) {
                        Iterator<Workout> it = cloneW.iterator();
                        while (it.hasNext()) {
                            Workout W = (Workout) it.next();
                            subToDelete.getWorkouts().remove(W);
                            Map<Practice, Instrument> temp = new HashMap(W.getTimeAndinstruments());
                            Iterator<Practice> itP = temp.keySet().iterator();
                            while (itP.hasNext()) {
                                Practice p = itP.next();
                                W.cancelInstrument(temp.get(p), p.getStart(), p.getEnd());
                            }
                        }
                    }
                    return true;
                }
        }
        return false;
    }
    
    /**
     * This method adds a lesson to the lessons ArrayList of the customer IF he
     * has a valid subscription
     *
     * @param lessonToAdd
     * @return
     */
    public boolean addLesson(Lesson lessonToAdd) {
        if (lessonToAdd != null && this.subs.size() > 0) {
            for (Subscription s : this.subs)
                if (s != null
                        && s.getStartDate().before(lessonToAdd.getStartDate())
                        && s.getLastDay().after(lessonToAdd.getStartDate())
                        && s.addLesson(lessonToAdd))
                    return true;
        }
        return false;
    }
    
    /**
     * this method checks if the customer has a subscription that is registered
     * to the given lesson if so, delete it from the subscription lessons
     *
     * @param lessonToCancel
     * @return
     */
    public boolean cancleLesson(Lesson lessonToCancel) {
        if (lessonToCancel != null)
            for (Subscription s : this.subs)
                for (Lesson l : s.getLessons())
                    if (l.equals(lessonToCancel))
                        if (s.cancelLesson(lessonToCancel))
                            return true;
        return false;
    }
    
    /**
     * This method adds a workout to the customer IF he has a valid
     * subscription
     *
     * @param workoutNum
     * @param date
     * @param branchNum
     * @return
     */
    public Workout addWorkout(int workoutNum, Date date, int branchNum) {
        // TODO Auto-generated method stub
        if (workoutNum > 0 && date != null && branchNum > 0
                && this.subs.size() > 0) {
            for (Subscription s : this.subs)
                if (s != null && s.getStartDate().before(date)
                        && s.getLastDay().after(date)) {
                    Workout workoutToAdd = new Workout(workoutNum, s, date,
                            branchNum);
                    if (this.subs.get(this.subs.indexOf(s)).addWorkout(
                            workoutToAdd))
                        return workoutToAdd;
                }
        }
        return null;
    }
    
    /**
     * this method checks if the customer has a subscription that holds the
     * given workout if so, delete it from the subscription workouts
     *
     * @param workoutToCancel
     * @return true if successfully deleted, false other
     */
    public boolean cancleWorkout(Workout workoutToCancel) {
        boolean flag = false;
        if (workoutToCancel != null)
            for (Subscription s : this.subs)
                for (Workout w : s.getWorkouts())
                    if (w.equals(workoutToCancel)) {
                        Subscription sub = s;
                        if (!workoutToCancel.getTimeAndinstruments().isEmpty()) {
                            sub = this.subs.get(this.subs.indexOf(s));
                            for (Practice p : workoutToCancel.getTimeAndinstruments().keySet()) {
                                Instrument ins = workoutToCancel.getTimeAndinstruments().get(p);
                                System.out.println("sub: " + sub +  ", p: " + p);
                                if (ins.cancelCustomer(sub, p)){
                                    flag = true;
                                }
                            }
                        } else
                            flag = true;
                        if (flag){
                            sub.cancelWorkout(w);
                            return true;
                        }
                            
                    }
        return false;
    }
    
    /**
     * this method get a string and check if the string is a valid ID number if
     * it is - return the string, if it's not - return 0
     *
     * @param id
     * @return id if this is an id, else "0"
     */
    public static String checkId(String id) {
        boolean isNum;
        if (id.length() == Constants.ID_NUMBER_SIZE) { // Check length of id
            String regex = "[0-9]+";
            isNum = id.matches(regex); // Check if only numbers
            if (isNum == true)
                return id;
        }
        return "0";
    }
    
    /**
     * Helper method for Query 1 This method finds the number of attended
     * Lessons - meaning PAST lessons this customer attended
     *
     * @return the attended Lessons
     */
    public List<Lesson> getAttendedLessons() {
        Date today = new Date();
        List<Lesson> attended = new ArrayList<Lesson>();
        for (Subscription sub : this.subs)
            // if (sub!=null)
            for (Lesson l : sub.getLessons())
                if (l.getStartDate().before(today)
                        && l.getRegistered().get(this) == true)
                    attended.add(l);
        return attended;
    }
    
    /*
    * Helper method NON-JAVADOC
    *
    * return number of valid subscriptions
    */
    public int getNumOfValidSubs() {
        Date today = new Date();
        int countValid = 0;
        for (Subscription s : getSubs())
            if (s.getStartDate().before(today) && s.getLastDay().after(today))
                countValid++;
        return countValid;
    }
    
    public boolean hasValidSub(Date d){
        for (Subscription sub:this.getSubs()){
            if (sub.getLastDay().after(d)) return true;
        }
        return false;
    }
    
    // -------------------------------hashCode equals &
    // toString------------------------------
    
    @Override
    public String toString() {
        return "Customer [ID Number=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", birthDate="
                + birthDate.getDate() + "/" + (birthDate.getMonth() + 1) + "/"
                + (birthDate.getYear() + 1900) + ", password=" + password
                + ", email=" + email + ", customerAddress=" + customerAddress
                + "]	";
    }
    
//	 @Override
//	 public String toString() {
//	 return "Customer [ID Number=" + id + " Subs= "+ subs +"]\n";
//	 }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Customer other = (Customer) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}// ~ END OF Class Customer