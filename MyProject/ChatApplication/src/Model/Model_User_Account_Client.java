package Model;

import org.json.JSONObject;


public class Model_User_Account_Client {
	int userID;
	String userName, gender, image;
	boolean status;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	public Model_User_Account_Client(int userID, String userName, String gender, String image, boolean status) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.gender = gender;
		this.image = image;
		this.status = status;
	}
	public Model_User_Account_Client( Object json) {
	
		
		JSONObject obj = (JSONObject ) json;

		try {
			userID = obj.getInt("userID");
			userName = obj.getString("userName");
			gender = obj.getString("gender");
//			image = obj.getString("Image");
			image = null;
 
			status = obj.getBoolean("status");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public String toString() {
		
		return status +""; 
		
	}
	
	
	
	

}
