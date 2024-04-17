/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademo;

import com.sun.rowset.JdbcRowSetImpl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.*;

/**
 *
 * @author mamta
 */
public class JavaDemo {

    public void createJdbcRowSetWithRowSetFactory(
            String username, String password) throws SQLException {
        /*RowSetFactory myRowSetFactory = null;
        JdbcRowSet jdbcRs = null;
        ResultSet rs = null;
        Statement stmt = null;
        try {
            myRowSetFactory = RowSetProvider.newFactory();
            jdbcRs = myRowSetFactory.createJdbcRowSet();
            jdbcRs.setUrl("jdbc:sqlserver://127.0.0.1:1433/BankDB");
            
           // jdbcRs.setUrl("jdbc:myDriver:myAttribute");
            jdbcRs.setUsername(username);
            jdbcRs.setPassword(password);
            
            jdbcRs.setCommand("desc spt_monitor");
            jdbcRs.execute();
            //while(jdbcRs.next()){
            //System.out.println(jdbcRs.getInt(0));
           // }
            // ...
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
        }*/
            
            
            
             JdbcRowSet rowSet = new JdbcRowSetImpl();

// Or
rowSet.setUrl("jdbc:sqlserver://127.0.0.1:1433/BankDB");
rowSet.setUsername(username);
rowSet.setPassword(password);

rowSet.setCommand("SELECT EMP_NO FROM Employee");
rowSet.execute();

while (rowSet.next()) {
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
try{
        JavaDemo jd= new JavaDemo();
        jd.createJdbcRowSetWithRowSetFactory("sa", "playware");
    }
catch(Exception e){
    e.printStackTrace();
     //System.out.println();
}
}
}

        //String url = "jdbc:sqlserver://127.0.0.1:1433; instanceName=LAPTOP-T09FUJJI\\SQLEXPRESS;databaseName=BankDB";

       // Connection cn = DriverManager.getConnection(url, "sa", "playware");

        //tatement st = cn.crejdbc:sqlserver://127.0.0.1:1433ateStatement();
        ////// ResultSet rs = st.executeQuery("Select * From Employee");
        // JdbcRowSet jRs = new JdbcRowSetImpl(rs);
        /*JdbcRowSet jrs2 = new JdbcRowSetImpl();
        jrs2.setUsername("sa");
        jrs2.setPassword("playware");
        jrs2.setUrl(";databaseName=BankDB");*/

//jrs2.setDataSourceName("BankDB");
       // jrs2.setCommand("SELECT CAST(GETDATE() AS DATE)");
      //  jrs2.execute();
//String s= jrs2.getDataSourceName();
//System.out.println(jrs2.);
//jrs2.execute();
    


/* cn.setAutoCommit(false);
        // Create an instance of Statement object
 Statement st = cn.createStatement();
int rows = st.executeUpdate("INSERT INTO EMPLOYEE (NAME) VALUES (\'Peter Smith\')");
// Set the Savepoint
Savepoint svpt = cn.setSavepoint("SAVEPOINT_1");
cn.releaseSavepoint(svpt);
rows = st.executeUpdate("INSERT INTO EMPLOYEE (NAME) VALUES (\'Michael Jones\')");
//cn.rollback(svpt);
System.out.println("Contents of the table");
 ResultSet     rs = st.executeQuery("select * from EMPLOYEE");

      System.out.println("Save point released");
//cn.releaseSavepoint (svpt);
        
     } catch (SQLException ce) {
            System.out.println("error: " + ce.getMessage());
        }
    }
}    
        
 */
 /*
        // TODO code application logic here
        try {
            String url = "jdbc:sqlserver://127.0.0.1:1433; instanceName=LAPTOP-T09FUJJI\\SQLEXPRESS;databaseName=Traders";
           
            Connection cn = DriverManager.getConnection(url, "sa", "playware");
            PreparedStatement updateSales = null;
            PreparedStatement updateTotal = null;
            String updateString = "update " +  ".COFFEES " + "set SALES = ? where COF_NAME = ?";
            String updateStatement = "update " +  ".COFFEES " + "set TOTAL = TOTAL + ? "
                    + "where COF_NAME = ?";
            cn.setAutoCommit(false);
            updateSales = cn.prepareStatement(updateString);
            updateTotal = cn.prepareStatement(updateStatement);
            updateSales.setInt(1, 104);
            updateSales.setString(2,"Colombian" );
            updateSales.executeUpdate();
            updateTotal.setInt(1, 103);
            updateTotal.setString(2, "French_Roast_Decaf");

            updateSales.setInt(1, 100);
            updateSales.setString(2, "French_Roast");
            updateSales.executeUpdate();

// changes SALES column of Espresso row to 100
// (the first parameter stayed 100, and the second
// parameter was reset to "Espresso")
            updateSales.setString(2, "Espresso");
            updateSales.executeUpdate();
            updateTotal.executeUpdate();
            cn.commit();
        } catch (SQLException ce) {
            System.out.println("error: " + ce.getMessage());
        }
    }
}*/
