/**
 * This Class controls the opened windows and prevents more than one shown window
 * Other windows will remain active but at hide state;
 */
package gui.internal;
import init.IShape;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 * @author mickey shalev
 */
public class iWindow {
    protected static int WindowID = 0;
    protected static IShape DB;
    protected static boolean isInternalOpened = false;
    protected static JInternalFrame currentWindow = null;
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
    public static void openWin(JInternalFrame frame, int WindowID){
        if(WindowID==getWindowID()) {
            getCurrentWindow().setVisible(true);
            
            return;
        }
        System.err.println(WindowID + " " + getWindowID());
        frame.setOpaque(true);
        if (!getWindowState()){
            setCurrentWindow(frame);
            getPanel().add(frame);
            getPanel().setVisible(true);
            frame.setVisible(true);
            setWindowState(true);
            setWindowID(WindowID);
        }else{
            getCurrentWindow().hide();
            setCurrentWindow(frame);
            getPanel().add(frame);
            getCurrentWindow().setVisible(true);
            setWindowID(WindowID);
        }
        System.err.println("test");
        
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
    
}