package Service;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import Event.PublicEvent;
import Model.Model_Receive_Message_Client;
import Model.Model_User_Account_Client;
import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
 
public class Client_Service {
	private static Client_Service instance;
	private Socket client;
	private final int PORT = 9999;
	private final String IP = "localhost";
	private Model_User_Account_Client user_Client;
	
	


	public static Client_Service getInstance( ) {
		if ( instance == null) {
			instance = new Client_Service( );
		}
		return instance;
	}
	
	public Client_Service ( ) {
	}
	
	public void  startServer()  {
		try {
			client = IO.socket("http://" + IP + ":"+ PORT);
			
			
			client.on("list_user", new Emitter.Listener() {
				
				@Override
				public void call(Object... os) {
					// list user
					
					List<Model_User_Account_Client> users = new ArrayList<>();
					for (Object o : os) {
						Model_User_Account_Client u = new Model_User_Account_Client(o);
						
						if (u.getUserID() != user_Client.getUserID()) {
							users.add(u);
						}
						
						
					}
					
					PublicEvent.getInstance().getEventMenuLeft().newUser(users);
					
				}
			});
			
			
			client.on("user_status", new Emitter.Listener() {
				
				@Override
				public void call(Object... os) {
					int userID = (Integer) os[0];
					boolean status = (boolean) os[1];
					if (status) {
						PublicEvent.getInstance().getEventMenuLeft().userConnect(userID);
					}
					else {
						PublicEvent.getInstance().getEventMenuLeft().userDisconnect(userID);
						
					}
					
				}
			});
			
			
			client.on("receive_ms", new Emitter.Listener() {
				
				@Override
				public void call(Object... os) {
					Model_Receive_Message_Client message = new Model_Receive_Message_Client(os[0]);
					PublicEvent.getInstance().getEventChat().receiveMessage(message);
					
				}
			});
			
			
			
				
			
			
			client.open();
		} catch (URISyntaxException e) {
			error(e);
		}
		
	}
	
	
	public Socket getClient() {
		return client;
	}

	public Model_User_Account_Client getUser_Client() {
		return user_Client;
	}

	public void setUser_Client(Model_User_Account_Client user_Client) {
		this.user_Client = user_Client;
		
		
		
	}
	 
	
	
	
	private void error( Exception e) {
		System.err.println(e);
	}

	
	
	
	
	
}
