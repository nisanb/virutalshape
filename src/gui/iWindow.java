/**
 * This Class controls the opened windows and prevents more than one shown window
 * Other windows will remain active but at hide state;
 */
package gui;
import core.Customer;
import core.Employee;
import core.Receptionist;
import gui.MainGui;
import init.IShape;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import jdk.nashorn.internal.scripts.JO;
import utils.MyFileLogWriter;

/**
 * Main iWindow Class -> Manages all internal jframes and DB connection to GUI
 */
public class iWindow {

    
    
    //User Decalress
    protected static int authLogged;
    protected static Customer customerLogged;
    private static Employee employeeLogged;
    
    
    //Main 
    protected static JLabel lblTitle = null;
    protected static IShape DB;
    
    //iWindow Management
    protected static JInternalFrame currentWindow = null;
    protected static JPanel panel = null;

    
    //================================= Setters and Getters ==================================
    
    /**
     * Set DB
     * @param tmp 
     */
    public static void setDB(IShape tmp){
        DB=tmp;
    }
    
    /**
     * Get DB
     * @return 
     */
    public static IShape getDB(){
        return DB;
    }

    /**
     * Set the current active frame
     * @param frame 
     */
    public static void setCurrentWindow(JInternalFrame frame){
        currentWindow = frame;
    }
    
    /**
     * Get the current active frame
     * @return 
     */
    public static JInternalFrame getCurrentWindow(){
        return currentWindow;
    }
    
    
    //================================ Methods =========================================
    
    /**
     * This method controls the opened internal windows by hiding and showing desired windows
     * @param frame
     * @param WindowID
     * @param windowTitle 
     */
    public static void openWin(JInternalFrame frame){
        if(frame==null)
            return;
        BasicInternalFrameUI bi = (BasicInternalFrameUI)frame.getUI();
        bi.setNorthPane(null);
        frame.setBackground(new Color(255,255,255,5));
        
        frame.setSize(800,600);
        frame.setBorder(null);
        lblTitle.setText(frame.getTitle());
        
        if(getCurrentWindow()==null){
            setCurrentWindow(frame);

            
        }
        else
        if(frame == getCurrentWindow()){
            frame.setVisible(true);
            return;
        }
        else{

            getCurrentWindow().setVisible(false);
            getCurrentWindow().dispose();
            setCurrentWindow(frame);

        }
        
        
        
        getPanel().add(getCurrentWindow());
        getPanel().setVisible(true);
        frame.setVisible(true);
        
        
        iWindow.update();
        return;
    }
    
    /**
     * Set the content pane panel
     * @param tmp 
     */
    public static void setPanel(JPanel tmp){
        panel=tmp;
    }
    
    /**
     * Aquire the content pane panel
     * @return 
     */
    public static JPanel getPanel(){
        return panel;
    }

    

  
    /**
     * Log Function
     * @param message 
     */
    public static void log(String message){
        System.err.println(message);
        //MyFileLogWriter.writeToFileInSeparateLine(message);
    }
    
    /**
     * Return Usernames' First & Last Name
     * @return 
     */
    public static String getAuthName(){
        String toReturn;
        switch(authLogged){
            case 1:
                toReturn = customerLogged.getFirstName()+" "+customerLogged.getLastName()+"";
            break;
            default:
                toReturn = employeeLogged.getFirstName()+" "+employeeLogged.getLastName()+"";
            break;
            
        }
        
        return toReturn;
    }
    
    /**
     * Return String Type by Auth
     * @return 
     */
    public static String getAuthType(){
        String toReturn = null;
        
        switch(authLogged){
            case 1:
                toReturn = "Customer";
            break;
            case 2:
                toReturn = "Receptionist";
            break;
            case 3:
                toReturn = "Administrator";
            break;
            default:
                toReturn = "ERROR";
            break;
        }
        return toReturn;
                
    }
    
    
    /**
     * Return color by auth
     * @return 
     */
    public static Color getAuthColor(){
        Color color = Color.white;
        switch(authLogged){
            case 1:
                color = Color.blue;
            break;
            case 2:
                color = Color.orange;
            break;
            case 3:
                color = Color.red;
            break;
        
            
        }
        return color;
    }
    
    /**
     * Return AUTH ID
     * @return 
     */
    public static int getAuthValue(){
        return authLogged;
    }
    
    /**
     * Sets customer rights
     * @param AuthType
     * @param user 
     */
    public static void setCustomer(int AuthType, Customer user){
        if(AuthType<=0) return;
        if(user==null) return;
        authLogged=AuthType;
        customerLogged=user;
        
        return;
    }
    
    /**
     * Sets receptionist rights
     * @param AuthType
     * @param user 
     */
    public static void setReceptionist(int AuthType, Receptionist user){
        if(AuthType<=0) return;
        if(user==null) return;
        authLogged=AuthType;
        employeeLogged=user;
        
        return;
    }
    
    /**
     * Set administrative rights
     * @param AuthType
     * @param emp 
     */
    public static void setAdmin(int AuthType, Employee emp){
        if(AuthType!=3)
            return;
        authLogged=3;
       employeeLogged=emp;
        
    }
    
    /**
     * Sets the title lbl, from main
     * @param title 
     */
    public static void setLblTitle(JLabel title){
        lblTitle=title;
    }
    
    /**
     * DC Method to clean GUI Vars
     */
     public static void clean(){
       authLogged=0;
       currentWindow=null;
       customerLogged=null;
       employeeLogged=null;
       lblTitle.setText("Welcome to Virutal iShape");
       
       
   }
    

    public static void update(){
        getCurrentWindow().setVisible(false);
        getCurrentWindow().setVisible(true);
    }
    public static void update(JInternalFrame frame){
        frame.setVisible(false);
        frame.setVisible(true);
    }
}
    
    
