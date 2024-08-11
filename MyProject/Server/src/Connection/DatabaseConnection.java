package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DatabaseConnection {
	private static DatabaseConnection instance;
	private Connection connection;
	
	
	public static DatabaseConnection getInstance() {
		if (instance == null) {
			instance= new DatabaseConnection();
		}
		return instance;
		
	}
	
	private DatabaseConnection () {
		
	}
	
	public void connectToDatabase () throws SQLException, ClassNotFoundException {

		String user = "sa";
		String password = "123";
		try {
            // Load driver JDBC của SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=chat_application;trustServerCertificate=true", user, password);
            if (connection != null) {
                System.out.println("Kết nối dữ liệu thành công.");
            } else {
                System.out.println("Không thể kết nối đến DB");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối đến cơ sở dữ liệu: " + e.getMessage());
        }
		
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			DatabaseConnection.getInstance().connectToDatabase();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
