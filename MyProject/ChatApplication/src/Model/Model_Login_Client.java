package Model;

import org.json.JSONException;
import org.json.JSONObject;

public class Model_Login_Client {
	String userName;
	String password;
	
	
	 
	
	public Model_Login_Client(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public Model_Login_Client() {
		super();
	}
	
	
	

	
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
	
	
	public JSONObject toJsonObject () {
		JSONObject json = new JSONObject();
		try {
			json.put("userName", userName);
			json.put("password", password);
			return json;
		} catch (JSONException e) {
			System.out.println("Tạo JSON ở login ko thành công.");
			e.printStackTrace();
			return null;
		}
		
		
		
	}

}
