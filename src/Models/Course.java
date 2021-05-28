
package Models;

import java.time.LocalDate;
import java.util.ArrayList;


public class Course {
    
    private String title;
    private String stream;
    private String type;
    private LocalDate start_date;
    private LocalDate end_date;
    private ArrayList<Student> students=new ArrayList<>();
    private ArrayList<Assignment> assignments=new ArrayList<>();
    private ArrayList<Trainer> trainers=new ArrayList<>();
    
    public static  ArrayList<Course> allCourses=new ArrayList<>();
    
    public Course() {
    } 

    public Course(String title, String stream, String type, String start_date, String end_date,
                                        ArrayList<Student> students,ArrayList<Assignment> assignments,
                                        ArrayList<Trainer> trainers) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = LocalDate.parse(start_date);
        this.end_date= LocalDate.parse(end_date);
        this.students=students;
        this.trainers=trainers;
        this.assignments=assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }
    
    public String getTitle() {
        return title;
    }

    public String getStream() {
        return stream;
    }

    public String getType() {
        return type;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public static ArrayList<Course> getAllCourses() {
        return allCourses;
    }

    public static void setAllCourses(ArrayList<Course> allCourses) {
        Course.allCourses = allCourses;
    }

    public static void addCourse(Course course){
        allCourses.add(course);
    }
    
    public ArrayList<Assignment> getAssignments(){
        return this.assignments;
    }
    
    public static void saveCourses(Course course){
        allCourses.add(course);
    }
    
    public void addStudents(Student student){
        this.students.add(student);
    }
    public void addTrainers(Trainer trainer){
        this.trainers.add(trainer);
    }
    
    @Override
    public String toString() {
        return String.format(" %-22s%-20s%-20s%-15s%-15s",  title, stream, type, start_date, end_date);

    }


}
