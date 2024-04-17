/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rowsetdemo;

/**
 *
 * @author mamta
 */
import com.sun.rowset.JdbcRowSetImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;


/**
 * RowSet is a new word (since Java 5.0) in light-weight configuration of JDBC connection
 */
public class RowSetDemo {


    //public static final String URL = "jdbc:sqlserver://127.0.0.1/";
    
    
            public static void main(String[] args) throws Exception {
                
   //String url = "jdbc:sqlserver://127.0.0.1:1433; instanceName=LAPTOP-T09FUJJI\\SQLEXPRESS;databaseName=BankDB";

    String url = "jdbc:sqlserver://127.0.0.1:1433;";
  Connection connection = DriverManager.getConnection(url, "sa", "playware");
		 
		
		//Statement statement = connection.createStatement();
		JdbcRowSet jdbcRowSet;
		jdbcRowSet = new JdbcRowSetImpl(connection);
                System.out.println("Connection Done");
		//jdbcRowSet.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);
		String queryString = "SELECT * FROM [dbo].[spt_monitor]";
		jdbcRowSet.setCommand(queryString);
		jdbcRowSet.execute();
                System.out.println("Connection Done again");
		jdbcRowSet.addRowSetListener(new ExampleListener());
		while (jdbcRowSet.next()) {
			// Generating cursor Moved event
			System.out.println("EMP_NO " + jdbcRowSet.getInt(2));
			//System.out.println("name- " + jdbcRowSet.getString(2));
		}
		connection.close();
	}
}

class ExampleListener implements RowSetListener {

	@Override
	public void cursorMoved(RowSetEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Cursor Moved Listener");
		System.out.println(event.toString());
	}

	@Override
	public void rowChanged(RowSetEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Cursor Changed Listener");
		System.out.println(event.toString());
	}

	@Override
	public void rowSetChanged(RowSetEvent event) {
		// TODO Auto-generated method stub
		System.out.println("RowSet changed Listener");
		System.out.println(event.toString());
	}
}