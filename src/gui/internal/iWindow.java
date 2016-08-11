/**
 * This Class controls the opened windows and prevents more than one shown window
 * Other windows will remain active but at hide state;
 */
package gui.internal;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 * @author mickey shalev
 */
public class iWindow {
    protected static boolean isInternalOpened = false;
    protected static JInternalFrame currentWindow = null;
    
    
    
    
    //================================= Setters and Getters ==================================
    protected static void setWindowState(boolean state){
        isInternalOpened = state;
    }
    
    protected static boolean getWindowState(){
        return isInternalOpened;
    }
    
    protected static void setCurrentWindow(JInternalFrame frame){
        currentWindow = frame;
    }
    
    protected static JInternalFrame getCurrentWindow(){
        return currentWindow;
    }
    
    
    //================================ Methods =========================================
    
    /**
     * This method controls the opened internal windows by hiding and showing desired windows
     * @param frame 
     */
    protected static void openWin(JInternalFrame frame){
        if (!getWindowState()){
            setCurrentWindow(frame);
            frame.setVisible(true);
            setWindowState(true);
        }else{
            currentWindow.setVisible(false);
            setCurrentWindow(frame);
            currentWindow.setVisible(true);
            setWindowState(true);
        }

        
        return;
    }
    
    
    
    
}