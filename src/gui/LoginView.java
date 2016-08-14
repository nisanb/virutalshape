/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import core.Customer;
import core.Employee;
import core.Receptionist;
import gui.internal.iWindow;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author nisan
 */
public class LoginView extends javax.swing.JFrame {

    private static String username;
    private static String password;
    /**
     * Creates new form LoginView
     */
    public LoginView() {
        setUndecorated(true);
        
        initComponents();
        
        //Hide Error Labels
       lblErrorLogin.hide();
       errimg.hide();
       
       
       
        
        setLocationRelativeTo(null);
   
       // bg.setSize(600,400);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fldUsername = new javax.swing.JTextField();
        fldPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        errimg = new javax.swing.JLabel();
        lblErrorLogin = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/quit.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 50, 60);

        fldUsername.setBackground(new Color(0,0,0,0));
        fldUsername.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        fldUsername.setForeground(new java.awt.Color(204, 204, 204));
        fldUsername.setText("User ID");
        fldUsername.setBorder(null);
        fldUsername.setCaretColor(new java.awt.Color(255, 51, 51));
        fldUsername.setOpaque(false);
        fldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldUsernameActionPerformed(evt);
            }
        });
        fldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fldUsernameKeyPressed(evt);
            }
        });
        getContentPane().add(fldUsername);
        fldUsername.setBounds(150, 260, 300, 30);

        fldPassword.setBackground(new Color(0,0,0,0));
        fldPassword.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        fldPassword.setForeground(new java.awt.Color(204, 204, 204));
        fldPassword.setText("Password");
        fldPassword.setBorder(null);
        fldPassword.setOpaque(false);
        fldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fldPasswordFocusGained(evt);
            }
        });
        fldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fldPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(fldPassword);
        fldPassword.setBounds(150, 300, 310, 30);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 340, 320, 40);

        errimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/error_red.png"))); // NOI18N
        getContentPane().add(errimg);
        errimg.setBounds(170, 230, 20, 30);

        lblErrorLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorLogin.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorLogin.setText("Wrong credentials, Please try again.");
        getContentPane().add(lblErrorLogin);
        lblErrorLogin.setBounds(190, 220, 440, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MainUI/loginui.png"))); // NOI18N
        bg.setMaximumSize(new java.awt.Dimension(600, 400));
        bg.setMinimumSize(new java.awt.Dimension(600, 400));
        bg.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(bg);
        bg.setBounds(0, -10, 600, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldUsernameActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void fldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldUsernameKeyPressed
        // TODO add your handling code here:
        if(fldUsername.getText().equals("Username")){
            //Wipe
            fldUsername.setText("");
        }
        
    }//GEN-LAST:event_fldUsernameKeyPressed

    private void fldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldPasswordKeyPressed
        // TODO add your handling code here:
        if(fldPassword.getText().equals("Password")){
            //Wipe
            fldPassword.setText("0");
        }
    }//GEN-LAST:event_fldPasswordKeyPressed

    private void fldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldPasswordFocusGained
        // TODO add your handling code here:
        fldPassword.setText("");
        
    }//GEN-LAST:event_fldPasswordFocusGained

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        doLogin();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }
    
   public void doLogin(){
        //Attempt to log in
        System.err.println("Username: "+fldUsername.getText()+"\nPassword: "+fldPassword.getText());
        iWindow.log("Attempting to login using credentials: "+fldUsername.getText()+"/"+fldPassword.getText()+".");
        System.err.println(iWindow.getDB().getCustomers().keySet().toString());
        System.err.println(iWindow.getDB().getEmployees().keySet().toString());
        
        //Go through customers first
        if(iWindow.getDB().getCustomers().containsKey(fldUsername.getText())){
            iWindow.log("Possibly Customer, verifying..");
            //Get customer object
            Customer cust = iWindow.getDB().getCustomers().get(fldUsername.getText());
            if(cust!=null){
                iWindow.log("Found customer by ID");
                //Found customer, checking password
                if(cust.getPassword().equals(fldPassword.getText())){
                    //Able to login!
                    iWindow.log("Successfully logged in. Loading GUI");
                    dispose();
                    iWindow.setCustomer(1, cust);
                    AdminGui gui = new AdminGui();
                    gui.setVisible(true);
                }
                iWindow.log("Wrong password given!");
            }
        } else if(iWindow.getDB().getEmployees().containsKey(fldUsername.getText())){
            //Check employees
            iWindow.log("Possibly Employee, verifying..");
            Employee emp = iWindow.getDB().getEmployees().get(fldUsername.getText());
            if(emp!=null){
                //Found emp, check password
                iWindow.log("Found employee by ID");
                if(emp.getPassword().equals(fldPassword)){
                    //Able to login
                    iWindow.log("Successfully logged in. Loading GUI");
                    dispose();
                    iWindow.setReceptionist(2, (Receptionist) emp);
                    AdminGui gui = new AdminGui();
                    gui.setVisible(true);
                }
                iWindow.log("Wrong password given!");
                
            }
            
            
        }
        
        
        lblErrorLogin.show();
        errimg.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel errimg;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JTextField fldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblErrorLogin;
    // End of variables declaration//GEN-END:variables

     

}
