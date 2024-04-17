/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
    
class Employee { 
  // Declares instance variables 
     String employeeName; 
     int employeeAge; 
     double employeeSalary; 
     boolean maritalStatus; 
  /** 
   * Accesses the instance variables and displays 
   * their values using the println() method 
   */ 
    void displayEmployeeDetails() {	
        System.out.println("Employee Details"); 
        System.out.println("================"); 
        System.out.println("Employee Name: " + employeeName); 
        System.out.println("Employee Age: " + employeeAge); 
        System.out.println("Employee Salary: " + employeeSalary); 
        System.out.println("Employee MaritalStatus:" + maritalStatus); 
    } 
} 
public class TestEmployee { 
 /** 
   * @param args the command line arguments 
   */ 
   public static void main(String[] args) { 
    // Instantiates an Employee object and initializes it 
       Employee objEmp = new Employee(); 

    // Invokes the displayEmployeeDetails() method 
       objEmp.displayEmployeeDetails(); 
   } 
} 