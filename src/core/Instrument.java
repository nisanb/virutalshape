package core;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import utils.Bookable;
import utils.E_Types;

/**
 * Class Instrument ~ represent a single Instrument of the company Each
 * instrument belongs to a specific branch
 *
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class Instrument implements Bookable, Serializable  {
    static final long serialVersionUID = 20;
    // -------------------------------Class Members------------------------------
    /**
     * instrument number
     */
    private int num;
    
    /**
     * related room
     */
    private Room room;
    
    /**
     * instrument status: true is active, false is not for use
     */
    private boolean status;
    
    /**
     * instrument type
     */
    private E_Types type;
    
    /**
     * customers who ordered this instrument, and the practice details
     */
    private Map<Practice, Customer> orders;
    
    // -------------------------------Constructors-----------------------------
    /**
     * Full Constructor ~ use for initial all fields instruments should be
     * numbered automatically
     *
     * @param room
     * @param status
     * @param type
     */
    public Instrument(Room room, boolean status, E_Types type) {
        super();
        this.num = room.getInstruments().size() + 1;
        this.room = room;
        this.status = status;
        this.type = type;
        this.orders = new HashMap<Practice, Customer>();
    }
    
    /**
     * Partial Constructor ~ use for initial key fields
     *
     * @param num
     */
    public Instrument(int num) {
        super();
        this.num = num;
    }
    
    // -------------------------------Getters And
    // Setters------------------------------
    
    /**
     * @return a map of customers who ordered this instrument, and the practice
     *         details
     */
    public Map<Practice, Customer> getOrders() {
        return Collections.unmodifiableMap(orders);
    }
    
    /**
     * @param orders
     *            of customers who ordered this instrument, and the practice
     *            details
     */
    public void setOrders(Map<Practice, Customer> orders) {
        this.orders = orders;
    }
    
    /**
     * @return the Instrument number
     */
    public int getNum() {
        return num;
    }
    
    /**
     * set the Instrument number
     *
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }
    
    /**
     * @return the Instrument room
     */
    public Room getRoom() {
        return room;
    }
    
    /**
     * set the Instrument room
     *
     * @param room
     */
    public void setRoom(Room room) {
        this.room = room;
    }
    
    /**
     * @return the Instrument status
     */
    public boolean getStatus() {
        return status;
    }
    
    /**
     * set the Instrument status
     *
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    /**
     * @return the Instrument type
     */
    public E_Types getType() {
        return type;
    }
    
    /**
     * set the Instrument type
     *
     * @param type
     */
    public void setType(E_Types type) {
        this.type = type;
    }
    
    // -------------------------------More Methods------------------------------
    /**
     * Method from interface Bookable
     *
     * @return the class primary key
     */
    @Override
    public int getPrimaryKey() {
        return getNum();
    }
    
    /**
     * Method from interface Bookable
     *
     * this method adds another customer from start time to end time needs to
     * make sure that the instrument is available- meaning the times for
     * different customers are not overlapping
     *
     * @param obj1 as Subscription
     * @param obj2 as Practice
     * @return true if added successfully, false other
     */
    @Override
    public boolean addCustomer(Object obj1, Object obj2) {// Subscription sub,
        // Practice
        // newPractice) {
        if (obj1 != null && obj2 != null && obj1 instanceof Subscription
                && obj2 instanceof Practice) {
            Subscription sub = (Subscription) obj1;
            Practice newPractice = (Practice) obj2;
            Date startTime = newPractice.getStart();
            Date endTime = newPractice.getEnd();
            // check if the instrument is available at the time
            for (Practice p : this.orders.keySet()) {
                if ((p.getStart().before(endTime) && p.getStart().after(
                        startTime))
                        || p.getStart().equals(startTime)
                        || p.getEnd().equals(endTime)
                        || (p.getEnd().before(endTime) && p.getEnd().after(
                                startTime)))
                    return false;
            }
            this.orders.put(newPractice, sub.getCustomer());
            return true;
        }
        return false;
    }
    
    /**
     * Method from interface Bookable
     *
     * this method cancel a customer order for a practice with this instrument,
     * if it exist. Hint- a customer may order the same instrument more than
     * once.
     */
    @Override
    public boolean cancelCustomer(Object obj1, Object obj2) {
        if (obj1 != null && obj2 != null && obj1 instanceof Subscription
                && obj2 instanceof Practice) {
            Subscription sub = (Subscription) obj1;
            Practice prac = (Practice) obj2;
            if (sub != null)
                if (prac != null)
                    if (this.orders.containsKey(prac))
                        if ((this.orders.get(prac)).equals(sub.getCustomer())) {
                            this.orders.remove(prac, sub.getCustomer());
                            return true;
                        }
        }
        return false;
    }
    
    // -------------------------------hashCode equals &
    // toString------------------------------
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + num;
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
        Instrument other = (Instrument) obj;
        if (num != other.num)
            return false;
        return true;
    }
    
    @Override
    public String toString(){
        return type.toString()+" ("+num+")";
    }
    
    public String toString2() {
        return "Instrument [num=" + num + ", room=" + room.getRoomNum()
                + " in branch number " + room.getBranch().getBranchNumber()
                + ", status=" + status + ", type=" + type + "]\n";
    }
    
}
