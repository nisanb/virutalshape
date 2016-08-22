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
import utils.E_Lessons;
import utils.E_Types;

/**
 *
 * @author nisans
 */
public class AddWorkout extends javax.swing.JInternalFrame {
    private Customer customer;
    /**
     * Creates new form NewJInternalFrame
     */
    public AddWorkout(Customer cust) {
        initComponents();
        this.customer = cust;
        setTitle("Customer #"+customer.getId()+" -> Add Workout");
        lblCustomerID.setText(customer.getId());
        
        //Finished Loading
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
        selectBranch = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        WorkoutNum = new javax.swing.JLabel();
        lblCustomerID = new javax.swing.JLabel();

        setBackground(new Color(0,0,0,85));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        setIconifiable(true);
        setMaximizable(true);
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
        Connect.setText("Connect");
        Connect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConnectMouseClicked(evt);
            }
        });
        getContentPane().add(Connect);
        Connect.setBounds(470, 170, 150, 23);

        custError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        custError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(custError);
        custError.setBounds(370, 10, 290, 20);

        MessageBox.setBackground(new Color (0,0,0,90));
        MessageBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MessageBox.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(MessageBox);
        MessageBox.setBounds(30, 170, 430, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Select Branch");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 40, 110, 20);

        selectBranch.setBackground(new Color(0,0,0));
        selectBranch.setForeground(new java.awt.Color(255, 255, 255));
        selectBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Branch" }));
        selectBranch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                selectBranchFocusLost(evt);
            }
        });
        getContentPane().add(selectBranch);
        selectBranch.setBounds(140, 40, 210, 22);
        for(Branch b : iWindow.getDB().getBranches().values()){
            selectBranch.addItem(b.getBranchNumber() + " " + b.getBranchName());
        }

        year.setBackground(new java.awt.Color(0, 0, 0));
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yeay", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearFocusLost(evt);
            }
        });
        getContentPane().add(year);
        year.setBounds(290, 70, 60, 22);

        month.setBackground(new java.awt.Color(0, 0, 0));
        month.setForeground(new java.awt.Color(255, 255, 255));
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(month);
        month.setBounds(210, 70, 60, 22);

        day.setBackground(new java.awt.Color(0, 0, 0));
        day.setForeground(new java.awt.Color(255, 255, 255));
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.setToolTipText("");
        day.setName(""); // NOI18N
        day.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dayFocusLost(evt);
            }
        });
        getContentPane().add(day);
        day.setBounds(140, 70, 50, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("From Date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 70, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Workout Num");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 100, 110, 20);

        WorkoutNum.setBackground(new Color(0,0,0,90));
        WorkoutNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        WorkoutNum.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(WorkoutNum);
        WorkoutNum.setBounds(140, 100, 210, 20);

        lblCustomerID.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerID.setText("jLabel1");
        getContentPane().add(lblCustomerID);
        lblCustomerID.setBounds(140, 10, 100, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnectMouseClicked
        custNum = customer.getId();
        System.out.println(workoutNum+" " +custNum+ " "+ start + " "+ branchNum);
        if (iWindow.getDB().addWorkout(workoutNum, custNum, start, branchNum)){
            MessageBox.setForeground(Color.GREEN);
            MessageBox.setText("Workout " +workoutNum + " was added successfully to Customer " + custNum);
            iWindow.log(new Date().toString() + " - Workout " +workoutNum + " was added successfully to Customer " + custNum);
        }
        else{
            MessageBox.setForeground(Color.RED);
            MessageBox.setText("Workout " +workoutNum + " was failed to be added to Customer " + custNum);
            iWindow.log(new Date().toString() + " - Workout " +workoutNum + " was failed to be added to Customer " + custNum);
        }
        
        iWindow.update();
        
    }//GEN-LAST:event_ConnectMouseClicked
        
    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost
        
    private void selectBranchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_selectBranchFocusLost
        String str = (String) selectBranch.getSelectedItem();
        if(str.equals("Select Branch"))
            return;
        if(str.length()<=0)
            return;
        
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))) continue;
            else{
                str = str.substring(0, i);
            }
        }
        branchNum = Integer.parseInt(str);

        iWindow.update();
    }//GEN-LAST:event_selectBranchFocusLost
    
    private void yearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFocusLost
        if (day.getSelectedIndex() != 0 && month.getSelectedIndex() != 0 && year.getSelectedIndex() != 0) {
            int d = day.getSelectedIndex();
            int m = month.getSelectedIndex()-1;
            int y =  year.getSelectedIndex()+110;
            
            start = new Date(y, m, d);
            
            if (customer.getId() != null && !customer.getId().equals("-1")){
                workoutNum = iWindow.getDB().getNextWork();
                WorkoutNum.setText(new Integer (workoutNum).toString());
            }
        }
        iWindow.update();
    }//GEN-LAST:event_yearFocusLost
                
    private void dayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dayFocusLost
        if (day.getSelectedIndex() != 0 && month.getSelectedIndex() != 0 && year.getSelectedIndex() != 0) {
            int d = day.getSelectedIndex();
            int m = month.getSelectedIndex()-1;
            int y =  year.getSelectedIndex()+110;
            start = new Date(y, m, d);
            
            if (customer.getId() != null && !customer.getId().equals("-1")){
                workoutNum = iWindow.getDB().getWorkouts().size()+10;
                WorkoutNum.setText(new Integer (workoutNum).toString());
            }
        }
        iWindow.update();
    }//GEN-LAST:event_dayFocusLost
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Connect;
    private javax.swing.JLabel MessageBox;
    private javax.swing.JLabel WorkoutNum;
    private javax.swing.JLabel custError;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JComboBox<String> selectBranch;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
    
    //Manual variables declaration
    private String custNum = null;
    private int workoutNum = -1;
    private int branchNum = -1;
    private Date start = null;
    private Customer cust = null;          
    
}
