package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class odbcdemo { 
    Connection con; 
    String url; 
    String serverName; 
    String instanceName; 
    String databaseName; 
    String userName; 
    String password; 
    String sql; 
   
 public static void main(String args[]) {
  try { 
       // Class.forName("jdbc.odbc.JdbcOdbcDriver");
          Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "");
         System.out.println("Connection successfully established");
Statement st = cn.createStatement();
 ResultSet rs = st.executeQuery("SELECT * FROM employee");
 while(rs.next()){
            System.out.println(rs.getInt(1));
            }
  }
  catch(SQLException ce) { 
        System.out.println(ce.getMessage() ); 
 } 
 }
}