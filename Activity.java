/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitysystem;

import java.util.ArrayList; 
import java.util.List; 

public class Activity {
    
    private int activityID; 
    private String activityName;  
    private List<Student> participants; 

    public Activity(int activityID, String activityName, List<Student> participants) {
        this.activityID = activityID;
        this.activityName = activityName;
        this.participants = participants;
    }
    
    
    
    
}
 