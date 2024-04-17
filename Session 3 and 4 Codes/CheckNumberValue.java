/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
public class CheckNumberValue { 
/** 
 * @param args the command line arguments 
 */ 
 public static void main(String[] args) { 
  int first = 400, second = 700, result; 
  result = first + second; 	

 // Evaluates the value of result variable 
    if (result > 1000) { 
          second = second + 100; 
          System.out.println("result is greater than 1000"); 
    } 
    else
    {
        if(result>500)
        {
    System.out.println("result is greater than 500 but less than 1000"); 
        }
    }
  System.out.println("The value of second is " + second); 
 } 
} 	
