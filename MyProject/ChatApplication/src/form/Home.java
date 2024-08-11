package form;

import javax.swing.JLayeredPane;

import Model.Model_User_Account_Client;
import net.miginfocom.swing.MigLayout;

public class Home extends JLayeredPane {
	private Chat chat;
	private Menu_Left menu_Left;

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Home()  {
		setBorder(null);
		
		init();
	}

	private void init() {
		setLayout(new MigLayout("fillx, filly", "1[200!]1[100%]1[200!]1", "0[fill]0"));
		menu_Left = new Menu_Left();
		this.add( menu_Left,"grow");
		chat= new Chat();
		this.add(chat, "grow");
		this.add(new Menu_Right(),"grow");
		chat.setVisible(false);
		
	}
	
	public void setUser (Model_User_Account_Client user) {
		chat.setUser(user);
		chat.setVisible(true);
	}
	
	public void updateUser(Model_User_Account_Client user) {
		chat.updateUser(user);
		revalidate();
	
				
	}

	
	
	
}
