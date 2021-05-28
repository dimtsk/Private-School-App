
package Models;

import Models.Course;
import java.time.LocalDate;
import java.util.ArrayList;


public class Assignment {
    
    private String title;
    private String description;
    private LocalDate subDateTime;
    private int oralMark;
    private int  totalMark;
    private ArrayList<Student> students=new ArrayList<>();
    private ArrayList<Course> courses;
    public static ArrayList<Assignment> allAssignments= new ArrayList<>();
   
    public Assignment() {
    }

    public Assignment(String title, String description, String subDateTime, int oralMark, int totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = LocalDate.parse(subDateTime);
        this.oralMark = oralMark;
        this.totalMark=totalMark;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
    
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public int getOralMark() {
        return oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public static ArrayList<Assignment> getAllAssignments() {
        return allAssignments;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public static void setAllAssignments(ArrayList<Assignment> allAssignments) {
        Assignment.allAssignments = allAssignments;
    }

    public static void saveAssignments(Assignment assignment){
        allAssignments.add(assignment);
    }    
    
    public void addStudent(Student student){
        this.students.add(student);
    }
    
    // TOSTRING
    @Override
    public String toString() {
        return String.format(" %-22s%-20s%-20s%-15s%-15s", title, description, subDateTime, oralMark, totalMark);

    }
    
    
}
