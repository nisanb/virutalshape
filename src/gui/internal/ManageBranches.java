/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internal;

import core.Branch;
import core.Employee;
import core.Room;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import utils.E_Rooms;

/**
 *
 * @author nisans
 */
public class ManageBranches extends javax.swing.JInternalFrame {

    private int WindowID = 4;
    private Object obj = null;
    private static Branch branch;
    private static Room room;
    /**
     * Creates new form NewJInternalFrame
     */
    public ManageBranches() {
        initComponents();
        setTitle("Manage Branches");
        chooseBranch.setBackground(Color.black);
        chooseBranch.setForeground(Color.white);
        chooseBranch.removeAllItems();
        chooseBranch.addItem("Edit Branch");
        chooseBranch.setSelectedIndex(0);
        statisticsPanel.hide();
        roomPanel.hide();
        lblAddInstrument.hide();

        for (Branch branch : iWindow.DB.getBranches().values()) {
            chooseBranch.addItem(branch.toString());
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

        chooseBranch = new javax.swing.JComboBox<>();
        statisticsPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        btnEdit = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        chooseRoom = new javax.swing.JComboBox<>();
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
        lblNewRoom = new javax.swing.JLabel();
        txtTotalRooms1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AddBranch = new javax.swing.JLabel();
        AddRoom = new javax.swing.JLabel();
        roomPanel = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        btnEdit1 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        lblRoomID = new javax.swing.JLabel();
        txtID1 = new javax.swing.JLabel();
        lblRoomInstruments = new javax.swing.JLabel();
        txtTotalWorkouts1 = new javax.swing.JLabel();
        lblRoomTotalLessons = new javax.swing.JLabel();
        txtTotalLessons1 = new javax.swing.JLabel();
        lblRoomMaxTrainees = new javax.swing.JLabel();
        txtBranchName1 = new javax.swing.JLabel();
        lblRoomType = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JLabel();
        lblAddInstrument = new javax.swing.JLabel();
        AddLesson = new javax.swing.JLabel();
        AddIns = new javax.swing.JLabel();

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
        setMaximumSize(new java.awt.Dimension(1073, 768));
        setMinimumSize(new java.awt.Dimension(1073, 768));
        setName(""); // NOI18N
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1073, 768));
        getContentPane().setLayout(null);

        chooseBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        chooseBranch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chooseBranchItemStateChanged(evt);
            }
        });
        chooseBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseBranchActionPerformed(evt);
            }
        });
        getContentPane().add(chooseBranch);
        chooseBranch.setBounds(60, 40, 260, 20);

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

        chooseRoom.setBackground(new java.awt.Color(0, 0, 0));
        chooseRoom.setForeground(new java.awt.Color(255, 255, 255));
        chooseRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        chooseRoom.setOpaque(false);
        chooseRoom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chooseRoomItemStateChanged(evt);
            }
        });
        chooseRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseRoomActionPerformed(evt);
            }
        });
        statisticsPanel.add(chooseRoom);
        chooseRoom.setBounds(210, 230, 170, 20);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        statisticsPanel.add(jSeparator8);
        jSeparator8.setBounds(400, 40, 10, 250);

        lblBranchID.setForeground(new java.awt.Color(255, 255, 255));
        lblBranchID.setText("id");
        statisticsPanel.add(lblBranchID);
        lblBranchID.setBounds(210, 60, 70, 14);

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("Branch ID");
        statisticsPanel.add(txtID);
        txtID.setBounds(20, 60, 70, 16);

        lblTotalWorkouts.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalWorkouts.setText("workouts");
        statisticsPanel.add(lblTotalWorkouts);
        lblTotalWorkouts.setBounds(210, 120, 70, 14);

        txtTotalWorkouts.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalWorkouts.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTotalWorkouts.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalWorkouts.setText("Total Workouts");
        statisticsPanel.add(txtTotalWorkouts);
        txtTotalWorkouts.setBounds(20, 120, 100, 16);

        lblTotalLessons.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalLessons.setText("lessons");
        statisticsPanel.add(lblTotalLessons);
        lblTotalLessons.setBounds(210, 140, 70, 14);

        txtTotalLessons.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalLessons.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTotalLessons.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalLessons.setText("Total Lessons");
        statisticsPanel.add(txtTotalLessons);
        txtTotalLessons.setBounds(20, 140, 110, 16);

        lblVisitedCustomers.setForeground(new java.awt.Color(255, 255, 255));
        lblVisitedCustomers.setText("customers");
        statisticsPanel.add(lblVisitedCustomers);
        lblVisitedCustomers.setBounds(210, 160, 70, 14);

        txtVisitedCustomers.setBackground(new java.awt.Color(255, 255, 255));
        txtVisitedCustomers.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtVisitedCustomers.setForeground(new java.awt.Color(255, 255, 255));
        txtVisitedCustomers.setText("# of Visited Customers");
        statisticsPanel.add(txtVisitedCustomers);
        txtVisitedCustomers.setBounds(20, 160, 150, 16);

        lblBranchAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblBranchAddress.setText("address");
        statisticsPanel.add(lblBranchAddress);
        lblBranchAddress.setBounds(210, 100, 200, 14);

        txtBranchName.setBackground(new java.awt.Color(255, 255, 255));
        txtBranchName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtBranchName.setForeground(new java.awt.Color(255, 255, 255));
        txtBranchName.setText("Branch Name");
        statisticsPanel.add(txtBranchName);
        txtBranchName.setBounds(20, 80, 90, 16);

        lblTotalEmployees.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalEmployees.setText("employees");
        statisticsPanel.add(lblTotalEmployees);
        lblTotalEmployees.setBounds(210, 180, 70, 14);

        txtTotalEmployees.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalEmployees.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTotalEmployees.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalEmployees.setText("Total Employees");
        statisticsPanel.add(txtTotalEmployees);
        txtTotalEmployees.setBounds(20, 180, 140, 16);

        lblTotalRooms.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalRooms.setText("rooms");
        statisticsPanel.add(lblTotalRooms);
        lblTotalRooms.setBounds(210, 200, 70, 14);

        txtTotalRooms.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalRooms.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTotalRooms.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalRooms.setText("Edit Rooms");
        statisticsPanel.add(txtTotalRooms);
        txtTotalRooms.setBounds(20, 230, 100, 16);

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

        lblNewRoom.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblNewRoom.setForeground(new java.awt.Color(51, 102, 255));
        lblNewRoom.setText("[New Room]");
        lblNewRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewRoomMouseClicked(evt);
            }
        });
        statisticsPanel.add(lblNewRoom);
        lblNewRoom.setBounds(20, 260, 70, 13);

        txtTotalRooms1.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalRooms1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTotalRooms1.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalRooms1.setText("Total Rooms");
        statisticsPanel.add(txtTotalRooms1);
        txtTotalRooms1.setBounds(20, 200, 100, 16);

        getContentPane().add(statisticsPanel);
        statisticsPanel.setBounds(0, 50, 420, 300);

        jLabel16.setBackground(new Color(0,0,0,0));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("You may choose a branch by using the selector.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 10, 510, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/search-3-24.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 30, 40);

        AddBranch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/plus-5-24.png"))); // NOI18N
        AddBranch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBranchMouseClicked(evt);
            }
        });
        getContentPane().add(AddBranch);
        AddBranch.setBounds(340, 30, 40, 40);

        AddRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/plus-5-24.png"))); // NOI18N
        AddRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddRoomMouseClicked(evt);
            }
        });
        getContentPane().add(AddRoom);
        AddRoom.setBounds(390, 30, 40, 40);

        roomPanel.setBackground(new Color(0,0,0,0));
        roomPanel.setLayout(null);
        roomPanel.add(jSeparator3);
        jSeparator3.setBounds(30, 50, 210, 0);

        btnEdit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/edit-11-24.png"))); // NOI18N
        btnEdit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEdit1MouseClicked(evt);
            }
        });
        roomPanel.add(btnEdit1);
        btnEdit1.setBounds(340, 50, 30, 30);

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator9.setEnabled(false);
        roomPanel.add(jSeparator9);
        jSeparator9.setBounds(10, 40, 30, 10);

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        roomPanel.add(jSeparator10);
        jSeparator10.setBounds(10, 40, 10, 250);

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        roomPanel.add(jSeparator11);
        jSeparator11.setBounds(10, 290, 390, 10);

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        roomPanel.add(jSeparator12);
        jSeparator12.setBounds(140, 40, 260, 10);

        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        roomPanel.add(jSeparator13);
        jSeparator13.setBounds(400, 40, 10, 250);

        lblRoomID.setForeground(new java.awt.Color(255, 255, 255));
        lblRoomID.setText("id");
        roomPanel.add(lblRoomID);
        lblRoomID.setBounds(210, 60, 70, 14);

        txtID1.setBackground(new java.awt.Color(255, 255, 255));
        txtID1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtID1.setForeground(new java.awt.Color(255, 255, 255));
        txtID1.setText("Room ID");
        roomPanel.add(txtID1);
        txtID1.setBounds(20, 60, 70, 16);

        lblRoomInstruments.setForeground(new java.awt.Color(255, 255, 255));
        lblRoomInstruments.setText("insrtuments");
        roomPanel.add(lblRoomInstruments);
        lblRoomInstruments.setBounds(210, 120, 70, 14);

        txtTotalWorkouts1.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalWorkouts1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTotalWorkouts1.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalWorkouts1.setText("Instruments");
        roomPanel.add(txtTotalWorkouts1);
        txtTotalWorkouts1.setBounds(20, 120, 140, 16);

        lblRoomTotalLessons.setForeground(new java.awt.Color(255, 255, 255));
        lblRoomTotalLessons.setText("lessons");
        roomPanel.add(lblRoomTotalLessons);
        lblRoomTotalLessons.setBounds(210, 140, 70, 14);

        txtTotalLessons1.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalLessons1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTotalLessons1.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalLessons1.setText("Total Lessons");
        roomPanel.add(txtTotalLessons1);
        txtTotalLessons1.setBounds(20, 140, 110, 16);

        lblRoomMaxTrainees.setForeground(new java.awt.Color(255, 255, 255));
        lblRoomMaxTrainees.setText("mtrainees");
        roomPanel.add(lblRoomMaxTrainees);
        lblRoomMaxTrainees.setBounds(210, 100, 200, 14);

        txtBranchName1.setBackground(new java.awt.Color(255, 255, 255));
        txtBranchName1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtBranchName1.setForeground(new java.awt.Color(255, 255, 255));
        txtBranchName1.setText("Room Type");
        roomPanel.add(txtBranchName1);
        txtBranchName1.setBounds(20, 80, 90, 16);

        lblRoomType.setForeground(new java.awt.Color(255, 255, 255));
        lblRoomType.setText("room type");
        roomPanel.add(lblRoomType);
        lblRoomType.setBounds(210, 80, 210, 20);

        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("Room Statistics");
        roomPanel.add(lblTitle1);
        lblTitle1.setBounds(40, 20, 100, 40);

        txtAddress1.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtAddress1.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress1.setText("Max. Trainees");
        roomPanel.add(txtAddress1);
        txtAddress1.setBounds(20, 100, 120, 16);

        lblAddInstrument.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblAddInstrument.setForeground(new java.awt.Color(51, 102, 255));
        lblAddInstrument.setText("[Add Instrument]");
        lblAddInstrument.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddInstrumentMouseClicked(evt);
            }
        });
        roomPanel.add(lblAddInstrument);
        lblAddInstrument.setBounds(20, 260, 100, 13);

        getContentPane().add(roomPanel);
        roomPanel.setBounds(410, 50, 420, 300);

        AddLesson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/plus-5-24.png"))); // NOI18N
        AddLesson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddLessonMouseClicked(evt);
            }
        });
        getContentPane().add(AddLesson);
        AddLesson.setBounds(680, 10, 40, 40);

        AddIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/plus-5-24.png"))); // NOI18N
        AddIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddInsMouseClicked(evt);
            }
        });
        getContentPane().add(AddIns);
        AddIns.setBounds(580, 10, 40, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseBranchActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_chooseBranchActionPerformed

    private void chooseBranchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooseBranchItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            if (item.equals("Edit Branch")) {
                return;
            }
            // do something with object
            String str = item.toString().substring(8, 16);
            Branch branch = new Branch(Integer.parseInt(str));

            updateData(branch);

        }
    }//GEN-LAST:event_chooseBranchItemStateChanged

    private void AddBranchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBranchMouseClicked

        //Create new Branch
        hide();
        AddBranchForm frm = new AddBranchForm();
        iWindow.openWin(frm, frm.getWindowID(), frm.getTitle());
    }//GEN-LAST:event_AddBranchMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:
        String str = chooseBranch.getSelectedItem().toString().substring(8, 16);
        Branch branch = iWindow.DB.getBranches().get(Integer.parseInt(str));
        AddBranchForm add = new AddBranchForm(branch);

        iWindow.openWin(add, add.getWindowID(), add.getTitle());
    }//GEN-LAST:event_btnEditMouseClicked

    private void AddRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddRoomMouseClicked

        AddRoom frm = new AddRoom(branch);
        iWindow.openWin(frm, frm.getWindowID(), frm.getTitle());
    }//GEN-LAST:event_AddRoomMouseClicked

    private void AddInsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddInsMouseClicked
        //removed
    }//GEN-LAST:event_AddInsMouseClicked

    private void lblNewRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewRoomMouseClicked
        // Open New Room for Branch
        AddRoom add = new AddRoom(branch);
        iWindow.openWin(add, add.getWindowID(), add.getTitle());

    }//GEN-LAST:event_lblNewRoomMouseClicked

    private void btnEdit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEdit1MouseClicked

    private void lblAddInstrumentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddInstrumentMouseClicked
        //Open Add Instrument GUI
        AddInstrument add = new AddInstrument(branch, room);
        iWindow.openWin(add, add.getWindowID(), add.getTitle());
    }//GEN-LAST:event_lblAddInstrumentMouseClicked

    private void chooseRoomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooseRoomItemStateChanged
        // TODO add your handling code here:
        //Chosen Room
        System.err.println("Chosen Room" + chooseRoom.getSelectedIndex());
        if (chooseRoom.getSelectedIndex() <= 0) {
            roomPanel.hide();
            return;
        }

        //Get Room Object
        String str = chooseRoom.getSelectedItem().toString();
        str = str.substring(1, str.length());
        int roomNum = Integer.parseInt(str);
        Room tmp = new Room(roomNum, branch.getBranchNumber());
        for(Room r : branch.getRooms()){
            System.err.println("XD Room #"+r.getRoomNum());
            if(r.equals(tmp)){
                room = r;
                break;
            }
        }
        //room = branch.getRooms().get(chooseRoom.getSelectedIndex() - 1);
        
        if (room == null) {
            return;
        }
        if(room.getRoomType().equals(E_Rooms.GYM)){
            lblAddInstrument.show();
        }
        //Update Components
        lblRoomID.setText(""+room.getRoomNum());
       
        lblRoomInstruments.setText(room.getInstruments().size()+"/"+room.getMaxNumOfInstruments());
        lblRoomMaxTrainees.setText(""+room.getMaxNumOfTrainees());
        lblRoomTotalLessons.setText(""+room.getLessons().size());
        lblRoomType.setText(room.getRoomType().toString());
        roomPanel.hide();
        roomPanel.repaint();
        roomPanel.show();
    }//GEN-LAST:event_chooseRoomItemStateChanged

    private void chooseRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseRoomActionPerformed

    private void AddLessonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLessonMouseClicked
        AddLesson add = new AddLesson();
        iWindow.openWin(add, add.getWindowID(), add.getTitle());
    }//GEN-LAST:event_AddLessonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddBranch;
    private javax.swing.JLabel AddIns;
    private javax.swing.JLabel AddLesson;
    private javax.swing.JLabel AddRoom;
    private javax.swing.JLabel btnEdit;
    private javax.swing.JLabel btnEdit1;
    private javax.swing.JComboBox<String> chooseBranch;
    private javax.swing.JComboBox<String> chooseRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAddInstrument;
    private javax.swing.JLabel lblBranchAddress;
    private javax.swing.JLabel lblBranchID;
    private javax.swing.JLabel lblBranchName;
    private javax.swing.JLabel lblNewRoom;
    private javax.swing.JLabel lblRoomID;
    private javax.swing.JLabel lblRoomInstruments;
    private javax.swing.JLabel lblRoomMaxTrainees;
    private javax.swing.JLabel lblRoomTotalLessons;
    private javax.swing.JLabel lblRoomType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTotalEmployees;
    private javax.swing.JLabel lblTotalLessons;
    private javax.swing.JLabel lblTotalRooms;
    private javax.swing.JLabel lblTotalWorkouts;
    private javax.swing.JLabel lblVisitedCustomers;
    private javax.swing.JPanel roomPanel;
    private javax.swing.JPanel statisticsPanel;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtAddress1;
    private javax.swing.JLabel txtBranchName;
    private javax.swing.JLabel txtBranchName1;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtID1;
    private javax.swing.JLabel txtTotalEmployees;
    private javax.swing.JLabel txtTotalLessons;
    private javax.swing.JLabel txtTotalLessons1;
    private javax.swing.JLabel txtTotalRooms;
    private javax.swing.JLabel txtTotalRooms1;
    private javax.swing.JLabel txtTotalWorkouts;
    private javax.swing.JLabel txtTotalWorkouts1;
    private javax.swing.JLabel txtVisitedCustomers;
    // End of variables declaration//GEN-END:variables

    public int getWindowID() {
        return this.WindowID;
    }

    public void setWindowID(int id) {
        this.WindowID = id;
    }

    public void updateData(Branch tmp) {

        //First Defence
        //Should not happen anyway!
        if (tmp == null) {
            System.err.println("Branch not found.");
            return;
        }

        //Get Branch Variable from HashMap
        branch = iWindow.getDB().getBranches().get(tmp.getBranchNumber());

        //setText to Lables
        lblBranchAddress.setText("" + branch.getBranchAddress().toString());
        lblBranchID.setText("" + branch.getBranchNumber());
        lblBranchName.setText("" + branch.getBranchName());
        lblTotalEmployees.setText("" + (branch.getCoaches().size() + branch.getRespt().size()));

        lblTotalLessons.setText("" + branch.getLessonsCount());
        lblVisitedCustomers.setText("" + branch.getUniqueVisitors());
        lblTotalWorkouts.setText("" + iWindow.DB.getTotalWorkoutsByBranch(branch.getBranchNumber()));

        //Room Selector
        chooseRoom.removeAllItems();
        if (branch.getRooms().size() == 0) {
            chooseRoom.addItem("No Rooms Found");
        } else {
            chooseRoom.addItem("Choose Room");
            for (Room r : branch.getRooms()) {
                chooseRoom.addItem("#" + r.getRoomNum());
            }
        }

        statisticsPanel.show();
        for (Employee emp : branch.getCoaches()) {
            System.err.println(emp);
        }
        for (Employee emp : branch.getRespt()) {
            System.err.println(emp);
        }
        lblTotalRooms.setText("" + branch.getRooms().size());

        return;
    }
}
