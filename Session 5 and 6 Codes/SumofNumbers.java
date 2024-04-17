/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
public class SumofNumbers { 
  /** 
   * @param args the command line arguments 
   */ 
   public static void main(String[] args) { 
    int num = 100, sum = 0; 
    
    /** 
     * The body of the loop is executed first, then the condition is      
     * evaluated 
     */	
     do { 
        sum = sum + num; 
         num++;
         System.out.println("iteration");
     } while (num <= 10); 

     // Prints the value of variable after the loop terminates 
        System.out.printf("Sum of 10 Numbers: %d\n", sum); 
   } 
} 

