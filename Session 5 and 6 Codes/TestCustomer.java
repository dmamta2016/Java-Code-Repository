/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
class Customer { 
   // Declare instance variables 
      int customerID; 
      String customerName; 
      String customerAddress; 
      int customerAge; 

 /** 
  * Declares an instance method changeCustomerAddress is created to       
  * change the address of the customer object 
  */ 
     void changeCustomerAddress(String address) { 
        customerAddress = address; 
     }

     /** 
   * Declares an instance method displayCustomerInformation is created    
   * to display the details of the customer object 
   */ 
   void displayCustomerInformation() { 
    System.out.println("Customer Identification Number: " + customerID); 
    System.out.println("Customer Name: " + customerName); 
    System.out.println("Customer Address: " + customerAddress); 
    System.out.println("Customer Age: " + customerAge); 
   } 
} 	

public class TestCustomer { 

 /** 
  * @param args the command line arguments 
  * The main() method creates the instance of class Customer 
  * and invoke its methods 
  */ 
   public static void main(String[] args) { 
    // Creates an object of the class 
       Customer objCustomer = new Customer();              
       
   // Initialize the object 
       objCustomer.customerID = 100; 
       objCustomer.customerName = "Jack"; 
       objCustomer.customerAddress = "123 Street"; 
       objCustomer.customerAge = 30;	
/* 
  * Invokes the instance method to display the details 
  * of objCustomer object 
  */ 
    objCustomer.displayCustomerInformation(); 
 /* 
  * Invokes the instance method to 
  * change the address of the objCustomer object 
  */ 
    objCustomer.changeCustomerAddress("999 Sunset Avenue"); 
 /* 
  * Invokes the instance method after changing the address field 
  * of objCustomer object 
  */ 
   // objCustomer.displayCustomerInformation(); 
    System.out.println("Modified address is: " + objCustomer.customerAddress);
  } 
} 	
