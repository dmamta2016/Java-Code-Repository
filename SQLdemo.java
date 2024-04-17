/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqldbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mamta
 */
public class SQLdemo {
    public static void main(String[] args) {
  try {
String url = "jdbc:sqlserver://127.0.0.1:1433; instanceName=localhost\\SQLEXPRESS; databaseName=LibraryDB";
Connection cn = DriverManager.getConnection(url, "sa", "playware");
Statement st = cn.createStatement();
ResultSet rs = st.executeQuery("SELECT BookName FROM Books");
while(rs.next()){
String name=rs.getString("BookName");
System.out.println(name);
}
} catch (SQLException ce) {
     System.out.println(ce.getMessage());
}
    }
}
