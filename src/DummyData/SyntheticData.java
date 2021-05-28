
package DummyData;


import Models.Trainer;
import Models.Student;
import Models.Assignment;
import Models.Course;
import java.util.ArrayList;
import java.util.Collections;

public class SyntheticData {
  
    
    public static void create(){
        //CREATE ASSIGNMENTS
        Assignment a1=new Assignment("OOP","PRACTISE","2021-02-03",100,100);
        Assignment a2=new Assignment("GIT ","PRACTISE","2021-02-03",100,100);
        Assignment a3=new Assignment("ABSTRACTS ","PRACTISE","2021-02-03",100,100);
        Assignment a4=new Assignment("INTERFACE ","PRACTISE","2021-02-03",100,100);
        Assignment a5=new Assignment("OOP ","PRACTISE","2021-02-03",100,100);
        Assignment a6=new Assignment("C1","PRACTISE","2021-02-03",100,100);
        Assignment a7=new Assignment("C2 ","PRACTISE","2021-02-03",100,100);
        Assignment a8=new Assignment("C3 ","PRACTISE","2021-02-03",100,100);
        Assignment a9=new Assignment("C4 ","PRACTISE","2021-02-03",100,100);
        Assignment a10=new Assignment("C5 ","FINAL EXAM","2021-02-03",100,100);
        //CREATE TRAINERS
        Trainer t1=new Trainer("GIORGOS","IRAKLIDIS","JAVA");
        Trainer t2=new Trainer("SPYROS","MAYROS","C");
        Trainer t3=new Trainer("TASOS","SOULIOTIS","PYTHON");
        Trainer t4=new Trainer("MARIA","XRISTIDOY","JAVASCRIPT");
        //CREATE STUDENTS
        Student s1=new Student("TASOS","FANTAKIS","1994-12-17",2500);
        Student s2=new Student("DIMITRIS","TSIKOS","1994-06-07",2500);
        Student s3=new Student("FOTEINI","SOTIRIOU","1993-05-04",2500);
        Student s4=new Student("GIORGOS","XRISTOPOULOS","1994-06-22",2500);
        Student s5=new Student("MARIA","FANAKI","1995-11-21",2500);
        Student s6=new Student("THIMIOS","MANTHIOS","1994-04-26",2500);
        Student s7=new Student("KOSTAS","PAPOURIS","1994-09-07",2500);
        Student s8=new Student("SOFIA","GIANNAKI","1994-09-07",2500);
        Student s9=new Student("ALEXIS","TSAROS","1994-09-07",2500);
        Student s10=new Student("SOFIA","GIANNAKI","1994-09-07",2500);
        //INPUT DATA INTO ARRAYLISTS
        ArrayList<Student> allStudentsList=new ArrayList<>();
        Collections.addAll(allStudentsList, s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
        Student.setAllStudents(allStudentsList);
        ArrayList<Trainer> allTrainersList=new ArrayList<>();
        Collections.addAll(allTrainersList, t1,t2,t3,t4);
        Trainer.setAllTrainers(allTrainersList);
        ArrayList<Assignment> allAssignmentsList=new ArrayList<>();
        Collections.addAll(allAssignmentsList, a1,a2,a3,a4,a5,a6,a7,a8,a9,a10);
        Assignment.setAllAssignments(allAssignmentsList);
        
        ArrayList<Student> javaStudents=new ArrayList<>();
        Collections.addAll(javaStudents, s1,s2,s3,s4);
        ArrayList<Student> cStudents=new ArrayList<>();
        Collections.addAll(cStudents, s5,s6,s7,s8);
        ArrayList<Student> pythonStudents=new ArrayList<>();
        Collections.addAll(pythonStudents, s5,s6,s9,s10);
        ArrayList<Student> javaScriptStudents=new ArrayList<>();
        Collections.addAll(javaScriptStudents, s1,s2,s7,s8);
        
        ArrayList<Assignment> javaAssignments=new ArrayList<>();
        Collections.addAll(javaAssignments, a1,a2,a3);
        ArrayList<Assignment> cAssignments=new ArrayList<>();
        Collections.addAll(cAssignments, a4,a5,a6);
        ArrayList<Assignment> pythonAssignments=new ArrayList<>();
        Collections.addAll(pythonAssignments, a7,a8,a9);
        ArrayList<Assignment> javaScriptAssignments=new ArrayList<>();
        Collections.addAll(javaScriptAssignments, a10,a2,a3);
        
        ArrayList<Trainer> javaTrainer=new ArrayList<>();
        Collections.addAll(javaTrainer, t1,t2);
        ArrayList<Trainer> cTrainer=new ArrayList<>();
        Collections.addAll(cTrainer, t3,t4);
        ArrayList<Trainer> pythonTrainer=new ArrayList<>();
        Collections.addAll(pythonTrainer, t1,t2);
        ArrayList<Trainer> javaScriptTrainer=new ArrayList<>();
        Collections.addAll(javaScriptTrainer, t3,t4);
        //CREATE COURSES AND CONNECTIONS
        Course c1=new Course("JAVA", "CB13", "FullTime","2021-03-15","2021-06-15",javaStudents,javaAssignments,javaTrainer);
        Course c2=new Course("C", "CB13", "FullTime","2021-03-15","2021-06-15",cStudents,cAssignments,cTrainer);
        Course c3=new Course("PYTHON", "CB13", "FullTime","2021-03-15","2021-06-15",pythonStudents,pythonAssignments,pythonTrainer);
        Course c4=new Course("JAVASCRIPT", "CB13", "FullTime","2021-03-15","2021-06-15",javaScriptStudents,javaScriptAssignments,javaScriptTrainer);
        
        ArrayList<Course> allCoursesList=new ArrayList<>();
        Collections.addAll(allCoursesList, c1,c2,c3,c4);  
        Course.setAllCourses(allCoursesList);
    }
         
}
        
      
        