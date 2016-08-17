package init;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TimeZone;

import core.Address;
import core.Branch;
import core.Coach;
import core.Customer;
import core.Employee;
import core.Lesson;
import core.Receptionist;
import gui.MainGui;
import gui.LoginGui;
import gui.iWindow;
import javax.swing.JFrame;
import utils.E_Cities;
import utils.E_Lessons;
import utils.E_Levels;
import utils.E_Periods;
import utils.E_Rooms;
import utils.E_Types;
import utils.MyFileLogWriter;

/**
 * The Main Class -The program runner
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class MainClass {
    
    /**
     * The command read from the input file
     */
    private static String command;
    
    /**
     * To check if the command updated the objects
     */
    private static boolean isUpdated;
    
    /**
     * The date format
     */
    private static DateFormat df;
    
    /**
     * Skip Log IN Window
     */
    private static boolean skipLogin = true;
    /**
     * The date & time format
     */
    private static DateFormat dft;
    
    /**
     * The main object for the program
     */
    private static IShape IShape;
    
    /**
     * Scanner for input
     */
    private static Scanner input;
    
    public static IShape getIShape(){
        return IShape;
    }
    
    /**
     * The main method of this system, gets input from input.txt and Writes
     * output to output.txt file
     *
     * @param args
     * @throws IOException
     * @throws ParseException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ParseException,
            ClassNotFoundException {
        
        //Activate Login GUI
       
        
        input = new Scanner(new File("input.txt")); // Create Scanner for the
        // text file named
        // "input.txt"
        
        df = new SimpleDateFormat("dd/MM/yyyy");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Jerusalem"));
        
        dft = new SimpleDateFormat("dd/MM/yyyy;HH:mm");
        dft.setTimeZone(TimeZone.getTimeZone("Asia/Jerusalem"));
        
        MyFileLogWriter.initializeMyFileWriter(); // Writer buffer creation used
        // after update
        
        
        // if the file has next - not empty\
        
        if (input.hasNext()) {
            
            /** Attempt to import Data **/
            IShape = importData();
        }
        
        /*
        * read the commands. loop while input file [input.hasnext()] and the
        * IShape is not null
        */
        while (input.hasNext() && IShape != null) {
            /*
            * read the command, must be first at line because command value
            * determine which method will be activated in IShape object.
            */
            command = input.next();
            isUpdated = false;
            
            // ================ Building Command ================
            if (command.equals("addBranch")) {
                // create and add new Branch to IFly
                int branchNumber = Integer.parseInt(input.next());
                String branchName = input.next();
                
                String country = input.next();
                E_Cities city = E_Cities.valueOf(input.next());
                String street = input.next();
                int housNumber = Integer.parseInt(input.next());
                String[] phoneNumber = { input.next() };
                
                isUpdated = IShape.addBranch(branchNumber, branchName, city,
                        country, street, housNumber, phoneNumber);
                if (isUpdated) { // if adding successfully, then true returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addBranch returns: "
                                    + "Successfully added Branch "
                                    + branchNumber + " to IShape");
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addBranch returns: "
                                    + "Failed to add new Branch "
                                    + branchNumber + " to IShape");
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("addCoach")) {
                // create and add new Agent to IFly
                int employeeNumber = Integer.parseInt(input.next());
                String firstName = input.next();
                String lastName = input.next();
                Date birthDate = df.parse(input.next());
                Date startWorkingDate = df.parse(input.next());
                String password = input.next();
                int level = Integer.parseInt(input.next());
                String[] temp = input.next().split(",");
                E_Lessons[] types = new E_Lessons[temp.length];
                for (int i = 0; i < temp.length; i++)
                    types[i] = E_Lessons.valueOf(temp[i]);
                String country = input.next();
                E_Cities city = E_Cities.valueOf(input.next());
                String street = input.next();
                int housNumber = Integer.parseInt(input.next());
                String[] phoneNumber = { input.next() };
                
                Address address = new Address(country, city, street,
                        housNumber, phoneNumber);
                
                Coach coach = new Coach(employeeNumber, firstName, lastName,
                        birthDate, startWorkingDate, password, level, address,
                        types);
                
                isUpdated = IShape.addEmployee(coach);
                if (isUpdated) { // if adding successfully, then true returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addCoach returns: "
                                    + "Successfully added coach "
                                    + employeeNumber + " to IShape");
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addCoach returns: "
                                    + "Failed to add new coach "
                                    + employeeNumber + " to IShape");
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("addReceptionist")) {
                // create and add new Agent to IFly
                int employeeNumber = Integer.parseInt(input.next());
                String firstName = input.next();
                String lastName = input.next();
                Date birthDate = df.parse(input.next());
                Date startWorkingDate = df.parse(input.next());
                String password = input.next();
                String country = input.next();
                E_Cities city = E_Cities.valueOf(input.next());
                String street = input.next();
                int housNumber = Integer.parseInt(input.next());
                String[] phoneNumber = { input.next() };
                
                Address address = new Address(country, city, street,
                        housNumber, phoneNumber);
                
                Receptionist respt = new Receptionist(employeeNumber,
                        firstName, lastName, birthDate, startWorkingDate,
                        password, address);
                
                isUpdated = IShape.addEmployee(respt);
                if (isUpdated) { // if adding successfully, then true returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addReceptionist returns: "
                                    + "Successfully added receptionist "
                                    + employeeNumber + " to IShape");
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addReceptionist returns: "
                                    + "Failed to add new receptionist "
                                    + employeeNumber + " to IShape");
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("addCustomer")) {
                // create and add new Customer to IFly
                String id = input.next();
                String firstName = input.next();
                String lastName = input.next();
                Date birthDate = df.parse(input.next());
                String password = input.next();
                URL email = new URL(input.next());
                
                String country = input.next();
                E_Cities city = E_Cities.valueOf(input.next());
                String street = input.next();
                int housNumber = Integer.parseInt(input.next());
                String[] phoneNumber = { input.next() };
                
                Address address = new Address(country, city, street,
                        housNumber, phoneNumber);
                
                isUpdated = IShape.addCustomer(id, firstName, lastName,
                        birthDate, password, email, address);
                if (isUpdated) { // if adding successfully, then true returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addCustomer returns: "
                                    + "Successfully added Customer with passport "
                                    + id + " to IShape");
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addCustomer returns: "
                                    + "Failed to add new Customer with passport "
                                    + id + " to IShape");
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("addSubToCustomer")) {
                // create and add new Flight to IFly
                int subNumber = Integer.parseInt(input.next());
                String custId = input.next();
                int receptNumber = Integer.parseInt(input.next());
                E_Periods period = E_Periods.valueOf(input.next());
                Date startDate = df.parse(input.next());
                
                isUpdated = IShape.addSubToCustomer(subNumber, custId,
                        receptNumber, period, startDate);
                if (isUpdated) { // if adding successfully, then true returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addSubToCustomer returns: "
                                    + "Successfully added subscription "
                                    + subNumber + " to IShape");
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addSubToCustomer returns: "
                                    + "Failed to add new subscription "
                                    + subNumber + " to IShape");
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("connectCoachToBranch")) {
                // Connect between an existing coach and an existing branch
                int coachNumber = Integer.parseInt(input.next());
                int branchNumber = Integer.parseInt(input.next());
                
                isUpdated = IShape.connectEmloyeeToBranch(coachNumber,
                        branchNumber);
                if (isUpdated) { // if adding successfully, then true returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("connectCoachToBranch returns: "
                                    + "Successfully connected between coach "
                                    + coachNumber
                                    + " and branch "
                                    + branchNumber);
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("connectCoachToBranch returns: "
                                    + "Failed to connected between coach "
                                    + coachNumber
                                    + " and branch "
                                    + branchNumber);
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("connectReceptionistToBranch")) {
                // Connect between an existing receptionist and an existing
                // branch
                int receptionistNumber = Integer.parseInt(input.next());
                int branchNumber = Integer.parseInt(input.next());
                
                isUpdated = IShape.connectEmloyeeToBranch(receptionistNumber,
                        branchNumber);
                if (isUpdated) { // if adding successfully, then true returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("connectReceptionistToBranch returns: "
                                    + "Successfully connected between receptionist "
                                    + receptionistNumber
                                    + " and branch "
                                    + branchNumber);
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("connectReceptionistToBranch returns: "
                                    + "Failed to connected between receptionist "
                                    + receptionistNumber
                                    + " and branch "
                                    + branchNumber);
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("addRoomToBranch")) {
                // add a room to an existing branch
                int roomNum = Integer.parseInt(input.next());
                int maxNumOfTrainees = Integer.parseInt(input.next());
                int maxNumOfInstruments = Integer.parseInt(input.next());
                E_Rooms roomType = E_Rooms.valueOf(input.next());
                int branchNum = Integer.parseInt(input.next());
                
                isUpdated = IShape.addRoomToBranch(roomNum, maxNumOfTrainees,
                        maxNumOfInstruments, roomType, branchNum);
                if (isUpdated) { // if changing successfully, then true
                    // returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addRoomToBranch returns: "
                                    + "Successfully added room: "
                                    + roomNum
                                    + " to branch " + branchNum + " in IShape");
                    
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addRoomToBranch returns: "
                                    + "Failed to add room: "
                                    + roomNum
                                    + " to branch " + branchNum + " in IShape");
                    
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("addInstrumentToRoom")) {
                // add instruments to an existing room in a specific branch
                int branchNum = Integer.parseInt(input.next());
                int roomNum = Integer.parseInt(input.next());
                E_Types type = E_Types.valueOf(input.next());
                String str = input.next();
                boolean status = false;
                int amount = Integer.parseInt(input.next());
                if (str.equals("true"))
                    status = true;
                
                isUpdated = IShape.addInstrumentToRoom(branchNum, roomNum,
                        type, status, amount);
                if (isUpdated) { // if added successfully, then true returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addInstrumentToRoom returns: "
                                    + "Successfully added instrument: "
                                    + type
                                    + " to room "
                                    + roomNum
                                    + " in branch "
                                    + branchNum + " in IShape");
                    
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addInstrumentToRoom returns: "
                                    + "Failed to add instrument: "
                                    + type
                                    + " to room "
                                    + roomNum
                                    + " in branch "
                                    + branchNum + " in IShape");
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("addLesson")) {
                // add a lesson to an existing room in a specific branch
                int lessonNum = Integer.parseInt(input.next());
                E_Lessons lessonName = E_Lessons.valueOf(input.next());
                Date dateTime = dft.parse(input.next());
                E_Levels level = E_Levels.valueOf(input.next());
                int coachNum = Integer.parseInt(input.next());
                int maxStudent = Integer.parseInt(input.next());
                int branchNum = Integer.parseInt(input.next());
                int roomNum = Integer.parseInt(input.next());
                
                isUpdated = IShape.addLesson(lessonNum, lessonName, dateTime,
                        level, coachNum, maxStudent, branchNum, roomNum);
                if (isUpdated) { // if added successfully, then true returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addLesson returns: "
                                    + "Successfully added lesson: "
                                    + lessonName + " at " + dateTime
                                    + " to room " + roomNum + " in branch "
                                    + branchNum + " in IShape");
                    
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addLesson returns: "
                                    + "Failed to add lesson: " + lessonName
                                    + " at " + dateTime + " to room " + roomNum
                                    + " in branch " + branchNum + " in IShape");
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("addCustomerToLesson")) {
                // add a customer to an existing lesson
                String custNum = input.next();
                int lessonNum = Integer.parseInt(input.next());
                
                isUpdated = IShape.addCustomerToLesson(custNum, lessonNum);
                if (isUpdated) { // if added successfully, then true returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addCustomerToLesson returns: "
                                    + "Successfully added customer "
                                    + custNum
                                    + " to lesson: " + lessonNum + " in IShape");
                    
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addCustomerToLesson returns: "
                                    + "Failed to add customer "
                                    + custNum
                                    + " to lesson: " + lessonNum + " in IShape");
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("changeCustomerAddress")) {
                // Change an existing customer's address
                String customerId = input.next();
                String country = input.next();
                E_Cities city = E_Cities.valueOf(input.next());
                String street = input.next();
                int housNumber = Integer.parseInt(input.next());
                String[] phoneNumber = { input.next() };
                
                isUpdated = IShape.changeCustomerAddress(customerId, country,
                        city, street, housNumber, phoneNumber);
                if (isUpdated) { // if changing successfully, then true
                    // returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("changeCustomerAddress returns: "
                                    + "Successfully changed address of customer: "
                                    + customerId
                                    + " "
                                    + IShape.getCustomers().get(customerId));
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("changeCustomerAddress returns: "
                                    + "Failed to change address of customer with id: "
                                    + customerId);
                    
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("cancelSubscription")) {
                // Cancel an existing subscription
                int subNumber = Integer.parseInt(input.next());
                
                isUpdated = IShape.cancelSubscription(subNumber);
                if (isUpdated) { // if canceling successfully, then true
                    // returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("cancelSubscription returns: "
                                    + "Successfully canceled subscription "
                                    + subNumber);
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("cancelSubscription returns: "
                                    + "Failed to cancel subscription "
                                    + subNumber);
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("addWorkout")) {
                // add a workout
                int workoutNum = Integer.parseInt(input.next());
                String customerNum = input.next();
                Date Date = df.parse(input.next());
                int branchNum = Integer.parseInt(input.next());
                
                isUpdated = IShape.addWorkout(workoutNum, customerNum, Date,
                        branchNum);
                if (isUpdated) { // if added successfully, then true
                    // returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addWorkout returns: "
                                    + "Successfully added workout number "
                                    + workoutNum + " to customer number: "
                                    + customerNum);
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addWorkout returns: "
                                    + "Failed to add workout number "
                                    + workoutNum + " to customer number: "
                                    + customerNum);
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("addInstrumentToWorkout")) {
                // add an instrument to an existing workout in IShape
                int workoutNum = Integer.parseInt(input.next());
                int branchNum = Integer.parseInt(input.next());
                int roomNum = Integer.parseInt(input.next());
                E_Types type = E_Types.valueOf(input.next());
                Date startTime = dft.parse(input.next());
                int minutes = Integer.parseInt(input.next());
                
                isUpdated = IShape.addInstrumentToWorkout(workoutNum,
                        branchNum, roomNum, type, startTime, minutes);
                if (isUpdated) { // if added successfully, then true returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addInstrumentToWorkout returns: "
                                    + "Successfully added instrument: "
                                    + type
                                    + " to workout: "
                                    + workoutNum
                                    + " at "
                                    + startTime
                                    + " to room "
                                    + roomNum
                                    + " in branch " + branchNum + " in IShape");
                    
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("addInstrumentToWorkout returns: "
                                    + "Failed to add instrument: "
                                    + type
                                    + " to workout: "
                                    + workoutNum
                                    + " at "
                                    + startTime
                                    + " to room "
                                    + roomNum
                                    + " in branch " + branchNum + " in IShape");
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("cancelWorkout")) {
                // Cancel an existing subscription
                int workoutNum = Integer.parseInt(input.next());
                
                isUpdated = IShape.cancelWorkout(workoutNum);
                if (isUpdated) { // if canceling successfully, then true
                    // returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("cancelWorkout returns: "
                                    + "Successfully canceled workout number "
                                    + workoutNum);
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("cancelWorkout returns: "
                                    + "Failed to cancel workout number "
                                    + workoutNum);
                }
            }
            
            // ================ Building Command ================
            else if (command.equals("attenedLesson")) {
                // customer attended a lesson
                String customerId = input.next();
                int lessonNum = Integer.parseInt(input.next());
                
                isUpdated = IShape.attendLesson(customerId, lessonNum);
                if (isUpdated) { // if canceling successfully, then true
                    // returned,
                    // the following message is written to the output file
                    MyFileLogWriter
                            .writeToFileInSeparateLine("attendLesson returns: "
                                    + "Successfully marked customer "
                                    + customerId + " in lesson " + lessonNum);
                } else {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("attendLesson returns: "
                                    + "Failed to mark customer " + customerId
                                    + " in lesson " + lessonNum);
                }
            }
            
            // ================ Query Command ================
            else if (command
                    .equals("getAllAttendedLessonsOfMostActiveCustomer")) {
                List<Lesson> mostLessons = IShape
                        .getAllAttendedLessonsOfMostActiveCustomer();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nQuery_1\n=======\ngetAllAttendedLessonsOfMostActiveCustomer returns:");
                if (mostLessons != null && mostLessons.size() != 0) {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("the following lessons:");
                    int i = 1;
                    for (Lesson l : mostLessons)
                        if (l != null)
                            MyFileLogWriter.writeToFileInSeparateLine((i++)
                                    + "\t- " + l.getName() + " on "
                                    + l.getStartDate());
                    
                } else
                    MyFileLogWriter
                            .writeToFileInSeparateLine("No customers were found");
            }
            
            // ================ Query Command ================
            else if (command
                    .equals("getAllCustomersFromBranchXbutNotFromBranchY")) {
                // Return all customers that practiced in branch X but didn't
                // practice in branch Y
                int branchXnumber = Integer.parseInt(input.next());
                int branchYnumber = Integer.parseInt(input.next());
                
                List<Customer> XonlyCustomers = IShape
                        .getAllCustomersFromBranchXbutNotFromBranchY(
                                branchXnumber, branchYnumber);
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nQuery_2\n=======\ngetAllCustomersFromBranchXbutNotFromBranchY returns:");
                if (XonlyCustomers != null && XonlyCustomers.size() != 0) {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("the following customers ed on branch "
                                    + +branchXnumber
                                    + " (and not in branch "
                                    + branchYnumber + "): ");
                    int i = 1;
                    
                    for (Customer customer : XonlyCustomers)
                        MyFileLogWriter.writeToFileInSeparateLine((i++)
                                + "\t- " + customer);
                    
                } else
                    MyFileLogWriter
                            .writeToFileInSeparateLine("No customers were found");
            }
            
            // ================ Query Command ================
            else if (command.equals("getTheMostPopularLessonType")) {
                E_Lessons lesson = IShape.getTheMostPopularLessonType();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nQuery_3\n=======\ngetTheMostPopularLessonType returns:");
                if (lesson != null) {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("The most popular lesson type is: \n"
                                    + lesson);
                } else
                    MyFileLogWriter
                            .writeToFileInSeparateLine("No lessons were found");
            }
            
            // ================ Query Command ================
            else if (command.equals("getReceptionistOfTheMonth")) {
                Receptionist recep = IShape.getReceptionistOfTheMonth();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nQuery_4\n=======\ngetReceptionistOfTheMonth returns:");
                if (recep != null) {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("The receptionist Of the month is: \n"
                                    + recep);
                } else
                    MyFileLogWriter
                            .writeToFileInSeparateLine("No receptionist won this month");
            }
            
            // ================ Query Command ================
            else if (command.equals("getAllSuperSeniorCoaches")) {
                Coach[] superCoaches = IShape.getAllSuperSeniorCoaches();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nQuery_5\n=======\ngetAllSuperSeniorCoaches returns:");
                if (superCoaches != null && superCoaches[0] != null) {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("The super senior coaches of the month is:");
                    for (int i = 0; i < superCoaches.length; i++)
                        if (superCoaches[i] != null)
                            MyFileLogWriter
                                    .writeToFileInSeparateLine(superCoaches[i]
                                            .toString());
                } else
                    MyFileLogWriter
                            .writeToFileInSeparateLine("No super senior coaches for this month");
            }
            
            // ================ Query Command ================
            else if (command.equals("getTopJanuaryReceptionists")) {
                Receptionist topReceptionist = IShape
                        .getTopJanuaryReceptionists();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nQuery_6\n=======\ngetTopJanuaryReceptionists returns:");
                if (topReceptionist != null) {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("The top january receptionist of the year is:");
                    MyFileLogWriter.writeToFileInSeparateLine(topReceptionist
                            .toString());
                } else
                    MyFileLogWriter
                            .writeToFileInSeparateLine("No top january receptionist for this year");
            }
            
            // ================ Query Command ================
            else if (command.equals("getTopCustomerOfTheMonth")) {
                Customer cust = IShape.getTopCustomerOfTheMonth();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nQuery_7\n=======\ngetTopCustomerOfTheMonth returns:");
                if (cust != null) {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("getTopCustomerOfTheMonthr is:");
                    MyFileLogWriter.writeToFileInSeparateLine(cust.toString());
                } else
                    MyFileLogWriter
                            .writeToFileInSeparateLine("No getTopCustomerOfTheMonth for this month");
            }
            
            // ================ Query Command ================
            else if (command.equals("getTopIstrumentType")) {
                E_Types type = IShape.getTopIstrumentType();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nQuery_8\n=======\ngetTopIstrumentType returns:");
                if (type != null) {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("getTopIstrumentType is:");
                    MyFileLogWriter.writeToFileInSeparateLine(type.toString());
                } else
                    MyFileLogWriter
                            .writeToFileInSeparateLine("No TopIstrumentType in IShape");
            }
            
            else if (command.equals("IShapeToString")) {
                String str = IShape.toString();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nIshape toString\n=======\n");
                if (str != null) {
                    MyFileLogWriter.writeToFileInSeparateLine(str);
                }
            }
            
            // ================ Query Command ================
            else if (command.equals("getAllCustomersAttendingMoreThan1City")) {
                ArrayList<Customer> cutomersCity = IShape
                        .getAllCustomersAttendingMoreThan1City();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nQuery_9\n=======\ngetAllCustomersAttendingMoreThan1City returns:");
                if (cutomersCity != null) {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("getAllCustomersAttendingMoreThan1City is:");
                    MyFileLogWriter.writeToFileInSeparateLine(cutomersCity
                            .toString());
                } else
                    MyFileLogWriter
                            .writeToFileInSeparateLine("No customers attending more than 1 city in IShape");
            }
            
            // ================ Query Command ================
            else if (command.equals("getMostActiveDatePerBranchThisMonth")) {
                HashMap<Branch, Date> topDatePerBranch = IShape
                        .getMostActiveDatePerBranchThisMonth();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nQuery_10\n=======\ngetMostActiveDatePerBranchThisMonth returns:");
                if (topDatePerBranch != null) {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("ActiveDatePerBranchThisMonth is:");
                    
                    for (Entry<Branch, Date> entry : topDatePerBranch
                            .entrySet()) {
                        MyFileLogWriter
                                .writeToFileInSeparateLine("BranchNum = "
                                        + (long) entry.getKey().getBranchNumber()
                                        + " active date = " + entry.getValue());
                        
                    }
                } else
                    MyFileLogWriter
                            .writeToFileInSeparateLine("No Active Date Per Branch This Month in IShape");
            }
            
            // ================ Query Command ================
            else if (command.equals("getPopularBranches")) {
                Set<Branch> popularBranches = IShape.getPopularBranches();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nQuery_11\n=======\ngetPopularBranches returns:");
                if (popularBranches != null) {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("getPopularBranches are:");
                    for (Branch b : popularBranches)
                        MyFileLogWriter
                                .writeToFileInSeparateLine("Branch number "
                                        + b.getBranchNumber());
                } else
                    MyFileLogWriter
                            .writeToFileInSeparateLine("No popular branches in IShape");
            }
            
            // ================ Query Command ================
            else if (command.equals("getPotentialCustomersPerBranch")) {
                Map<Branch, ArrayList<Customer>> branchAndCusts = IShape
                        .getPotentialCustomersPerBranch();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nQuery_12\n=======\ngetPotentialCustomersPerBranch returns:");
                if (branchAndCusts != null) {
                    MyFileLogWriter
                            .writeToFileInSeparateLine("getPotentialCustomersPerBranch are:");
                    for (Entry<Branch, ArrayList<Customer>> entry : branchAndCusts
                            .entrySet()) {
                        MyFileLogWriter
                                .writeToFileInSeparateLine("Branch number "
                                        + entry.getKey().getBranchNumber()
                                        + " "
                                        + entry.getKey().getBranchAddress()
                                                .getCity());
                        for (Customer cust : entry.getValue())
                            MyFileLogWriter
                                    .writeToFileInSeparateLine("Customer number "
                                            + cust.getId()
                                            + " "
                                            + cust.getCustomerAddress()
                                                    .getCity());
                    }
                } else
                    MyFileLogWriter
                            .writeToFileInSeparateLine("No Potential Customers Per Branch in IShape");
            }
            
            else if (command.equals("IShapeToString")) {
                String str = IShape.toString();
                MyFileLogWriter
                        .writeToFileInSeparateLine("=======\nIshape toString\n=======\n");
                if (str != null) {
                    MyFileLogWriter.writeToFileInSeparateLine(str);
                }
            }
            
            else if (command.equals("//")) {
                // Separate line command
                MyFileLogWriter.writeToFileInSeparateLine("\n");
                input.nextLine();
                // ignores line starts by '//' the result is empty lines in the
                // output
            }
            // ================ Command ================
            else
                System.out.printf("Command %s does not exist\n", command);
        } // ~ end of clause - while input has next
        
        MyFileLogWriter.saveLogFile(); // save the output file
        input.close(); // close connection to input file
        System.out.println("[End Of process]");
        System.out.println("\n NOTICE:\n\t\"End of process\" "
                + "does NOT mean that all your methods are correct.\n"
                + "\n==>\t You NEED to check the \"output.txt\" file");
        
        //Set IShape DB to GUI
        iWindow.setDB(IShape);
        JFrame login = null;
        if(skipLogin){
            iWindow.setAdmin(3, new Employee(999, "Administrator","Privilige"));
            login = new MainGui();
            
        }
            
        else
            login = new LoginGui();
        
        login.setVisible(true);
        //exportData();
    }// END OF ~ main
    private static IShape importData() {
        // TODO Auto-generated method stub
        try {
            String fileName = "Data.cer";
            FileInputStream input = new FileInputStream(fileName);
            ObjectInputStream objInput = new ObjectInputStream(input);
            IShape Data = (IShape) objInput.readObject();
            System.err.println("Successfully imported Data.cer");
            return Data;
        } catch (Exception e) {
            System.err.println("Failed to import database");
            return new IShape();
        }
        
        
    }
    
    public static void exportData() {
        try {
            String fileName = "Data.cer";
            FileOutputStream output = new FileOutputStream(fileName);
            ObjectOutputStream objoutput = new ObjectOutputStream(output);
            objoutput.writeObject(IShape);
            objoutput.close();
            
            System.err.println("Exported Data to \"" + fileName + "\"");
            
        } catch (Exception e) {
            System.err.println("Could not export database\n" + e.toString());
            
        }
    }
}// ~ END OF Class MainClass
