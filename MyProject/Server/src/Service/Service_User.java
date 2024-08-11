package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import Connection.DatabaseConnection;
import Model.Model_Client_Server;
import Model.Model_Login_Server;
import Model.Model_Message_Server;
import Model.Model_Register_Server;
import Model.Model_User_Account_Server;

public class Service_User {
	
	// Instance
	private final Connection connection;

	// SQL
	private final String SELECT_USER_ACCOUNT = "SELECT UserID, UserName, Gender, ImageString FROM [user_account] WHERE [user_account].Status = 1 AND [user_account].UserID <> ?";
	private final String LOGIN= "SELECT [user].UserID ,[user_account].UserName , Gender ,ImageString  FROM  [chat_application].[dbo].[user] JOIN  [chat_application].[dbo].[user_account]"
			+ " ON [chat_application].[dbo].[user].UserID =  [chat_application].[dbo].[user_account].UserID"
			+ "  WHERE  CAST([user].UserName AS VARBINARY(MAX)) = CAST(? AS VARBINARY(MAX)) "
			+ "  AND CAST([user].Password AS VARBINARY(MAX)) = CAST(? AS VARBINARY(MAX))"
			+ "  AND [user_account].Status = 1; ";
	
	
//	private final String LOGIN= "SELECT [user].UserID ,[user_account].UserName , [user_account].Gender ,[user_account].ImageString  FROM  [user] JOIN  [user_account]"
//			+ " ON [user].UserID = [user_account].UserID"
//			+ " WHERE  [user].UserName ='q' ";
	private final String INSERT_USER = "insert into [user](UserName,Password) values (?,?)";
	private final String INSERT_USER_ACCOUNT = "insert into [user_account](UserID,UserName ) values (?,?)";
	private final String CHECK_USER = "select top 1 UserID from [user] where UserName =? ";
	
	
	public Service_User() {
		super();
		this.connection = DatabaseConnection.getInstance().getConnection();
	}

	
	
	public Model_Message_Server register(Model_Register_Server register_Server) {
		// Check user exit

		Model_Message_Server message = new Model_Message_Server();
		java.sql.PreparedStatement p;
		try {
			p = connection.prepareStatement(CHECK_USER);
			
			p.setString(1, register_Server.getUserName());
			ResultSet resultSet = p.executeQuery();
			
			if (resultSet.next()) {
				message.setAction(false);
				message.setMessage("User Already Exit");						

			}
			else {
				message.setAction(true);
			}
			resultSet.close();
			p.close();
			
			
			if (message.isAction()) {
				// Insert User register
				connection.setAutoCommit(false);
				p = connection.prepareStatement(INSERT_USER, PreparedStatement.RETURN_GENERATED_KEYS);
				p.setString(1, register_Server.getUserName());
				p.setString(2, register_Server.getPassword());
				p.executeUpdate();
				resultSet= p.getGeneratedKeys(); // Get the id of the newly created user
				resultSet.next();
				int userID = resultSet.getInt(1);

//				p.close();
				
				
				// Creat user account
				p = connection.prepareStatement(INSERT_USER_ACCOUNT);
				p.setInt(1, userID);
				p.setString(2, register_Server.getUserName());
				p.execute();
				
				
				connection.commit();
				connection.setAutoCommit(true);
				message.setMessage("Oke");
				message.setData(new Model_User_Account_Server(userID, register_Server.getUserName(), "", "" , true));
				
				resultSet.close();
				p.close();
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			message.setAction(false);
			message.setMessage("Server Error");
			try {
				if (connection.getAutoCommit() == false) {
					connection.rollback();
					connection.setAutoCommit(true);
				}
				
			} catch (Exception e2) {
			}
			
		}
		
		
		return message;

	}
	
	
	public List<Model_User_Account_Server> getUser( int exitUser) throws SQLException  {
		List<Model_User_Account_Server> list = new ArrayList<Model_User_Account_Server>();
		PreparedStatement p= connection.prepareStatement(SELECT_USER_ACCOUNT);
		p.setInt(1, exitUser);
		ResultSet result = p.executeQuery();
		while (result.next()) {
			int userID = result.getInt(1);
			String userName = result.getString(2);
			String gender = result.getString(3);
			String image = result.getString(4);
			
			list.add(new Model_User_Account_Server(userID, userName, gender, image, checkUserStatus(userID)));
		}
		result.close();
		p.close();
		return list;
	}
	
	
	
	public Model_User_Account_Server login( Model_Login_Server login) throws SQLException {
		Model_User_Account_Server data = null;
		PreparedStatement p= connection.prepareStatement(LOGIN);
		
		p.setString(1, login.getUserName());
		p.setString(2, login.getPassword());
		
		ResultSet resultSet = p.executeQuery();
		if (resultSet.next()) {
			
			int userID = resultSet.getInt(1);
			String userName = resultSet.getString(2);
			String gender = resultSet.getString(3);
			String image = resultSet.getString(4);
			data = new Model_User_Account_Server(userID, userName, gender, image, checkUserStatus(userID));
			
			
		}
		resultSet.close();
		p.close();
		return data;
		
	}
	
	private boolean checkUserStatus (int userID) {
		List<Model_Client_Server> clients= Server_Service.getInstance(null).getListClient_Servers();
		for (Model_Client_Server c : clients) {
			if (c.getUser().getUserID() == userID) {
				return true;
			}
		}
		return false;
	}

}
