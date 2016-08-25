package gui.internal;

import gui.iWindow;
import Validators.CharValidator;
import Validators.EmailValidator;
import Validators.PhoneValidator;
import Validators.PositiveValidator;

import core.Branch;
import core.Room;
import java.awt.Color;
import utils.E_Cities;
import java.lang.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import utils.E_Rooms;
import utils.E_Types;

/**
 *
 * @author nisans
 */
public class AddInstrument extends javax.swing.JInternalFrame {

    private Branch branch;
    private Room room;
    /**
     * Creates new form NewJInternalFrame
     */
    public AddInstrument(Branch branch, Room room) {
        initComponents();
        setTitle("Instruments -> Add Instrument");
        this.branch = branch;
        this.room = room;
        lblBranchNum.setText(""+branch.getBranchNumber());
        lblRoomNum.setText(""+room.getRoomNum());
        insType.removeAllItems();
        insType.addItem("Select Instrument");
         for (E_Types type:E_Types.values()){
            insType.addItem(type.toString());
        }
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

        AddIns = new javax.swing.JButton();
        slctBranch = new javax.swing.JLabel();
        MessageBox = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InsNum = new javax.swing.JTextField();
        insNumError = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        insType = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        insStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblRoomNum = new javax.swing.JLabel();
        lblBranchNum = new javax.swing.JLabel();

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

        AddIns.setBackground(new java.awt.Color(102, 102, 102));
        AddIns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddIns.setForeground(new java.awt.Color(255, 255, 255));
        AddIns.setText("Add Instruments");
        AddIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddInsMouseClicked(evt);
            }
        });
        getContentPane().add(AddIns);
        AddIns.setBounds(430, 200, 150, 23);

        jLabel3.setToolTipText("Subscription Number ");
        slctBranch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        slctBranch.setForeground(new java.awt.Color(204, 204, 204));
        slctBranch.setText("Branch");
        getContentPane().add(slctBranch);
        slctBranch.setBounds(30, 10, 110, 20);

        MessageBox.setBackground(new Color (0,0,0,90));
        MessageBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MessageBox.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(MessageBox);
        MessageBox.setBounds(30, 200, 370, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Instruments Amount");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 100, 150, 20);

        InsNum.setBackground(new java.awt.Color(0, 0, 0));
        InsNum.setColumns(10);
        InsNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        InsNum.setForeground(new java.awt.Color(255, 255, 255));
        InsNum.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        InsNum.setCaretColor(new java.awt.Color(255, 255, 255));
        InsNum.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsNum.setSelectionColor(new java.awt.Color(204, 204, 204));
        InsNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                InsNumFocusLost(evt);
            }
        });
        getContentPane().add(InsNum);
        InsNum.setBounds(180, 100, 170, 21);

        insNumError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        insNumError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(insNumError);
        insNumError.setBounds(360, 100, 210, 20);

        jLabel3.setToolTipText("Subscription Number ");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Instrument Type");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 70, 140, 20);

        insType.setBackground(new java.awt.Color(0, 0, 0));
        insType.setForeground(new java.awt.Color(255, 255, 255));
        insType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Instrument", "CROSS", "CYCLE", "ROWER", "STEPPER", "BENCH", "KETTLEBELLS", "WEIGHTLIFTING_BAR", "POWER_STATION", "ROPE_CLIMBER", "SHOULDER_PRESS", "MATTRESS" }));
        insType.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                insTypeFocusLost(evt);
            }
        });
        getContentPane().add(insType);
        insType.setBounds(180, 70, 170, 20);

        jLabel3.setToolTipText("Subscription Number ");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Room");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 40, 110, 20);

        insStatus.setBackground(new java.awt.Color(0, 0, 0));
        insStatus.setForeground(new java.awt.Color(255, 255, 255));
        insStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "False", "True" }));
        insStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                insStatusFocusLost(evt);
            }
        });
        getContentPane().add(insStatus);
        insStatus.setBounds(180, 130, 170, 20);
        for(E_Rooms r : E_Rooms.values()){
            insType.addItem(r.toString());
        }

        jLabel3.setToolTipText("Subscription Number ");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Status");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 130, 140, 20);

        lblRoomNum.setForeground(new java.awt.Color(255, 255, 255));
        lblRoomNum.setText("branchnum");
        getContentPane().add(lblRoomNum);
        lblRoomNum.setBounds(180, 40, 80, 20);

        lblBranchNum.setForeground(new java.awt.Color(255, 255, 255));
        lblBranchNum.setText("branchnum");
        getContentPane().add(lblBranchNum);
        lblBranchNum.setBounds(180, 10, 80, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * this method adds instrument to ishape
     * @param evt 
     */
    private void AddInsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddInsMouseClicked

        int branchNum = branch.getBranchNumber();
        int roomNum = room.getRoomNum();
        
        if(amount < 1 || roomNum < 1 || type == null || branchNum < 1 || insStatus.getSelectedIndex() == 0){
            MessageBox.setForeground(Color.RED);
            MessageBox.setText("Please select all required fields");
            return;
        }
        if(iWindow.getDB().addInstrumentToRoom(branchNum, roomNum,type, status, amount)){
            MessageBox.setForeground(Color.GREEN);
            MessageBox.setText("Successfully added instrument " + type  +" to branch" + branchNum);
            iWindow.log(new Date().toString() + "Successfully added instrument " + type  +" to branch" + branchNum);
            iWindow.exportData();
            
            InsNum.setText(""); amount = -1;
            insStatus.setSelectedIndex(0); status = true;
            insType.setSelectedIndex(0); type=null;
        }       
        else{
            MessageBox.setForeground(Color.RED);
            MessageBox.setText("Failed to add instrument " + type  +" to branch" + branchNum);
            iWindow.log(new Date().toString() + " - " + "Failed to add instrument " + type  +" to branch" + branchNum);
        }
        iWindow.update();
        
    }//GEN-LAST:event_AddInsMouseClicked
           
    
    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost

    /**
     * this method validates the number of instruments inserted
     * @param evt 
     */
    private void InsNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InsNumFocusLost
       String str = InsNum.getText();
        if (!PositiveValidator.isPositiveStringNum(str) || str.length()>2) {
            insNumError.setText("Positive 2 digits only");
            amount = -1;
            iWindow.update();
            return;
        }

        else {
            insNumError.setText(" ");
            amount = Integer.parseInt(str);
        }
        
        iWindow.update();
    }//GEN-LAST:event_InsNumFocusLost

    /**
     * this method gets the instrument type
     * @param evt 
     */
    private void insTypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_insTypeFocusLost
        if(insType.getSelectedIndex() == 0){
            MessageBox.setForeground(Color.red);
            MessageBox.setText("One or more field are empty");
            type = null;
            iWindow.update();
            return;
        }
        if(insType.getSelectedItem().toString().length()<=0)
            return;
        
        type = E_Types.valueOf((String)insType.getSelectedItem());
            
    }//GEN-LAST:event_insTypeFocusLost

    /**
     * this method gets the instrument status
     * @param evt
     */
    private void insStatusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_insStatusFocusLost
        if (insStatus.getSelectedIndex() == 0){
            MessageBox.setForeground(Color.red);
            MessageBox.setText("One or more field are empty");
            return;
        }
        if (insStatus.getSelectedIndex() == 2) status = true;
        else if (insStatus.getSelectedIndex() == 1) status = false;
    }//GEN-LAST:event_insStatusFocusLost
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddIns;
    private javax.swing.JTextField InsNum;
    private javax.swing.JLabel MessageBox;
    private javax.swing.JLabel insNumError;
    private javax.swing.JComboBox<String> insStatus;
    private javax.swing.JComboBox<String> insType;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblBranchNum;
    private javax.swing.JLabel lblRoomNum;
    private javax.swing.JLabel slctBranch;
    // End of variables declaration//GEN-END:variables
    
    //Manual variables declaration
    // create and add new Flight to IFly
    private int branchNum;
    private int roomNum;
    private E_Types type;
    private int amount;
    private boolean status;
    
    
//    isUpdated = IShape.addInstrumentToRoom(branchNum, roomNum,
//            type, status, amount);

    

}
