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
import core.Employee;
import core.Lesson;
import core.Receptionist;
import core.Room;
import gui.internal.AddBranchForm;
import gui.internal.AddCoach;
import gui.internal.AddInstrument;
import gui.internal.AddLesson;
import gui.internal.AddRcp;
import gui.internal.AddRoom;
import gui.internal.EmpToBranch;
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
import javax.swing.plaf.basic.BasicInternalFrameUI;
import utils.E_Lessons;
import utils.E_Rooms;

/**
 *
 * @author nisans
 */
public class ManageEmployees extends javax.swing.JInternalFrame {

    private Object obj = null;
    private static Employee emp = null;
    /**
     * Creates new form NewJInternalFrame
     */
    
    public ManageEmployees() {
        
        initComponents();
        if(iWindow.getAuthValue()==2){
            setTitle("Vieweing Your Account Details");
            chooseBranch.hide();
            jLabel1.hide();
            jLabel16.hide();
            AddCoach.hide();
            AddReceptionist.hide();
            jSeparator1.hide();
            fldEmpID.hide();
            lblError.hide();
            emp = iWindow.getEmployeeLogged();
            updateData();
            return;
            
        }
        
        setTitle("Manage Employees");
        chooseBranch.setBackground(Color.black);
        chooseBranch.setForeground(Color.white);
        chooseBranch.removeAllItems();
        chooseBranch.addItem("Select Employee");
        chooseBranch.setSelectedIndex(0);
        statisticsPanel.hide();
        moreInfo.hide();

        lblError.setVisible(false);
    

        for (Employee emp : iWindow.getDB().getEmployees().values()) {
            chooseBranch.addItem("#"+emp.getEmployeeNumber()+" - "+emp.getFirstName()+" "+emp.getLastName());
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

        chooseBranch = new javax.swing.JComboBox<>();
        statisticsPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        btnEdit = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblEmployeeID = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        lblStartWorkingDate = new javax.swing.JLabel();
        txtStartWorkingDate = new javax.swing.JLabel();
        lblWorkingBranch = new javax.swing.JLabel();
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
        lbl1 = new javax.swing.JLabel();
        lblChangeBranch = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AddCoach = new javax.swing.JLabel();
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
        fldEmpID = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        AddReceptionist = new javax.swing.JLabel();
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
        chooseBranch.setBounds(70, 40, 260, 22);

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
        jSeparator7.setBounds(160, 40, 240, 10);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        statisticsPanel.add(jSeparator8);
        jSeparator8.setBounds(400, 40, 10, 250);

        lblEmployeeID.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeID.setText("id");
        statisticsPanel.add(lblEmployeeID);
        lblEmployeeID.setBounds(210, 60, 70, 16);

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setText("Employee ID");
        statisticsPanel.add(txtID);
        txtID.setBounds(20, 60, 100, 16);

        lblStartWorkingDate.setForeground(new java.awt.Color(255, 255, 255));
        lblStartWorkingDate.setText("workingdaet");
        statisticsPanel.add(lblStartWorkingDate);
        lblStartWorkingDate.setBounds(210, 120, 160, 16);

        txtStartWorkingDate.setBackground(new java.awt.Color(255, 255, 255));
        txtStartWorkingDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtStartWorkingDate.setForeground(new java.awt.Color(255, 255, 255));
        txtStartWorkingDate.setText("Start Working Date");
        statisticsPanel.add(txtStartWorkingDate);
        txtStartWorkingDate.setBounds(20, 120, 140, 16);

        lblWorkingBranch.setForeground(new java.awt.Color(255, 255, 255));
        lblWorkingBranch.setText("branch");
        statisticsPanel.add(lblWorkingBranch);
        lblWorkingBranch.setBounds(210, 140, 70, 16);

        txtWorkBranch.setBackground(new java.awt.Color(255, 255, 255));
        txtWorkBranch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtWorkBranch.setForeground(new java.awt.Color(255, 255, 255));
        txtWorkBranch.setText("Branch Association");
        statisticsPanel.add(txtWorkBranch);
        txtWorkBranch.setBounds(20, 140, 150, 16);

        lblBirthDate.setForeground(new java.awt.Color(255, 255, 255));
        lblBirthDate.setText("bday");
        statisticsPanel.add(lblBirthDate);
        lblBirthDate.setBounds(210, 100, 200, 16);

        txtBranchName.setBackground(new java.awt.Color(255, 255, 255));
        txtBranchName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtBranchName.setForeground(new java.awt.Color(255, 255, 255));
        txtBranchName.setText("Employee Name");
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
        txtPassword.setBounds(20, 160, 70, 20);

        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("lblAddress");
        statisticsPanel.add(lblAddress);
        lblAddress.setBounds(210, 180, 190, 16);

        lblEmployeeName.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployeeName.setText("name");
        statisticsPanel.add(lblEmployeeName);
        lblEmployeeName.setBounds(210, 80, 210, 20);

        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Employee Statistics");
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
        lblShow.setBounds(180, 160, 40, 20);

        txt1.setBackground(new java.awt.Color(255, 255, 255));
        txt1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText("Subscriptions Sold");
        statisticsPanel.add(txt1);
        txt1.setBounds(20, 200, 170, 16);

        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setText("id");
        statisticsPanel.add(lbl1);
        lbl1.setBounds(210, 200, 70, 16);

        lblChangeBranch.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblChangeBranch.setForeground(new java.awt.Color(51, 102, 255));
        lblChangeBranch.setText("[Change Branch]");
        lblChangeBranch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChangeBranchMouseClicked(evt);
            }
        });
        statisticsPanel.add(lblChangeBranch);
        lblChangeBranch.setBounds(20, 270, 140, 13);

        getContentPane().add(statisticsPanel);
        statisticsPanel.setBounds(0, 90, 420, 300);

        jLabel16.setBackground(new Color(0,0,0,0));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("You may choose an Employe by using the selector or entering Employee Number");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 10, 510, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/search-3-24.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 30, 40);

        AddCoach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/plus-5-24.png"))); // NOI18N
        AddCoach.setToolTipText("Add Coach");
        AddCoach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCoachMouseClicked(evt);
            }
        });
        getContentPane().add(AddCoach);
        AddCoach.setBounds(340, 30, 30, 40);

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

        fldEmpID.setBackground(new java.awt.Color(0, 0, 0));
        fldEmpID.setForeground(new java.awt.Color(255, 255, 255));
        fldEmpID.setText("Search Employee");
        fldEmpID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        fldEmpID.setCaretColor(new java.awt.Color(255, 255, 255));
        fldEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldEmpIDActionPerformed(evt);
            }
        });
        fldEmpID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fldEmpIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fldEmpIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fldEmpIDKeyTyped(evt);
            }
        });
        getContentPane().add(fldEmpID);
        fldEmpID.setBounds(70, 80, 260, 18);

        lblError.setForeground(new java.awt.Color(0, 255, 51));
        lblError.setText("Found Employee");
        getContentPane().add(lblError);
        lblError.setBounds(340, 80, 290, 20);
        lblError.getAccessibleContext().setAccessibleName("Employee Found!");

        AddReceptionist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/plus-5-24.png"))); // NOI18N
        AddReceptionist.setToolTipText("Add Receptionist");
        AddReceptionist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddReceptionistMouseClicked(evt);
            }
        });
        getContentPane().add(AddReceptionist);
        AddReceptionist.setBounds(380, 30, 30, 40);

        jMenuBar1.setBackground(new Color(0,0,0,0));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseBranchActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_chooseBranchActionPerformed

    private void chooseBranchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooseBranchItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            if (item.equals("Select Employee")) {
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
            
            int empNum = Integer.parseInt(str);
            
            
            // do something with object
           
            this.emp = iWindow.getDB().getEmployees().get(Integer.parseInt(str));
            
            
            updateData();

        }
    }//GEN-LAST:event_chooseBranchItemStateChanged

    private void AddCoachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCoachMouseClicked

        //Create new Branch
        
        AddCoach frm = new AddCoach();
        iWindow.openWin(frm);
    }//GEN-LAST:event_AddCoachMouseClicked

    private void fldEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldEmpIDActionPerformed

    private void fldEmpIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldEmpIDKeyPressed
        if(fldEmpID.getText().equals("Search Employee")){
                   fldEmpID.setText("");
                   lblError.setText("");
                   lblError.setVisible(true);
                   return;
               }
         if(evt.getKeyCode()!=KeyEvent.VK_ENTER)
            return;
        
        
        
        //Check if not integer/positive
        if(!PositiveValidator.isPositiveStringNum(fldEmpID.getText())){
            lblError.setText("Please use positive numbers");
            lblError.setForeground(Color.red);
            iWindow.update();
            return;
        }
        
        //Check if employee exists
        this.emp = iWindow.getDB().getEmployees().get(Integer.parseInt(fldEmpID.getText()));
        if(this.emp==null){
            lblError.setText("Employee not found!");
            lblError.setForeground(Color.blue);
            iWindow.update();
            return;
        }
        
        //Found
        lblError.setText("Employee Found!");
        lblError.setForeground(Color.green);
        updateData();
        iWindow.update();     
        
    }//GEN-LAST:event_fldEmpIDKeyPressed

    private void fldEmpIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldEmpIDKeyReleased
       
        
    }//GEN-LAST:event_fldEmpIDKeyReleased

    private void fldEmpIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldEmpIDKeyTyped
        // TODO add your handling code here:
         // TODO add your handling code here:
           // TODO add your handling code here:
       
        
    }//GEN-LAST:event_fldEmpIDKeyTyped

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:
        String str = chooseBranch.getSelectedItem().toString().substring(8, 16);
        Branch branch = iWindow.getDB().getBranches().get(Integer.parseInt(str));
        AddBranchForm add = new AddBranchForm(branch);

        iWindow.openWin(add);
    }//GEN-LAST:event_btnEditMouseClicked

    private void lblShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowMouseClicked
        // TODO add your handling code here:
        lblPassword.setText(""+emp.getPassword());
        iWindow.update();
    }//GEN-LAST:event_lblShowMouseClicked

    private void AddReceptionistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddReceptionistMouseClicked
        // TODO add your handling code here:
        AddRcp add = new AddRcp();
        iWindow.openWin(add);
    }//GEN-LAST:event_AddReceptionistMouseClicked

    private void lblChangeBranchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChangeBranchMouseClicked
        // Open New Room for Branch
        EmpToBranch add = new EmpToBranch(emp.getEmployeeNumber(), emp.getWorkBranch().getBranchNumber());
        iWindow.openWin(add);
    }//GEN-LAST:event_lblChangeBranchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddCoach;
    private javax.swing.JLabel AddReceptionist;
    private javax.swing.JLabel btnEdit;
    private javax.swing.JComboBox<String> chooseBranch;
    private javax.swing.JTextField fldEmpID;
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
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblChangeBranch;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblShow;
    private javax.swing.JLabel lblStartWorkingDate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWorkingBranch;
    private javax.swing.JPanel moreInfo;
    private javax.swing.JPanel statisticsPanel;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
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
        if (this.emp == null) {
            System.err.println("Employee not found.");
            return;
        }

        //Date Values
        String strBirthDate = new SimpleDateFormat("dd/MM/yyyy").format(emp.getBirthDate());
        String strWorkingDate = new SimpleDateFormat("dd/MM/yyyy").format(emp.getStartWorkingDate());
        
        //setText to Lables
        lblAddress.setText(emp.getAddress().toString());
        lblBirthDate.setText("" + strBirthDate);
        lblEmployeeID.setText("" + emp.getEmployeeNumber());
        lblEmployeeName.setText("" + emp.getFirstName()+" "+emp.getLastName());
        lblPassword.setText("*******");
     
        lblWorkingBranch.setText("" + strWorkingDate);
        lblStartWorkingDate.setText("" + emp.getStartWorkingDate());

        

        statisticsPanel.show();
        
        
        
        //Start Info Panel
        if(emp instanceof Receptionist){
            Receptionist resp = (Receptionist) emp;
            

            lbl1.setText(""+resp.getSubscriptions().size());
            txt1.setVisible(true);
            lbl1.setVisible(true);
            moreInfo.setVisible(false);
            
        }else if(emp instanceof Coach){
            Coach coach = (Coach) emp;
            txt1.setVisible(false);
            lbl1.setVisible(false);
            infotitle.setText("Coach Statistics");
            txt2.setText("Lesson Types");
            
            lbl2.setText("");
            String types = "";
            for(E_Lessons les : coach.getTypes()){
                if(les==null) continue;
                
                 types = types+"<br>"+les.toString();
            }
            types = types.substring(4, types.length());
            lbl2.setText("<html>"+types+"</html>");
            
            txt3.setText("Total Lessons");
            lbl3.setText(""+coach.getLessons().size());
            
            txt4.setText("Coach Level");
            lbl4.setText(""+coach.getLevel());
            
            int registered=0, capacity=0;
            for(Lesson les : coach.getLessons()){
                capacity+=les.getMaxStudent();
                registered+=les.getRegistered().size();
            }
            System.err.println("Capacity: "+capacity+" Registered: "+registered);
            if(capacity==0){
                lbl5.setText("No Data");
            }else{
                double coachRatio = ((double)registered/(double)capacity)*100;
                 lbl5.setText(coachRatio+"%");
            }
            
            txt5.setText("Coach Ratio");
            txt6.setText("Registered/Total");
           
            
            
            
            
            
            
            
            moreInfo.setVisible(true);
            
            
            
            
        }
   
        
        iWindow.update();
        return;
    }
}
