package gui.internal;

import gui.iWindow;
import Validators.CharValidator;
import Validators.EmailValidator;
import Validators.PhoneValidator;
import Validators.PositiveValidator;


import core.Branch;
import core.Coach;
import core.Room;
import java.awt.Color;
import utils.E_Cities;
import java.lang.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import utils.E_Lessons;
import utils.E_Levels;
import utils.E_Rooms;
import utils.E_Types;

/**
 *
 * @author nisans
 */
public class AddLesson extends javax.swing.JInternalFrame {

    private Branch branch;
    private Room room;
    /**
     * Creates new form NewJInternalFrame
     */
    public AddLesson(Branch branch, Room room) {
        initComponents();
        this.branch=branch;
        this.room=room;
        setTitle(branch.getBranchName()+" -> "+room.getRoomType().toString()+" #"+room.getRoomNum()+" -> Add Instrument");
        lblBranchID.setText(branch.getBranchNumber()+ " - "+branch.getBranchName());
        lblRoomID.setText(""+room.getRoomNum());
        
        
        //Finished Loading
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddLes = new javax.swing.JButton();
        slctBranch = new javax.swing.JLabel();
        MessageBox = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        IDfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CoachError = new javax.swing.JLabel();
        streetError = new javax.swing.JLabel();
        maxNumStudent = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numstudentserror = new javax.swing.JLabel();
        LessonLevel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        Hour = new javax.swing.JComboBox<>();
        Minute = new javax.swing.JComboBox<>();
        Second = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LessonName = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        DateError = new javax.swing.JLabel();
        LevelError = new javax.swing.JLabel();
        lblRoomID = new javax.swing.JLabel();
        lblBranchID = new javax.swing.JLabel();
        lessonNumAuto = new javax.swing.JLabel();

        setBackground(new Color(0,0,0,85));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        setMaximizable(true);
        setAutoscrolls(true);
        setFrameIcon(null);
        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 600));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        getContentPane().setLayout(null);

        AddLes.setBackground(new java.awt.Color(102, 102, 102));
        AddLes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddLes.setForeground(new java.awt.Color(255, 255, 255));
        AddLes.setText("Add Lesson");
        AddLes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddLesMouseClicked(evt);
            }
        });
        getContentPane().add(AddLes);
        AddLes.setBounds(470, 290, 150, 23);

        jLabel3.setToolTipText("Subscription Number ");
        slctBranch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        slctBranch.setForeground(new java.awt.Color(204, 204, 204));
        slctBranch.setText("Branch");
        getContentPane().add(slctBranch);
        slctBranch.setBounds(30, 10, 110, 20);

        MessageBox.setBackground(new Color (0,0,0,90));
        MessageBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MessageBox.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(MessageBox);
        MessageBox.setBounds(30, 290, 370, 20);

        jLabel3.setToolTipText("Subscription Number ");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Lesson Name");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 70, 110, 20);

        IDfield.setBackground(new java.awt.Color(0, 0, 0));
        IDfield.setColumns(10);
        IDfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDfield.setForeground(new java.awt.Color(255, 255, 255));
        IDfield.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        IDfield.setCaretColor(new java.awt.Color(255, 255, 255));
        IDfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        IDfield.setSelectionColor(new java.awt.Color(204, 204, 204));
        IDfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDfieldFocusLost(evt);
            }
        });
        getContentPane().add(IDfield);
        IDfield.setBounds(160, 100, 170, 21);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Coach");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 110, 20);

        CoachError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CoachError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(CoachError);
        CoachError.setBounds(350, 100, 210, 20);

        streetError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        streetError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(streetError);
        streetError.setBounds(350, 380, 180, 20);

        maxNumStudent.setBackground(new java.awt.Color(0, 0, 0));
        maxNumStudent.setColumns(10);
        maxNumStudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxNumStudent.setForeground(new java.awt.Color(255, 255, 255));
        maxNumStudent.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        maxNumStudent.setCaretColor(new java.awt.Color(255, 255, 255));
        maxNumStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        maxNumStudent.setSelectionColor(new java.awt.Color(204, 204, 204));
        maxNumStudent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                maxNumStudentFocusLost(evt);
            }
        });
        getContentPane().add(maxNumStudent);
        maxNumStudent.setBounds(160, 130, 170, 21);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Num of Trainees");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 130, 130, 20);

        numstudentserror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        numstudentserror.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(numstudentserror);
        numstudentserror.setBounds(350, 130, 210, 20);

        LessonLevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LessonLevel.setForeground(new java.awt.Color(204, 204, 204));
        LessonLevel.setText("Lesson Level");
        getContentPane().add(LessonLevel);
        LessonLevel.setBounds(30, 190, 110, 20);

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level", "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(210, 190, 80, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Lesson Date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 220, 110, 20);

        day.setBackground(new java.awt.Color(0, 0, 0));
        day.setForeground(new java.awt.Color(255, 255, 255));
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.setToolTipText("");
        day.setName(""); // NOI18N
        getContentPane().add(day);
        day.setBounds(160, 220, 50, 20);

        month.setBackground(new java.awt.Color(0, 0, 0));
        month.setForeground(new java.awt.Color(255, 255, 255));
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(month);
        month.setBounds(220, 220, 60, 20);

        year.setBackground(new java.awt.Color(0, 0, 0));
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2016", "2017", "2018", "2019", "2020" }));
        year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearFocusLost(evt);
            }
        });
        getContentPane().add(year);
        year.setBounds(290, 220, 60, 20);

        Hour.setBackground(new java.awt.Color(0, 0, 0));
        Hour.setForeground(new java.awt.Color(255, 255, 255));
        Hour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "18", "20", "21", "22", "23" }));
        getContentPane().add(Hour);
        Hour.setBounds(160, 250, 50, 20);

        Minute.setBackground(new java.awt.Color(0, 0, 0));
        Minute.setForeground(new java.awt.Color(255, 255, 255));
        Minute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minute", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "18", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "34", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        getContentPane().add(Minute);
        Minute.setBounds(220, 250, 60, 20);

        Second.setBackground(new java.awt.Color(0, 0, 0));
        Second.setForeground(new java.awt.Color(255, 255, 255));
        Second.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Second", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "18", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "34", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        getContentPane().add(Second);
        Second.setBounds(290, 250, 60, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Lesson Time");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 250, 110, 20);

        jLabel3.setToolTipText("Subscription Number ");
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Room");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(30, 40, 110, 20);

        LessonName.setBackground(new java.awt.Color(0, 0, 0));
        LessonName.setForeground(new java.awt.Color(255, 255, 255));
        LessonName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Lesson Type" }));
        LessonName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LessonNameFocusLost(evt);
            }
        });
        getContentPane().add(LessonName);
        LessonName.setBounds(160, 70, 170, 20);
        for (E_Lessons l:E_Lessons.values()){
            LessonName.addItem(l.toString());
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Lesson Number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 160, 130, 20);

        DateError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DateError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(DateError);
        DateError.setBounds(370, 230, 250, 20);

        LevelError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LevelError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(LevelError);
        LevelError.setBounds(350, 190, 210, 20);

        lblRoomID.setForeground(new java.awt.Color(255, 255, 255));
        lblRoomID.setText("roomid");
        getContentPane().add(lblRoomID);
        lblRoomID.setBounds(160, 40, 170, 20);

        lblBranchID.setForeground(new java.awt.Color(255, 255, 255));
        lblBranchID.setText("branchid");
        getContentPane().add(lblBranchID);
        lblBranchID.setBounds(160, 14, 170, 20);

        lessonNumAuto.setBackground(new Color(0,0,0,90));
        lessonNumAuto.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lessonNumAuto);
        lessonNumAuto.setBounds(160, 160, 160, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * this method adds the lesson to ishape
     * @param evt 
     */
    private void AddLesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLesMouseClicked
        //Create the date
        if (day.getSelectedIndex() != 0 && month.getSelectedIndex() != 0
                && year.getSelectedIndex() != 0 && Hour.getSelectedIndex() !=0
                && Minute.getSelectedIndex() !=0 && Second.getSelectedIndex() !=0) {
            int d = day.getSelectedIndex();
            int m = month.getSelectedIndex()-1;
            int y =  year.getSelectedIndex()+115;
            int h = Hour.getSelectedIndex()-1;
            int min = Minute.getSelectedIndex()-1;
            int s = Second.getSelectedIndex()-1;
            
            dateTime = new Date(y, m, d, h,min,s);
            if (new Date().before(dateTime)){
                String strDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(dateTime);
                DateError.setForeground(Color.GREEN);
                DateError.setText("Date: " + strDate);
                iWindow.update();
            }
            else{
                dateTime = null;
                DateError.setForeground(Color.red);
                DateError.setText("Invalid date or time");
                iWindow.update();
                return;
            }
        }
        else{
            dateTime = null;
            DateError.setForeground(Color.red);
            DateError.setText("Invalid date or time");
            iWindow.update();
            return;
        }
        
        //chech if caoch is availiable and authorized
        Coach coach = (Coach)iWindow.getDB().getEmployees().get(coachNum);
        if (!coach.isAvailable(dateTime)){
            CoachError.setText("Coach is not available");
            iWindow.update();
            MessageBox.setText(" ");
            return;
        }
        
        if (level ==null || !coach.isAuthorized(level, lessonName)){
            CoachError.setText("Coach is not autthorized");
            iWindow.update();
            MessageBox.setText(" ");
            iWindow.update();
            return;
        }

        //create the lesson and add it to ishape
        if(iWindow.getDB().addLesson(lessonNum, lessonName, dateTime,
                level, coachNum, maxStudent, branch.getBranchNumber(), room.getRoomNum())){
            MessageBox.setForeground(Color.GREEN);
            MessageBox.setText("Successfully added lesson " + lessonNum  +" to branch" + branch.getBranchNumber());
            iWindow.log(new Date().toString() + " - Successfully added lesson " + lessonNum  +" to branch" + branch.getBranchNumber());
        }
        else{
            MessageBox.setForeground(Color.RED);
            MessageBox.setText("Failed to add lesson " + lessonNum  +" to branch" + branch.getBranchNumber());
            iWindow.log(new Date().toString() + " - " + "Failed to add lesson " + lessonNum  +" to branch" + branch.getBranchNumber());
        }
        iWindow.update();
        
    }//GEN-LAST:event_AddLesMouseClicked
            
    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost

    /**
     * this method checks the validity of coach
     * @param evt 
     */
    private void IDfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDfieldFocusLost
        
        if(IDfield.getText().length()==0){
            CoachError.setText("Please select coach!");
            coachNum = -1;
            iWindow.update();
            return;
        }
        String str = IDfield.getText();
        if (!PositiveValidator.isPositiveStringNum(str)) {
            CoachError.setText("Positive digits only");
            coachNum = -1;
            iWindow.update();
        }

        if (iWindow.getDB().getEmployees().containsKey(Integer.parseInt(str)) && 
                iWindow.getDB().getEmployees().get(Integer.parseInt(str)) instanceof Coach) {
            CoachError.setText(" ");
            coachNum = Integer.parseInt(str);
            lessonNum = iWindow.getDB().getNextLes();
            lessonNumAuto.setText(new Integer(lessonNum).toString());
        } else {
            CoachError.setText("Coach number doesn't exist");
            coachNum = -1;
        }

        iWindow.update();
    }//GEN-LAST:event_IDfieldFocusLost

    /**
     * this method checks and sets the level of the lesson
     * @param evt 
     */
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() != 0) {
            level = E_Levels.values()[jComboBox1.getSelectedIndex()-1];
            LevelError.setText(" ");
        } else {
            LevelError.setText("Plese choose level");
            return;
        }
        iWindow.update();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void yearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFocusLost
//        if (day.getSelectedIndex() != 0 && month.getSelectedIndex() != 0 
//                && year.getSelectedIndex() != 0 && Hour.getSelectedIndex() !=0
//                && Minute.getSelectedIndex() !=0 && Second.getSelectedIndex() !=0) {
//            int d = day.getSelectedIndex();
//            int m = month.getSelectedIndex()-1;
//            int y =  year.getSelectedIndex()+116;
//            int h = Hour.getSelectedIndex()-1;
//            int min = Minute.getSelectedIndex()-1;
//            int s = Second.getSelectedIndex()-1;
//            
//            dateTime = new Date(y, m, d, h,min,s);
//            if (new Date().before(dateTime)){
//                DateError.setForeground(Color.GREEN);
//                DateError.setText("Schedualed: " + dateTime);
//            }
//            else{
//                DateError.setForeground(Color.GREEN);
//                DateError.setText("Please choose valid date");
//                
//            }
//
//        }
//        iWindow.update();
    }//GEN-LAST:event_yearFocusLost

    /**
     * this method checks and sets the number of people can participate on the lesson
     * @param evt 
     */
    private void maxNumStudentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_maxNumStudentFocusLost
        String str = maxNumStudent.getText();
        if(str.length()<=0)
            return;
        if (CharValidator.isNumber(str) && str.length() < 3) {
            maxStudent = Integer.parseInt(str);
            numstudentserror.setText(" ");
        } else {
            numstudentserror.setText("Positive 2 digit number");
        }
        iWindow.update();   
    }//GEN-LAST:event_maxNumStudentFocusLost

    /**
     * this method allows the user choose lesson type from a list
     * @param evt 
     */
    private void LessonNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LessonNameFocusLost

        if (LessonName.getSelectedIndex() !=0){
            lessonName = E_Lessons.valueOf(LessonName.getSelectedItem().toString());
        }
        
        lessonNum = iWindow.getDB().getLessons().size()+20;
        lessonNumAuto.setText(new Integer(lessonNum).toString());
        
        iWindow.update();
    }//GEN-LAST:event_LessonNameFocusLost
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLes;
    private javax.swing.JLabel CoachError;
    private javax.swing.JLabel DateError;
    private javax.swing.JComboBox<String> Hour;
    private javax.swing.JTextField IDfield;
    private javax.swing.JLabel LessonLevel;
    private javax.swing.JComboBox<String> LessonName;
    private javax.swing.JLabel LevelError;
    private javax.swing.JLabel MessageBox;
    private javax.swing.JComboBox<String> Minute;
    private javax.swing.JComboBox<String> Second;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBranchID;
    private javax.swing.JLabel lblRoomID;
    private javax.swing.JLabel lessonNumAuto;
    private javax.swing.JTextField maxNumStudent;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JLabel numstudentserror;
    private javax.swing.JLabel slctBranch;
    private javax.swing.JLabel streetError;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
    
    //Manual variables declaration
    private int lessonNum;
    private E_Lessons lessonName;
    private Date dateTime ;
    private E_Levels level;
    private int coachNum;
    private int maxStudent;
    private int branchNum;
    private int roomNum;

}
