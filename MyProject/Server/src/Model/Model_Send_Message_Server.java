package Model;



public class Model_Send_Message_Server {
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
	
	
	public Model_Send_Message_Server(int fromUserID, int toUserID, String text) {
		super();
		this.fromUserID = fromUserID;
		this.toUserID = toUserID;
		this.text = text;
	}
	
	
	public Model_Send_Message_Server() {
	}
	
	
	
	
	@Override
	public String toString() {
		return "Model_Send_Message_Server [fromUserID=" + fromUserID + ", toUserID=" + toUserID + ", text=" + text
				+ "]";
	}
	
	
	
	
	
	
	
}
