/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.manage;

import Validators.PositiveValidator;
import gui.iWindow;
import core.Branch;
import core.Coach;
import core.Customer;
import core.Employee;
import core.Lesson;
import core.Receptionist;
import core.Room;
import core.Subscription;
import gui.internal.AddBranchForm;
import gui.internal.AddCoach;
import gui.internal.AddCustomer;
import gui.internal.AddInstrument;
import gui.internal.AddLesson;
import gui.internal.AddRoom;
import gui.internal.AddSubscription;
import gui.internal.AddWorkout;
import gui.internal.CancelSubscription;
import gui.internal.CustomerToLesson;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import utils.E_Lessons;
import utils.E_Rooms;

/**
 *
 * @author nisans
 */
public class ManageCustomers extends javax.swing.JInternalFrame {

    
    private static Customer customer = null;
    /**
     * Creates new form NewJInternalFrame
     */
    public ManageCustomers() {
        initComponents();
        setTitle("Manage Customers");
        chooseCustomer.setBackground(Color.black);
        chooseCustomer.setForeground(Color.white);
        chooseCustomer.removeAllItems();
        chooseCustomer.addItem("Select Customer");
        chooseCustomer.setSelectedIndex(0);
        statisticsPanel.hide();
        moreInfo.hide();

        lblError.setVisible(false);
    

        for (Customer cust : iWindow.getDB().getCustomers().values()) {
            chooseCustomer.addItem("#"+cust.getId()+" - "+cust.getFirstName()+" "+cust.getLastName());
        }
        
        iWindow.update(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseCustomer = new javax.swing.JComboBox<>();
        statisticsPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        btnEdit = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblCustomerID = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        lblCountWorkouts = new javax.swing.JLabel();
        txtStartWorkingDate = new javax.swing.JLabel();
        lblCountLessons = new javax.swing.JLabel();
        txtWorkBranch = new javax.swing.JLabel();
        lblBirthDate = new javax.swing.JLabel();
        txtBranchName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmployeeName = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtBirthDate = new javax.swing.JLabel();
        txtTotalRooms1 = new javax.swing.JLabel();
        lblShow = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        lblActiveSubs = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        lblSubs = new javax.swing.JLabel();
        lblNewLesson = new javax.swing.JLabel();
        lblNewWorkout = new javax.swing.JLabel();
        lblCancelSub = new javax.swing.JLabel();
        lblNewSub = new javax.swing.JLabel();
        lblNewSub2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AddCustomer = new javax.swing.JLabel();
        moreInfo = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        lbl4 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        infotitle = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fldCustID = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

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

        chooseCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        chooseCustomer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chooseCustomerItemStateChanged(evt);
            }
        });
        chooseCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(chooseCustomer);
        chooseCustomer.setBounds(70, 40, 260, 22);

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
        jSeparator5.setBounds(10, 40, 10, 280);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        statisticsPanel.add(jSeparator6);
        jSeparator6.setBounds(10, 320, 390, 10);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        statisticsPanel.add(jSeparator7);
        jSeparator7.setBounds(160, 40, 240, 10);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        statisticsPanel.add(jSeparator8);
        jSeparator8.setBounds(400, 40, 10, 280);

        lblCustomerID.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerID.setText("id");
        statisticsPanel.add(lblCustomerID);
        lblCustomerID.setBounds(210, 60, 70, 16);

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("Customer ID");
        statisticsPanel.add(txtID);
        txtID.setBounds(20, 60, 100, 16);

        lblCountWorkouts.setForeground(new java.awt.Color(255, 255, 255));
        lblCountWorkouts.setText("workingdaet");
        statisticsPanel.add(lblCountWorkouts);
        lblCountWorkouts.setBounds(210, 120, 160, 16);

        txtStartWorkingDate.setBackground(new java.awt.Color(255, 255, 255));
        txtStartWorkingDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtStartWorkingDate.setForeground(new java.awt.Color(255, 255, 255));
        txtStartWorkingDate.setText("Registered Workouts");
        statisticsPanel.add(txtStartWorkingDate);
        txtStartWorkingDate.setBounds(20, 120, 180, 16);

        lblCountLessons.setForeground(new java.awt.Color(255, 255, 255));
        lblCountLessons.setText("branch");
        statisticsPanel.add(lblCountLessons);
        lblCountLessons.setBounds(210, 140, 70, 16);

        txtWorkBranch.setBackground(new java.awt.Color(255, 255, 255));
        txtWorkBranch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtWorkBranch.setForeground(new java.awt.Color(255, 255, 255));
        txtWorkBranch.setText("Registered Lessons");
        statisticsPanel.add(txtWorkBranch);
        txtWorkBranch.setBounds(20, 140, 150, 16);

        lblBirthDate.setForeground(new java.awt.Color(255, 255, 255));
        lblBirthDate.setText("bday");
        statisticsPanel.add(lblBirthDate);
        lblBirthDate.setBounds(210, 100, 200, 16);

        txtBranchName.setBackground(new java.awt.Color(255, 255, 255));
        txtBranchName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtBranchName.setForeground(new java.awt.Color(255, 255, 255));
        txtBranchName.setText("Customer Name");
        statisticsPanel.add(txtBranchName);
        txtBranchName.setBounds(20, 80, 120, 16);

        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("password");
        statisticsPanel.add(lblPassword);
        lblPassword.setBounds(210, 160, 70, 16);

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("Password");
        statisticsPanel.add(txtPassword);
        txtPassword.setBounds(20, 160, 140, 20);

        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("lblAddress");
        statisticsPanel.add(lblAddress);
        lblAddress.setBounds(210, 180, 170, 16);

        lblEmployeeName.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeName.setText("name");
        statisticsPanel.add(lblEmployeeName);
        lblEmployeeName.setBounds(210, 80, 210, 20);

        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Customer Statistics");
        statisticsPanel.add(lblTitle);
        lblTitle.setBounds(40, 20, 120, 40);

        txtBirthDate.setBackground(new java.awt.Color(255, 255, 255));
        txtBirthDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtBirthDate.setForeground(new java.awt.Color(255, 255, 255));
        txtBirthDate.setText("Birth Date");
        statisticsPanel.add(txtBirthDate);
        txtBirthDate.setBounds(20, 100, 140, 16);

        txtTotalRooms1.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalRooms1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtTotalRooms1.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalRooms1.setText("Address");
        statisticsPanel.add(txtTotalRooms1);
        txtTotalRooms1.setBounds(20, 180, 100, 16);

        lblShow.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        lblShow.setForeground(new java.awt.Color(255, 255, 255));
        lblShow.setText("[show]");
        lblShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowMouseClicked(evt);
            }
        });
        statisticsPanel.add(lblShow);
        lblShow.setBounds(100, 160, 40, 20);

        txt1.setBackground(new java.awt.Color(255, 255, 255));
        txt1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText("Active Subscriptions");
        statisticsPanel.add(txt1);
        txt1.setBounds(20, 220, 170, 16);

        lblActiveSubs.setForeground(new java.awt.Color(255, 255, 255));
        lblActiveSubs.setText("id");
        statisticsPanel.add(lblActiveSubs);
        lblActiveSubs.setBounds(210, 220, 70, 16);

        txt7.setBackground(new java.awt.Color(255, 255, 255));
        txt7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txt7.setForeground(new java.awt.Color(255, 255, 255));
        txt7.setText("Subscriptions");
        statisticsPanel.add(txt7);
        txt7.setBounds(20, 200, 170, 16);

        lblSubs.setForeground(new java.awt.Color(255, 255, 255));
        lblSubs.setText("id");
        statisticsPanel.add(lblSubs);
        lblSubs.setBounds(210, 200, 70, 16);

        lblNewLesson.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblNewLesson.setForeground(new java.awt.Color(51, 102, 255));
        lblNewLesson.setText("[Add Lesson]");
        lblNewLesson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewLessonMouseClicked(evt);
            }
        });
        statisticsPanel.add(lblNewLesson);
        lblNewLesson.setBounds(170, 260, 70, 13);

        lblNewWorkout.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblNewWorkout.setForeground(new java.awt.Color(51, 102, 255));
        lblNewWorkout.setText("[Add Workout]");
        lblNewWorkout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewWorkoutMouseClicked(evt);
            }
        });
        statisticsPanel.add(lblNewWorkout);
        lblNewWorkout.setBounds(170, 280, 100, 13);

        lblCancelSub.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblCancelSub.setForeground(new java.awt.Color(51, 102, 255));
        lblCancelSub.setText("[Cancel Subscription]");
        lblCancelSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelSubMouseClicked(evt);
            }
        });
        statisticsPanel.add(lblCancelSub);
        lblCancelSub.setBounds(20, 280, 140, 13);

        lblNewSub.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblNewSub.setForeground(new java.awt.Color(51, 102, 255));
        lblNewSub.setText("[Add Subscription]");
        lblNewSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewSubMouseClicked(evt);
            }
        });
        statisticsPanel.add(lblNewSub);
        lblNewSub.setBounds(20, 260, 100, 13);

        lblNewSub2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblNewSub2.setForeground(new java.awt.Color(51, 102, 255));
        lblNewSub2.setText("[Add Subscription]");
        lblNewSub2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewSub2MouseClicked(evt);
            }
        });
        statisticsPanel.add(lblNewSub2);
        lblNewSub2.setBounds(20, 260, 100, 13);

        getContentPane().add(statisticsPanel);
        statisticsPanel.setBounds(0, 90, 420, 350);

        jLabel16.setBackground(new Color(0,0,0,0));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("You may choose a Customer by using the selector or entering Customer Number");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 10, 510, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/search-3-24.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 30, 40);

        AddCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/plus-5-24.png"))); // NOI18N
        AddCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCustomerMouseClicked(evt);
            }
        });
        getContentPane().add(AddCustomer);
        AddCustomer.setBounds(340, 30, 40, 40);

        moreInfo.setBackground(new Color(0,0,0,0));
        moreInfo.setLayout(null);
        moreInfo.add(jSeparator3);
        jSeparator3.setBounds(30, 50, 210, 0);

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator9.setEnabled(false);
        moreInfo.add(jSeparator9);
        jSeparator9.setBounds(10, 40, 30, 10);

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        moreInfo.add(jSeparator10);
        jSeparator10.setBounds(10, 40, 10, 310);

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        moreInfo.add(jSeparator11);
        jSeparator11.setBounds(10, 350, 330, 10);

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        moreInfo.add(jSeparator12);
        jSeparator12.setBounds(140, 40, 200, 10);

        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        moreInfo.add(jSeparator13);
        jSeparator13.setBounds(340, 40, 10, 310);

        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setText("insrtuments");
        moreInfo.add(lbl4);
        lbl4.setBounds(210, 80, 70, 16);

        txt4.setBackground(new java.awt.Color(255, 255, 255));
        txt4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        txt4.setText("Instruments");
        moreInfo.add(txt4);
        txt4.setBounds(20, 80, 140, 16);

        lbl5.setForeground(new java.awt.Color(255, 255, 255));
        lbl5.setText("lessons");
        moreInfo.add(lbl5);
        lbl5.setBounds(210, 100, 70, 16);

        txt5.setBackground(new java.awt.Color(255, 255, 255));
        txt5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txt5.setForeground(new java.awt.Color(255, 255, 255));
        txt5.setText("Total Lessons");
        moreInfo.add(txt5);
        txt5.setBounds(20, 100, 200, 16);

        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setText("mtrainees");
        moreInfo.add(lbl3);
        lbl3.setBounds(210, 60, 200, 16);

        txt2.setBackground(new java.awt.Color(255, 255, 255));
        txt2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setText("Lessons Teaching");
        moreInfo.add(txt2);
        txt2.setBounds(20, 130, 130, 16);

        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("room type");
        lbl2.setToolTipText("");
        lbl2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        moreInfo.add(lbl2);
        lbl2.setBounds(210, 130, 120, 130);

        infotitle.setForeground(new java.awt.Color(255, 255, 255));
        infotitle.setText("Room Statistics");
        moreInfo.add(infotitle);
        infotitle.setBounds(40, 20, 100, 40);

        txt3.setBackground(new java.awt.Color(255, 255, 255));
        txt3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setText("Total Lessons");
        moreInfo.add(txt3);
        txt3.setBounds(20, 60, 120, 16);

        txt6.setBackground(new java.awt.Color(255, 255, 255));
        txt6.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        txt6.setForeground(new java.awt.Color(255, 255, 255));
        txt6.setText("Total Lessons");
        moreInfo.add(txt6);
        txt6.setBounds(20, 110, 110, 20);

        getContentPane().add(moreInfo);
        moreInfo.setBounds(410, 90, 370, 400);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(70, 70, 260, 2);

        fldCustID.setBackground(new java.awt.Color(0, 0, 0));
        fldCustID.setForeground(new java.awt.Color(255, 255, 255));
        fldCustID.setText("Search Customer");
        fldCustID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fldCustID.setCaretColor(new java.awt.Color(255, 255, 255));
        fldCustID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldCustIDActionPerformed(evt);
            }
        });
        fldCustID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fldCustIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fldCustIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fldCustIDKeyTyped(evt);
            }
        });
        getContentPane().add(fldCustID);
        fldCustID.setBounds(70, 80, 260, 18);

        lblError.setForeground(new java.awt.Color(0, 255, 51));
        lblError.setText("Found Employee");
        getContentPane().add(lblError);
        lblError.setBounds(340, 80, 290, 20);
        lblError.getAccessibleContext().setAccessibleName("Employee Found!");

        jMenuBar1.setBackground(new Color(0,0,0,0));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseCustomerActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_chooseCustomerActionPerformed

    private void chooseCustomerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooseCustomerItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            if (item.equals("Select Customer")) {
                return;
            }
        int i;
        String str = item.toString();
            for(i=0;i<item.toString().length();i++){
                if(Character.isSpace(str.charAt(i))){
                    str = str.substring(1,i);
                    break;
                }
            }
            
            
            
            // do something with object
           
            this.customer = iWindow.getDB().getCustomers().get(str);
            
            
            updateData();

        }
    }//GEN-LAST:event_chooseCustomerItemStateChanged

    private void AddCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCustomerMouseClicked

        //Create new Branch
        
        AddCustomer frm = new AddCustomer();
        iWindow.openWin(frm);
    }//GEN-LAST:event_AddCustomerMouseClicked

    private void fldCustIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldCustIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldCustIDActionPerformed

    private void fldCustIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldCustIDKeyPressed
        if(fldCustID.getText().equals("Search Customer")){
                   fldCustID.setText("");
                   lblError.setText("");
                   lblError.setVisible(true);
                   return;
               }
         if(evt.getKeyCode()!=KeyEvent.VK_ENTER)
            return;
        
        
        
        //Check if not integer/positive
        if(!PositiveValidator.isPositiveStringNum(fldCustID.getText())){
            lblError.setText("Please use positive numbers");
            lblError.setForeground(Color.red);
            iWindow.update();
            return;
        }
        
        //Check if employee exists
        this.customer = iWindow.getDB().getCustomers().get(fldCustID.getText());
        if(this.customer==null){
            lblError.setText("Customer not found!");
            lblError.setForeground(Color.blue);
            iWindow.update();
            return;
        }
        
        //Found
        lblError.setText("Customer Found!");
        lblError.setForeground(Color.green);
        updateData();
        iWindow.update();     
        
    }//GEN-LAST:event_fldCustIDKeyPressed

    private void fldCustIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldCustIDKeyReleased
       
        
    }//GEN-LAST:event_fldCustIDKeyReleased

    private void fldCustIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldCustIDKeyTyped
        // TODO add your handling code here:
         // TODO add your handling code here:
           // TODO add your handling code here:
       
        
    }//GEN-LAST:event_fldCustIDKeyTyped

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnEditMouseClicked

    private void lblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowMouseClicked
        // TODO add your handling code here:
        lblPassword.setText(""+customer.getPassword());
        iWindow.update();
    }//GEN-LAST:event_lblShowMouseClicked

    private void lblNewLessonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewLessonMouseClicked
       // New Lesson
       if(Integer.parseInt(lblActiveSubs.getText())<=0){
           JOptionPane.showMessageDialog(null, "Customer has no valid subscriptions.\nAdd a subscription first.");
           return;
       }
       
       CustomerToLesson add = new CustomerToLesson(customer);
       iWindow.openWin(add);
       
        
    }//GEN-LAST:event_lblNewLessonMouseClicked

    private void lblNewWorkoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewWorkoutMouseClicked
        // TODO add your handling code here:
        AddWorkout add = new AddWorkout(customer);
        iWindow.openWin(add);
    }//GEN-LAST:event_lblNewWorkoutMouseClicked

    private void lblCancelSubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelSubMouseClicked
        // TODO add your handling code here:
        CancelSubscription add = new CancelSubscription(customer);
        iWindow.openWin(add);
    }//GEN-LAST:event_lblCancelSubMouseClicked

    private void lblNewSubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewSubMouseClicked
        // TODO add your handling code here:
         AddSubscription add = new AddSubscription(customer);
        iWindow.openWin(add);
    }//GEN-LAST:event_lblNewSubMouseClicked

    private void lblNewSub2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewSub2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNewSub2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddCustomer;
    private javax.swing.JLabel btnEdit;
    private javax.swing.JComboBox<String> chooseCustomer;
    private javax.swing.JTextField fldCustID;
    private javax.swing.JLabel infotitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
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
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblActiveSubs;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblCancelSub;
    private javax.swing.JLabel lblCountLessons;
    private javax.swing.JLabel lblCountWorkouts;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblNewLesson;
    private javax.swing.JLabel lblNewSub;
    private javax.swing.JLabel lblNewSub2;
    private javax.swing.JLabel lblNewWorkout;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblShow;
    private javax.swing.JLabel lblSubs;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel moreInfo;
    private javax.swing.JPanel statisticsPanel;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txtBirthDate;
    private javax.swing.JLabel txtBranchName;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtPassword;
    private javax.swing.JLabel txtStartWorkingDate;
    private javax.swing.JLabel txtTotalRooms1;
    private javax.swing.JLabel txtWorkBranch;
    // End of variables declaration//GEN-END:variables



    public void updateData() {
        
        
        //First Defence
        //Should not happen anyway!
        if (this.customer == null) {
            System.err.println("Customer not found.");
            return;
        }

        //Date Values
        String strBirthDate = new SimpleDateFormat("dd/MM/yyyy").format(customer.getBirthDate());
        
        
        //setText to Lables
        lblBirthDate.setText("" + strBirthDate);
        lblCustomerID.setText(customer.getId());
        lblEmployeeName.setText(customer.getFirstName()+" "+customer.getLastName());
        lblPassword.setText("*******");
        
        int subsCount=0, lessonsCount=0, countActiveSubs=0, countWorkout=0;
        
        subsCount = customer.getSubs().size();
        
        for(Subscription sub : customer.getSubs()){
            if(sub.isValid()) countActiveSubs++;
            
            lessonsCount+=sub.getLessons().size();
            countWorkout+=sub.getWorkouts().size();
        }
        
        
        lblCountLessons.setText("" + lessonsCount);
        lblCountWorkouts.setText("" + countWorkout);
        lblAddress.setText(customer.getCustomerAddress().toString());
        lblSubs.setText(""+subsCount);
        lblActiveSubs.setText(""+countActiveSubs);

        statisticsPanel.show();
        
        
        
   
        
        iWindow.update();
        return;
    }
}
