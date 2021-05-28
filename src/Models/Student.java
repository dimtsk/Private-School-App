
package Models;

import Models.Assignment;
import Models.Course;
import java.time.LocalDate;
import java.util.ArrayList;


public class Student {
    
    private String firstName;
    private String surName;
    private int tuitionFees;
    private LocalDate dateOfBirth;

    
    private static ArrayList<Student> allStudents = new ArrayList();

    public Student() {
    }

    public Student(String firstName, String surName,  String dateOfBirth, int tuitionFees) {
        this.firstName = firstName;
        this.surName = surName;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
        this.tuitionFees = tuitionFees;

    }



    public static void setAllStudents(ArrayList<Student> allStudents) {
        Student.allStudents = allStudents;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getTuitionFees() {
        return tuitionFees;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public static ArrayList<Student> getAllStudents() {
        return allStudents;
    }

    public static void saveStudent(Student student){
        allStudents.add(student);
    }
    
    public ArrayList<Course> getCourses(){
        ArrayList<Course> c=new ArrayList<>();
        for(Course course:Course.getAllCourses()){
            if(course.getStudents().contains(this)){
                c.add(course);
            }
            
        }
        return c;
    }
    
    public ArrayList<Assignment> getAssignments(){
        ArrayList<Assignment> a=new ArrayList<>();
        for(Course course:this.getCourses()){
            for(Assignment assignment:course.getAssignments()){
                a.add(assignment);
            }
        }
        return a;
    }
    
    //TOSTRING
    @Override
    public String toString() {
        return String.format(" %-22s%-20s%-20s%-15s",  firstName, surName, tuitionFees, dateOfBirth);
    }
    
    
}
