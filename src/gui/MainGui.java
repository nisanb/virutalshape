/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import core.Customer;
import gui.manage.ManageBranches;
import javax.swing.JDesktopPane;
import gui.internal.*;
import gui.manage.ManageCustomers;
import gui.manage.ManageEmployees;
import gui.manage.ViewStatistics;
import gui.manage.rcpManageBranch;
import init.IShape;
import java.awt.Desktop;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import utils.MyFileLogWriter;
/**
 *
 * @author nisan
 */
public class MainGui extends javax.swing.JFrame implements Serializable  {
    
    
 
    /**
     * Creates new form MainGui
     */
    public MainGui() {
        setUndecorated(true);
        
        initComponents();
        
        
        iWindow.setLblTitle(lblTitle);
        iWindow.setPanel(ContentFrame);
        MyFileLogWriter.initializeMyFileWriter();
        lblAuthLogged.setText(iWindow.getAuthType());
        lblAuthLogged.setForeground(iWindow.getAuthColor());
        lblName.setText(iWindow.getAuthName());
      
        pnlAdmin.setVisible(false);
        pnlCoach.setVisible(false);
        pnlRcp.setVisible(false);
        pnlCust.setVisible(false);
         setLocationRelativeTo(null);
       
        //Get User Panel
        switch(iWindow.getAuthValue()){
            case 1:
                //Customer
              pnlCust.setVisible(true);
            break;
                
            case 2:
                pnlRcp.setVisible(true);           
            break;
            case 3:

                pnlCoach.setVisible(true);;
            break;
            
            case 4:
                //Administrator
                pnlAdmin.setVisible(true);
            break;
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

        pnlCust = new javax.swing.JPanel();
        btnCustomers3 = new javax.swing.JLabel();
        btnEmployees4 = new javax.swing.JLabel();
        btnEmployees5 = new javax.swing.JLabel();
        pnlRcp = new javax.swing.JPanel();
        btnCustomers1 = new javax.swing.JLabel();
        btnEmployees1 = new javax.swing.JLabel();
        btnEmployees3 = new javax.swing.JLabel();
        pnlCoach = new javax.swing.JPanel();
        btnCustomers2 = new javax.swing.JLabel();
        btnEmployees2 = new javax.swing.JLabel();
        pnlAdmin = new javax.swing.JPanel();
        btnBranches = new javax.swing.JLabel();
        btnCustomers = new javax.swing.JLabel();
        btnStatistics = new javax.swing.JLabel();
        btnEmployees = new javax.swing.JLabel();
        btnDisconnect = new javax.swing.JLabel();
        iReturn = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        lblAuthLogged = new javax.swing.JLabel();
        ContentFrame = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        btnFB = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 204));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1024, 765));
        setMinimumSize(new java.awt.Dimension(1024, 765));
        setPreferredSize(new java.awt.Dimension(1024, 765));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCust.setOpaque(false);

        btnCustomers3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCustomers3.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomers3.setText("My Account");
        btnCustomers3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomers3MouseClicked(evt);
            }
        });

        btnEmployees4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEmployees4.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployees4.setText("Test3");
        btnEmployees4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployees4MouseClicked(evt);
            }
        });

        btnEmployees5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEmployees5.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployees5.setText("Test2");
        btnEmployees5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployees5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCustLayout = new javax.swing.GroupLayout(pnlCust);
        pnlCust.setLayout(pnlCustLayout);
        pnlCustLayout.setHorizontalGroup(
            pnlCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCustLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEmployees4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCustLayout.createSequentialGroup()
                        .addGroup(pnlCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCustomers3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmployees5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCustLayout.setVerticalGroup(
            pnlCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCustLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCustomers3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnEmployees5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmployees4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        getContentPane().add(pnlCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 410));

        pnlRcp.setOpaque(false);

        btnCustomers1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCustomers1.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomers1.setText("Manage Customers");
        btnCustomers1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomers1MouseClicked(evt);
            }
        });

        btnEmployees1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEmployees1.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployees1.setText("My Account");
        btnEmployees1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployees1MouseClicked(evt);
            }
        });

        btnEmployees3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEmployees3.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployees3.setText("Manage Branch");
        btnEmployees3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployees3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlRcpLayout = new javax.swing.GroupLayout(pnlRcp);
        pnlRcp.setLayout(pnlRcpLayout);
        pnlRcpLayout.setHorizontalGroup(
            pnlRcpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRcpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRcpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRcpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRcpLayout.createSequentialGroup()
                        .addGroup(pnlRcpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCustomers1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmployees3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlRcpLayout.setVerticalGroup(
            pnlRcpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRcpLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCustomers1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnEmployees3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmployees1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        getContentPane().add(pnlRcp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 410));

        pnlCoach.setOpaque(false);

        btnCustomers2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCustomers2.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomers2.setText("Manage Customers");
        btnCustomers2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomers2MouseClicked(evt);
            }
        });

        btnEmployees2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEmployees2.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployees2.setText("My Account");
        btnEmployees2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployees2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCoachLayout = new javax.swing.GroupLayout(pnlCoach);
        pnlCoach.setLayout(pnlCoachLayout);
        pnlCoachLayout.setHorizontalGroup(
            pnlCoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCoachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCustomers2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmployees2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCoachLayout.setVerticalGroup(
            pnlCoachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCoachLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCustomers2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmployees2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        getContentPane().add(pnlCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 410));

        pnlAdmin.setOpaque(false);

        btnBranches.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBranches.setForeground(new java.awt.Color(255, 255, 255));
        btnBranches.setText("Manage Branches");
        btnBranches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBranchesMouseClicked(evt);
            }
        });

        btnCustomers.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCustomers.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomers.setText("Manage Customers");
        btnCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomersMouseClicked(evt);
            }
        });

        btnStatistics.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnStatistics.setForeground(new java.awt.Color(255, 255, 255));
        btnStatistics.setText("View Statistics");
        btnStatistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatisticsMouseClicked(evt);
            }
        });

        btnEmployees.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEmployees.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployees.setText("Manage Employees");
        btnEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployeesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAdminLayout = new javax.swing.GroupLayout(pnlAdmin);
        pnlAdmin.setLayout(pnlAdminLayout);
        pnlAdminLayout.setHorizontalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBranches, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAdminLayout.setVerticalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnBranches, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        getContentPane().add(pnlAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 410));

        btnDisconnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDisconnectMouseClicked(evt);
            }
        });
        getContentPane().add(btnDisconnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 180, 40));

        iReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/arrow-88-24.png"))); // NOI18N
        iReturn.setToolTipText("Return");
        iReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iReturnMouseClicked(evt);
            }
        });
        getContentPane().add(iReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 30, 30));

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
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 180, 40));

        lblAuthLogged.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblAuthLogged.setForeground(new java.awt.Color(255, 0, 0));
        lblAuthLogged.setText("Administrator");
        getContentPane().add(lblAuthLogged, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 50));

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
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(ContentFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 820, 650));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 190, 30));

        btnFB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gui/buttons/facebook-3-24.png"))); // NOI18N
        btnFB.setText("jLabel1");
        btnFB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFBMouseClicked(evt);
            }
        });
        getContentPane().add(btnFB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 30, 30));

        lblTitle.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 153, 0));
        lblTitle.setText("Welcome to Virtual iShape");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 420, 20));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MainUI/ishapegui.png"))); // NOI18N
        Background.setText("A");
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.setInheritsPopupMenu(false);
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
        iWindow.clean();
        LoginGui tmp = new LoginGui();
        tmp.setVisible(true);
        
    }//GEN-LAST:event_btnDisconnectMouseClicked

    private void btnExitPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnExitPropertyChange
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnExitPropertyChange

    ///Commit
    private void btnStatisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatisticsMouseClicked
        // TODO add your handling code here:
        //Open Internal JFrame
        ViewStatistics add = new ViewStatistics();
        iWindow.openWin(add);
    }//GEN-LAST:event_btnStatisticsMouseClicked

    private void btnBranchesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBranchesMouseClicked
        //AddBranchForm add = new AddBranchForm();
        //AddCoach add = new AddCoach();
        ManageBranches add = new ManageBranches();
        iWindow.openWin(add);
    }//GEN-LAST:event_btnBranchesMouseClicked

    private void btnCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomersMouseClicked
        // TODO add your handling code here:
        ManageCustomers add = new ManageCustomers();
        iWindow.openWin(add);
    }//GEN-LAST:event_btnCustomersMouseClicked

    private void iReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iReturnMouseClicked
    
    }//GEN-LAST:event_iReturnMouseClicked

    private void btnEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeesMouseClicked
//        EmpToBranch add = new EmpToBranch();
//        iWindow.openWin(add);
        ManageEmployees add = new ManageEmployees();
        iWindow.openWin(add);
        iWindow.update();
    }//GEN-LAST:event_btnEmployeesMouseClicked

    private void btnFBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFBMouseClicked
        // TODO add your handling code here:
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        URI uri = null;
        try {
            uri = new URI("https://www.facebook.com/Virtual-IShape-1076392832409754/");
        } catch (URISyntaxException ex) {
            Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
        try {
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_btnFBMouseClicked

    private void btnCustomers1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomers1MouseClicked
        // TODO add your handling code here:
        ManageCustomers add = new ManageCustomers();
        iWindow.openWin(add);
    }//GEN-LAST:event_btnCustomers1MouseClicked

    private void btnEmployees1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployees1MouseClicked
        // TODO add your handling code here:
        ManageEmployees add = new ManageEmployees();
        iWindow.openWin(add);
    }//GEN-LAST:event_btnEmployees1MouseClicked

    private void btnCustomers2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomers2MouseClicked
        // TODO add your handling code here:
        ManageCustomers add = new ManageCustomers();
        iWindow.openWin(add);
    }//GEN-LAST:event_btnCustomers2MouseClicked

    private void btnEmployees2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployees2MouseClicked
        // TODO add your handling code here:
        ManageEmployees add = new ManageEmployees();
        iWindow.openWin(add);
    }//GEN-LAST:event_btnEmployees2MouseClicked

    private void btnEmployees3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployees3MouseClicked
        rcpManageBranch add = new rcpManageBranch();
        iWindow.openWin(add);
    }//GEN-LAST:event_btnEmployees3MouseClicked

    private void btnCustomers3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomers3MouseClicked
        // TODO add your handling code here:
        ManageCustomers add = new ManageCustomers(iWindow.getCustomerLogged());
        iWindow.openWin(add);
    }//GEN-LAST:event_btnCustomers3MouseClicked

    private void btnEmployees4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployees4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployees4MouseClicked

    private void btnEmployees5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployees5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployees5MouseClicked

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
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel ContentFrame;
    private javax.swing.JLabel btnBranches;
    private javax.swing.JLabel btnCustomers;
    private javax.swing.JLabel btnCustomers1;
    private javax.swing.JLabel btnCustomers2;
    private javax.swing.JLabel btnCustomers3;
    private javax.swing.JLabel btnDisconnect;
    private javax.swing.JLabel btnEmployees;
    private javax.swing.JLabel btnEmployees1;
    private javax.swing.JLabel btnEmployees2;
    private javax.swing.JLabel btnEmployees3;
    private javax.swing.JLabel btnEmployees4;
    private javax.swing.JLabel btnEmployees5;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnFB;
    private javax.swing.JLabel btnStatistics;
    private javax.swing.JLabel iReturn;
    private javax.swing.JLabel lblAuthLogged;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPanel pnlCoach;
    private javax.swing.JPanel pnlCust;
    private javax.swing.JPanel pnlRcp;
    // End of variables declaration//GEN-END:variables
}
