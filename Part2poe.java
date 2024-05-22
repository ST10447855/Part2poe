/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Part2poe;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class Part2poe {



   

    

    
    public static void main(String[] args) {
        //Declaration
       String taskname;
       int tasknumber;
       String developerDetails;
       String taskDescription;
       int taskDuration;
       String taskStatus;
       int total;
       String lastname = null;
       
       Login login = new Login();
       Scanner input = new Scanner (System.in);
       
       //input
       System.out.println("Enter taskname");
       taskname = input.nextLine();
       System.out.println("Enter the tasknumber");
       tasknumber = input.nextInt();
       System.out.println("Enter the developerdetails");
       developerDetails = input.nextLine();
       System.out.println("Enter the taskDuration");
       taskDuration = input.nextInt();
       System.out.println("Enter the taskStatus");
       taskStatus = input.nextLine();
       System.out.println("Enter the lastname");
       login.setlastname(lastname);
       login.checklastname();
       
        //Output
        if(login.returnLoginStatus().equals(login.RegisterUser())){
            System.out.println("registratiuon Successful");
        }
        else {
            System.out.println("registration failed");
        }
        System.out.println("LOGIN");
        
        login.RegisterUser();
        login.returnLoginStatus();
        
        //output
        if(login.RegisterUser().equals(login.returnLoginStatus())){
            String firstname = null;
       
        System.out.println(firstname 
                + "welcometo Kanban : " + lastname) ;
        }
       else{
            String fisrtname = null;
                System.out.println("Username or password incorrect please try again:" + fisrtname);
                }
    }

   
       
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
                
    
        
    }
    
        
   
        
       
            
       





    

