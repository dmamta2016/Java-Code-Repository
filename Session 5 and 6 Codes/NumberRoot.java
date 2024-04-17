/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
public class NumberRoot {
  /** 
   * @param args the command line arguments 
   */ 
 
   public static void main(String[] args) { 
      int cnt, square, cube; 
      // Loop continues till the remainder of the division is 0 	
      for (cnt = 1; cnt < 300; cnt++) { 
         if (cnt % 3 == 0) { 
            continue; 
         } 
      square = cnt * cnt; 
      cube = cnt * cnt * cnt; 
      System.out.printf("\nSquare of %d is %d and Cube is %d", cnt, square, cube); 
     } // End of the for loop 
   } 
} 	

