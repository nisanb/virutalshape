/**
 * This Class controls the opened windows and prevents more than one shown window
 * Other windows will remain active but at hide state;
 */
package gui.internal;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 * @author mickey shalev
 */
public class iWindow {
    protected static boolean isInternalOpened = false;
    protected static JInternalFrame currentWindow = null;
    protected static JPanel panel = null;
    
    
    
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
    public static void openWin(JInternalFrame frame){
        
        frame.setOpaque(true);
        if (!getWindowState()){
            setCurrentWindow(frame);
            getPanel().add(frame);
            getPanel().setVisible(true);
            frame.setVisible(true);
            setWindowState(true);
        }else{
            getCurrentWindow().hide();
            setCurrentWindow(frame);
            getPanel().add(frame);
            getCurrentWindow().setVisible(true);
        }

        
        return;
    }
    
    public static void setPanel(JPanel tmp){
        panel=tmp;
    }
    public static JPanel getPanel(){
        return panel;
    }
    
}