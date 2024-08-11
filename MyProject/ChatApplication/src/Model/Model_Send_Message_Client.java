package Model;

import org.json.JSONObject;

public class Model_Send_Message_Client {
	int fromUserID;
	int toUserID;
	String text;
	
	
	
	public int getFromUserID() {
		return fromUserID;
	}
	public void setFromUserID(int fromUserID) {
		this.fromUserID = fromUserID;
	}
	public int getToUserID() {
		return toUserID;
	}
	public void setToUserID(int toUserID) {
		this.toUserID = toUserID;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	public Model_Send_Message_Client(int fromUserID, int toUserID, String text) {
		super();
		this.fromUserID = fromUserID;
		this.toUserID = toUserID;
		this.text = text;
	}
	
	
	
	public Model_Send_Message_Client() {
	}
	
	
	
	
	public JSONObject toJsonObject() {
		try {
			JSONObject json = new JSONObject();
			json.put("fromUserID", fromUserID);
			json.put("toUserID", toUserID);
			json.put("text", text);
			return json;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	
	
}
