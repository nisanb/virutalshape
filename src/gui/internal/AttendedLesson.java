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

/**
 *
 * @author nisans
 */
public class AttendedLesson extends javax.swing.JInternalFrame {
    private Customer customer;
    /**
     * Creates new form NewJInternalFrame
     */
    public AttendedLesson(Customer cust) {
        initComponents();
        this.customer = cust;
        setTitle("Customer #"+customer.getId()+" -> Add Lesson");
        
        lblCustomerID.setText(customer.getId());
        
        
        //Finished Loadingh 
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
        lesError = new javax.swing.JLabel();
        MessageBox = new javax.swing.JLabel();
        lesNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LessonName = new javax.swing.JComboBox<>();
        selectBranch = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        lessonChooser = new javax.swing.JComboBox<>();
        details = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        freeSpace = new javax.swing.JLabel();
        lblCustomerID = new javax.swing.JLabel();
        dateError = new javax.swing.JLabel();

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
        Connect.setText("Attended");
        Connect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConnectMouseClicked(evt);
            }
        });
        getContentPane().add(Connect);
        Connect.setBounds(510, 270, 150, 23);

        custError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        custError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(custError);
        custError.setBounds(360, 10, 320, 20);

        lesError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lesError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lesError);
        lesError.setBounds(360, 190, 320, 20);

        MessageBox.setBackground(new Color (0,0,0,90));
        MessageBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MessageBox.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(MessageBox);
        MessageBox.setBounds(40, 270, 430, 20);

        lesNum.setBackground(new java.awt.Color(0, 0, 0));
        lesNum.setColumns(10);
        lesNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lesNum.setForeground(new java.awt.Color(255, 255, 255));
        lesNum.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        lesNum.setCaretColor(new java.awt.Color(255, 255, 255));
        lesNum.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lesNum.setSelectionColor(new java.awt.Color(204, 204, 204));
        lesNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lesNumFocusLost(evt);
            }
        });
        getContentPane().add(lesNum);
        lesNum.setBounds(140, 190, 210, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Or Lesson Num");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 190, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Select Branch");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 40, 110, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Registered");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 220, 110, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Lesson Type");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 70, 110, 20);

        LessonName.setBackground(new java.awt.Color(0, 0, 0));
        LessonName.setForeground(new java.awt.Color(255, 255, 255));
        LessonName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Lesson Type" }));
        LessonName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LessonNameFocusLost(evt);
            }
        });
        getContentPane().add(LessonName);
        LessonName.setBounds(140, 70, 210, 20);
        for (E_Lessons l:E_Lessons.values()){
            LessonName.addItem(l.toString());
        }

        selectBranch.setBackground(new Color(0,0,0));
        selectBranch.setForeground(new java.awt.Color(255, 255, 255));
        selectBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Branch" }));
        selectBranch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                selectBranchFocusLost(evt);
            }
        });
        getContentPane().add(selectBranch);
        selectBranch.setBounds(140, 40, 210, 20);
        for(Branch b : iWindow.getDB().getBranches().values()){
            selectBranch.addItem(b.getBranchNumber() + " " + b.getBranchName());
        }

        year.setBackground(new java.awt.Color(0, 0, 0));
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2016", "2017", "2018", "2019", "2020" }));
        year.setToolTipText("");
        year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearFocusLost(evt);
            }
        });
        getContentPane().add(year);
        year.setBounds(290, 100, 60, 20);

        month.setBackground(new java.awt.Color(0, 0, 0));
        month.setForeground(new java.awt.Color(255, 255, 255));
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(month);
        month.setBounds(210, 100, 60, 20);

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
        day.setBounds(140, 100, 50, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("From Date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 100, 110, 20);

        lessonChooser.setBackground(new java.awt.Color(0, 0, 0));
        lessonChooser.setForeground(new java.awt.Color(255, 255, 255));
        lessonChooser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lessonChooserItemStateChanged(evt);
            }
        });
        getContentPane().add(lessonChooser);
        lessonChooser.setBounds(140, 160, 210, 20);

        details.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        details.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(details);
        details.setBounds(360, 160, 320, 20);

        Search.setBackground(new java.awt.Color(102, 102, 102));
        Search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search Lesson");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        getContentPane().add(Search);
        Search.setBounds(140, 130, 210, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Select Lesson");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 160, 110, 20);

        freeSpace.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        freeSpace.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(freeSpace);
        freeSpace.setBounds(140, 220, 80, 20);

        lblCustomerID.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblCustomerID);
        lblCustomerID.setBounds(140, 10, 200, 20);

        dateError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dateError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(dateError);
        dateError.setBounds(360, 100, 320, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnectMouseClicked
        custNum = customer.getId();
        if (!custNum.equals("-1") && lessonNum > 0 && iWindow.getDB().getLessons().get(lessonNum).getRegistered().containsKey(custNum)){
            MessageBox.setForeground(Color.RED);
            MessageBox.setText("Customer is already registered to this lesson");
            iWindow.update();
            return;
            
        }
        if(!iWindow.getDB().getCustomers().get(custNum).hasValidSub(start)){
            MessageBox.setForeground(Color.RED);
            MessageBox.setText("No valid sub for this lesson date");
            iWindow.update();
            return;
        }
        
        if (iWindow.getDB().addCustomerToLesson(custNum, lessonNum)){
            MessageBox.setForeground(Color.GREEN);
            MessageBox.setText("Customer " +custNum + "was added successfully to lesson " + lessonNum);
            iWindow.log(new Date().toString() + " - Customer " + custNum + " was added successfully to lesson "+ lessonNum);
        }
        else{
            MessageBox.setForeground(Color.RED);
            MessageBox.setText("Customer " + custNum + " was failed to be added to lesson "+ lessonNum);
            iWindow.log(new Date().toString() + " - Customer " + custNum + " was failed to be added to lesson "+ lessonNum);
        }
        
        iWindow.update();
        
    }//GEN-LAST:event_ConnectMouseClicked
    
    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost
    
    private void LessonNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LessonNameFocusLost
        if (LessonName.getSelectedIndex() !=0){
            les = E_Lessons.valueOf(LessonName.getSelectedItem().toString());
        }
        
        iWindow.update();
    }//GEN-LAST:event_LessonNameFocusLost
    
    private void selectBranchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_selectBranchFocusLost
        String str = (String) selectBranch.getSelectedItem();
        //System.err.println("STR: "+str+" Length: "+(str.length())+" Value: "+str);
        
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))) continue;
            else{
                str = str.substring(0, i);
            }
        }
        if(str.length()<1) return;
        branchNum = Integer.parseInt(str);
        
        
        
        iWindow.update();
    }//GEN-LAST:event_selectBranchFocusLost
    
    private void yearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFocusLost
        if (day.getSelectedIndex() != 0 && month.getSelectedIndex() != 0 && year.getSelectedIndex() != 0) {
            int d = day.getSelectedIndex();
            int m = month.getSelectedIndex()-1;
            int y =  year.getSelectedIndex()+115;
            
            start = new Date(y, m, d);
        }
        iWindow.update();
    }//GEN-LAST:event_yearFocusLost
    
    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        if (day.getSelectedIndex() != 0 && month.getSelectedIndex() != 0 && year.getSelectedIndex() != 0) {
            int d = day.getSelectedIndex();
            int m = month.getSelectedIndex()-1;
            int y =  year.getSelectedIndex()+115;
            
            start = new Date(y, m, d);
        }
        else{
            dateError.setText("Invalid date");
            iWindow.update();
            return;
        }
        
        dateError.setText(" ");
        if (branchNum ==0 || start == null || les == null){
            MessageBox.setText("Please choose all categories");
            iWindow.update();
            return;
        }
        
        lessonChooser.removeAllItems();
        Customer cust = iWindow.getDB().getCustomers().get(custNum);
        Branch branch = iWindow.getDB().getBranches().get(branchNum);{
        for (Subscription sub:cust.getSubs()){
            for (Lesson l:sub.getLessons()){
                if (l.getStartDate().before(start) && l.getName().equals(les) && l.getRegistered().get(custNum) == false){
                    lessonChooser.addItem(l.toString2());
                }
            }
        }
    }
    }//GEN-LAST:event_SearchMouseClicked
    
    private void lesNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lesNumFocusLost
        String str = lesNum.getText();
        if (!PositiveValidator.isPositiveStringNum(str) || !CharValidator.isNumber(str) || str.length() < 1) {
            lesError.setForeground(Color.red);
            lesError.setText("Positive digits only");
            lessonNum = -1;
            iWindow.update();
        }
        
        if (iWindow.getDB().getLessons().containsKey(Integer.parseInt(str))) {
            Lesson les = iWindow.getDB().getLessons().get(Integer.parseInt(str));
            lesError.setForeground(Color.green);
            lesError.setText(les.toString2());
            details.setText(les.toString2());
            lessonNum =Integer.parseInt(str);
            freeSpace.setText(les.getRegistered().size() + "/" + les.getMaxStudent());
        } else {
            lesError.setForeground(Color.red);
            lesError.setText("Lesson Number does not exists");
            lessonNum = -1;
            freeSpace.setText("0");
        }
        iWindow.update();
    }//GEN-LAST:event_lesNumFocusLost
    
    private void dayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dayFocusLost
        if (day.getSelectedIndex() != 0 && month.getSelectedIndex() != 0 && year.getSelectedIndex() != 0) {
            int d = day.getSelectedIndex();
            int m = month.getSelectedIndex()-1;
            int y =  year.getSelectedIndex()+115;
            
            start = new Date(y, m, d);
        }
        iWindow.update();
    }//GEN-LAST:event_dayFocusLost
    
    private void lessonChooserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lessonChooserItemStateChanged
        String str = lessonChooser.getSelectedItem().toString();
        if (str == null) return;
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))) continue;
            else str = str.substring(0,i);
        }
        lessonNum = Integer.parseInt(str);
        iWindow.update();
        Lesson les = iWindow.getDB().getLessons().get(lessonNum);
        if (les == null) return;
        details.setText(lessonChooser.getSelectedItem().toString());
        lesError.setForeground(Color.green);
        lesError.setText(lessonChooser.getSelectedItem().toString());
        lesNum.setText(str);
        freeSpace.setText(les.getRegistered().size() + "/" + les.getMaxStudent());
        iWindow.update();
    }//GEN-LAST:event_lessonChooserItemStateChanged
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Connect;
    private javax.swing.JComboBox<String> LessonName;
    private javax.swing.JLabel MessageBox;
    private javax.swing.JButton Search;
    private javax.swing.JLabel custError;
    private javax.swing.JLabel dateError;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel details;
    private javax.swing.JLabel freeSpace;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lesError;
    private javax.swing.JTextField lesNum;
    private javax.swing.JComboBox<String> lessonChooser;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JComboBox<String> selectBranch;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
    
    //Manual variables declaration
    // create and add new Flight to IFly
    private String custNum = null;
    private int lessonNum = -1;
    private int branchNum = -1;
    private Date start = null;
    private E_Lessons les = null;
    
}
