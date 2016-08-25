package init;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import utils.Constants;
import utils.E_Cities;
import utils.E_Lessons;
import utils.E_Levels;
import utils.E_Periods;
import utils.E_Rooms;
import utils.E_Types;
import core.Address;
import core.Branch;
import core.Coach;
import core.Customer;
import core.Employee;
import core.Instrument;
import core.Lesson;
import core.Practice;
import core.Receptionist;
import core.Room;
import core.Subscription;
import core.Workout;
import java.text.SimpleDateFormat;


/**
 * This IShape object represents the class system
 *
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class IShape implements Serializable {
    static final long serialVersionUID = 1;
    
    // --------------------------Class Members---------------------------
    /**
     * IShape employees
     */
    private HashMap<Integer, Employee> employees;
    
    /**
     * IShape branches
     */
    private HashMap<Integer, Branch> branches;
    
    /**
     * IShape customers
     */
    private HashMap<String, Customer> customers;
    
    /**
     * IShape lessons
     */
    private HashMap<Integer, Lesson> lessons;
    
    /**
     * IShape Workouts
     */
    private HashMap<Integer, Workout> workouts;
    
    
    /**
     * IShape subscriptions
     */
    private HashMap<Integer, Subscription> subs;
    
    
    /**
     * This variables are required for auto numbering of new objects
     */
    private int EMPLOYEES, SUBSCRIPTIONS, WORKOUTS, LESSONS;
    
    private static IShape Data;
    // -------------------------------Constructors------------------------------
    /**
     * Full Constructor ~ use for initial all data structures
     */
    public IShape() {
        employees = new HashMap<Integer, Employee>();
        branches = new HashMap<Integer, Branch>();
        customers = new HashMap<String, Customer>();
        lessons = new HashMap<Integer, Lesson>();
        workouts = new HashMap<Integer, Workout>();
        subs = new HashMap<Integer,Subscription>();
        EMPLOYEES = 0;
        SUBSCRIPTIONS = 0;
        WORKOUTS = 0;
        LESSONS = 0;
    }
    
    // -----------------------------------------Getters------------------------------------
    
    /**
     * @return the branches
     */
    public Map<Integer, Branch> getBranches() {
        return Collections.unmodifiableMap(branches);
    }
    
    /**
     * @return the employees
     */
    public Map<Integer, Employee> getEmployees() {
        return Collections.unmodifiableMap(employees);
    }
    
    /**
     * @return the customers
     */
    public Map<String, Customer> getCustomers() {
        return Collections.unmodifiableMap(customers);
    }
    
    /**
     * @return the Lessons
     */
    public Map<Integer, Lesson> getLessons() {
        return Collections.unmodifiableMap(lessons);
    }
    
    /**
     * @return the workouts
     */
    public Map<Integer, Workout> getWorkouts() {
        return Collections.unmodifiableMap(workouts);
    }
    
    public Map<Integer,Subscription> getSubs(){
        return Collections.unmodifiableMap(subs);
    }
    
    /**
     * Next Auto Number getters
     * @return the numbers of type required
     */
    public int getNextEmp(){
        return EMPLOYEES;
    }
    
    public int getNextWork(){
        return WORKOUTS;
    }
    
    public int getNextSub(){
        return SUBSCRIPTIONS;
    }
    
    public int getNextLes(){
        return LESSONS;
    }
    
    // --------------------------Add && Remove Methods-------------------------
    /**
     * This method adds a new branch to our company IFF the branch doesn't
     * already exist and the details are valid.
     *
     * @param branchNumber
     * @param branchName
     * @param city
     * @param street
     * @param houseNumber
     * @param phoneNumber
     * @return true if the branch was added successfully, otherwise false
     */
    public boolean addBranch(int branchNumber, String branchName,
            E_Cities city, String country, String street, int houseNumber,
            String[] phoneNumber) {
        if (branchName != null && branchNumber > 0 && city != null
                && street != null && houseNumber > 0 && phoneNumber != null
                && country != null) {
            
            if (!branches.containsKey(branchNumber)) {
                Address branchAddress = new Address(country, city, street,
                        houseNumber, phoneNumber);
                Branch branchToAdd = new Branch(branchNumber, branchName,
                        branchAddress);
                branches.put(branchNumber, branchToAdd);
                return true;
            }
        }
        return false;
    } // ~ END OF addBranch
    
    /**
     * Creates and adds a new employee into the relevant data-structure
     *
     * @param emp
     * @return true IF the coach was added successfully, otherwise false
     */
    public boolean addEmployee(Employee emp) {
        // Check validity first
        
        if (emp != null && emp.getEmployeeNumber() > 0
                && !employees.containsKey(emp.getEmployeeNumber())) {
            EMPLOYEES++;
            employees.put(emp.getEmployeeNumber(), emp);
            return true;
        }
        return false;
    }// ~ END OF addEmployee
    
    /**
     * Creates and adds a new customer into the relevant data-structure. id
     * number length needs to be as it's represented in Constants class and
     * contains only digits.
     *
     * @see Constants#ID_NUMBER_SIZE
     * @param id
     * @param firstName
     * @param lastName
     * @param birthDate
     * @param password
     * @param email
     * @param customerAddress
     * @return true if the customer was added successfully
     */
    public boolean addCustomer(String id, String firstName, String lastName,
            Date birthDate, String password, URL email, Address customerAddress) {
        // Check validity first
        if (id != null && firstName != null && lastName != null
                && birthDate != null && password != null && email != null
                && customerAddress != null)
            if (id.length() == Constants.ID_NUMBER_SIZE) {
                for (int i = 0; i < id.length(); i++)
                    if (!Character.isDigit(id.charAt(i)))
                        return false;
                if (!customers.containsKey(id)) {
                    // Creating a new customer with his partial constructor
                    Customer customer = new Customer(id, firstName, lastName,
                            birthDate, password, email, customerAddress);
                    customers.put(id, customer); // Add this customer
                    return true;
                }
            }
        return false;
    }// ~ END OF addCustomer
    
    /**
     * Creates a new subscription, and add it to the relevant customer and
     * receptionist. if needed don't forget to rollback
     *
     * @param subNumber
     * @param custId
     * @param period
     * @param startDate
     * @return true if the subscription was added to the customer, false other
     */
    public boolean addSubToCustomer(int subNumber, String custId,
            int receptNumber, E_Periods period, Date startDate) {
        if (subNumber > 0 && custId != null && receptNumber > 0
                && period != null && startDate != null)
            if (customers.containsKey(custId)
                    && employees.containsKey(receptNumber)) {
                        SUBSCRIPTIONS++;
                Employee emp = employees.get(receptNumber);
                if (emp instanceof Receptionist) {
                    Subscription subToAdd = new Subscription(subNumber,
                            customers.get(custId), (Receptionist) emp, period,
                            startDate);
                    if (customers.get(custId).addSubscription(subToAdd))
                        if (((Receptionist) emp).addSubscription(subToAdd)){
                            this.subs.put(new Integer(subNumber), subToAdd);
                            return true;
                        }
                        else
                            customers.get(custId).removeSubscription(subToAdd);
                }
            }
        return false;
    }// ~ END OF addSubToCustomer
    
    /**
     * This method connects an employee a branch IF the branch and the employee
     * exists.
     *the method removes the employee from the old branch and adds him to new branch
     * @param empNumber
     * @param branchNumber
     * @return true if the connection was added successfully, otherwise false
     */
    public boolean connectEmloyeeToBranch(int empNumber, int branchNumber) {
        boolean flag = false;
        if (empNumber > 0 && branchNumber > 0)
            if (employees.containsKey(empNumber) && branches.containsKey(branchNumber)) {
                if (employees.get(empNumber) instanceof Coach){
                    if (branches.get(branchNumber).addCoach((Coach) employees.get(empNumber))) {
                        if (this.employees.get(empNumber).getWorkBranch() !=null)
                            this.employees.get(empNumber).getWorkBranch().removeCoach((Coach)this.employees.get(empNumber));
                        flag = true;
                    }
                }
                
                if (employees.get(empNumber) instanceof Receptionist){
                    if (branches.get(branchNumber).addReceptionist((Receptionist) employees.get(empNumber))) {
                        if (this.employees.get(empNumber).getWorkBranch() !=null)
                            this.employees.get(empNumber).getWorkBranch().removeReceptionist((Receptionist)this.employees.get(empNumber));
                        flag = true;
                    }
                }
                if (flag) {
                    employees.get(empNumber).setWorkBranch(branches.get(branchNumber));
                    return true;
                }
            }
        return false;
    }// ~ END OF connectEmloyeeToBranch
    
    /**
     * this method adds a room to a branch IF the branch already exist
     *
     * @param roomNum
     * @param maxNumOfTrainees
     * @param roomType
     * @param branchNum
     * @return true if the room was added to the branch, false other
     */
    public boolean addRoomToBranch(int roomNum, int maxNumOfTrainees,
            int maxNumOfInstruments, E_Rooms roomType, int branchNum) {
        if (roomNum > 0 && maxNumOfTrainees > 0 && maxNumOfInstruments >= 0
                && roomType != null && branchNum > 0) {
            if (branches.containsKey(branchNum)) {
                // the method branch.addRoom(roomToAdd) checks if the room is
                // new and adds it to the branch
                Room roomToAdd = new Room(roomNum, maxNumOfTrainees,
                        maxNumOfInstruments, roomType, branches.get(branchNum));
                return branches.get(branchNum).addRoom(roomToAdd);
            }
        }
        return false;
    }// ~ END OF addRoomToBranch
    
    /**
     * this method adds instruments to a specific room in a branch
     *
     * @param branchNum
     * @param roomNum
     * @param type
     * @param status
     * @param amount
     * @return true if ALL instruments were added, false if some or none were
     *         added
     */
    public boolean addInstrumentToRoom(int branchNum, int roomNum,
            E_Types type, boolean status, int amount) {
        if (branchNum > 0 && roomNum > 0 && type != null && amount > 0) {
            int count = 0;
            if (branches.containsKey(branchNum)) {
                Branch branch = branches.get(branchNum);
                if (branch.getRooms() != null
                        && branch.getRooms().contains(
                                new Room(roomNum, branchNum))) {
                    
                    Room r = branch.getRooms().get(
                            branch.getRooms().indexOf(
                                    new Room(roomNum, branchNum)));
                    if (r.getInstruments() != null) {
                        for (int j = 0; j < amount; j++) {
                            Instrument ins = new Instrument(r, status, type);
                            if (r.addInstruments(ins))
                                count++;
                        }
                    }
                    if (count == amount)
                        return true;
                }
            }
        }
        return false;
    }
    
    /**
     * This method add a new Lesson to IShape Hint- think of all the things that
     * are related to a lesson or should store the lesson, and don't forget to
     * rollBack if needed
     *
     * @param lessonNum
     * @param lessonName
     * @param dateTime
     * @param level
     * @param coachNum
     * @param maxStudent
     * @param branchNum
     * @param roomNum
     * @return true if a lesson was added, false other
     */
    public boolean addLesson(int lessonNum, E_Lessons lessonName,
            Date dateTime, E_Levels level, int coachNum, int maxStudent,
            int branchNum, int roomNum) {
        
        if (new Date().after(dateTime)) {
            System.out.println("Date error");
            return false;
        }
        if (lessonNum > 0 && lessonName != null && dateTime != null
                && level != null && coachNum > 0 && maxStudent > 0
                && branchNum > 0 && roomNum > 0) {
            LESSONS++;
            // if the coach & branch exists and the lesson is new
            if (employees.containsKey(coachNum)
                    && branches.containsKey(branchNum)
                    && !lessons.containsKey(lessonNum)) {
                Coach coach = (Coach) employees.get(coachNum);
                Branch branch = branches.get(branchNum);
                if (branch.getRooms() != null)
                    for (Room r : branch.getRooms())
                        if (r != null && r.getRoomNum() == roomNum) {
                            Lesson leesonToAdd = new Lesson(lessonNum,
                                    lessonName, level, dateTime, coach,
                                    maxStudent, branch.getRooms().get(
                                            branch.getRooms().indexOf(r)));
                            if (leesonToAdd.getCoach() != null)
                                if (coach.addLesson(leesonToAdd))
                                    if (branch.getRooms()
                                            .get(branch.getRooms().indexOf(r))
                                            .addLessons(leesonToAdd)) {
                                        lessons.put(leesonToAdd.getLessonNum(),
                                                leesonToAdd);
                                        return true;
                                    } else
                                        coach.removeLesson(leesonToAdd);
                        }
            }
        }
        return false;
    }
    
    /**
     * This method adds a customer to a specific lesson if his subscription
     * fits, with default "attended" as false Hint: if needed, don't forget to
     * rollback
     *
     * @param custNum
     * @param lessonNum
     * @return true if the customer is registered to the lesson, false other
     */
    public boolean addCustomerToLesson(String custNum, int lessonNum) {
        if (custNum != null && lessonNum > 0)
            if (customers.containsKey(custNum)
                    && lessons.containsKey(lessonNum)) {
                Customer custToAdd = customers.get(custNum);
                Lesson lessonToAdd = lessons.get(lessonNum);
                if (lessonToAdd.hasFreeSpace()
                        && custToAdd.addLesson(lessonToAdd))
                    if (lessonToAdd.addCustomer(custToAdd, false))
                        return true;
                    else
                        custToAdd.cancleLesson(lessonToAdd);
            }
        return false;
    }
    
    /**
     * This method adds a workout to a customer if his subscription fits
     *
     * @param workoutNum
     * @param customerNum
     * @param date
     * @param branchNum
     * @return
     */
    public boolean addWorkout(int workoutNum, String customerNum, Date date,
            int branchNum) {
        
        if (workoutNum > 0 && customerNum != null && date != null && branchNum > 0) {
            WORKOUTS++;
            if (customers.containsKey(customerNum)) {
                Customer cust = customers.get(customerNum);
                if (cust != null) {
                    Workout workoutToAdd = cust.addWorkout(workoutNum, date,
                            branchNum);
                    if (workoutToAdd != null) {
                        if (!workouts.containsValue(workoutToAdd)) {
                            workouts.put(workoutNum, workoutToAdd);
                            return true;
                        } else
                            cust.cancleWorkout(workoutToAdd);
                    }
                }
            }
        }
        return false;
    }
    
    /**
     * This method change the address of existing customer IFF the customer
     * already exist and the Address details are valid.
     *
     * @param id
     * @param country
     * @param city
     * @param street
     * @param houseNumber
     * @param phonenumbers
     * @return true if succeeded, otherwise false.
     */
    public boolean changeCustomerAddress(String id, String country,
            E_Cities city, String street, int houseNumber, String[] phonenumbers) {
        if (id != null && country != null && city != null && street != null
                && houseNumber > 0 && phonenumbers != null) {
            if (customers.containsKey(id)) {
                Customer customer = customers.get(id);
                Address address = new Address(country, city, street,
                        houseNumber, phonenumbers);
                customer.setCustomerAddress(address);
                return true;
            }
        }
        return false;
    } // ~ END OF changeCustomerAddress
    
    /**
     * This method cancels a subscription from the system using the subNumber
     * (Primary Key). The subscription will be canceled IFF all connections will
     * be deleted
     *
     * @param subNumber
     * @return true if subscription was canceled, false otherwise
     */
    public boolean cancelSubscription(int subNumber) {
        if (subNumber > 0) {
            Subscription sub = new Subscription(subNumber);
            // Check if the subscription exist
            for (Customer customer : customers.values())
                if (customer != null && customer.getSubs() != null)
                    for (Subscription s : customer.getSubs())
                        if (s != null && s.equals(sub)) {
                            sub = s;
                            Customer cust = customers.get(customer.getId());
                            // Remove the subscription from the customer
                            if (cust.removeSubscription(sub)){
                                this.subs.remove(new Integer(subNumber));
                                return true;
                            }
                        }
        }
        return false;
    }// ~ END OF cancelSubscription
    
    /**
     * this method cancel a workout Hint: don't forget to disconnects all
     * relevant objects
     *
     * @param workoutNum
     * @return
     */
    public boolean cancelWorkout(int workoutNum) {
        if (workoutNum > 0) {
            if (workouts.containsKey(workoutNum)) {
                Workout workoutToDelete = workouts.get(workoutNum);
                if (workoutToDelete != null) {
                    if (workoutToDelete.getSub().getCustomer()
                            .cancleWorkout(workoutToDelete)) {
                        workouts.remove(workoutNum);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    /**
     * this method adds a new instrument to a specific workout, connecting it to
     * all relevant objects. Hint: don't forget to rollback if needed
     *
     * @param workoutNum
     * @param branchNum
     * @param roomNum
     * @param type
     * @param startTime
     * @param minutes
     * @return
     */
    public boolean addInstrumentToWorkout(int workoutNum, int branchNum,
            int roomNum, E_Types type, Date startTime, int minutes) {
        if (workoutNum > 0 && branchNum > 0 && roomNum > 0 && type != null
                && startTime != null && minutes > 0) {
            if (workouts.containsKey(workoutNum)
                    && branches.containsKey(branchNum)
                    && workouts.get(workoutNum).getBranchNum() == branchNum) {
                Workout workout = workouts.get(workoutNum);
                Branch branch = branches.get(branchNum);
                Room room = branch.getRooms()
                        .get(branch.getRooms().indexOf(
                                new Room(roomNum, branchNum)));
                
                Date endTime = (Date) startTime.clone();
                Calendar cal = Calendar.getInstance();
                cal.setTime(endTime);
                cal.add(Calendar.MINUTE, minutes);
                endTime = cal.getTime();
                
                Practice practice = new Practice(startTime, endTime);
                if (workout != null && room != null
                        && room.getInstruments() != null
                        && !room.getInstruments().isEmpty() && practice != null) {
                    // the room exist and have instruments in it
                    for (Instrument ins : room.getInstruments()) {
                        if (ins.getType().equals(type) && ins.getStatus()) {
                            // there is an active instrument of the wanted type
                            if (ins.addCustomer(workout.getSub(), practice)) {
                                if (workout.addInstrument(ins, startTime,
                                        endTime))
                                    return true;
                                else
                                    ins.cancelCustomer(workout.getSub(),
                                            practice);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    /**
     * this method marks a given customer as "attended" (true) for a specific
     * lesson, after the customer came to the lesson Hint: a customer can't
     * attend parallel lessons
     *
     * @param customerId
     * @param lessonNum
     * @return
     */
    public boolean attendLesson(String customerId, int lessonNum) {
        if (customerId != null && lessonNum > 0) {
            if (customers.containsKey(customerId)
                    && lessons.containsKey(lessonNum)) {
                Lesson lesson = lessons.get(lessonNum);
                Customer cust = customers.get(customerId);
                Date today = new Date();
                Date start = lesson.getStartDate();
                Date end = lesson.getEndDate();
                if (cust.getAttendedLessons().contains(lesson)
                        || lesson.getStartDate().after(today))
                    return false;
                // check if cust attended another lesson at the same time
                for (Lesson l : lessons.values()) {
                    if (((l.getStartDate().before(end) && l.getStartDate()
                            .after(start))
                            || l.getStartDate().equals(start)
                            || l.getEndDate().equals(end) || (l.getEndDate()
                                    .before(end) && l.getEndDate().after(start)))
                            && l.getRegistered().containsKey(cust)
                            && l.getRegistered().get(cust)) {
                        return false;
                    }
                }
                
                if (lesson.getRegistered().containsKey(cust)) {
                    Map<Customer, Boolean> registered = new HashMap<Customer, Boolean>(
                            lesson.getRegistered());
                    registered.put(cust, true);
                    lesson.setRegistered(registered);
                    return true;
                }
            }
        }
        return false;
    }
    
    // -------------------------------Queries------------------------------
    
    // ===================================================
    // HW_1_Queries
    // ===================================================
    /**
     * This method returns all lessons of the most active customer. Most active
     * customer is the customer with the most ATTENDED lessons A lesson will be
     * counted as attended if its date has past already AND the customer attended the lesson
     *
     * @return ordered list of lessons by start date
     */
    public String getAllAttendedLessonsOfMostActiveCustomer() {
        int numberOfLessons = 0;
        Customer profitableCustomer = null;
        
        for (Customer customer : customers.values()) {
            if (customer.getAttendedLessons().size() > numberOfLessons) {
                profitableCustomer = customer;
                numberOfLessons = customer.getAttendedLessons().size();
            }
        }
        if (profitableCustomer == null)
            return null;
        Collections.sort(profitableCustomer.getAttendedLessons(),
                new Comparator<Lesson>() {
                    public int compare(Lesson l1, Lesson l2) {
                        return l1.getStartDate().compareTo(l2.getStartDate());
                    }
                });
        System.out.println(profitableCustomer.getId());
        String toReturn = "";
        for(Lesson l : profitableCustomer.getAttendedLessons()){
            
            toReturn=toReturn+l.getLessonNum()+" - "+l.getName().toString()+"<br>ASD";
        }
        String heading = "The most active customers' attended lessons are:<br>";
        toReturn = "<html>"+heading+toReturn+"</html>";
        
        return toReturn;
    } // ~ END OF getAllLessonsOfMostActiveCustomer
    
    /**
     * Find customers that practiced in a given branch X but not in another
     * given branch Y <b>Hint:<b> locate all the customers from X and remove
     * from it all customers from branches X and Y.
     *
     * @param branchXnumber
     * @param branchYnumber
     * @return list of customers
     */
    public String getAllCustomersFromBranchXbutNotFromBranchY(
            int branchXnumber, int branchYnumber) {
        List<Customer> customersFromBranchX = new ArrayList<Customer>();
        // Check if branch X and branch Y exist
        if (branchXnumber > 0 && branchYnumber > 0) {
            if (branches.containsKey(branchXnumber)
                    && branches.containsKey(branchYnumber)) {
                Branch branchX = branches.get(branchXnumber);
                Branch branchY = branches.get(branchYnumber);
                // Add all customers from branch X to the list
                for (Room room : branchX.getRooms())
                    if (room != null)	{
                        if (room.getLessons() != null)
                            for (Lesson lesson : room.getLessons())
                                if (lesson != null)
                                    for (Customer cust : lesson.getRegistered()
                                            .keySet())
                                        if (cust != null
                                                && !customersFromBranchX
                                                        .contains(cust))
                                            customersFromBranchX.add(cust);
                        if (room.getInstruments()!=null && !room.getInstruments().isEmpty())
                            for (Instrument ins : room.getInstruments())
                                for (Customer cust : ins.getOrders().values())
                                    if (cust != null && !customersFromBranchX.contains(cust))
                                        customersFromBranchX.add(cust);
                        
                    }
                
                // Remove all customers from branch Y from the list
                for (Room room : branchY.getRooms())
                    if (room != null)	{
                        if (room.getLessons() != null)
                            for (Lesson lesson : room.getLessons())
                                if (lesson != null)
                                    for (Customer cust : lesson.getRegistered()
                                            .keySet())
                                        if (cust != null
                                                && customersFromBranchX
                                                        .contains(cust))
                                            customersFromBranchX.remove(cust);
                        if (room.getInstruments()!=null && !room.getInstruments().isEmpty())
                            for (Instrument ins : room.getInstruments())
                                for (Customer cust : ins.getOrders().values())
                                    if (cust != null && customersFromBranchX.contains(cust))
                                        customersFromBranchX.remove(cust);
                    }
            }
        }
        
        String str = "";
        for(Customer x : customersFromBranchX){
            str = str+x.toString()+"<br>";
        }
        if(str.equals("")) return "No customers found.";
        Branch branchx = getBranches().get(branchXnumber);
        Branch branchy = getBranches().get(branchYnumber);
        String heading = "The following customers visited branch "+branchx.getBranchName()+" but not branch "+branchy.getBranchName()+":<br>";
        str = "<html>"+heading+str+"</html>";
        return str;
    } // ~ END OF getAllCustomersFromBranchXbutNotFromBranchY
    
    /**
     * This query returns the most popular Lesson Type. Most popular Lesson Type
     * is the Lesson Type with the highest number of registered customers.
     * <b>Hint!</b>The number of registered customers is saved for each lesson
     *
     * @return a lesson type
     */
    public String getTheMostPopularLessonType() {
        //Both ways are ok- this and the next one marked in green
        //first way: lower time complexity, higher space complexity than second way
        //firs way result: AEROBICS
        //second way result: YOGA
        int maxRegisteredForType = 0, count = 0;
        E_Lessons popularLessonType = null;
        Map<E_Lessons, Integer> popLess = new HashMap<E_Lessons, Integer>();
        
        for (Lesson l: lessons.values())	{
            if (popLess.containsKey(l.getName()))	{
                popLess.put(l.getName(), (popLess.get(l.getName())+l.getRegistered().size()));
            }
            else
                popLess.put(l.getName(), l.getRegistered().size());
        }
        for (Map.Entry<E_Lessons, Integer> e : popLess.entrySet())
            if (e.getValue() > maxRegisteredForType)	{
                maxRegisteredForType = e.getValue();
                popularLessonType = e.getKey();
            }
        /*for (E_Lessons type : E_Lessons.values()) {
        count = 0;
        for (Lesson l : lessons.values())
        if (l != null && l.getRegistered() != null
        && l.getName().equals(type))
        for (Customer c : l.getRegistered().keySet())
        if (c != null) {
        count++;
        }
        if (count > maxRegisteredForType) {
        maxRegisteredForType = count;
        popularLessonType = type;
        }
        }*/
        return "The most popular lesson type is: "+popularLessonType.toString();
    }// ~END OF getTheMostPopularLessonType
    
    /**
     * The receptionist of the month is the receptionist who sold the most
     * active subscriptions this month (must be at least 2) A subscription will
     * be count as an active subscription only after it was used for registering
     * a lesson
     *
     * @return the receptionist of the month if it exist, null other
     */
    public String getReceptionistOfTheMonth() {
        Date today = new Date();
        int count, maxActiveSubs = 0;
        Receptionist recepOfTheMonth = null;
        for (Employee emp : employees.values())
            if (emp instanceof Receptionist) {
                count = 0;
                for (Subscription sub : ((Receptionist) emp).getSubscriptions()) {
                    if (sub != null
                            && sub.getStartDate().getYear() == today.getYear()
                            && sub.getStartDate().getMonth() == today
                                    .getMonth()) {
                        if (sub.getLessons().size() > 0) {
                            count++;
                        }
                    }
                }
                if (count > maxActiveSubs) {
                    maxActiveSubs = count;
                    recepOfTheMonth = (Receptionist) emp;
                }
            }
        if (maxActiveSubs >= 2)
            return "Top receptionist of the month is: "+recepOfTheMonth.toString()+" with "+recepOfTheMonth.getSubscriptions().size()+" Subscriptions!";
        return "There are no receptionists who made it to Receptionist Of The Month";
    }
    
    /**
     * This method finds all of the super senior coaches of this month. A coach
     * is considered a super senior coach if he started working over 15 years
     * ago and gives at least 2 lessons this month
     *
     * @return an array of super senior coaches if found, null other
     */
    public String getAllSuperSeniorCoaches() {
        Date today = new Date();
        List<Coach> superCoaches = new ArrayList<Coach>();
        int count = 0;
        for (Employee emp : employees.values())
            if (emp instanceof Coach && emp.getEmployeeSeniority() >= 15) {
                count = 0;
                for (Lesson l : ((Coach) emp).getLessons())
                    if (l != null
                            && l.getStartDate().getYear() == today.getYear()
                            && l.getStartDate().getMonth() == today.getMonth())
                        count++;
                if (count >= 2)
                    superCoaches.add((Coach) emp);
            }
        if (!superCoaches.isEmpty()) {
            ArrayList<Coach> a = (ArrayList<Coach>) superCoaches;
            Coach[] arr = a.toArray(new Coach[a.size()]);
            String toReturn = "";
            for(Coach c : arr){
                toReturn = toReturn + c.toString() + "<br>";
            }
            String heading = "The following coaches have made it to Senior Rank: <br>";
            toReturn = "<html>"+heading+toReturn+"</html>";
            return toReturn;
        }
        return "Currently there are no coaches at senior rank.";
    }
    
    /**
     * this method returns the top receptionist of this year January the top
     * receptionist is the one who sold the most subscriptions during this
     * January
     *
     * @return the top receptionist
     */
    public String getTopJanuaryReceptionists() {
        Receptionist topReceptionist = null;
        int max = 0;
        for (Employee emp : employees.values())
            if (emp instanceof Receptionist
                    && ((Receptionist) emp)
                            .getNumberOfThisYearJanuaryAssignments() > max) {
                max = ((Receptionist) emp)
                        .getNumberOfThisYearJanuaryAssignments();
                topReceptionist = (Receptionist) emp;
            }
        if(topReceptionist == null){
            return "No receptionist found.";
        } else return "The following employee is our receptionist of this years' January: "+topReceptionist.toString();
    }
    
    /**
     * this query returns the customer who registered to the most time this
     * month count both time for workouts and for registered lessons NO NEED TO
     * CHECK if the customer attended the lesson or not (future lessons and
     * workouts in this month will be counted)
     *
     * @return the customer who registered to the most time this month
     */
    public String getTopCustomerOfTheMonth() {
        Customer topCust = null;
        int maxTime = 0, count;
        Date today = new Date();
        for (Customer c : customers.values()) {
            c.toString();
        }
        for (Customer cust : customers.values()) {
            count = 0;
            for (Subscription sub : cust.getSubs()) {
                for (Workout wor : sub.getWorkouts()) {
                    if (wor.getDate().getMonth() == today.getMonth()
                            && wor.getDate().getYear() == today.getYear())
                        for (Practice p : wor.getTimeAndinstruments().keySet())
                            count += p.getTimeInMinute();
                }
                if (!sub.getLessons().isEmpty()) {
                    for (Lesson l : sub.getLessons()) {
                        if (l.getStartDate().getMonth() == today.getMonth()
                                && l.getStartDate().getYear() == today
                                        .getYear())
                            count += 120;
                    }
                }
            }
            if (count > maxTime) {
                maxTime = count;
                topCust = cust;
            }
        }
        if (topCust != null)
            return "The following customer is our most active customer:<br>"+ topCust.toString();
        return "There are no customers to display.";
    }
    
    /**
     * top instrument type is the type of instrument that is ordered the most
     * times
     *
     * @return the most ordered type of instrument
     */
    public String getTopIstrumentType() {
        HashMap<E_Types, Integer> types = new HashMap<>();
        for (E_Types type : E_Types.values()) {
            types.put(type, 0);
        }
        for (Workout workout : getWorkouts().values()) {
            for (Instrument ins : workout.getTimeAndinstruments().values()) {
                E_Types insType = ins.getType();
                types.put(insType, (types.get(insType) + 1));
            }
        }
        int max = 0;
        E_Types maxEtype = null;
        for (Map.Entry<E_Types, Integer> entry : types.entrySet()) {
            if (entry.getValue() >= max) {
                max = entry.getValue();
                maxEtype = entry.getKey();
            }
        }
        return "Top Instrument and most used is "+maxEtype.toString();
    }
    
    /**
     * this method returns all customers who registered lessons or workouts in
     * more than 1 city
     *
     * @return the list of customers, or null
     */
    public String getAllCustomersAttendingMoreThan1City() {
        ArrayList<Customer> customersDiffCities = new ArrayList<Customer>();
        if (!this.customers.isEmpty()) {
            for (Customer c : this.customers.values()) {
                List<E_Cities> cities = new ArrayList<E_Cities>();
                for (Subscription s : c.getSubs()) {
                    for (Lesson l : s.getLessons())
                        if (!cities.contains(l.getRoom().getBranch()
                                .getBranchAddress().getCity()))
                            cities.add(l.getRoom().getBranch()
                                    .getBranchAddress().getCity());
                    for (Workout w : s.getWorkouts())
                        if (!cities.contains(branches.get(w.getBranchNum())
                                .getBranchAddress().getCity()))
                            cities.add(branches.get(w.getBranchNum())
                                    .getBranchAddress().getCity());
                }
                if (cities.size() > 1)
                    customersDiffCities.add(c);
            }
        }
        if (customersDiffCities.isEmpty())
            return "No customers found.";
        String toReturn = "";
        for(Customer cust : customersDiffCities){
            toReturn = toReturn + cust+"<br>";
        }
        String heading = "The following customers are attending to more than one city:<br>";
        toReturn = "<html>"+heading+toReturn+"</html>";
        return toReturn;
    }
    
    
    /**
     * this method returns a map with the most active day this month for each
     * branch the most active date is the one with most lessons scheduled
     *
     * @return a hashMap with branches and active dates, or null BONUS METHOD!!!
     *         EXTRA 7 POINTS
     */
    public String getMostActiveDatePerBranchThisMonth() {
        
        HashMap<Branch, Date> active = new HashMap<Branch, Date>();
        if (!this.branches.isEmpty()) {
            Date today = new Date();
            for (Branch b : this.branches.values()) {
                Date activeDate = null;
                Date maxActiveDate = null;
                int count = 0, maxCount = 0;
                ArrayList<Lesson> less = new ArrayList<Lesson>();
                //add all lessons for this branch
                for (Room r : b.getRooms())
                    if (!r.getLessons().isEmpty())
                        less.addAll(r.getLessons());
                
                Collections.sort(less, new Comparator<Lesson>() {
                    public int compare(Lesson o1, Lesson o2) {
                        return o1.getStartDate().compareTo(o2.getStartDate());
                    }
                });
                
                for (Lesson l : less) {
                    if (l.getStartDate().getYear() == today.getYear()
                            && l.getStartDate().getMonth() == today.getMonth()) {
                        // its the first date checked
                        if (activeDate == null) {
                            activeDate = l.getStartDate();
                            count++;
                        } else
                            // its the same date as the lest lesson
                            if (activeDate.getDate() == l.getStartDate().getDate()) {
                                count++;
                            } else
                                // its a new date in this month for this branch
                                if (activeDate.getDate() < l.getStartDate().getDate()) {
                                    if (count > maxCount) { // if the last date checked
                                        // had the most lessons-
                                        // save as max
                                        maxCount = count;
                                        maxActiveDate = activeDate;
                                    }
                                    activeDate = l.getStartDate();
                                    count = 1;
                                }
                    }
                    if (count > maxCount) { // if the last date checked had the
                        // most lessons- save as max
                        maxCount = count;
                        maxActiveDate = activeDate;
                    }
                }
                if (maxActiveDate != null) {
                    active.put(b, maxActiveDate);
                }
            }// end of branch
        }
        if (active.isEmpty())
            return "There are no branches to display.";
        String toReturn = "";
        for(Map.Entry<Branch, Date> entry : active.entrySet()){
            Branch branch = entry.getKey();
            Date date = entry.getValue();
            toReturn = toReturn + branch.getBranchName() + " - " +  new SimpleDateFormat("dd/MM/yyyy").format(date)+"<br>";
        }
        String heading = "The following is a list of branches and their most active date:<br>";
        return "<html>"+heading+toReturn+"</html>";
        
    }
    
    /**
     * this method finds and returns all popular branches A popular branch is a
     * branch with more then 2 hours of total workouts this month
     *
     * @return a set with all popular branches
     */
    public String getPopularBranches() {
        Map<Branch, Integer> branchAndTime = new HashMap<Branch, Integer>();
        Set<Branch> popular = new HashSet<Branch>();
        Date today = new Date();
        if (!this.branches.isEmpty()) {
            for (Workout w : this.workouts.values()) {
                if (w.getDate().getYear() == today.getYear()
                        && w.getDate().getMonth() == today.getMonth()) {
                    Branch b = this.branches.get(w.getBranchNum());
                    int minutes = w.getTotalWorkoutTime();
                    if (branchAndTime.containsKey(b))
                        minutes += branchAndTime.get(b);
                    branchAndTime.put(b, minutes);
                }
            }
        }
        for (Map.Entry<Branch, Integer> entry : branchAndTime.entrySet()) {
            System.out.println("Branch "+ (long) entry.getKey().getBranchNumber() + " " + entry.getValue());
            if (entry.getValue() >= 120) {
                popular.add(entry.getKey());
            }
        }
        if (popular.isEmpty())
            return "No popular branches found.";
        
        String toReturn = "";
        for(Branch b : popular){
            toReturn = toReturn + b.getBranchName()+"<br>";
        }
        String heading = "The following branches are our popular branches:<br>";
        toReturn = "<html>"+heading+toReturn+"</html>";
     
        return toReturn;
    }
    
    /**
     * this method returns a map with all branches that have potential
     * customers, and their potential customers.
     * A potential customer for branch is a customer that has no valid subscription
     * and lives in the same city as the branch address
     *
     * @return
     */
    public String getPotentialCustomersPerBranch() {
        Map<Branch, ArrayList<Customer>> potential = new HashMap<Branch, ArrayList<Customer>>();
        if (!branches.isEmpty()) {
            for (Branch b : branches.values()) {
                ArrayList<Customer> potentialCusts = new ArrayList<Customer>();
                for (Customer cust : customers.values()) {
                    if (cust.getCustomerAddress().getCity()
                            .equals(b.getBranchAddress().getCity())
                            && cust.getNumOfValidSubs() == 0)
                        potentialCusts.add(cust);
                }
                if (!potentialCusts.isEmpty())
                    potential.put(b, potentialCusts);
            }
        }
        if (potential.isEmpty())
            return "No potential customers found.";
        String toReturn = "";
        
        for(Map.Entry<Branch, ArrayList<Customer>> e : potential.entrySet()){
            //Go through all branches
            toReturn = toReturn + "<b><u>Branch "+e.getKey().getBranchName()+"</u></b><br>";
            int i=1;
            for(Customer c : e.getValue()){
                toReturn = toReturn + (i++)+". "+c.getFirstName()+" "+c.getLastName()+" ("+c.getId()+")<br>";
            }
        }
        
            String heading = "The following list are potential customers among all of our branches:<br>";
            toReturn = "<html>"+heading+toReturn+"</html>";
        
            return toReturn;
    }
    
    
    public String getTotalWorkoutsByBranch(int branchNum){
        int count=0;
        for(Workout w : getWorkouts().values()){
            if(branchNum==w.getBranchNum())
                count++;
        }
        
        return "Total time: "+count +" Minutes ";
    }

    // -------------------------------hashCode equals11 &
    // toString------------------------------
    
//	@Override
//	public String toString() {
//		return "IShape ["//employees=" + employees + ", branches=" + branches
//				+ ", customers= \n" + customers + "]";//", lessons=" + lessons + "]";
//	}
    
}// ~ END OF Class IShape
