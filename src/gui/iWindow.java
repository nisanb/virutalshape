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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import jdk.nashorn.internal.scripts.JO;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
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

    private static boolean skipLogin = true;
    private static IShape IShape;
    
    
    public static IShape getIShape(){
        return IShape;
    }
    
    //iWindow Management
    protected static JInternalFrame currentWindow = null;
    protected static JPanel panel = null;

    //======================================= Main ==========================================
    public static void main(String[] args){
        IShape = importData();

        //Set IShape DB to GUI
        //iWindow.setDB(IShape);
        JFrame login = null;
        if(skipLogin){
            iWindow.setUser(4, iWindow.getDB().getEmployees().get(11));
            login = new MainGui();
            
        }
        
        else
            login = new LoginGui();
        
        login.setVisible(true);
        //exportData();
    }// END OF ~ main
    
    //=================================== Import & Export ====================================
    
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
            return null;
        }
        
        
    }
    
    public static void exportData() {
        try {
            String fileName = "Data.cer";
            FileOutputStream output = new FileOutputStream(fileName);
            ObjectOutputStream objoutput = new ObjectOutputStream(output);
            objoutput.writeObject(IShape);
            objoutput.close();
            
            //System.err.println("Exported Data to \"" + fileName + "\"");
            
        } catch (Exception e) {
            System.err.println("Could not export database\n" + e.toString());
            
        }
    }
    
    //================================= Setters and Getters ==================================
    
    /**
     * Set DB
     * @param tmp 
     */
    public static void setDB(IShape tmp){
        IShape=tmp;
    }
    
    /**
     * Get DB
     * @return 
     */
    public static IShape getDB(){
        return IShape;
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
                toReturn = "Coach";
            break;

            case 4:
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
                color = Color.green;
            break;
            case 2:
                color = Color.orange;
            break;
            case 3:
                color = Color.blue;
            break;
            case 4:
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
    public static void setUser(int AuthType, Object user){
        if(AuthType<=0) return;
        if(user==null) return;
        authLogged=AuthType;
        switch(AuthType){
            case 1:
                
                customerLogged=(Customer) user;
                break;
            default:
                employeeLogged=(Employee) user;
                break;
  
        }
        
        
        return;
    }
    
   
    
    /**
     * Sets the title lbl, from main
     * @param title 
     */
    public static void setLblTitle(JLabel title){
        lblTitle=title;
    }
    
    public static Employee getEmployeeLogged(){
        return employeeLogged;
    }
    
    public static Customer getCustomerLogged(){
        return customerLogged;
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
        if (getCurrentWindow() == null) return; 
        getCurrentWindow().setVisible(false);
        getCurrentWindow().setVisible(true);
        exportData();
    }
    public static void update(JInternalFrame frame){
        frame.setVisible(false);
        frame.setVisible(true);
    }
    public static void playAudio(int type){
        String gongFile = "";
        switch(type){
            case 1: //logged in
                  gongFile = "./src/gui/sounds/success.wav";
            break;
            case 2: //error
                 gongFile = "./src/gui/sounds/error.wav";
            break;
            case 3:
                 gongFile = "./src/gui/sounds/quit.wav";
            break;
            default:
                return;
        }
         
            InputStream in = null;
        try {
            in = new FileInputStream(gongFile);
        } catch (FileNotFoundException ex) {
            System.err.println("WTF");
            Logger.getLogger(LoginGui.class.getName()).log(Level.SEVERE, null, ex);
        }

            // create an audiostream from the inputstream
            AudioStream audioStream = null;
        try {
            audioStream = new AudioStream(in);
        } catch (IOException ex) {
            Logger.getLogger(LoginGui.class.getName()).log(Level.SEVERE, null, ex);
        }

            // play the audio clip with the audioplayer class
            AudioPlayer.player.start(audioStream);
    }
    
}
    
    
