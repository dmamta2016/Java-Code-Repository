/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import com.sun.rowset.CachedRowSetImpl;
import com.sun.rowset.JdbcRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class ProcedureDemo {

    public void createJdbcRowSetWithRowSetFactory(String username, String password) throws SQLException {
Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "");
con.setAutoCommit(false);
CachedRowSet crs = new CachedRowSetImpl();

crs.setUsername("root");
crs.setPassword("");
crs.setUrl("jdbc:mysql://127.0.0.1:3306/test");
crs.setCommand("Select * From EmpLeave");
crs.execute();
   
    while (crs.next()) {
    if (crs.getInt("EMP_NO") == 222) {
        
        crs.deleteRow();
        System.out.println("deleted");
        crs.moveToCurrentRow();
crs.acceptChanges(con);
   
        break;

}
        }
     
    }

    public static void main(String args[]) {
        ProcedureDemo pd = new ProcedureDemo();
        try {
            pd.createJdbcRowSetWithRowSetFactory("root", "");
        } catch (SQLException ce) {
            ce.printStackTrace();
        }
    }
}
