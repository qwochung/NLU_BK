package DataBase;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBC_Util {


	// BƯỚC 1 : TẠO KẾT NỐI

	public static Connection getConnection() {
		Connection connection = null;

		try {
			// Đăng kí MySQL với DriverManager

			DriverManager.registerDriver(new Driver());

			String url = "jdbc:mySQL://localhost:3306/quanlysinhvien";
			String userName = "root";
			String paswd = "";

			connection = DriverManager.getConnection(url, userName, paswd);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}

	
	
			
			
	
	
	
	
	
	
	
	
	
	// BƯỚC 5 : NGẮT KẾT NỐI
	
	
	public static void closeConnection(Connection c) {
		try {
			if (c != null) {
				c.close();
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	
	
	public static void printInfo (Connection connection) {
		try {
			
			if (connection != null) {
				
				 DatabaseMetaData mtdt = connection.getMetaData()	;
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
