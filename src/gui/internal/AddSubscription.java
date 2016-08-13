/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internal;

import Validators.CharValidator;
import Validators.EmailValidator;
import Validators.PhoneValidator;
import Validators.PositiveValidator;
import core.Address;
import core.Branch;
import core.Coach;
import java.awt.Color;
import utils.E_Cities;
import java.lang.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JList;
import utils.E_Lessons;
import utils.E_Periods;
import utils.E_Types;

/**
 *
 * @author nisans
 */
public class AddSubscription extends javax.swing.JInternalFrame {

    private int WindowID = 6;

    /**
     * Creates new form NewJInternalFrame
     */
    public AddSubscription() {
        initComponents();
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
        cust = new javax.swing.JTextField();
        btnAddCustomer = new javax.swing.JButton();
        cusrError = new javax.swing.JLabel();
        recpError = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        recp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sub = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        length = new javax.swing.JComboBox<>();
        subError = new javax.swing.JLabel();
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
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Customer ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 10, 110, 20);

        cust.setBackground(new java.awt.Color(0, 0, 0));
        cust.setColumns(10);
        cust.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cust.setForeground(new java.awt.Color(255, 255, 255));
        cust.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        cust.setCaretColor(new java.awt.Color(255, 255, 255));
        cust.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cust.setSelectionColor(new java.awt.Color(204, 204, 204));
        cust.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                custFocusLost(evt);
            }
        });
        getContentPane().add(cust);
        cust.setBounds(140, 10, 170, 21);

        btnAddCustomer.setBackground(new java.awt.Color(102, 102, 102));
        btnAddCustomer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCustomer.setText("Add Subscription");
        btnAddCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCustomerMouseClicked(evt);
            }
        });
        getContentPane().add(btnAddCustomer);
        btnAddCustomer.setBounds(470, 230, 150, 23);

        cusrError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cusrError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(cusrError);
        cusrError.setBounds(350, 10, 240, 20);

        recpError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        recpError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(recpError);
        recpError.setBounds(350, 40, 250, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Period");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 130, 110, 20);

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.setToolTipText("");
        day.setName(""); // NOI18N
        getContentPane().add(day);
        day.setBounds(140, 100, 50, 20);

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(month);
        month.setBounds(200, 100, 60, 20);

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2015", "2016", "2017", "2018", "2019", "2020" }));
        year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearFocusLost(evt);
            }
        });
        getContentPane().add(year);
        year.setBounds(270, 100, 60, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Receptionist ID");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 40, 110, 20);

        recp.setBackground(new java.awt.Color(0, 0, 0));
        recp.setColumns(10);
        recp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        recp.setForeground(new java.awt.Color(255, 255, 255));
        recp.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        recp.setCaretColor(new java.awt.Color(255, 255, 255));
        recp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        recp.setSelectionColor(new java.awt.Color(204, 204, 204));
        recp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recpFocusLost(evt);
            }
        });
        getContentPane().add(recp);
        recp.setBounds(140, 40, 170, 21);

        jLabel3.setToolTipText("Subscription Number ");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Sub Number");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 70, 110, 20);

        sub.setBackground(new java.awt.Color(0, 0, 0));
        sub.setColumns(10);
        sub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sub.setForeground(new java.awt.Color(255, 255, 255));
        sub.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        sub.setCaretColor(new java.awt.Color(255, 255, 255));
        sub.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sub.setEnabled(false);
        sub.setSelectionColor(new java.awt.Color(204, 204, 204));
        sub.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                subFocusLost(evt);
            }
        });
        getContentPane().add(sub);
        sub.setBounds(140, 70, 170, 21);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Start Date");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 100, 110, 20);

        length.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 MONTH", "3 MONTHS - QUARTER", "6 MONTHS HALF", "12 MONTHS - YEAR" }));
        length.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lengthFocusLost(evt);
            }
        });
        getContentPane().add(length);
        length.setBounds(140, 130, 170, 20);

        subError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(subError);
        subError.setBounds(360, 70, 230, 20);

        dateError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dateError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(dateError);
        dateError.setBounds(360, 100, 240, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCustomerMouseClicked
   if(iWindow.DB.addSubToCustomer(subNumber, ID, receptNumber, period, startDate))
            System.out.println("Successfully added subscription");
            
    }//GEN-LAST:event_btnAddCustomerMouseClicked

    private void custFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_custFocusLost
        String str = cust.getText();
        if (!PositiveValidator.isPositiveStringNum(str) || str.length() != 8) {
            cusrError.setText("Positive 8 digits only");
            ID = "-1";
            return;
        }

        if (!iWindow.DB.getCustomers().containsKey(Integer.parseInt(str))) {
            cusrError.setText(" ");
            ID = str;
            subNumber = iWindow.DB.getCustomers().get(ID).getSubs().size() + 1;
            sub.setText(new Integer(subNumber).toString());
        } else {
            cusrError.setText("Custonrt ID exists");
            ID = "-1";
        }

    }//GEN-LAST:event_custFocusLost

    private void yearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFocusLost
        if (day.getSelectedIndex() != 0 && month.getSelectedIndex() != 0 && year.getSelectedIndex() != 0) {
            int d = day.getSelectedIndex();
            int m = month.getSelectedIndex()-1;
            int y =  year.getSelectedIndex()+29;
            
            startDate = new Date(y, m, d);
            Date today = new Date();
            Date ref = new Date(today.getYear(), today.getMonth(), today.getDay()-7);
          
            if ((today.getTime() - ref.getTime()) > 6.048e+8){
                startDate = null;
                dateError.setText("Can't add sub more than week later"); 
            }
            
            if ((today.getTime() - ref.getTime()) < 6.048e+8)
                startDate = null;
                dateError.setText("Can't add sub more than week ahead");
        }
        
    }//GEN-LAST:event_yearFocusLost

    private void recpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recpFocusLost
        //TODO - GET LOGIN ID AUTHOMATICALLY
        String str = recp.getText();
        if (!PositiveValidator.isPositiveStringNum(str) || str.length() != 9) {
            recpError.setText("Positive 9 digits only");
            receptNumber = -1;
            return;
        }

        if (iWindow.DB.getEmployees().containsKey(Integer.parseInt(str))) {
            recpError.setText(" ");
            receptNumber = Integer.parseInt(str);
        } else {
            recpError.setText("Emlpyee number doesn't exists");
            receptNumber = -1;
        }

    }//GEN-LAST:event_recpFocusLost

    private void subFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subFocusLost
        
    }//GEN-LAST:event_subFocusLost

    private void lengthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lengthFocusLost
        if (length.getSelectedIndex() == 0) period = E_Periods.valueOf("MONTH");
        else if (length.getSelectedIndex() == 0) period = E_Periods.valueOf("QUATER");
        else if (length.getSelectedIndex() == 0) period = E_Periods.valueOf("HALF");
        else if (length.getSelectedIndex() == 0) period = E_Periods.valueOf("YEAR");
    }//GEN-LAST:event_lengthFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JLabel cusrError;
    private javax.swing.JTextField cust;
    private javax.swing.JLabel dateError;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> length;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField recp;
    private javax.swing.JLabel recpError;
    private javax.swing.JTextField sub;
    private javax.swing.JLabel subError;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables

    //Manual variables declaration
    // create and add new Flight to IFly
    private int subNumber;
    private String ID;
    private int receptNumber;
    private E_Periods period;
    private Date startDate;
    

    //Manual variables declaration 
    public int getWindowID() {
        return this.WindowID;
    }

    public void setWindowID(int id) {
        this.WindowID = id;
    }
}