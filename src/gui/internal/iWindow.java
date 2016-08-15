/**
 * This Class controls the opened windows and prevents more than one shown window
 * Other windows will remain active but at hide state;
 */
package gui.internal;
import core.Customer;
import core.Employee;
import core.Receptionist;
import gui.AdminGui;
import init.IShape;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import jdk.nashorn.internal.scripts.JO;
import utils.MyFileLogWriter;

/**
 * @author mickey shalev
 */
public class iWindow {

    
    
    //User Decalress
    protected static int authLogged;
    protected static Customer customerLogged;
    private static Employee employeeLogged;
    
    
    //Main 
    protected static JLabel lblTitle = null;
    
    protected static int WindowID = 0;
    protected static IShape DB;
    protected static boolean isInternalOpened = false;
    protected static JFrame mainFrame = new JFrame(){
        public void setReturn(){
            
        }
    };
    protected static JInternalFrame currentWindow = null;
    protected static JInternalFrame lastWindow = null;
    protected static JPanel panel = null;
    
    public static void setDB(IShape tmp){
        DB=tmp;
    }
    
    public static IShape getDB(){
        return DB;
    }
    
    //================================= Setters and Getters ==================================
    public static void setWindowState(boolean state){
        isInternalOpened = state;
    }
    
    public static boolean getWindowState(){
        return isInternalOpened;
    }
    
    public static void setCurrentWindow(JInternalFrame frame){
        currentWindow = frame;
    }
    
    public static JInternalFrame getCurrentWindow(){
        return currentWindow;
    }
    
    
    //================================ Methods =========================================
    
    /**
     * This method controls the opened internal windows by hiding and showing desired windows
     * @param frame 
     */
    //Commit
    public static void openWin(JInternalFrame frame, int WindowID, String windowTitle){
        
        if(WindowID==getWindowID()) {
            getCurrentWindow().setVisible(true);
            
            return;
        }
       
         BasicInternalFrameUI bi = (BasicInternalFrameUI)frame.getUI();
        bi.setNorthPane(null);
   
        frame.setOpaque(true);
        if (!getWindowState()){
            //Enable Return Button
            
            setCurrentWindow(frame);
            getPanel().add(frame);
            getPanel().setVisible(true);
            frame.setVisible(true);
            setWindowState(true);
            setWindowID(WindowID);
            System.err.println(lblTitle.getText());
            lblTitle.setText(windowTitle);
        }else{
            getCurrentWindow().hide();
            setLastWindow(getCurrentWindow());
            setCurrentWindow(frame);
            getPanel().add(frame);
            getCurrentWindow().setVisible(true);
            setWindowID(WindowID);
            lblTitle.setText(windowTitle);
        }
        
        
        return;
    }
    
    public static void setPanel(JPanel tmp){
        panel=tmp;
    }
    public static JPanel getPanel(){
        return panel;
    }
    public static void setWindowID(int tmp){
        WindowID=tmp;
    }
    public static int getWindowID(){
        return WindowID;
    }
    public static JInternalFrame getLastWindow(){
        return lastWindow;
    }
    public static void setLastWindow(JInternalFrame curr){
        lastWindow=curr;
    }
    public static void setMainFrame(JFrame frm){
        mainFrame=frm;
    }
    public static JFrame getMainFrame(){
        return mainFrame;
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
    
    public static void setCustomer(int AuthType, Customer user){
        if(AuthType<=0) return;
        if(user==null) return;
        authLogged=AuthType;
        customerLogged=user;
        
        return;
    }
    
    public static void setReceptionist(int AuthType, Receptionist user){
        if(AuthType<=0) return;
        if(user==null) return;
        authLogged=AuthType;
        employeeLogged=user;
        
        return;
    }
    
    public static void setAdmin(int AuthType, Employee emp){
        if(AuthType!=3)
            return;
        authLogged=3;
       employeeLogged=emp;
        
    }
    
    public static void setLblTitle(JLabel title){
        lblTitle=title;
    }
    
    
   
    
}
    
    
