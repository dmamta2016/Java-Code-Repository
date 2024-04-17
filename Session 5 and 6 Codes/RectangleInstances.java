/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */

class NewRectangle { 
  int width; 
  int height; 	
 
 /** 
  * A no-argument constructor for NewRectangle class 
  */ 
 
   NewRectangle() { 
     System.out.println("Constructor Invoked..."); 
     width = 10; 
     height = 10; 
   }

   
   NewRectangle (int wid, int heig) { 
        System.out.println("Parameterized Constructor Invoked"); 
        width = wid; 
        height = heig; 
     }  

  /** 
   * This method displays the dimensions of the Rectangle object 
   */ 
     void displayDimensions(){ 
       System.out.println("Width: " + width);	
       System.out.println("Width: " + height); 
     } 
}

   
public class RectangleInstances { 

  /**  
   * @param args the command line arguments 
   */ 
    
   public static void main(String[] args) { 
    // Declare and initialize two objects for Rectangle class 
       NewRectangle objRec1 = new NewRectangle(10, 20); 
       NewRectangle objRec2 = new NewRectangle(6, 9); 

// Invokes displayDimensions() method to display values 
       System.out.println("\nRectangle1 Details"); 
       System.out.println("==================="); 
       objRec1.displayDimensions(); 
       System.out.println("\nRectangle2 Details"); 
       System.out.println("==================="); 
       objRec2.displayDimensions(); 
   } 
} 