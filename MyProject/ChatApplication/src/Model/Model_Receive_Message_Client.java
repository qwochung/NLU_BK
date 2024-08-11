package Model;

import org.json.JSONObject;

public class Model_Receive_Message_Client {
	int fromUserID;
	String text;
	
	 
	public int getFromUserID() {
		return fromUserID;
	}
 
	public void setFromUserID(int fromUserID) {
		this.fromUserID = fromUserID;
	}
 
	public String getText() {
		return text;
	}
 
	public void setText(String text) {
		this.text = text;
	}

 
	public Model_Receive_Message_Client(int fromUserID, String text) {
		super();
		this.fromUserID = fromUserID;
		this.text = text;
	}
	 
	
	public Model_Receive_Message_Client() {
	}
	
	

	public Model_Receive_Message_Client(Object json) {
		JSONObject obj = (JSONObject) json;
		try {
			fromUserID = obj.getInt("fromUserID");
			text = obj.getString("text");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	



	public JSONObject toJsonObject() {
		try {
			JSONObject json = new JSONObject();
			json.put("fromUserID", fromUserID);
			json.put("text", text);
			
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	
	
}
