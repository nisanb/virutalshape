/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internal;

import gui.iWindow;
import java.awt.Color;

/**
 *
 * @author nisans
 */
public class iStatisticsNew extends javax.swing.JInternalFrame {
    private int WindowID = 1;
    /**
     * Creates new form NewJInternalFrame
     */
    public iStatisticsNew() {
        initComponents();
        setTitle("Statistics");
        //Set Vars
        int branchesCount = iWindow.getDB().getBranches().size();
        this.lblCountBranches.setText(""+branchesCount);
        
        int employeesCount = iWindow.getDB().getEmployees().size();
        this.lblCountEmployees.setText(""+employeesCount);
        
        int customersCount = iWindow.getDB().getCustomers().size();
        this.lblCountCustomers.setText(""+customersCount);
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCustomers = new javax.swing.JLabel();
        lblBranches = new javax.swing.JLabel();
        lblEmployees = new javax.swing.JLabel();
        lblCountCustomers = new javax.swing.JLabel();
        lblCountBranches = new javax.swing.JLabel();
        lblCountEmployees = new javax.swing.JLabel();

        setBackground(new Color(0,0,0,85));
        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setAutoscrolls(true);
        setFrameIcon(null);
        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(410, 314));
        setMinimumSize(new java.awt.Dimension(410, 314));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(410, 314));
        getContentPane().setLayout(null);

        lblCustomers.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblCustomers.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomers.setText("Total Customers");
        getContentPane().add(lblCustomers);
        lblCustomers.setBounds(40, 140, 130, 19);

        lblBranches.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblBranches.setForeground(new java.awt.Color(255, 255, 255));
        lblBranches.setText("Total Branches");
        getContentPane().add(lblBranches);
        lblBranches.setBounds(40, 60, 130, 19);

        lblEmployees.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblEmployees.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployees.setText("Total Employees");
        getContentPane().add(lblEmployees);
        lblEmployees.setBounds(40, 100, 130, 19);

        lblCountCustomers.setForeground(new java.awt.Color(255, 255, 255));
        lblCountCustomers.setText("asdasd");
        getContentPane().add(lblCountCustomers);
        lblCountCustomers.setBounds(170, 140, 130, 20);

        lblCountBranches.setForeground(new java.awt.Color(255, 255, 255));
        lblCountBranches.setText("asdasdasd");
        getContentPane().add(lblCountBranches);
        lblCountBranches.setBounds(170, 60, 130, 20);

        lblCountEmployees.setForeground(new java.awt.Color(255, 255, 255));
        lblCountEmployees.setText("asdasd");
        getContentPane().add(lblCountEmployees);
        lblCountEmployees.setBounds(170, 100, 130, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBranches;
    private javax.swing.JLabel lblCountBranches;
    private javax.swing.JLabel lblCountCustomers;
    private javax.swing.JLabel lblCountEmployees;
    private javax.swing.JLabel lblCustomers;
    private javax.swing.JLabel lblEmployees;
    // End of variables declaration//GEN-END:variables

}
