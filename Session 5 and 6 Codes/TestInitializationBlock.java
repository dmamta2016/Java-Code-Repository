/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamta
 */
 class Account { 
  private int accountID; 
  private String holderName; 
  private String accountType; 
 
  /** 
   * Initialization block 
   */ 
  { 
    accountID = 100; 
    holderName = "John Anderson"; 
    accountType = "Savings"; 
  } 	
/** 
   * Displays the details of Account object 
   */ 
     public void displayAccountDetails() { 
      System.out.println("Account Details"); 
      System.out.println("==============="); 
      System.out.println("Account ID: " + accountID + "\nAccount Type: " + accountType); 
     } 
} 
public class TestInitializationBlock { 
  /** 
   * @param args the command line arguments 
   */ 
   public static void main(String[] args) { 
     Account objAccount = new Account(); 
     objAccount.displayAccountDetails(); 
   } 
} 	

