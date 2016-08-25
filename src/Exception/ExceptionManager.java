/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import Validators.PhoneValidator;
import core.Customer;
import gui.iWindow;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nisan
 */
public class ExceptionManager {

    
    public static Boolean windowException(JInternalFrame frame){
        
        Boolean bool = false;
        String str = "";
        if(iWindow.getDB().getBranches().size()==0 &&
               ( frame.getTitle().contains("Add Receptionist") || frame.getTitle().contains("Add Coach"))){
            str = "You cannot enter this feature until you have added atleast one branch.";
            bool = true;
        }
        else
        if(iWindow.getDB().getEmployees().size()==0 &&
                (frame.getTitle().contains("Add Subscription"))){
            
            str = "You cannot enter this feature until you have added atleast one employee.";
            bool = true;
        } 

            
            
            
        if(bool)
        JOptionPane.showMessageDialog(null, str);
        
        return bool;
    }
    
    
}
