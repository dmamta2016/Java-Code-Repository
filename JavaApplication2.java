/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mamta
 */

class JavaApplication2 { 
    Connection con; 
    String url; 
    String serverName; 
    String instanceName; 
    String databaseName; 
    String userName; 
    String password; 
    String sql; 
  JavaApplication2() { 
      url = "jdbc:sqlserver://"; 
      serverName = "127.0.0.1:1433"; 
      instanceName = "LAPTOP-T09FUJJI\\SQLEXPRESS"; 
      databaseName = "BankDB"; 
      userName = "sa"; 
      password = "playware"; 
  }
 
 private String getConnectionUrl() { 
  // Constructing the connection string 
 return url + serverName + ";instanceName = " +instanceName +" ;DatabaseName = " +databaseName; 
 } 
 private java.sql.Connection getConnection() { 
   try { 
 //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 

 // Establishing the connection 
      con = DriverManager.getConnection(getConnectionUrl(), userName, password); 
      if(con != null) 
        System.out.println("Connection Successful!"); 
   } catch(Exception e) {
          e.printStackTrace(); 
          System.out.println("Error Trace in getConnection(): " 
          + e.getMessage()); 
   } 
     return con; 
} 
 public void display(){ 
  try { 
    con = getConnection(); 
    /*CallableStatement cstmt = con.prepareCall("{call recalculatetotal (?, ?)}"); 
    cstmt.setInt(1,2500); 
    cstmt.registerOutParameter(2, java.sql.Types.INTEGER); 
    cstmt.execute();
    int maxSalary = cstmt.getInt(2);
    System.out.println(maxSalary); */
    
    String sqlStmt = "UPDATE Employee SET NAME = ?   WHERE EMP_NO LIKE ?";
PreparedStatement pStmt = con.prepareStatement(sqlStmt);
pStmt.setInt(2, 5000);
pStmt.setString(1, "Park Smith");
pStmt.executeUpdate();


  } catch(SQLException ce) { 
        System.out.println(ce); 
 } 
 }  
 public static void main(String args[]) { 
 JavaApplication2 proObj = new JavaApplication2(); 
    proObj.display(); 
 }
}



