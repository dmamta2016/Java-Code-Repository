/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademo;

/**
 *
 * @author mamta
 */
class Animal {
 void getMessage() {
 System.out.println("Message from Animal.");
 }
}
class Dog extends Animal {
 @Override
 void getMessage() {
 System.out.println("Bow-wow! Message from Dog.");
 }
}
class Cat extends Animal {
 @Override
 void getMessage() {
 System.out.println("Meow! Message from Cat.");
 }
}
public class MethodOverridingDemo {
 public static void main(String[] args) {
 Animal animal1 = new Dog(); 
