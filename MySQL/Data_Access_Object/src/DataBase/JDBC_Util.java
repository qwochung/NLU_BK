package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class JDBC_Util {
	public static Connection getConnection () {
		Connection connection = null ;
		try {
			DriverManager.deregisterDriver( new Driver());
			String url = "jdbc:mySQL://localhost:3306/book";
			String userName = "root";
			String paswd = "";
			
			connection = DriverManager.getConnection(url, userName, paswd);

			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return connection;
		
	}

	
	
	public static void closeConnection ( Connection c) {
		
		try {
			if ( c != null) {
				
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
}
