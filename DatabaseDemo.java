import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseDemo{
public static void main(String[] args) throws SQLException, ClassNotFoundException{ 
     Class.forName("com.mysql.jdbc.Driver");
Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/log4jlog", "root", "root");
Statement st = cn.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM applicationlog");
}
}