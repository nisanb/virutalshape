package gui.internal;

import gui.iWindow;
import Validators.CharValidator;
import Validators.EmailValidator;
import Validators.PhoneValidator;
import Validators.PositiveValidator;
import core.Branch;
import java.awt.Color;
import utils.E_Cities;
import java.lang.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JList;

/**
 *
 * @author nisans
 */
public class EmpToBranch extends javax.swing.JInternalFrame {
    private int EmployeeID=0, BranchID=0;
    /**
     * Creates new form NewJInternalFrame
     */
    public EmpToBranch(int e, int b) {
        initComponents();
        this.EmployeeID=e;
        this.BranchID=b;
        setTitle("Employee #"+e+" -> Connect Employee to Branch");
        lblEmployeeID.setText(EmployeeID+"");
        lblBranchID.setText(BranchID+"");
        //Finished Loading
    }

    /**
     * Connects employee to branch given a specific employee number
     * Will display current branch
     * @param e 
     */
    public EmpToBranch(int e) {
        initComponents();
        this.EmployeeID=e;
        this.BranchID=0;
        setTitle("Employee #"+e+" -> Connect Employee to Branch");
        lblEmployeeID.setText(EmployeeID+"");
        lblBranchID.setText(BranchID+"");
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
        empError = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        subError = new javax.swing.JLabel();
        selectBranch = new javax.swing.JComboBox<>();
        MessageBox = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        lblBranchID = new javax.swing.JLabel();

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
        jLabel3.setText("Employee ID");
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
        Connect.setBounds(390, 150, 150, 23);

        empError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        empError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(empError);
        empError.setBounds(350, 10, 250, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Current Branch");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 40, 110, 20);

        jLabel3.setToolTipText("Subscription Number ");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Add to Branch");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 70, 110, 20);

        subError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(subError);
        subError.setBounds(360, 70, 230, 20);

        selectBranch.setBackground(new java.awt.Color(0, 0, 0));
        selectBranch.setForeground(new java.awt.Color(255, 255, 255));
        selectBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Branch" }));
        selectBranch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                selectBranchFocusLost(evt);
            }
        });
        getContentPane().add(selectBranch);
        selectBranch.setBounds(150, 70, 170, 20);
        for(Branch b : iWindow.getDB().getBranches().values()){
            selectBranch.addItem(b.getBranchNumber() + " " + b.getBranchName());
        }

        MessageBox.setBackground(new Color (0,0,0,90));
        MessageBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MessageBox.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(MessageBox);
        MessageBox.setBounds(30, 150, 330, 20);

        lblEmployeeID.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeID.setText("jLabel1");
        getContentPane().add(lblEmployeeID);
        lblEmployeeID.setBounds(150, 10, 160, 20);

        lblBranchID.setForeground(new java.awt.Color(255, 255, 255));
        lblBranchID.setText("jLabel2");
        getContentPane().add(lblBranchID);
        lblBranchID.setBounds(150, 40, 130, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnectMouseClicked
        if(iWindow.getDB().connectEmloyeeToBranch(EmployeeID, branchNum)){
            MessageBox.setForeground(Color.GREEN);
            MessageBox.setText("Successfully connected employee to new branch");
            iWindow.log(new Date().toString() + " - " + EmployeeID + " was successfully connected employee to new branch");
            lblBranchID.setText(new Integer(branchNum).toString());
            iWindow.exportData();
        }       
        else{
            MessageBox.setForeground(Color.RED);
            MessageBox.setText("Failed connected employee to new branch");
            iWindow.log(new Date().toString() + " - " + EmployeeID + " was failed to be connected to new branch");
        }
        iWindow.update();
        
    }//GEN-LAST:event_ConnectMouseClicked
        
    private void selectBranchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_selectBranchFocusLost
        if(selectBranch.getSelectedIndex()==0)
            return; 
        String str = (String) selectBranch.getSelectedItem();
        System.err.println("STR: "+str+" Length: "+(str.length())+" Value: "+str);
        if(str.length()<=0)
            return;
        
        
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))) continue;
            else{
                str = str.substring(0, i);
            }
        }
        branchNum = Integer.parseInt(str);
        System.out.println(branchNum);
        iWindow.update();
    }//GEN-LAST:event_selectBranchFocusLost
    
    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Connect;
    private javax.swing.JLabel MessageBox;
    private javax.swing.JLabel empError;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBranchID;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JComboBox<String> selectBranch;
    private javax.swing.JLabel subError;
    // End of variables declaration//GEN-END:variables
    
    //Manual variables declaration
    // create and add new Flight to IFly
    private int empNumber;
    private int branchNum;
    
    

}
