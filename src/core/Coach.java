package core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import utils.CoachComperator;
import utils.E_Lessons;
import utils.E_Levels;

/**
 * Class Coach ~ represent a single Coach of the company, inheritor of Employee
 *
 * @author Java Course Team 2016
 * @author University Of Haifa-Israel
 */
public class Coach extends Employee implements Serializable {
    static final long serialVersionUID = 5;
    // -------------------------------Class
    // Members------------------------------
    
    /**
     * All coaches lessons
     */
    private List<Lesson> lessons;
    
    /**
     * all types the coach can teach
     */
    private E_Lessons[] types;
    
    /**
     * level of the coach can be 1-3 1 is the lowest
     */
    private int level;
    
    // -------------------------------Constructors------------------------------
    /**
     * Full constructor
     *
     * @param empNum
     * @param firstName
     * @param lastName
     * @param birthDate
     * @param startWorkingDate
     * @param password
     * @param level
     * @param branch
     * @param address
     * @param types
     */
    public Coach(int empNum, String firstName, String lastName, Date birthDate,
            Date startWorkingDate, String password, int level, Branch branch,
            Address address, E_Lessons[] types) {
        
        super(empNum, firstName, lastName, birthDate, startWorkingDate,
                password, address);
        this.level = 1;
        if (level > 0 && level < 4)
            this.level = level;
        this.setWorkBranch(branch);
        this.lessons = new ArrayList<Lesson>();
        this.types = new E_Lessons[E_Lessons.values().length];
    }
    
    /**
     * Partial constructor
     *
     * @param empNum
     * @param firstName
     * @param lastName
     * @param birthDate
     * @param startWorkingDate
     * @param password
     * @param level
     * @param address
     * @param types
     */
    public Coach(int empNum, String firstName, String lastName, Date birthDate,
            Date startWorkingDate, String password, int level, Address address,
            E_Lessons[] types) {
        
        super(empNum, firstName, lastName, birthDate, startWorkingDate,
                password, address);
        this.level = 1;
        if (level > 0 && level < 4)
            this.level = level;
        this.types = new E_Lessons[E_Lessons.values().length];
        System.arraycopy(types, 0, this.types, 0, types.length);
        this.lessons = new ArrayList<Lesson>();
    }
    
    /**
     * Partial constructor
     *
     * @param empNum
     * @param firstName
     * @param lastName
     * @param birthDate
     * @param startWorkingDate
     * @param password
     * @param level
     * @param address
     */
    public Coach(int empNum, String firstName, String lastName, Date birthDate,
            Date startWorkingDate, String password, int level, Address address) {
        super(empNum, firstName, lastName, birthDate, startWorkingDate,
                password, address);
        this.level = 1;
        if (level > 0 && level < 4)
            this.level = level;
        this.lessons = new ArrayList<Lesson>();
        this.types = new E_Lessons[E_Lessons.values().length];
    }
    
    /**
     * Partial constructor
     *
     * @param empNum
     */
    public Coach(int empNum) {
        super(empNum);
    }
    
    // -------------------------------Getters And
    // Setters------------------------------
    
    /**
     * @return the coach lessons
     */
    public List<Lesson> getLessons() {
        return Collections.unmodifiableList(lessons);
    }
    
    /**
     * set the coach lessons
     *
     * @param lessons
     */
    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }
    
    /**
     * @return the coach lesson's types
     */
    public E_Lessons[] getTypes() {
        return types;
    }
    
    /**
     * set the coach lesson's types
     *
     * @param types
     */
    public void setTypes(E_Lessons[] types) {
        this.types = types;
    }
    
    /**
     * @return the coach level
     */
    public int getLevel() {
        return level;
    }
    
    /**
     * set the coach level
     *
     * @param level
     */
    public void setLevel(int level) {
        this.level = 1;
        if (level > 0 && level < 4)
            this.level = level;
    }
    
    // -------------------------------More Methods------------------------------
    
    /**
     * This method add a lesson to this coach lessons IF he is available at the
     * time. Attention- a lesson takes 2 hours
     *
     * @param lesson
     * @return
     */
    public boolean addLesson(Lesson lesson) {
        if (lesson != null && lesson.getCoach().equals(this)
                && lesson.getStartDate() != null) {
            // if the coach is set for this lesson it means he knows it and has
            // the right level for it as well
            Date start = lesson.getStartDate();
            Date endd = (Date) start.clone();
            endd.setHours(endd.getHours() + 2);
            for (Lesson l : this.lessons) {
                if (l != null && l.equals(lesson))
                    return false;
                if (l != null && l.getStartDate() != null)
                    if ((l.getStartDate().before(endd) && l.getStartDate()
                            .after(start))
                            || l.getStartDate().equals(start)
                            || l.getEndDate().equals(endd)
                            || (l.getEndDate().before(endd) && l.getEndDate()
                                    .after(start)))
                        return false;
            }
            lessons.add(lesson);
            this.getWorkBranch().reorderCoaches();
            return true;
        }
        return false;
    }
    
    /**
     * This method removes a lesson if it exist & belongs to this coach
     *
     * @param lesson
     * @return true if the lesson was successfully deleted, false other
     */
    public boolean removeLesson(Lesson lesson) {
        if (lesson != null && lesson.getCoach().equals(this)
                && lessons.contains(lesson)) {
            lessons.remove(lessons.indexOf(lesson));
            this.getWorkBranch().reorderCoaches();
            return true;
        }
        return false;
    }
    
    // -------------------------------hashCode equals &
    // toString------------------------------
    
    // inherited from Employee
    
    
    
    /**
     * this help method checks if coach is available for lesson
     * @param d
     * @return
     */
    public boolean isAvailable (Date d){
        int maxLessonLength = 120;
        for (Lesson l:this.lessons){
            if (l==null) continue;
            long duration  = l.getStartDate().getTime() - d.getTime();
            long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
            if (diffInMinutes < 0) diffInMinutes *= -1;
            //System.err.println("diff: " + diffInMinutes);
            if (diffInMinutes < maxLessonLength) return false;
        }
        
        return true;
    }
    
    
    /**
     * This method checks if the coach is authorized to be in charge of lesson
     * @param l
     * @return true if he/she can or false if he is not authorized
     */
    public boolean isAuthorized (E_Levels l, E_Lessons type){
        if (this.getLevel() < l.ordinal()) return false;
        System.out.println(l.ordinal());
        for (E_Lessons t:this.types){
            if (type == null) continue;
            if (type == t) return true;
        }
        return false;
    }
    
}
