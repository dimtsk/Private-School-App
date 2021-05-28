
package Models;

import java.util.ArrayList;


public class Trainer {
    private String firstName;
    private String surName;
    private String subject;
    
    private static ArrayList<Trainer> allTrainers=new ArrayList<>();
    public Trainer() {
    }
    
    
    public Trainer(String firstName, String surName, String subject) {
        this.firstName = firstName;
        this.surName = surName;
        this.subject = subject;
    }
    public static void saveTrainer(Trainer trainer){
           allTrainers.add(trainer);
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static ArrayList<Trainer> getAllTrainers() {
        return allTrainers;
    }

    public static void setAllTrainers(ArrayList<Trainer> allTrainers) {
        Trainer.allTrainers = allTrainers;
    }

    
    //TOSTRING
    @Override
    public String toString() {
        return String.format(" %-22s%-20s%-20s", firstName, surName, subject);

    }
    
    
}
