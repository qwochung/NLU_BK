package Event;

import Model.Model_Receive_Message_Client;
import Model.Model_Send_Message_Client;

public interface EventChat {
	public void  sendMessage(Model_Send_Message_Client data) ;
	public void  receiveMessage(Model_Receive_Message_Client data) ;
	
}
