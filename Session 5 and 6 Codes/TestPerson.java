/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */

class Person { 
  private String name = "John"; 
  private int age = 12; 
  
  void displayDetails() { 
    System.out.println("Person Details"); 
    System.out.println("=============="); 
    System.out.println("Person Name: " + name); 	
   }
}	

public class TestPerson {
    /** 
    * @param args the command line arguments 
    */ 
     public static void main(String[] args) { 
      Person objPerson1 = new Person(); 
      objPerson1.displayDetails(); 
     } 
} 