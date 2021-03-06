/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internal;

import gui.iWindow;
import Validators.CharValidator;
import Validators.EmailValidator;
import Validators.PhoneValidator;
import Validators.PositiveValidator;
import core.Address;
import core.Branch;
import core.Coach;
import core.Customer;
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
import utils.E_Types;

/**
 *
 * @author nisans
 */
public class UpdateCustAddress extends javax.swing.JInternalFrame {

    private Customer customer;
    private URL email;
    /**
     * Creates new form NewJInternalFrame
     */
    public UpdateCustAddress(Customer cust) {
        id = cust.getId();
        this.customer = cust;

        initComponents();
        IDfield.setText(id);
        setTitle("Customers -> Update Customer Address");

        updateData();
        //Finished Loading
        slctCity.addItem(customer.getCustomerAddress().getCity().toString());
        slctCity.setSelectedIndex(1);
        for (E_Cities city : E_Cities.values()) {
            slctCity.addItem(city.toString());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPhoneNumber = new javax.swing.JTextField();
        slctCity = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        changeAddr = new javax.swing.JButton();
        btnBranchCountry = new javax.swing.JTextField();
        btnhStreet = new javax.swing.JTextField();
        btnHouseNumber = new javax.swing.JTextField();
        numError = new javax.swing.JLabel();
        phoneError = new javax.swing.JLabel();
        streetError = new javax.swing.JLabel();
        houseError = new javax.swing.JLabel();
        numError2 = new javax.swing.JLabel();
        MessageBox = new javax.swing.JLabel();
        IDfield = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        mailError = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Phone Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 160, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Customer ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 10, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Country");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 70, 110, 20);

        btnPhoneNumber.setBackground(new java.awt.Color(0, 0, 0));
        btnPhoneNumber.setColumns(15);
        btnPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        btnPhoneNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnPhoneNumber.setCaretColor(new java.awt.Color(255, 255, 255));
        btnPhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnPhoneNumberFocusLost(evt);
            }
        });
        getContentPane().add(btnPhoneNumber);
        btnPhoneNumber.setBounds(140, 160, 170, 21);

        slctCity.setBackground(new java.awt.Color(0, 0, 0));
        slctCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        slctCity.setForeground(new java.awt.Color(255, 255, 255));
        slctCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City" }));
        slctCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                slctCityItemStateChanged(evt);
            }
        });
        slctCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                slctCityFocusLost(evt);
            }
        });
        getContentPane().add(slctCity);
        slctCity.setBounds(140, 40, 170, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("City");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 40, 110, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Street");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 100, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("House Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 130, 110, 20);

        changeAddr.setBackground(new java.awt.Color(102, 102, 102));
        changeAddr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        changeAddr.setForeground(new java.awt.Color(255, 255, 255));
        changeAddr.setText("Update");
        changeAddr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAddrMouseClicked(evt);
            }
        });
        getContentPane().add(changeAddr);
        changeAddr.setBounds(530, 310, 140, 23);

        btnBranchCountry.setBackground(new java.awt.Color(0, 0, 0));
        btnBranchCountry.setColumns(20);
        btnBranchCountry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBranchCountry.setForeground(new java.awt.Color(255, 255, 255));
        btnBranchCountry.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnBranchCountry.setCaretColor(new java.awt.Color(255, 255, 255));
        btnBranchCountry.setEnabled(false);
        getContentPane().add(btnBranchCountry);
        btnBranchCountry.setBounds(140, 70, 170, 21);

        btnhStreet.setBackground(new java.awt.Color(0, 0, 0));
        btnhStreet.setColumns(20);
        btnhStreet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnhStreet.setForeground(new java.awt.Color(255, 255, 255));
        btnhStreet.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnhStreet.setCaretColor(new java.awt.Color(255, 255, 255));
        btnhStreet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnhStreetFocusLost(evt);
            }
        });
        getContentPane().add(btnhStreet);
        btnhStreet.setBounds(140, 100, 170, 21);

        btnHouseNumber.setBackground(new java.awt.Color(0, 0, 0));
        btnHouseNumber.setColumns(4);
        btnHouseNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHouseNumber.setForeground(new java.awt.Color(255, 255, 255));
        btnHouseNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnHouseNumber.setCaretColor(new java.awt.Color(255, 255, 255));
        btnHouseNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnHouseNumberFocusLost(evt);
            }
        });
        getContentPane().add(btnHouseNumber);
        btnHouseNumber.setBounds(140, 130, 170, 21);

        numError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        numError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(numError);
        numError.setBounds(330, 10, 310, 20);

        phoneError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        phoneError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(phoneError);
        phoneError.setBounds(350, 220, 180, 20);

        streetError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        streetError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(streetError);
        streetError.setBounds(330, 160, 330, 20);

        houseError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        houseError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(houseError);
        houseError.setBounds(340, 160, 330, 20);

        numError2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        numError2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(numError2);
        numError2.setBounds(350, 10, 170, 20);

        MessageBox.setBackground(new Color (0,0,0,90));
        MessageBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MessageBox.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(MessageBox);
        MessageBox.setBounds(30, 310, 470, 20);

        IDfield.setBackground(new java.awt.Color(0, 0, 0));
        IDfield.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(IDfield);
        IDfield.setBounds(140, 10, 160, 20);

        emailfield.setBackground(new java.awt.Color(0, 0, 0));
        emailfield.setColumns(20);
        emailfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailfield.setForeground(new java.awt.Color(255, 255, 255));
        emailfield.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        emailfield.setCaretColor(null);
        emailfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailfieldFocusLost(evt);
            }
        });
        getContentPane().add(emailfield);
        emailfield.setBounds(140, 190, 170, 21);

        mailError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mailError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(mailError);
        mailError.setBounds(350, 190, 170, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Email");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 190, 110, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * this method adds updates customer address on ishape
     *
     * @param evt
     */

    private void changeAddrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeAddrMouseClicked
        Address address = new Address(country, city, street,
                housNumber, phones);

        if (iWindow.getDB().changeCustomerAddress(id, country, city, street, housNumber, phones)) {
            customer.setEmail(email);
            MessageBox.setForeground(Color.GREEN);
            MessageBox.setText("Customer's address was added successfully");
            iWindow.log(new Date().toString() + " - " + id + " was added successfully");
            iWindow.exportData();
        } else {
            MessageBox.setForeground(Color.RED);
            MessageBox.setText("Failed to add customer");
            iWindow.log(new Date().toString() + " - " + id + " was falied to be add");
        }

        System.out.println(iWindow.getDB().getCustomers().get(id));

        iWindow.update();

    }//GEN-LAST:event_changeAddrMouseClicked

    /**
     * this method validates the street name input
     *
     * @param evt
     */
    private void btnhStreetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnhStreetFocusLost
        String str = btnhStreet.getText();
        if (CharValidator.isWord(str)) {
            streetError.setText(" ");
            street = str;
        } else {
            streetError.setText("Enter valid name");
            street = null;
        }
        iWindow.update();
    }//GEN-LAST:event_btnhStreetFocusLost

    public void updateData() {
        if (customer == null) {
            return;
        }
        btnHouseNumber.setText(customer.getCustomerAddress().getHousNumber() + "");

        String phoneStr = "";
        String phoneArray[] = customer.getCustomerAddress().getPhoneNumber();
       
        
        for(String tmp : phoneArray){
            phoneStr = phoneStr + tmp + ", ";
        }
        phoneStr = phoneStr.substring(0, phoneStr.length()-2);
        
        btnPhoneNumber.setText(phoneStr);
        String email = customer.getEmail().toString();
        email = email.substring(7, email.length());
        emailfield.setText(email);
        btnhStreet.setText(customer.getCustomerAddress().getStreet());
        String str = (String) slctCity.getSelectedItem();
        if (str.equals("Select City")) {
            return;
        }

        city = E_Cities.valueOf(str);
        btnBranchCountry.setText(city.getCountry());
        country = city.getCountry();
        
        iWindow.update();

        
        
    }

    /**
     * this method validates the house number input
     *
     * @param evt
     */
    private void btnHouseNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnHouseNumberFocusLost
        String str = btnHouseNumber.getText();
        if (PositiveValidator.isPositiveStringNum(str) && str.length() < 5) {
            houseError.setText(" ");
            housNumber = Integer.parseInt(str);

        } else {
            houseError.setText("up tp 4 digit number");
            housNumber = -1;
        }
        iWindow.update();
    }//GEN-LAST:event_btnHouseNumberFocusLost

    /**
     * this method validates phone number using validator
     *
     * @param evt
     */
    private void btnPhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnPhoneNumberFocusLost

        if (phones == null) {
            String[] phones = new String[5];
        }
        try {
            String str = btnPhoneNumber.getText();
            phones = str.split(", ");
        } catch (java.lang.ArrayIndexOutOfBoundsException obe) {
            phoneError.setText("up to 5 phone numbers");
        }

        for (String s : phones) {
            if (!PhoneValidator.validatePhone(s)) {
                phoneError.setText("wrong format. example: 972-xxxxxxx, 04-xxxxxxx");
                iWindow.update();
                return;
            }
        }
        phoneError.setText(" ");
        iWindow.update();
    }//GEN-LAST:event_btnPhoneNumberFocusLost

    /**
     * this method checks user's city selection and sets the city and country
     *
     * @param evt
     */
    private void slctCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_slctCityFocusLost

    }//GEN-LAST:event_slctCityFocusLost

    private void slctCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_slctCityItemStateChanged
        // TODO add your handling code here:
        
        String str = (String) slctCity.getSelectedItem();
        if (str.equals("Select City")) {
            return;
        }

        city = E_Cities.valueOf(str);
        btnBranchCountry.setText(city.getCountry());
        country = city.getCountry();
        iWindow.update();
    }//GEN-LAST:event_slctCityItemStateChanged

    private void emailfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailfieldFocusLost
        String str = emailfield.getText();
        if (EmailValidator.validateEmail(str)){
            str = "http:\\"+"\\"+str;
            try {
                email = new URL(str);
                mailError.setText(" ");
            } catch (MalformedURLException ex) {
                mailError.setText("username@domain.xx");
            }

        }
        else{
            mailError.setText("username@domain.xx");
            email = null;
        }
        iWindow.update();

    }//GEN-LAST:event_emailfieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDfield;
    private javax.swing.JLabel MessageBox;
    private javax.swing.JTextField btnBranchCountry;
    private javax.swing.JTextField btnHouseNumber;
    private javax.swing.JTextField btnPhoneNumber;
    private javax.swing.JTextField btnhStreet;
    private javax.swing.JButton changeAddr;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel houseError;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel mailError;
    private javax.swing.JLabel numError;
    private javax.swing.JLabel numError2;
    private javax.swing.JLabel phoneError;
    private javax.swing.JComboBox<String> slctCity;
    private javax.swing.JLabel streetError;
    // End of variables declaration//GEN-END:variables

    //Manual variables declaration 
    private String id;
    private String country;
    private E_Cities city;
    private String street;
    private int housNumber;
    private String[] phones = new String[5];

}
