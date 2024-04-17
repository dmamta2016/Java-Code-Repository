/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
class Rectangle { 
int width; 
int height; 	

  /** 
   * Constructor for Rectangle class 
   */ 
     Rectangle() { 
      width = 10; 
      height = 10; 
     } 
}

public class TestConstructor { 
 /** 
  * @param args the command line arguments 
  */ 
   public static void main(String[] args) { 
    // Instantiates an object of the Rectangle class 
       Rectangle objRec = new Rectangle(); 	

    // Accesses the instance variables using the object reference 
       System.out.println("Width: " + objRec.width); 
       System.out.println("Height: " + objRec.height); 
   } 
}

