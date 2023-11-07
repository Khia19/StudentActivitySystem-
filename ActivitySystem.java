
package activitysystem;

import java.util.ArrayList; 
import java.util.List; 
                
public class ActivitySystem {
    
    private List<Student> students; 
    private List<Activity> activities; 
    
    public ActivitySystem () {
        
        students = new ArrayList <>(); 
        activities = new ArrayList <>(); 
    }
    
    public void addStudent (Student student) { 
        
        students.add(student); 
    }
     public void addActivity (Activity activity) { 
        
        activities.add(activity);      
    }
    public List<Student> getAbsentees (Activity activity) { 
        
      List<Student> absentees = new ArrayList<>(); 
      
      for (Student student: students) {
              absentees.add(student);
              
              return absentees;  
          }
 
       public class Main {
           
           public static void main(String[] args) {
               ActivitySystem activitySystem = new ActivitySystem(); 
               
               Student student1 = new Participant(1, "Khia"); 
               Student student2 = new Participant(2, "Raiza"); 
               Student student3 = new Participant(3, "Angeli"); 
               
               Activity activity1 = new Activities(1,"Webinar");
               Activity activity2 = new Activities(2, "Seminar"); 
               Activity activity3 = new Activities(3, "First Friday Mass"); 
               
               activitySystem.addStudent(student1);
               activitySystem.addStudent(student2);
               activitySystem.addStudent(student3); 
               
               activitySystem.addActivity(activity1);
               activitySystem.addActivity(activity2);
               activitySystem.addActivity(activity3);
               
               List<Students> absentees = activitySystem.getAbsentees(activity1)
               
               System.out.printIn("Absentees for " + activity1.getActivityName() + ";"); 
                for (Student student : absentees) {
                    
                    System.out.println(student.getFirstName() + " "student.getLastName());
                    
                    
                }
             
               
           }
       } 
        

