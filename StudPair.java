/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericapplication;

/**
 *
 * @author mamta
 */
import java.util.*;
class StudPair<T, U> { 
private T name; 
private U rollNumber; 
public StudPair(T nmObj, U rollNo) { 
this.name = nmObj; 
this.rollNumber = rollNo; 
} 
public T displayName() { 
return name; 
} 
public U displayNumber() { 
return rollNumber; 
} 
public static void main(String [] args) { 
    
StudPair<String, Integer> studObj = new StudPair<>("John",2); 
System.out.println("Student Name:"); 
System.out.println(studObj.displayName()); 
System.out.println("Student Number:"); 
System.out.println(studObj.displayNumber()); 
}
}
