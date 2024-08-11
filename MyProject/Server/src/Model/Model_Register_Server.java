package Model;

public class Model_Register_Server {
	String userName, password;

	 
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	 

	public Model_Register_Server(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public Model_Register_Server() {
	}
	
	
	

}
