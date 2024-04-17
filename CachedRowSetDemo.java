package cachedrowsetdemo;

import java.sql.*;
import java.util.*;
class CachedRowSetDemo { 
    Connection con; 
    String url, serverName, instanceName,databaseName, userName,  password,  sql; 
  CachedRowSetDemo() { 
     url = "jdbc:sqlserver://"; 
      serverName = "127.0.0.1:1433"; 
      instanceName = "LAPTOP-T09FUJJI\\SQLEXPRESS"; 
      databaseName = "BankDB"; 
      userName = "sa"; 
      password = "playware"; 
  }
 private String getConnectionUrl() { 
  // Constructing the connection string 
 //return url + serverName + "instanceName=\""+instanceName +"\";DatabaseName=\"" +databaseName+"\""; 
 
 return url + serverName + ";instanceName = " +instanceName +" ;DatabaseName = " +databaseName; 
 } 
 private java.sql.Connection getConnection() { 
   try { 
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
 CallableStatement cstmt = con.prepareCall("{call recalculatetotal (?, ?)}"); 
    cstmt.setInt(1,2500); 
    cstmt.registerOutParameter(2, java.sql.Types.INTEGER); 
    cstmt.execute();
    int maxSalary = cstmt.getInt(2);
    System.out.println(maxSalary); 
  } catch(SQLException ce) { 
        System.out.println(ce); 
 } 
 }  
 public static void main(String args[]) { 
 CachedRowSetDemo proObj = new CachedRowSetDemo(); 
    proObj.display(); 
 }
}