package Model;

public class Model_Message_Client {
	boolean action;
	String message;
	
	
	
	
	
	
	public boolean isAction() {
		return action;
	}
	
	public void setAction(boolean action) {
		this.action = action;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
	
	
	
	public Model_Message_Client(boolean action, String message) {
		super();
		this.action = action;
		this.message = message;
	}

	public Model_Message_Client() {
	}
	
	

}
