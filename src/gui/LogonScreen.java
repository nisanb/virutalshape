package gui;
import init.*;
import core.*;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LogonScreen extends JInternalFrame {
    
    private JButton btnNewButton;
    private TextField textField;
    private JPasswordField passwordField;
    
    /**
     * Create the frame.
     */
    public LogonScreen() {
        setVisible(true);
        setTitle("IShape Login");
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);
        
        textField = new TextField("User Name (ID)");
        textField.setFont(new Font("Arial", Font.BOLD, 16));
        textField.setBounds(125, 81, 189, 24);
        getContentPane().add(textField);
        
        btnNewButton = new JButton("Enter");
        btnNewButton.setBounds(177, 172, 89, 23);
        getContentPane().add(btnNewButton);
        
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        passwordField.setToolTipText("Password");
        passwordField.setBounds(125, 129, 189, 24);
        getContentPane().add(passwordField);
        
        btnNewButton.addActionListener(new Handler());
        
    }
    
    class Handler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource().equals(btnNewButton)){
                System.err.println("\n\n\nChecking employees\n\n\n");
                for (Employee e:MainClass.getIShape().getEmployees().values()){
                    if (e == null){
                        System.out.println("null");
                        continue;
                    }
                    if (!(Integer.toString(e.getEmployeeNumber()).equals(textField.getText()))) continue;
                    if (e.getPassword().equals(passwordField.getText())){
                        System.err.println("Not imlemented yet");
                        return;
                    }
                }
                
                System.err.println("\n\n\nChecking cutomers\n\n\n");
                for (Customer c:MainClass.getIShape().getCustomers().values()){
                    if (c == null) continue;
                    if (!c.getId().equals(textField.getText())) continue;
                    if (c.getPassword().equals(passwordField.getText())){
                        System.err.println("Not imlemented yet");
                        return;
                    }
                }
            }
        }
    }
  }  
    
//    /**
//     * Launch the application.
//     */
//    public static void main(String[] args) {
//        System.err.println("Starting");
//        JFrame frame = new JFrame("Main Window");
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
//        frame.add(new LogonScreen());
//        
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    LogonScreen frame = new LogonScreen();
//                    frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
//}