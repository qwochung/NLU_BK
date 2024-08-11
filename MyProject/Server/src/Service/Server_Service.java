package Service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.ConnectListener;
import com.corundumstudio.socketio.listener.DataListener;
import com.corundumstudio.socketio.listener.DisconnectListener;

import Model.Model_Client_Server;
import Model.Model_Login_Server;
import Model.Model_Message_Server;
import Model.Model_Receive_Message_Server;
import Model.Model_Register_Server;
import Model.Model_Send_Message_Server;
import Model.Model_User_Account_Server;

public class Server_Service {
	private static Server_Service instance;
	private SocketIOServer server;
	private final int PORT = 9999;
	private JTextArea textArea;
	private Service_User service_User;
	private List<Model_Client_Server> listClient_Servers;
	
	
	
	
	public static Server_Service getInstance(JTextArea textArea) {
		if ( instance == null) {
			instance = new Server_Service(textArea);
		}
		return instance;
	}
	
	public Server_Service (JTextArea textArea) {
		this.textArea = textArea;
		service_User = new Service_User();
		listClient_Servers= new ArrayList<Model_Client_Server>();
	}
	
	public void  startServer() {
		Configuration config = new Configuration();
		config.setPort(PORT);
		server = new SocketIOServer(config);
		server.addConnectListener(new ConnectListener() {
			
			@Override
			public void onConnect(SocketIOClient arg0) {
				textArea.append("One Client connected.\n");
			}
		});
		
		server.addEventListener("register", Model_Register_Server.class, new DataListener<Model_Register_Server>() {

			@Override
			public void onData(SocketIOClient socIO, Model_Register_Server arg1, AckRequest arg2) throws Exception {
				
				 Model_Message_Server message =service_User.register(arg1);
				 arg2.sendAckData(message.isAction(), message.getMessage(), message.getData());
				 if (message.isAction()) {
					 textArea.append("User has Register : " + arg1.getUserName() + " Pass " + arg1.getPassword() + " \n");
					 server.getBroadcastOperations().sendEvent("list_user"	, (Model_User_Account_Server) message.getData());
					 addClient(socIO, (Model_User_Account_Server) message.getData());
				}
				 
			}
		});
		
		server.addEventListener("login", Model_Login_Server.class, new DataListener<Model_Login_Server>() {

			@Override
			public void onData(SocketIOClient socIO, Model_Login_Server l, AckRequest ack) throws Exception {
				 Model_User_Account_Server login = service_User.login(l);
			
				 if (login != null) {
					ack.sendAckData(true, login);
					addClient(socIO, login);
					userConnect(login.getUserID());
					
				}
				 else {
					ack.sendAckData(false);
				}
				
			}
		});
		
		server.addEventListener("list_user", Integer.class, new DataListener<Integer>() {

			@Override
			public void onData(SocketIOClient socIO, Integer userID, AckRequest arg2) throws Exception {
			
				try {
					List<Model_User_Account_Server> list= service_User.getUser(userID);
					
					socIO.sendEvent("list_user", list.toArray());
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		});		
		
		
	
		
		server.addEventListener("send_to_user", Model_Send_Message_Server.class, new DataListener<Model_Send_Message_Server>() {

			@Override
			public void onData(SocketIOClient socIO, Model_Send_Message_Server data, AckRequest ack) throws Exception {
				sendToClient(data);
				
				
			}
		});
		
		
		
		
		
		server.addDisconnectListener(new DisconnectListener() {
			
			@Override
			public void onDisconnect(SocketIOClient socIO) {
				int userID = removeClient(socIO);
				if (userID != 0) {
					userDisconnect(userID);
				} 
			} 
		}); 
		
		
		
		server.start();
		textArea.append("Server has start on port " + PORT +"\n");
	}

	
	
	private void  addClient (SocketIOClient client, Model_User_Account_Server user) {
		listClient_Servers.add(new Model_Client_Server(client, user));
	}

	
	
	public List<Model_Client_Server> getListClient_Servers() {
		return listClient_Servers;
	}
	
	
	public int removeClient (SocketIOClient client) {
		for (Model_Client_Server c : listClient_Servers) {
			if (c.getClient() == client) {
				listClient_Servers.remove(c);
				return c.getUser().getUserID();
			}
		}
		return 0;
	}
	

	
	private void userConnect (int userID) {
		server.getBroadcastOperations().sendEvent("user_status", userID, true);
		
	}
	
	private void userDisconnect( int userID) {
		server.getBroadcastOperations().sendEvent("user_status", userID, false);
	}
	
	
	private void sendToClient(Model_Send_Message_Server data) {
		for (Model_Client_Server c : listClient_Servers) {
			if (c.getUser().getUserID() == data.getToUserID()) {
				c.getClient().sendEvent("receive_ms", new Model_Receive_Message_Server(data.getFromUserID(), data.getText()));
				
				break;
				
			}
		}

	}
	
	

}
