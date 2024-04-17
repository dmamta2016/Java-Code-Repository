/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqldbdemo;

import com.sun.rowset.JdbcRowSetImpl;
import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;

public class MYSQLDBDemo {   
    public static void main(String[] args) {
        try {
            JdbcRowSet jrs2 = new JdbcRowSetImpl();
            jrs2.setUsername("root");
            jrs2.setPassword("");
            jrs2.setUrl("jdbc:mysql://127.0.0.1:3306/test");
            jrs2.setCommand("Select * from Employee");
            jrs2.execute();
            while(jrs2.next()){
            System.out.println(jrs2.getInt(1));
            }
            /*jrs2.moveToInsertRow();
            jrs2.updateInt("EMP_NO", 1449);
jrs2.updateString("NAME", "Homer Smith");
jrs2.updateInt("SALARY", 449);
jrs2.updateFloat("RATING", 7.99f);
jrs2.insertRow();*/
  jrs2.last();
  jrs2.deleteRow();
            
            /*jrs2.absolute(3);
jrs2.updateFloat("Rating", 15.75f);
jrs2.updateRow();  */
        } catch (SQLException se) {
            System.out.println("error: " + se.getMessage());
        }
    }
}