package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class BasicDatabaseDemo {

    public static void main(String args[]) {
        try {
            
//            String url = "jdbc:sqlserver://127.0.0.1:1433; instanceName=FUJI\\SQLEXPRESS;databaseName=BankDB";
//Connection con = DriverManager.getConnection(url, "sa", "playware");
  //          System.out.println("Connection successfully established"); 
            
Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "");
PreparedStatement pst = cn.prepareStatement("SELECT EMP_NO, SALARY FROM EMPLOYEE WHERE EMP_NO = ?",ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
pst.setString(1, "155");

int empnum;
int sal;
ResultSet rs = pst.executeQuery();
while (rs.next()) {
               empnum = rs.getInt("EMP_NO"); //previously defined variable of type int
                sal = rs.getInt("SALARY");   //previously defined variable of type int
                System.out.println(empnum);
                System.out.println(sal);
            }

            
Statement st1 = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,   ResultSet.CONCUR_UPDATABLE);

   // Create an updatable result set
        ResultSet rs2 = st1.executeQuery("SELECT EMP_NO, NAME, SALARY, RATING FROM EMPLOYEE");
// Move cursor to insert row
/*rs2.moveToInsertRow();
rs2.updateString(2, "William Ferris");
rs2.updateInt(1, 244);
rs2.updateInt(3,400);
rs2.updateFloat(4, 4.5f);
//rs2.updateInt(0, 354);
rs2.insertRow();*/
    rs2.last();
    rs2.deleteRow();
    
    
    String createProcedure = "Create Procedure DISPLAY_PRODUCTS " + "as " + "select PRODUCTS.PRD_NAME, COFFEES.COF_NAME " + "from PRODUCTS, COFFEES " + "where PRODUCTS.PRD_ID = COFFEES.PRD_ID " + "order by PRD_NAME";
Statement st = cn.createStatement();
// Execute the stored procedure
   st.executeUpdate(createProcedure);
        } catch (SQLException ce) {
            System.out.println(ce.getMessage());
        }
    }
}