
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
public class AcceptNumbers {   

  /** 
   * @param args the command line arguments 
   */ 
   
    public static void main(String[] args) { 
    int cnt, number; // cnt variable is a counter variable 	
for (cnt = 1, number = 0; cnt <= 10; cnt++) { 
      // Scanner class is used to accept data from the keyboard 
         Scanner input = new Scanner(System.in); 
         System.out.println("Enter a number: "); 
         number = input.nextInt(); 
         
           if (number == 0) { 
               System.out.printf("\n You entered %d numbers (excluding 0)", cnt-1); 

            // break statement terminates the loop 
               break; 
           } // End if statement 
    } // End of for statement 
  } 
} 	


