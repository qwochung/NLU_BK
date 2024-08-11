package Model;

import com.corundumstudio.socketio.SocketIOClient;

public class Model_Client_Server {
	private SocketIOClient client;
	private Model_User_Account_Server user;
	
	
	
	public SocketIOClient getClient() {
		return client;
	}
	public void setClient(SocketIOClient client) {
		this.client = client;
	}
	public Model_User_Account_Server getUser() {
		return user;
	}
	public void setUser(Model_User_Account_Server user) {
		this.user = user;
	}
	
	
	
	
	
	public Model_Client_Server(SocketIOClient client, Model_User_Account_Server user) {
		super();
		this.client = client;
		this.user = user;
	}
	
	


}
