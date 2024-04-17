/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
public class NumberDivision { 

 /**
  * @param args the command line arguments 
  */ 
  public static void main(String[] args) { 
    int number = 11, remainder; 
    
    // % operator to return the remainder of the division 
    remainder = number % 2; 
    if (remainder == 0) { 
        System.out.println("Number is even"); 
    } else { 
        System.out.println("Number is odd"); 
    } 
  } 
} 	

