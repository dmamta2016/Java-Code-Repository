/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
public class ForLoopWithComma {
   /** 
   * @param args the command line arguments 
   */ 	
   public static void main(String[] args) { 
    int i, j; 
    int max = 10; 
     /* 
      * The initialization and increment/decrement section includes 
      * more than one variable 
      */ 
      for (i = 0, j = max; i <= max; i++, j--) { 
         System.out.printf("\n%d + %d = %d", i, j, i + j); 
      } 
  } 
}

