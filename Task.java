/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part2poe;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskStatus;
    private int total;
   
    
    public Task()  {
        this.total = 0;
       
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public int getTotal() {
        return this. total;
    }
   public String checkTaskDescription(String taskDescription)  {
       int description = taskDescription.length();
       String output ="";
       if (description <= 50) {
           output = "Task successfully captured";
       }
       else{
           output = "Please enter a task description of less than 50 characters";
       }
       return output;
   }
   public String createTaskID(String taskName, int taaskNumber, String developer){
       String firstName = developer.substring(0, developer.indexOf(""));
       String taskId  = taskName.substring(0,   2).toUpperCase().":" + firstname.substring(firstname.length() - 3).toUpperCase();
       
       return taskId;
   }
   public int returnTotalHours(int numTasks, int taskDuration) {
    int count = 0;
    
    if(count < numTasks) {
        this.total = taskDuration;
    }
     return this.total;
   }
    public String printTaskDetails(String taskID) {
        String output = "Task Details:" + "/n" + "Task Status:  "+ getTaskStatus() + "/n" + "Developer Details:"
                +getDeveloperDetails() +"/n"+"Task Number: "+ getTaskNumber()+"/n"+
                "Task Name: " + getTaskName()+ "/n" + "Task Description: " + getTaskDescription()+ "/n"
                +"Task ID: "+"/n" +"Task Duraqtion: "+ getTaskDuration();
        return output;
        
        public void dislay() {
            JOptionPane.showMessageDialog(null, "Total hour for all tasks: " + this.total);
            
            
        }
        
       
       
       
       
       
       
       
       
   }

}
        }
}
{
}
