/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
public class NewClass {
    
 private static String message = "Hello!";
 public static String getMessage(){
 message="Hello! Hello!";
 return NewClass.message;
 }
 public static void main(String[] args) {
 message="Hello! Hello! Hello!";
 String msg = NewClass.getMessage();
 System.out.println(msg);
 }
 static {
 System.out.println(NewClass.getMessage());
 }
}