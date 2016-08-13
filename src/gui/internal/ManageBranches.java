/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internal;

import core.Branch;
import core.Employee;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author nisans
 */
public class ManageBranches extends javax.swing.JInternalFrame {
    private int WindowID = 4;
    private Object obj=null;
    /**
     * Creates new form NewJInternalFrame
     */
    public ManageBranches() {
        initComponents();
   
        chooseCustoemr.setBackground(Color.black);
        chooseCustoemr.setForeground(Color.white);
        chooseCustoemr.removeAllItems();
        chooseCustoemr.addItem("Edit Branch");
        chooseCustoemr.setSelectedIndex(0);
        statisticsPanel.hide();
        for(Branch branch : iWindow.DB.getBranches().values()){
            chooseCustoemr.addItem(branch.toString());
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

        chooseCustoemr = new javax.swing.JComboBox<>();
        statisticsPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        btnEdit = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblBranchID = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        lblTotalWorkouts = new javax.swing.JLabel();
        txtTotalWorkouts = new javax.swing.JLabel();
        lblTotalLessons = new javax.swing.JLabel();
        txtTotalLessons = new javax.swing.JLabel();
        lblVisitedCustomers = new javax.swing.JLabel();
        txtVisitedCustomers = new javax.swing.JLabel();
        lblBranchAddress = new javax.swing.JLabel();
        txtBranchName = new javax.swing.JLabel();
        lblTotalEmployees = new javax.swing.JLabel();
        txtTotalEmployees = new javax.swing.JLabel();
        lblTotalRooms = new javax.swing.JLabel();
        txtTotalRooms = new javax.swing.JLabel();
        lblBranchName = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new Color(0,0,0,70));
        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(null);
        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(1073, 500));
        setMinimumSize(new java.awt.Dimension(1073, 500));
        setName(""); // NOI18N
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1073, 500));
        getContentPane().setLayout(null);

        chooseCustoemr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        chooseCustoemr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chooseCustoemrItemStateChanged(evt);
            }
        });
        chooseCustoemr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseCustoemrActionPerformed(evt);
            }
        });
        getContentPane().add(chooseCustoemr);
        chooseCustoemr.setBounds(60, 40, 260, 22);

        statisticsPanel.setBackground(new Color(0,0,0,0));
        statisticsPanel.setLayout(null);
        statisticsPanel.add(jSeparator2);
        jSeparator2.setBounds(30, 50, 210, 0);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/edit-11-24.png"))); // NOI18N
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        statisticsPanel.add(btnEdit);
        btnEdit.setBounds(340, 50, 30, 30);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setEnabled(false);
        statisticsPanel.add(jSeparator4);
        jSeparator4.setBounds(10, 40, 30, 10);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        statisticsPanel.add(jSeparator5);
        jSeparator5.setBounds(10, 40, 10, 250);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        statisticsPanel.add(jSeparator6);
        jSeparator6.setBounds(10, 290, 390, 10);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        statisticsPanel.add(jSeparator7);
        jSeparator7.setBounds(140, 40, 260, 10);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        statisticsPanel.add(jSeparator8);
        jSeparator8.setBounds(400, 40, 10, 250);

        lblBranchID.setForeground(new java.awt.Color(255, 255, 255));
        lblBranchID.setText("id");
        statisticsPanel.add(lblBranchID);
        lblBranchID.setBounds(210, 60, 70, 16);

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("Branch ID");
        statisticsPanel.add(txtID);
        txtID.setBounds(20, 60, 70, 16);

        lblTotalWorkouts.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalWorkouts.setText("workouts");
        statisticsPanel.add(lblTotalWorkouts);
        lblTotalWorkouts.setBounds(210, 120, 70, 16);

        txtTotalWorkouts.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalWorkouts.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTotalWorkouts.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalWorkouts.setText("Total Workouts");
        statisticsPanel.add(txtTotalWorkouts);
        txtTotalWorkouts.setBounds(20, 120, 100, 16);

        lblTotalLessons.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalLessons.setText("lessons");
        statisticsPanel.add(lblTotalLessons);
        lblTotalLessons.setBounds(210, 140, 70, 16);

        txtTotalLessons.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalLessons.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTotalLessons.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalLessons.setText("Total Lessons");
        statisticsPanel.add(txtTotalLessons);
        txtTotalLessons.setBounds(20, 140, 110, 16);

        lblVisitedCustomers.setForeground(new java.awt.Color(255, 255, 255));
        lblVisitedCustomers.setText("customers");
        statisticsPanel.add(lblVisitedCustomers);
        lblVisitedCustomers.setBounds(210, 160, 70, 16);

        txtVisitedCustomers.setBackground(new java.awt.Color(255, 255, 255));
        txtVisitedCustomers.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtVisitedCustomers.setForeground(new java.awt.Color(255, 255, 255));
        txtVisitedCustomers.setText("# of Visited Customers");
        statisticsPanel.add(txtVisitedCustomers);
        txtVisitedCustomers.setBounds(20, 160, 150, 16);

        lblBranchAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblBranchAddress.setText("address");
        statisticsPanel.add(lblBranchAddress);
        lblBranchAddress.setBounds(210, 100, 200, 16);

        txtBranchName.setBackground(new java.awt.Color(255, 255, 255));
        txtBranchName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtBranchName.setForeground(new java.awt.Color(255, 255, 255));
        txtBranchName.setText("Branch Name");
        statisticsPanel.add(txtBranchName);
        txtBranchName.setBounds(20, 80, 90, 16);

        lblTotalEmployees.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalEmployees.setText("employees");
        statisticsPanel.add(lblTotalEmployees);
        lblTotalEmployees.setBounds(210, 180, 70, 16);

        txtTotalEmployees.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalEmployees.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTotalEmployees.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalEmployees.setText("Total Employees");
        statisticsPanel.add(txtTotalEmployees);
        txtTotalEmployees.setBounds(20, 180, 140, 16);

        lblTotalRooms.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalRooms.setText("rooms");
        statisticsPanel.add(lblTotalRooms);
        lblTotalRooms.setBounds(210, 200, 70, 16);

        txtTotalRooms.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalRooms.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTotalRooms.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalRooms.setText("Total Rooms");
        statisticsPanel.add(txtTotalRooms);
        txtTotalRooms.setBounds(20, 200, 100, 16);

        lblBranchName.setForeground(new java.awt.Color(255, 255, 255));
        lblBranchName.setText("name");
        statisticsPanel.add(lblBranchName);
        lblBranchName.setBounds(210, 80, 210, 20);

        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Branch Statistics");
        statisticsPanel.add(lblTitle);
        lblTitle.setBounds(40, 20, 100, 40);

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.setText("Address");
        statisticsPanel.add(txtAddress);
        txtAddress.setBounds(20, 100, 70, 16);

        getContentPane().add(statisticsPanel);
        statisticsPanel.setBounds(10, 110, 420, 340);

        jLabel16.setBackground(new Color(0,0,0,0));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("You may choose a branch by using the selector.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 10, 510, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/search-3-24.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 30, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/plus-5-24.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15);
        jLabel15.setBounds(330, 30, 40, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseCustoemrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseCustoemrActionPerformed
  
// TODO add your handling code here:
    }//GEN-LAST:event_chooseCustoemrActionPerformed

    private void chooseCustoemrItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooseCustoemrItemStateChanged
        // TODO add your handling code here:
         if (evt.getStateChange() == ItemEvent.SELECTED) {
          Object item = evt.getItem();
          if(item.equals("Edit Branch")) return;
          // do something with object
          String str = item.toString().substring(8, 16);
          Branch branch = new Branch(Integer.parseInt(str));
          
          updateData(branch);
          
          
       }
    }//GEN-LAST:event_chooseCustoemrItemStateChanged

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        
        //Create new Branch
        hide();
        AddBranchForm frm = new AddBranchForm();
        iWindow.openWin(frm, frm.getWindowID());
    }//GEN-LAST:event_jLabel15MouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:
        String str = chooseCustoemr.getSelectedItem().toString().substring(8, 16);
        Branch branch = iWindow.DB.getBranches().get(Integer.parseInt(str));
        AddBranchForm add = new AddBranchForm(branch);
     
        iWindow.openWin(add, add.getWindowID());
    }//GEN-LAST:event_btnEditMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEdit;
    private javax.swing.JComboBox<String> chooseCustoemr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblBranchAddress;
    private javax.swing.JLabel lblBranchID;
    private javax.swing.JLabel lblBranchName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalEmployees;
    private javax.swing.JLabel lblTotalLessons;
    private javax.swing.JLabel lblTotalRooms;
    private javax.swing.JLabel lblTotalWorkouts;
    private javax.swing.JLabel lblVisitedCustomers;
    private javax.swing.JPanel statisticsPanel;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtBranchName;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtTotalEmployees;
    private javax.swing.JLabel txtTotalLessons;
    private javax.swing.JLabel txtTotalRooms;
    private javax.swing.JLabel txtTotalWorkouts;
    private javax.swing.JLabel txtVisitedCustomers;
    // End of variables declaration//GEN-END:variables

    public int getWindowID(){
        return this.WindowID;
    }

    public void setWindowID(int id){
        this.WindowID=id;
    }
    
    public void updateData(Branch tmp){
        
        
        //First Defence
          //Should not happen anyway!
        if(tmp == null){
            System.err.println("Branch not found.");
            return;
        }
        
        //Get Branch Variable from HashMap
        tmp = iWindow.getDB().getBranches().get(tmp.getBranchNumber());
        
        
        //setText to Lables
        lblBranchAddress.setText(""+tmp.getBranchAddress().toString());
        lblBranchID.setText(""+tmp.getBranchNumber());
        lblBranchName.setText(""+tmp.getBranchName());
        lblTotalEmployees.setText(""+tmp.getCoaches().size()+tmp.getRespt().size());
        
        lblTotalLessons.setText(""+tmp.getLessonsCount());
        lblVisitedCustomers.setText(""+tmp.getUniqueVisitors());
        lblTotalWorkouts.setText(""+iWindow.DB.getTotalWorkoutsByBranch(tmp.getBranchNumber()));
        statisticsPanel.show();
        for(Employee emp : tmp.getCoaches()){
            System.err.println(emp);
        }
        for(Employee emp : tmp.getRespt()){
            System.err.println(emp);
        }
        return;
    }
}
