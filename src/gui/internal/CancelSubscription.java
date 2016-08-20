package gui.internal;

import gui.iWindow;
import Validators.CharValidator;
import Validators.EmailValidator;
import Validators.PhoneValidator;
import Validators.PositiveValidator;
import core.Branch;
import core.Customer;
import core.Lesson;
import core.Room;
import core.Subscription;
import java.awt.Color;
import utils.E_Cities;
import java.lang.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import utils.E_Lessons;

/**
 *
 * @author nisans
 */
public class CancelSubscription extends javax.swing.JInternalFrame {
    private Customer customer;
    /**
     * Creates new form NewJInternalFrame
     */
    public CancelSubscription(Customer cust) {
        initComponents();
        this.customer = cust;
        lblCustomerID.setText(customer.getId());
        setTitle("Customer #"+customer.getId()+" -> Cancel Subscription");
        iWindow.update();
        //Finished Loading
          String str = customer.getId();
        subChooser.removeAllItems();
        

            subChooser.addItem("Select Subscription");
            custError.setForeground(Color.GREEN);
            custError.setText(customer.getFirstName() +" " + customer.getLastName());
            custNum = str;
            int counter=0;
            for (Subscription sub:cust.getSubs()){
                counter++;
                subChooser.addItem(sub.getNumber() + " - End date: " + sub.getLastDay());
            }
            
            if(counter==0)
                Connect.setEnabled(false);
    
            
      
        
        iWindow.update();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Connect = new javax.swing.JButton();
        custError = new javax.swing.JLabel();
        MessageBox = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        subChooser = new javax.swing.JComboBox<>();
        lblCustomerID = new javax.swing.JLabel();

        setBackground(new Color(0,0,0,85));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setAutoscrolls(true);
        setFrameIcon(null);
        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 600));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Customer ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 10, 110, 20);

        Connect.setBackground(new java.awt.Color(102, 102, 102));
        Connect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Connect.setForeground(new java.awt.Color(255, 255, 255));
        Connect.setText("Remove Subscription");
        Connect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConnectMouseClicked(evt);
            }
        });
        getContentPane().add(Connect);
        Connect.setBounds(500, 120, 180, 23);

        custError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        custError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(custError);
        custError.setBounds(410, 10, 290, 20);

        MessageBox.setBackground(new Color (0,0,0,90));
        MessageBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MessageBox.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(MessageBox);
        MessageBox.setBounds(20, 120, 460, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Subscriptions");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 40, 110, 20);

        subChooser.setBackground(new java.awt.Color(0, 0, 0));
        subChooser.setForeground(new java.awt.Color(255, 255, 255));
        subChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subscription" }));
        subChooser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                subChooserFocusLost(evt);
            }
        });
        getContentPane().add(subChooser);
        subChooser.setBounds(140, 40, 250, 22);

        lblCustomerID.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerID.setText("jLabel1");
        getContentPane().add(lblCustomerID);
        lblCustomerID.setBounds(140, 10, 130, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnectMouseClicked
        if(!Connect.isEnabled()){
            JOptionPane.showMessageDialog(null, "Customer has no subscriptions.");
            return;
        }
        if(subNum<=0 || subChooser.getSelectedIndex()==0)
            return;
        System.err.println(subChooser.getSelectedIndex()+"");
        if (JOptionPane.showConfirmDialog(this, "Are you sure you want to remove subscription? "
                + "\nNOTE: Action can't be resotred", "Remove subsription confirmation",
                JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) return;
        
        if (iWindow.getDB().cancelSubscription(subNum)){
            MessageBox.setForeground(Color.GREEN);
            MessageBox.setText("Subscription " +subNum + " was successfully deleted from customer " + customer.getId());
            iWindow.log(new Date().toString() + " - Subscription " + subNum + " was successfully deleted from customer "+ customer.getId());
            

            //Update Window
            CancelSubscription cancel = new CancelSubscription(customer);
            iWindow.openWin(cancel);
        }
        else{
            MessageBox.setForeground(Color.RED);
            MessageBox.setText("Subscription " + subNum + " was failed to be removed from customer "+ customer.getId());
            iWindow.log(new Date().toString() + " - Subscription " + subNum + " was failed to be removed from customer "+ customer.getId());
        }
        
        iWindow.update();
        
    }//GEN-LAST:event_ConnectMouseClicked
        
    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost
    
    private void subChooserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subChooserFocusLost
        String str = (String) subChooser.getSelectedItem();
        if(str.equals("Select Subscription"))
                return;
        //System.err.println("STR: "+str+" Length: "+(str.length())+" Value: "+str);
        if(str.length()<=0)
            return;
        
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))) continue;
            else{
                str = str.substring(0, i);
            }
        }
        subNum = Integer.parseInt(str);

        iWindow.update();
    }//GEN-LAST:event_subChooserFocusLost
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Connect;
    private javax.swing.JLabel MessageBox;
    private javax.swing.JLabel custError;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JComboBox<String> subChooser;
    // End of variables declaration//GEN-END:variables
    
    //Manual variables declaration
    // create and add new Flight to IFly
    private String custNum = null;
    private int subNum = -1;
    
}
