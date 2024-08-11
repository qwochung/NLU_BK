package Model;


public class Model_Receive_Message_Server {
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

 
	public Model_Receive_Message_Server(int fromUserID, String text) {
		super();
		this.fromUserID = fromUserID;
		this.text = text;
	}
	
	
	
	public Model_Receive_Message_Server( ) {
		 
	}
	

 
	
	
	
	
}
