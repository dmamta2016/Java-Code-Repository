/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
public class DisplayPattern {
    

  /** 
   * @param args the command line arguments 
   */ 

    public static void main(String[] args) { 
     int row, col; 	

    // The outer for loop executes 5 times 
       
        for (row = 1; row <= 5; row++) {
               /* 
    * For each iteration, the inner for loop will execute from col = 1 
    * and will continue, till the value of col is less than or equal to row 
    */ 
       for (col = 1; col <= row; col++) { 
          System.out.print(" * "); 
       } // End of inner for loop 
          
          System.out.println(); 
    } // End of outer for loop 
  } 
}    