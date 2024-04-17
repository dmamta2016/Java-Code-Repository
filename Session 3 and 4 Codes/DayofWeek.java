
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
public class DayofWeek { 

  /** 
   * @param args the command line arguments 
   */ 
   public static void main(String[] args) { 
 String day; 
Scanner s = new Scanner(System.in);
System.out.println("Enter day:");
day = s.next();
System.out.println(day);
     // switch statement contains an expression of type String 
  
      switch (day) { 	
         case "Sunday": 
                       System.out.println("First day of the Week"); 
                       break; 
         case "Monday": 
                      System.out.println("Second Day of the Week"); 
                      break;	
         case "Tuesday": 
                      System.out.println("Third Day of the Week"); 
                      break; 
         case "Wednesday": 
                      System.out.println("Fourth Day of the Week"); 
                      break; 
         case "Thursday": 
                      System.out.println("Fifth Day of the Week"); 
                      break; 
         case "Friday": 
                      System.out.println("Sixth Day of the Week"); 
                      break; 
         case "Saturday": 
                      System.out.println("Seventh Day of the Week"); 
                      break; 
         default: 
                     System.out.println("Invalid Day"); 
         }// End of switch-case statement 
  
   
  
   } 	
}
