package core;

import java.io.Serializable;
import java.util.Date;

import java.util.concurrent.TimeUnit;
import utils.E_Lessons;

/**
 * Class Employee ~ represent a single Employee of the company
 *
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class Employee implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = -2113891689244281240L;
    
    // -------------------------------Class Members------------------------------
    /**
     * Employee's number - the key
     */
    private int empNum;
    
    /**
     * Employee's First name
     */
    private String firstName;
    
    /**
     * Employee's Sure name
     */
    private String lastName;
    
    /**
     * Employee's Date of birth
     */
    private Date birthDate;
    
    /**
     * The date this employee started working in the company
     */
    private Date startWorkingDate;
    
    /**
     * The branch where this employee work in
     */
    private Branch workBranch;
    
    /**
     * Employee's password for the system
     */
    private String password;
    
    /**
     * Employee's address
     */
    private Address address;
    
    // -------------------------------Constructors-----------------------------
    /**
     * Partial Constructor ~ use for initial most fields
     *
     * @param empNum
     * @param firstName
     * @param lastName
     * @param birthDate
     * @param startWorkingDate
     * @param password
     * @param address
     */
    public Employee(int empNum, String firstName, String lastName,
            Date birthDate, Date startWorkingDate, String password,
            Address address) {
        super();
        this.empNum = empNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.startWorkingDate = startWorkingDate;
        this.password = password;
        this.address = address;
    }
    
    /**
     * Administrator Employee
     * @param empNum
     * @param firstName
     * @param lastName
     */
    public Employee(int empNum, String firstName, String lastName){
        super();
        this.empNum=empNum;
        this.firstName = firstName;
        this.lastName=lastName;
    }
    
    /**
     * Partial Constructor ~ use for initial key fields
     *
     * @param empNum
     */
    public Employee(int empNum) {
        super();
        this.empNum = empNum;
    }
    
    // -------------------------------Getters And Setters------------------------------
    
    /**
     * @return the employee number
     */
    public int getEmployeeNumber() {
        return empNum;
    }
    
    /**
     * set the employee number
     *
     * @param empNum
     */
    public void setEmployeeNumber(int empNum) {
        this.empNum = empNum;
        
    }
    
    /**
     * @return the employee work branch
     */
    public Branch getWorkBranch() {
        return workBranch;
    }
    
    public String getnName(){
        return this.firstName + " " + this.getLastName();
    }
    
    /**
     * set the employee work branch
     *
     * @param workBranch
     */
    public void setWorkBranch(Branch workBranch) {
        this.workBranch = workBranch;
    }
    
    /**
     * @return the employee first name
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * set the employee first name
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * @return the employee last name
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * set the employee last name
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * @return the employee birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }
    
    /**
     * set the employee birthDate
     *
     * @param birthDate
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    /**
     * @return the employee startwWorking date
     */
    public Date getStartWorkingDate() {
        return startWorkingDate;
    }
    
    /**
     * set the employee startwWorking date
     *
     * @param startWorkingDate
     *            to set
     */
    public void setStartWorkingDate(Date startWorkingDate) {
        this.startWorkingDate = startWorkingDate;
    }
    
    /**
     * @return the employee password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * set the employee password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * @return the employee address
     */
    public Address getAddress() {
        return address;
    }
    
    /**
     * set the employee address
     *
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }
    
    // -------------------------------More Methods------------------------------
    /**
     * This method calculate this employee seniority (in years). If he started
     * to work in this year, than his seniority is 0 years.
     *
     * @return employee seniority
     */
    @SuppressWarnings("deprecation")
    public int getEmployeeSeniority() {
        return new Date().getYear() - this.startWorkingDate.getYear();
    }
    
    // -------------------------------hashCode equals & toString------------------------------
    /*
    * (non-Javadoc)
    *
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
        return "employeeNumber=" + empNum + ", firstName=" + firstName
                + ", lastName=" + lastName + ", birthDate="
                + birthDate.getDate() + "/" + (birthDate.getMonth() + 1) + "/"
                + (birthDate.getYear() + 1900) + ", startWorkingDate= "
                + startWorkingDate.getDate() + "/"
                + (startWorkingDate.getMonth() + 1) + "/"
                + (startWorkingDate.getYear() + 1900) + ", password="
                + password;
    }
    
    // public String toString() {
    // return "employeeNumber=" + empNum;
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
        result = prime * result + empNum;
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
        Employee other = (Employee) obj;
        if (empNum != other.empNum)
            return false;
        return true;
    }
    
}// ~ END OF Abstract Class Employee
