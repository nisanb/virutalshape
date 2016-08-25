/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internal;

import Validators.PositiveValidator;
import core.Customer;
import core.Lesson;
import core.Subscription;
import gui.iWindow;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author nisan
 */
public class ViewLessons extends javax.swing.JInternalFrame {

    private Customer customer;
    /**
     * Creates new form ViewStatistics
     */
    public ViewLessons(Customer cust) {
        initComponents();
      
        this.customer = cust;
        jLabel1.setText("Viewing Lessons of "+cust.getFirstName()+" "+cust.getLastName());
        String str = "<html>"
                + "<table>"
                + "<tr>"
                + "<td>#</td>"
                + "<td>Date</td>"
                + "<td>Hour</td>"
                + "<td>Type</td>"
                + "<td>Room</td>"
                + "<td>Branch</td>"
                + "<td>Total Registered</td>"
                + "</tr>";
        int counter=1;
        for(Subscription sub : customer.getSubs()){
            for(Lesson l : sub.getLessons()){
                
                String date = new SimpleDateFormat("dd/MM/yyyy").format(l.getStartDate());
                String time = new SimpleDateFormat("HH:mm").format(l.getStartDate());
                String strreg = ""+l.getRegistered().size()+"/"+l.getMaxStudent();
                String level = ""+l.getLevel();
                String room = l.getRoom().toString();
                String branch = l.getRoom().getBranch().getBranchName().toString();
                String type = l.getName().toString();
        
                
                
                str+="<tr>"+(counter++)+"</td><td>"+date+"</td><td>"+time+"</td><td>"+type+"</td><td>"+room+"</td><td>"+branch+"</td><td>"+strreg+"</tr>";
            }
                    
        }
        
        str += "</table></html>";
        
        lblContent.setText(str);
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
        lblContent = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Your Lessons");

        lblContent.setForeground(new java.awt.Color(255, 255, 255));
        lblContent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContent.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblContent, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lblContent, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContent;
    // End of variables declaration//GEN-END:variables
}
