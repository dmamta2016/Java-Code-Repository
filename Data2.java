import com.sun.rowset.JdbcRowSetImpl;
import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.JdbcRowSet;
public class Data2 {
 
public static void main(String args[]) throws ClassNotFoundException, SQLException{
    
    
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
// Establishing the connection
    
    Connection con = DriverManager.getConnection("jdbc:odbc:demo", "sa", "playware");
Statement st = con.createStatement();
   

CallableStatement cs = con.prepareCall("{call getData(?, ?)}");
  cs.registerOutParameter(1, java.sql.Types.INTEGER);
  cs.registerOutParameter(2, java.sql.Types.DECIMAL, 3);
  cs.executeQuery();
  int x = cs.getInt(1);
  java.math.BigDecimal n = cs.getBigDecimal(x);

JdbcRowSet jrs2;
jrs2= new JdbcRowSetImpl();
jrs2.setUsername("sa");
jrs2.setPassword("playware");
jrs2.setUrl("jdbc:sqlserver://");
jrs2.setCommand("Select * from Employees");
jrs2.execute(); 
}
}