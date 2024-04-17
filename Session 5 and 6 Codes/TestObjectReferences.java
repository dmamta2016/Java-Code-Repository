/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */

public class TestObjectReferences { 

   /** 
    * @param args the command line arguments 
    */ 
     public static void main(String[] args) { 
      
      /* Instantiates an object of type Rectangle and stores 	
       * its reference in the object reference variable, objRec1 
       */ 
         NewRectangle objRec1 = new NewRectangle(10, 20); 
      
        // Declares a reference variable of type Rectangle 
         NewRectangle objRec2;       

     // Assigns the value of objRec1 to objRec2 
        objRec2 = objRec1; 
        System.out.println("\nRectangle1 Details"); 
        System.out.println("==================="); 

      /* Invokes the method that displays values of the 
       * instance variables for object, objRec1 
       */ 
        objRec1.displayDimensions(); 
        System.out.println("\nRectangle2 Details"); 
        System.out.println("==================="); 
        objRec2.displayDimensions(); 
    } 
} 
