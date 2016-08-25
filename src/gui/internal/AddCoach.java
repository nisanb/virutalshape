/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.internal;

import gui.iWindow;
import core.Address;
import core.Branch;
import core.Coach;
import core.Employee;
import java.awt.Color;
import utils.E_Cities;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JList;
import utils.E_Lessons;
import utils.E_Types;
import Validators.*;
import java.util.Random;

/**
 *
 * @author nisans
 */
public class AddCoach extends javax.swing.JInternalFrame {

    private int WindowID = 3;

    /**
     * Creates new form NewJInternalFrame
     */
    public AddCoach() {
        initComponents();
        setTitle("Employees -> Add Coach");
        
        //Finished Loading
        //Add cities to the city chooser
        for (E_Cities city : E_Cities.values()) {
            slctCity.addItem(city.toString());
        }
        
        Random rand = new Random();
        while (employeeNumber < 1){
            int temp = rand.nextInt(99999);
            if (temp > 10000 && !iWindow.getDB().getEmployees().containsKey(temp))
                employeeNumber = temp;
        }
        jLabel1.setText(employeeNumber+"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPhoneNumber = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        slctCity = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAddCoach = new javax.swing.JButton();
        btnBranchCountry = new javax.swing.JTextField();
        btnBranchStreet = new javax.swing.JTextField();
        btnHouseNumber = new javax.swing.JTextField();
        numError = new javax.swing.JLabel();
        phoneError = new javax.swing.JLabel();
        streetError = new javax.swing.JLabel();
        houseError = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LastField = new javax.swing.JTextField();
        Lerror = new javax.swing.JLabel();
        numError2 = new javax.swing.JLabel();
        Ferror = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CoachLevel1 = new javax.swing.JLabel();
        LessonTypes1 = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Password1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        day1 = new javax.swing.JComboBox<>();
        month1 = new javax.swing.JComboBox<>();
        year1 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        copy = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        MessageBox = new javax.swing.JLabel();
        DateError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new Color(0,0,0,85));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        setIconifiable(true);
        setMaximizable(true);
        setAutoscrolls(true);
        setFrameIcon(null);
        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Phone Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 440, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Employee ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 10, 110, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("First Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 40, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Country");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 350, 110, 20);

        btnPhoneNumber.setBackground(new java.awt.Color(0, 0, 0));
        btnPhoneNumber.setColumns(15);
        btnPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        btnPhoneNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnPhoneNumber.setCaretColor(new java.awt.Color(255, 255, 255));
        btnPhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnPhoneNumberFocusLost(evt);
            }
        });
        getContentPane().add(btnPhoneNumber);
        btnPhoneNumber.setBounds(140, 440, 170, 21);

        NameField.setBackground(new java.awt.Color(0, 0, 0));
        NameField.setColumns(20);
        NameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameField.setForeground(new java.awt.Color(255, 255, 255));
        NameField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        NameField.setCaretColor(new java.awt.Color(255, 255, 255));
        NameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameFieldFocusLost(evt);
            }
        });
        getContentPane().add(NameField);
        NameField.setBounds(140, 40, 170, 21);

        slctCity.setBackground(new java.awt.Color(0, 0, 0));
        slctCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        slctCity.setForeground(new java.awt.Color(255, 255, 255));
        slctCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City" }));
        slctCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                slctCityFocusLost(evt);
            }
        });
        getContentPane().add(slctCity);
        slctCity.setBounds(140, 320, 170, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("City");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 320, 110, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Street");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 380, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("House Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 410, 110, 20);

        btnAddCoach.setBackground(new java.awt.Color(102, 102, 102));
        btnAddCoach.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddCoach.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCoach.setText("Add Coach");
        btnAddCoach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCoachMouseClicked(evt);
            }
        });
        getContentPane().add(btnAddCoach);
        btnAddCoach.setBounds(520, 480, 110, 23);

        btnBranchCountry.setBackground(new java.awt.Color(0, 0, 0));
        btnBranchCountry.setColumns(20);
        btnBranchCountry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBranchCountry.setForeground(new java.awt.Color(255, 255, 255));
        btnBranchCountry.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnBranchCountry.setCaretColor(new java.awt.Color(255, 255, 255));
        btnBranchCountry.setEnabled(false);
        btnBranchCountry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnBranchCountryFocusLost(evt);
            }
        });
        getContentPane().add(btnBranchCountry);
        btnBranchCountry.setBounds(140, 350, 170, 21);

        btnBranchStreet.setBackground(new java.awt.Color(0, 0, 0));
        btnBranchStreet.setColumns(20);
        btnBranchStreet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBranchStreet.setForeground(new java.awt.Color(255, 255, 255));
        btnBranchStreet.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnBranchStreet.setCaretColor(new java.awt.Color(255, 255, 255));
        btnBranchStreet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnBranchStreetFocusLost(evt);
            }
        });
        getContentPane().add(btnBranchStreet);
        btnBranchStreet.setBounds(140, 380, 170, 21);

        btnHouseNumber.setBackground(new java.awt.Color(0, 0, 0));
        btnHouseNumber.setColumns(4);
        btnHouseNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHouseNumber.setForeground(new java.awt.Color(255, 255, 255));
        btnHouseNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnHouseNumber.setCaretColor(new java.awt.Color(255, 255, 255));
        btnHouseNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnHouseNumberFocusLost(evt);
            }
        });
        getContentPane().add(btnHouseNumber);
        btnHouseNumber.setBounds(140, 410, 170, 21);

        numError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        numError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(numError);
        numError.setBounds(350, 10, 170, 20);

        phoneError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        phoneError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(phoneError);
        phoneError.setBounds(330, 440, 300, 20);

        streetError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        streetError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(streetError);
        streetError.setBounds(350, 380, 180, 20);

        houseError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        houseError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(houseError);
        houseError.setBounds(350, 410, 180, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Last Name");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 70, 110, 20);

        LastField.setBackground(new java.awt.Color(0, 0, 0));
        LastField.setColumns(20);
        LastField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LastField.setForeground(new java.awt.Color(255, 255, 255));
        LastField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        LastField.setCaretColor(new java.awt.Color(255, 255, 255));
        LastField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LastFieldFocusLost(evt);
            }
        });
        getContentPane().add(LastField);
        LastField.setBounds(140, 70, 170, 21);

        Lerror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lerror.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Lerror);
        Lerror.setBounds(350, 70, 170, 20);

        numError2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        numError2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(numError2);
        numError2.setBounds(350, 10, 170, 20);

        Ferror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Ferror.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Ferror);
        Ferror.setBounds(350, 40, 170, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Birth Date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 100, 110, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Hire Date");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 130, 110, 20);

        CoachLevel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CoachLevel1.setForeground(new java.awt.Color(204, 204, 204));
        CoachLevel1.setText("Coach Level");
        getContentPane().add(CoachLevel1);
        CoachLevel1.setBounds(30, 160, 110, 20);

        LessonTypes1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LessonTypes1.setForeground(new java.awt.Color(204, 204, 204));
        LessonTypes1.setText("Lesson Types");
        getContentPane().add(LessonTypes1);
        LessonTypes1.setBounds(30, 190, 110, 20);

        Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(204, 204, 204));
        Password.setText("Password");
        getContentPane().add(Password);
        Password.setBounds(30, 290, 110, 20);

        Password1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Password1.setForeground(new java.awt.Color(204, 204, 204));
        Password1.setText("Retype");
        getContentPane().add(Password1);
        Password1.setBounds(320, 290, 60, 20);

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setToolTipText("");
        jPasswordField1.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(140, 290, 170, 20);

        jPasswordField2.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setCaretColor(new java.awt.Color(255, 255, 255));
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(380, 290, 170, 20);

        list.setBackground(new java.awt.Color(0, 0, 0));
        list.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        list.setForeground(new java.awt.Color(255, 255, 255));
        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "YOGA", "KICKBOXING", "PILATES", "TRX", "ABS", "AEROBICS", "BODYWEIGHT", "BOXFIT", "CIRCUITS", "COMBAT", "SPINNING", "DANCE", "FAT_BURN", "STEP_TONE", "STRETCH", "ZUMBA", "RAVE", "BROGA", "FITBOXING", "TRAPEZE", "DYNAMIC_WORKOUT", "POWER", "HOOP" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list.setToolTipText("");
        jScrollPane2.setViewportView(list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(140, 190, 170, 80);

        day.setBackground(new java.awt.Color(0, 0, 0));
        day.setForeground(new java.awt.Color(255, 255, 255));
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.setToolTipText("");
        day.setName(""); // NOI18N
        getContentPane().add(day);
        day.setBounds(140, 100, 50, 22);

        month.setBackground(new java.awt.Color(0, 0, 0));
        month.setForeground(new java.awt.Color(255, 255, 255));
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(month);
        month.setBounds(200, 100, 60, 22);

        year.setBackground(new java.awt.Color(0, 0, 0));
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yeay", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        getContentPane().add(year);
        year.setBounds(270, 100, 60, 22);

        day1.setBackground(new java.awt.Color(0, 0, 0));
        day1.setForeground(new java.awt.Color(255, 255, 255));
        day1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day1.setName(""); // NOI18N
        getContentPane().add(day1);
        day1.setBounds(140, 130, 50, 22);

        month1.setBackground(new java.awt.Color(0, 0, 0));
        month1.setForeground(new java.awt.Color(255, 255, 255));
        month1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(month1);
        month1.setBounds(200, 130, 60, 22);

        year1.setBackground(new java.awt.Color(0, 0, 0));
        year1.setForeground(new java.awt.Color(255, 255, 255));
        year1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yeay", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        getContentPane().add(year1);
        year1.setBounds(270, 130, 60, 22);

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level", "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(190, 160, 70, 22);

        copy.setText(">>");
        copy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                copyMouseClicked(evt);
            }
        });
        getContentPane().add(copy);
        copy.setBounds(320, 220, 50, 25);

        list1.setBackground(new java.awt.Color(0, 0, 0));
        list1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        list1.setForeground(new java.awt.Color(255, 255, 255));
        list1.setToolTipText("");
        jScrollPane3.setViewportView(list1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(380, 190, 170, 80);

        MessageBox.setBackground(new Color (0,0,0,90));
        MessageBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MessageBox.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(MessageBox);
        MessageBox.setBounds(30, 470, 480, 40);

        DateError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DateError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(DateError);
        DateError.setBounds(350, 110, 170, 20);

        jLabel1.setBackground(new Color (0,0,0,90));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 90, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * this method adds coach to ishape if all parameters are checked
     * @param evt 
     */
    private void btnAddCoachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCoachMouseClicked
        //Create the date
        if (day.getSelectedIndex() != 0 && month.getSelectedIndex() != 0
                && year.getSelectedIndex() != 0 && day1.getSelectedIndex() != 0 
                && month1.getSelectedIndex() != 0 && year1.getSelectedIndex() != 0) {
            int d = day.getSelectedIndex();
            int m = month.getSelectedIndex()-1;
            int y =  year.getSelectedIndex()+29;
            int day = day1.getSelectedIndex();
            int month = month1.getSelectedIndex()-1;
            int year =  year1.getSelectedIndex()+29;

            startWorkingDate = new Date(y, m, d);
            birthDate = new Date(y, m, d);

            if (startWorkingDate != null && birthDate !=null && new Date().after(birthDate)
                    && AgeValidator.ValidateAge(birthDate, 16)){
                DateError.setText(" ");
                iWindow.update();
            }
            else{
                birthDate = null;
                startWorkingDate = null;
                DateError.setForeground(Color.red);
                DateError.setText("Invalid date or time");
                MessageBox.setForeground(Color.RED);
                MessageBox.setText("Failed to add coach");
                iWindow.update();
                return;
            }
        }
        else{
            birthDate = null;
            startWorkingDate = null;
            DateError.setForeground(Color.red);
            DateError.setText("Invalid date or time");
            MessageBox.setForeground(Color.RED);
            MessageBox.setText("Failed to add coach");
            iWindow.update();
            return;
        }
        
        
        //create address
//        System.out.println(employeeNumber + " " +  firstName + " " + lastName+ " " +
//                birthDate+ " " + startWorkingDate+ " " + password+ " " + level);
        
        try{
        Address address = new Address(country, city, street, housNumber, phones);
        
//            System.out.println(address);
        Coach coach = new Coach(employeeNumber, firstName, lastName,
                birthDate, startWorkingDate, password, level, address,
                types);
        
        //add coach to ishape
        if (iWindow.getDB().addEmployee(coach)){
            MessageBox.setForeground(Color.GREEN);
            MessageBox.setText("Coach was added successfully");
            iWindow.log(new Date().toString() + " - " + employeeNumber + "was added successfully");
            iWindow.exportData();
        }       
        else{
            MessageBox.setForeground(Color.RED);
            MessageBox.setText("Failed to add coach");
            iWindow.log(new Date().toString() + " - " + employeeNumber  + " was failed to add");
        }
        iWindow.update();
           }
           catch(Exception e){
                MessageBox.setForeground(Color.RED);
                MessageBox.setText("<html>Failed to add coach<br>Please review fields</html>");
                iWindow.log(new Date().toString() + " - " + employeeNumber  + " was failed to add");
                iWindow.update();
           }
    }//GEN-LAST:event_btnAddCoachMouseClicked

    /**
     * this method check if coach's name is valid (letters only)
     * @param evt 
     */
    private void NameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFieldFocusLost
        String str = NameField.getText();
        if (!CharValidator.isWord(str) || str.length() < 2) {
            Ferror.setText("Invalid name");
            firstName = null;
        } else {
            Ferror.setText(" ");
            firstName = str;
        }
        iWindow.update();
    }//GEN-LAST:event_NameFieldFocusLost

    
    private void btnBranchCountryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnBranchCountryFocusLost
    }//GEN-LAST:event_btnBranchCountryFocusLost

    /**
     * this method checks if the street is valid name
     * @param evt 
     */
    private void btnBranchStreetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnBranchStreetFocusLost
        String str = btnBranchStreet.getText();
        if (CharValidator.isWord(str)) {
            streetError.setText(" ");
            street = str;
        } else {
            streetError.setText("Enter valid name");
            street = null;
        }
        iWindow.update();
    }//GEN-LAST:event_btnBranchStreetFocusLost

    /**
     * this method checks if house number is a valid number
     * @param evt 
     */
    private void btnHouseNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnHouseNumberFocusLost
        String str = btnHouseNumber.getText();
        if (PositiveValidator.isPositiveStringNum(str) && str.length() < 5) {
            houseError.setText(" ");
            housNumber = Integer.parseInt(str);
            return;
        } else {
            houseError.setText("up tp 4 digit number");
            housNumber = -1;
        }
        iWindow.update();
    }//GEN-LAST:event_btnHouseNumberFocusLost

    /**
     * this method checks if a phone number is valid (using validator)
     * @param evt 
     */
    private void btnPhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnPhoneNumberFocusLost
        
        if (phones == null) {
            String[] phones = new String[5];
        }
        try{
        String str = btnPhoneNumber.getText();
        phones = str.split(", ");
        } catch (java.lang.ArrayIndexOutOfBoundsException obe){
            phoneError.setText("up to 5 phone numbers");
        }
        
        for (String s:phones){
            if (!PhoneValidator.validatePhone(s)) {
                phoneError.setText("wrong format. example: 972-xxxxxxx, 04-xxxxxxx");
                iWindow.update();
                return;
            }
        }
        phoneError.setText(" ");
        iWindow.update();
    }//GEN-LAST:event_btnPhoneNumberFocusLost

    /**
     * this method gets the city selected by user (country selected automatically)
     * @param evt 
     */
    private void slctCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_slctCityFocusLost

        if (slctCity.getSelectedIndex() == 0) return;
        String str = (String) slctCity.getSelectedItem();
        city = E_Cities.valueOf(str);
        btnBranchCountry.setText(city.getCountry());
        country = city.getCountry();
        iWindow.update();
    }//GEN-LAST:event_slctCityFocusLost

       /**
     * this method check if coach's name is valid (letters only)
     * @param evt 
     */
    private void LastFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LastFieldFocusLost
        String str = NameField.getText();
        if (!CharValidator.isWord(str) || str.length() < 2) {
            Lerror.setText("Invalid name");
            lastName = null;
        } else {
            Lerror.setText(" ");
            lastName = str;
        }
        iWindow.update();
    }//GEN-LAST:event_LastFieldFocusLost

    /**
     * this method validates both passwords are the same
     * @param evt 
     */
    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        if (!jPasswordField2.getText().equals(jPasswordField1.getText())) {
            Password.setForeground(Color.RED);
            Password1.setForeground(Color.RED);
            password = null;
        } else {
            Password.setForeground(Color.WHITE);
            Password1.setForeground(Color.WHITE);
            password = jPasswordField1.getText();;
            
        }
        iWindow.update();

    }//GEN-LAST:event_jPasswordField2FocusLost

    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() != 0) {
            level = jComboBox1.getSelectedIndex();
        } else {
            level = 1;
        }
        iWindow.update();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * this method copies the types selected by user and adds it to array
     * @param evt 
     */
    
    private void copyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copyMouseClicked
        String[] str = new String[list.getSelectedValues().length];
        list1.setListData(list.getSelectedValuesList().toArray(str));
        types = new E_Lessons[str.length];
        for (int i = 0; i < str.length; i++){
            types[i] = E_Lessons.valueOf(str[i]);      
        }
        iWindow.update();
    }//GEN-LAST:event_copyMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CoachLevel1;
    private javax.swing.JLabel DateError;
    private javax.swing.JLabel Ferror;
    private javax.swing.JTextField LastField;
    private javax.swing.JLabel Lerror;
    private javax.swing.JLabel LessonTypes1;
    private javax.swing.JLabel MessageBox;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Password1;
    private javax.swing.JButton btnAddCoach;
    private javax.swing.JTextField btnBranchCountry;
    private javax.swing.JTextField btnBranchStreet;
    private javax.swing.JTextField btnHouseNumber;
    private javax.swing.JTextField btnPhoneNumber;
    private javax.swing.JButton copy;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JComboBox<String> day1;
    private javax.swing.JLabel houseError;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> list;
    private javax.swing.JList<String> list1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JComboBox<String> month1;
    private javax.swing.JLabel numError;
    private javax.swing.JLabel numError2;
    private javax.swing.JLabel phoneError;
    private javax.swing.JComboBox<String> slctCity;
    private javax.swing.JLabel streetError;
    private javax.swing.JComboBox<String> year;
    private javax.swing.JComboBox<String> year1;
    // End of variables declaration//GEN-END:variables

    //Manual variables declaration 
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date startWorkingDate;
    private String password;
    int level;
    private E_Lessons[] types;
    private String country;
    private E_Cities city;
    private String street;
    private int housNumber;
    private String[] phones;
//    String[] phoneNumber;

//    Address address = new Address(country, city, street,
//            housNumber, phoneNumber);
//    
//    Coach coach = new Coach(employeeNumber, firstName, lastName,
//            birthDate, startWorkingDate, password, level, address,
//            types);
    //Manual variables declaration 


}
