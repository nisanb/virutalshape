/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internal;

import Validators.CharValidator;
import Validators.PhoneValidator;
import Validators.PositiveValidator;
import core.Branch;
import java.awt.Color;
import utils.E_Cities;
import java.lang.Enum.*;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author nisans
 */
public class AddBranchForm extends javax.swing.JInternalFrame {
    private int WindowID = 2;
    private Branch branch=null;
    private boolean editForm = false;
    /**
     * Creates new form NewJInternalFrame
     */
    public AddBranchForm() {
        initComponents();
         falseVisible();
        UIManager.put("slctCity.background", new ColorUIResource(UIManager.getColor("TextField.background")));
        UIManager.put("slctCity.foreground", new ColorUIResource(UIManager.getColor("TextField.foreground")));
        UIManager.put("slctCity.selectionBackground", new ColorUIResource(Color.GREEN));
        UIManager.put("slctCity.selectionForeground", new ColorUIResource(Color.WHITE));
        //Finished Loading
        
        for(E_Cities city : E_Cities.values()){
            slctCity.addItem(city.toString());
        }
        phoneError.setVisible(false);
        
    }
    
    /**
     * SWT Update - Bypass Bad Effects
     */
    public void update(){
        
        hide();
        repaint();
        show();
    }
    
    /**
     * Set All Errors
     */
    public void falseVisible(){
        phoneError.setVisible(false);
        numError.setVisible(false);
        numExists.setVisible(false);
        houseError.setVisible(false);
        streetError.setVisible(false);
        if(editForm){
            btnBranchCountry.setEnabled(false);
            btnBranchCountry.setBorder(null);
            btnBranchNum.setEnabled(false);
            btnBranchNum.setBorder(null);
            btnBranchStreet.setEnabled(false);
            btnBranchStreet.setBorder(null);
            btnHouseNumber.setEnabled(false);
            btnHouseNumber.setBorder(null);
            
        }
        
        update();
        
    }
    /**
     * Constructor as editor
     * @param branch 
     */
    public AddBranchForm(Branch branch){
         
        editForm = true;
        initComponents();
        falseVisible();
        this.branch=branch;
        btnBranchNum.setText(""+branch.getBranchNumber());
        btnBranchNum.setEditable(false);
        btnBranchName.setText(branch.getBranchName());
        btnBranchCountry.setText(branch.getBranchAddress().getCountry().toString());
        slctCity.setEditable(false);
        slctCity.setEnabled(false);
      
        
        int counter=0, selected=0;
        for(E_Cities city : E_Cities.values()){
            
            slctCity.addItem(city.toString());
            if(city.equals(branch.getBranchAddress().getCity())){
                selected=counter+1;
                
            }
            counter++;
        }
        slctCity.setSelectedIndex(selected);
        
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPhoneNumber = new javax.swing.JTextField();
        btnBranchNum = new javax.swing.JTextField();
        btnBranchName = new javax.swing.JTextField();
        slctCity = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAddBranch = new javax.swing.JButton();
        btnBranchCountry = new javax.swing.JTextField();
        btnBranchStreet = new javax.swing.JTextField();
        btnHouseNumber = new javax.swing.JTextField();
        numExists = new javax.swing.JLabel();
        phoneError = new javax.swing.JLabel();
        countryError = new javax.swing.JLabel();
        streetError = new javax.swing.JLabel();
        houseError = new javax.swing.JLabel();
        numError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setAutoscrolls(true);
        setFrameIcon(null);
        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(560, 330));
        setMinimumSize(new java.awt.Dimension(560, 330));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 314));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 200, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Branch Nunber");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 20, 110, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Branch Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 50, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Country");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 80, 110, 20);

        btnPhoneNumber.setBackground(new java.awt.Color(0, 0, 0));
        btnPhoneNumber.setColumns(15);
        btnPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        btnPhoneNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnPhoneNumber.setOpaque(false);
        btnPhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnPhoneNumberFocusLost(evt);
            }
        });
        getContentPane().add(btnPhoneNumber);
        btnPhoneNumber.setBounds(160, 200, 170, 21);

        btnBranchNum.setBackground(new java.awt.Color(0, 0, 0));
        btnBranchNum.setColumns(10);
        btnBranchNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBranchNum.setForeground(new java.awt.Color(255, 255, 255));
        btnBranchNum.setBorder(null);
        btnBranchNum.setCaretColor(new java.awt.Color(255, 255, 255));
        btnBranchNum.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        btnBranchNum.setOpaque(false);
        btnBranchNum.setSelectionColor(new java.awt.Color(204, 204, 204));
        btnBranchNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnBranchNumFocusLost(evt);
            }
        });
        getContentPane().add(btnBranchNum);
        btnBranchNum.setBounds(160, 20, 170, 17);

        btnBranchName.setBackground(new java.awt.Color(0, 0, 0));
        btnBranchName.setColumns(20);
        btnBranchName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBranchName.setForeground(new java.awt.Color(255, 255, 255));
        btnBranchName.setBorder(new javax.swing.border.MatteBorder(null));
        btnBranchName.setOpaque(false);
        btnBranchName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnBranchNameFocusLost(evt);
            }
        });
        getContentPane().add(btnBranchName);
        btnBranchName.setBounds(160, 50, 170, 19);

        slctCity.setBackground(new java.awt.Color(0, 0, 0));
        slctCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        slctCity.setForeground(new java.awt.Color(255, 255, 255));
        slctCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City" }));
        slctCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        slctCity.setOpaque(false);
        slctCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                slctCityFocusLost(evt);
            }
        });
        getContentPane().add(slctCity);
        slctCity.setBounds(160, 110, 170, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 110, 110, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Street");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 140, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("House Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 170, 110, 20);

        btnAddBranch.setBackground(new java.awt.Color(102, 102, 102));
        btnAddBranch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddBranch.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBranch.setText("Add Branch");
        btnAddBranch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBranchMouseClicked(evt);
            }
        });
        btnAddBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBranchActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddBranch);
        btnAddBranch.setBounds(190, 260, 110, 23);

        btnBranchCountry.setBackground(new java.awt.Color(0, 0, 0));
        btnBranchCountry.setColumns(20);
        btnBranchCountry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBranchCountry.setForeground(new java.awt.Color(255, 255, 255));
        btnBranchCountry.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnBranchCountry.setEnabled(false);
        btnBranchCountry.setOpaque(false);
        btnBranchCountry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnBranchCountryFocusLost(evt);
            }
        });
        getContentPane().add(btnBranchCountry);
        btnBranchCountry.setBounds(160, 80, 170, 21);

        btnBranchStreet.setBackground(new java.awt.Color(0, 0, 0));
        btnBranchStreet.setColumns(20);
        btnBranchStreet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBranchStreet.setForeground(new java.awt.Color(255, 255, 255));
        btnBranchStreet.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnBranchStreet.setOpaque(false);
        btnBranchStreet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnBranchStreetFocusLost(evt);
            }
        });
        getContentPane().add(btnBranchStreet);
        btnBranchStreet.setBounds(160, 140, 170, 21);

        btnHouseNumber.setBackground(new java.awt.Color(0, 0, 0));
        btnHouseNumber.setColumns(4);
        btnHouseNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHouseNumber.setForeground(new java.awt.Color(255, 255, 255));
        btnHouseNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnHouseNumber.setOpaque(false);
        btnHouseNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnHouseNumberFocusLost(evt);
            }
        });
        getContentPane().add(btnHouseNumber);
        btnHouseNumber.setBounds(160, 170, 170, 21);

        numExists.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        numExists.setForeground(new java.awt.Color(255, 0, 0));
        numExists.setText("Branch number exists");
        getContentPane().add(numExists);
        numExists.setBounds(350, 20, 170, 20);

        phoneError.setBackground(new Color(0,0,0,0));
        phoneError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        phoneError.setForeground(new java.awt.Color(255, 0, 0));
        phoneError.setText("Error (example: 972-xxxx)");
        getContentPane().add(phoneError);
        phoneError.setBounds(350, 200, 170, 20);

        countryError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        countryError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(countryError);
        countryError.setBounds(350, 80, 170, 20);

        streetError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        streetError.setForeground(new java.awt.Color(255, 0, 0));
        streetError.setText("Enter valid name");
        getContentPane().add(streetError);
        streetError.setBounds(350, 140, 180, 20);

        houseError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        houseError.setForeground(new java.awt.Color(255, 0, 0));
        houseError.setText("Invalid Input");
        getContentPane().add(houseError);
        houseError.setBounds(350, 170, 180, 20);

        numError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        numError.setForeground(new java.awt.Color(255, 0, 0));
        numError.setText("Input valid numbers only");
        getContentPane().add(numError);
        numError.setBounds(350, 20, 170, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBranchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBranchMouseClicked
        // TODO add your handling code here:
        System.out.println(slctCity.getSelectedItem());
    }//GEN-LAST:event_btnAddBranchMouseClicked

    private void btnBranchNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnBranchNumFocusLost
       if(editForm) return;
        String str = btnBranchNum.getText();
        if (!PositiveValidator.isPositiveStringNum(str) || str.length() !=8){
            numExists.setVisible(false);
            numError.setVisible(true);
            branchNumber = -1;
  
            
            update();
            
            return;
        }          
        
        if (!iWindow.DB.getBranches().containsKey(Integer.parseInt(btnBranchNum.getText()))){
              numError.setVisible(false);
              numExists.setVisible(false);
              branchNumber = Integer.parseInt(str);
           }
           else {
            numError.setVisible(false);
            numExists.setVisible(true);
            
            branchNumber = -1;
        }
        update();
        
    }//GEN-LAST:event_btnBranchNumFocusLost

    private void btnBranchNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnBranchNameFocusLost
       branchName = btnBranchName.getText();
       update();
    }//GEN-LAST:event_btnBranchNameFocusLost

    private void btnBranchCountryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnBranchCountryFocusLost
//        String str = btnBranchCountry.getText();
//        if (CharValidator.isWord(str)) {
//            countryError.setText(" ");
//            country = str;
//        }
//        else {
//            countryError.setText("Enter valid name");
//            country = null;
//        }
    }//GEN-LAST:event_btnBranchCountryFocusLost

    private void btnBranchStreetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnBranchStreetFocusLost
        if(editForm) return;
        String str = btnBranchStreet.getText();
        if (CharValidator.isWord(str)) {
            streetError.setVisible(false);
            street = str;
        }
        else {
            streetError.setVisible(true);
            
            street = null;
        }
        update();
    }//GEN-LAST:event_btnBranchStreetFocusLost

    private void btnHouseNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnHouseNumberFocusLost
        if(editForm)
            return;
        
        String str = btnHouseNumber.getText();
        if (PositiveValidator.isPositiveStringNum(str) && str.length() < 5) {
            houseError.setVisible(false);

            housNumber = Integer.parseInt(str);
        
        }
        else {
            houseError.setVisible(true);
            
            housNumber = -1;
        }
        update();
    }//GEN-LAST:event_btnHouseNumberFocusLost

    private void btnPhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnPhoneNumberFocusLost
        if (phoneNumber == null) phoneNumber = new ArrayList<String>();
        
        
        String str = btnPhoneNumber.getText();
        if (PhoneValidator.validatePhone(str)) {
            
            phoneError.setVisible(false);
            phoneNumber.add(str);
            
            
        }
        else {
            phoneError.setVisible(true);
           
            
       
        }
        update();
    }//GEN-LAST:event_btnPhoneNumberFocusLost

    private void slctCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_slctCityFocusLost
        //        try{
        if(editForm)
            return;
            String str = (String)slctCity.getSelectedItem();
            if(str.equals("Select City"))
                return;
            city = E_Cities.valueOf(str);
  
            btnBranchCountry.setText(city.getCountry());
           update();
            btnBranchCountry.repaint();
            country = city.getCountry();
            //        System.out.println(str);
            //        }catch (Exception e){
            //            e.printStackTrace();
            //        }
    }//GEN-LAST:event_slctCityFocusLost

    private void btnAddBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBranchActionPerformed
        if (iWindow.DB.addBranch(branchNumber, branchName, city, country, street, housNumber, phoneNumber.toArray(new String[phoneNumber.size()]) ))
        System.out.println("Successfully added branch");
    }//GEN-LAST:event_btnAddBranchActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        update();
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBranch;
    private javax.swing.JTextField btnBranchCountry;
    private javax.swing.JTextField btnBranchName;
    private javax.swing.JTextField btnBranchNum;
    private javax.swing.JTextField btnBranchStreet;
    private javax.swing.JTextField btnHouseNumber;
    private javax.swing.JTextField btnPhoneNumber;
    private javax.swing.JLabel countryError;
    private javax.swing.JLabel houseError;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel numError;
    private javax.swing.JLabel numExists;
    private javax.swing.JLabel phoneError;
    private javax.swing.JComboBox<String> slctCity;
    private javax.swing.JLabel streetError;
    // End of variables declaration//GEN-END:variables

    //Manual variables declaration 
    private int branchNumber;
    private String branchName;
    private String country;
    private E_Cities city;
    private String street;
    private int housNumber;
    private ArrayList<String> phoneNumber;
    //Manual variables declaration 
    
    
    
    public int getWindowID(){
        return this.WindowID;
    }

    public void setWindowID(int id){
        this.WindowID=id;
    }
    public Branch getBranch(){
        return this.branch;
    }

    public boolean isEdit(){
        if(getBranch()==null){
            return false;
        }
        return true;
    }
}
