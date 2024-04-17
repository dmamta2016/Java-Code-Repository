/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */

 class Rectangles { 
  // Declares instance variables 
     private int width; 
     private int height; 
  /** 
   * Declares a no-argument constructor 
   */ 
    public Rectangles() { 
     System.out.println("Constructor Invoked..."); 
     width = 10; 
     height = 10; 
    } 
/** 
   * Declares a parameterized constructor with two parameters 
   * @param wid 
   * @param heig 
   */ 

    public Rectangles (int wid, int heig) { 
     System.out.println("Parameterized Constructor Invoked..."); 
     width = wid; 
     height = heig; 
    } 
  
  /** 
   * Displays the dimensions of the Rectangle object 
   */ 
   public void displayDimensions(){
    System.out.println("Width: " + width); 
    System.out.println("Width: " + height); 
   } 
} 

public class RectangleTest {
    public static void main(String[] args) { 
    
       Rectangles objRec1 = new Rectangles(10, 20); 
       Rectangles objRec2 = new Rectangles(6, 9); 
       
     //  System.out.println(objRec1.width); // will result in compiler error
}
}
