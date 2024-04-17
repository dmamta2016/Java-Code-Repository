/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
public class ForLoopWithNoInitialization {
   public static void main(String[] args) { 
  
  /* 
   * Counter variable declared and initialized outside for loop 
   */ 
    int num = 1; 	

  /* 
   * Boolean variable initialized to false 
   */ 
    boolean flag = false;
/* 
      * The for loop starts with num value 1 and continues till value of 
      * flag is not true 
      */ 
        for (; ; ) { 
            System.out.println("Value of num: " + num); 
             if (num == 5) { 
                flag = true; 
             } 
        } // End of for loop 
} 
}