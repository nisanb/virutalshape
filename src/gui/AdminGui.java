/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import java.awt.Color;
import javax.swing.JDesktopPane;
import gui.internal.*;
import init.IShape;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
/**
 *
 * @author nisan
 */
public class AdminGui extends javax.swing.JFrame  {
    
 
    /**
     * Creates new form MainGui
     */
    public AdminGui() {
        
        initComponents();
        iWindow.setMainFrame(this);
        iWindow.setPanel(ContentFrame);
     
        
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStatistics = new javax.swing.JLabel();
        btnCustomers = new javax.swing.JLabel();
        btnEmployees = new javax.swing.JLabel();
        btnBranches = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        btnDisconnect = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        iReturn = new javax.swing.JLabel();
        ContentFrame = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 204));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStatistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatisticsMouseClicked(evt);
            }
        });
        getContentPane().add(btnStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, 50));

        btnCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomersMouseClicked(evt);
            }
        });
        getContentPane().add(btnCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 50));

        btnEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployeesMouseClicked(evt);
            }
        });
        getContentPane().add(btnEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 50));

        btnBranches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBranchesMouseClicked(evt);
            }
        });
        getContentPane().add(btnBranches, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 190, 50));

        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnExitPropertyChange(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 180, 40));

        btnDisconnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDisconnectMouseClicked(evt);
            }
        });
        getContentPane().add(btnDisconnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 180, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/facebook-3-24.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 30, 30));

        iReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/return.png"))); // NOI18N
        iReturn.setToolTipText("Return");
        iReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iReturnMouseClicked(evt);
            }
        });
        getContentPane().add(iReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 60, 60));

        ContentFrame.setForeground(new java.awt.Color(255, 51, 102));
        ;
        ContentFrame.setAutoscrolls(true);
        ContentFrame.setOpaque(false);
        ContentFrame.setVisible(false);

        javax.swing.GroupLayout ContentFrameLayout = new javax.swing.GroupLayout(ContentFrame);
        ContentFrame.setLayout(ContentFrameLayout);
        ContentFrameLayout.setHorizontalGroup(
            ContentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        ContentFrameLayout.setVerticalGroup(
            ContentFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        getContentPane().add(ContentFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 820, 670));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/Admin.jpg"))); // NOI18N
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseClicked
        
    }//GEN-LAST:event_BackgroundMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnDisconnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDisconnectMouseClicked
        // TODO add your handling code here:
        dispose();
        LoginView tmp = new LoginView();
        tmp.setVisible(true);
        
    }//GEN-LAST:event_btnDisconnectMouseClicked

    private void btnExitPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnExitPropertyChange
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnExitPropertyChange

    ///Commit
    private void btnStatisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatisticsMouseClicked
        // TODO add your handling code here:
        //Open Internal JFrame
        iStatisticsNew tmp = new iStatisticsNew();
        iWindow.openWin(tmp, tmp.getWindowID());
    }//GEN-LAST:event_btnStatisticsMouseClicked

    private void btnBranchesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBranchesMouseClicked
        //AddBranchForm add = new AddBranchForm();
        //AddCoach add = new AddCoach();
        ManageBranches add = new ManageBranches();
        iWindow.openWin(add, add.getWindowID());
    }//GEN-LAST:event_btnBranchesMouseClicked

    private void btnCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomersMouseClicked
        // TODO add your handling code here:
        AddCustomer add = new AddCustomer();
        iWindow.openWin(add, add.getWindowID());
    }//GEN-LAST:event_btnCustomersMouseClicked

    private void iReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iReturnMouseClicked
        // TODO add your handling code here:
        try {
            
        
        iWindow.getCurrentWindow().hide();
        JInternalFrame frm = iWindow.getLastWindow();
        frm.setVisible(true);
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_iReturnMouseClicked

    private void btnEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeesMouseClicked
        EmpToBranch add = new EmpToBranch();
        iWindow.openWin(add, add.getWindowID());
    }//GEN-LAST:event_btnEmployeesMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        URI uri = null;
        try {
            uri = new URI("https://www.facebook.com/Virtual-IShape-1076392832409754/");
        } catch (URISyntaxException ex) {
            Logger.getLogger(AdminGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
        try {
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
      
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel ContentFrame;
    private javax.swing.JLabel btnBranches;
    private javax.swing.JLabel btnCustomers;
    private javax.swing.JLabel btnDisconnect;
    private javax.swing.JLabel btnEmployees;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnStatistics;
    private javax.swing.JLabel iReturn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
