package Model;

import org.json.JSONException;
import org.json.JSONObject;


public class Model_Register_Client {
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

	
	 

	public Model_Register_Client(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public Model_Register_Client() {
	}
	
	public JSONObject toJSonObject() {
		JSONObject json = new JSONObject();
		try {
			json.put("userName", userName);
			json.put("password", password);
			return json;
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

}
