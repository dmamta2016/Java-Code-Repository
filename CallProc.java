import java.sql.*; import java.util.*; 
class CallProc {
Connection con;
String url;
String serverName; String instanceName; String databaseName; String userName; String password; String sql;
CallProc() {
url = "jdbc:sqlserver://"; serverName = "10.2.1.51"; instanceName = "martin"; databaseName = "DeveloperApps"; userName = "sa";
password = "playware";
}
private String getConnectionUrl() {
// Constructing the connection string
return url + serverName + ";instanceName = " +instanceName +" ;DatabaseName = " +databaseName;
}
private java.sql.Connection getConnection() {
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
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
cstmt.registerOutParameter(2, java.sql.Types.INTEGER); cstmt.execute();
int maxSalary = cstmt.getInt(2); System.out.println(maxSalary);
} catch(SQLException ce) { System.out.println(ce);
 }
}
public static void main(String args[]) { CallProc proObj = new CallProc();
proObj.display();
}
}