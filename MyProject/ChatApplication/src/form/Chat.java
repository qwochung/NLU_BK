package form;

import javax.swing.JPanel;


import java.awt.Color;
import Component.Chat_Title;
import Event.EventChat;
import Event.PublicEvent;
import Model.Model_Receive_Message_Client;
import Model.Model_Send_Message_Client;
import Model.Model_User_Account_Client;
import Component.Chat_Body;
import Component.Chat_Bottom;
import net.miginfocom.swing.MigLayout;

public class Chat extends JPanel {
	Chat_Title chat_Title;
	Chat_Body chat_Body;
	Chat_Bottom chat_Bottom;
	

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Chat() {
		setBackground(Color.WHITE);
		setLayout(new MigLayout("fillx", "0[fill]0", "0[]0[100%,fill]0[shrink 0]0"));
		
		chat_Title = new Chat_Title();
		chat_Body = new Chat_Body();
		chat_Bottom = new Chat_Bottom();
		
		add(chat_Title, "wrap");
		add(chat_Body, "wrap");
		add(chat_Bottom, " wrap, h ::30%");
	 
		
		
		
		PublicEvent.getInstance().addEventChat(new EventChat() {
			
			@Override
			public void sendMessage(Model_Send_Message_Client data) {
				
				chat_Body.addItemRight(data);
			}

			

			@Override
			public void receiveMessage(Model_Receive_Message_Client data) {
				if (chat_Title.getUser().getUserID() == data.getFromUserID()) {
					chat_Body.addItemLeft(data);
				}
				
				
			}
		});	

	}
	
	public void setUser(Model_User_Account_Client user) {
		chat_Title.setUserName(user);
		chat_Bottom.setUser(user);
		chat_Body.clearChat();
		

	}
	public void updateUser(Model_User_Account_Client user) {
		chat_Title.updateUser(user);
		
		
	}

}
