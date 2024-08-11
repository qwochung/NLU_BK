package Component;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;

import Model.Model_User_Account_Client;

import java.awt.Font;

public class Chat_Title extends JPanel {

	private static final long serialVersionUID = 1L;
	JLabel lbName;
	JLabel lbStatus;
	private Model_User_Account_Client user;
	/**
	 * Create the panel.
	 */
	public Chat_Title() {
		setBackground(new Color(220,220,220));
		setPreferredSize(new Dimension(500, 40));
		setLayout(new BorderLayout(0, 0));
		
		JLayeredPane layer = new JLayeredPane();
		layer.setBorder(new EmptyBorder(5, 10, 5, 10));
		add(layer, BorderLayout.WEST);
		layer.setLayout(new GridLayout(0, 1, 0, 0));
		
		lbName = new JLabel("Name");
		lbName.setFont(new Font("Tahoma", Font.BOLD, 13));
		layer.add(lbName);
		
		lbStatus = new JLabel("Active Now");
		lbStatus.setForeground(new Color(18, 158, 62));
		layer.add(lbStatus);
	}
	
	
	
	
	
	
	public void setUserName(Model_User_Account_Client user) {
		this.user = user;
		lbName.setText(user.getUserName());
		if (user.isStatus()) {
			setStatusActive();
		}
		else {
			setStatusText("Offline");
		}
	}
	
	
	private void setStatusActive() {
		lbStatus.setText("Active Now");
		lbStatus.setForeground(new Color(18, 158, 62));
	}
	
	private void setStatusText(String text) {
		lbStatus.setText(text);
		lbStatus.setForeground(new Color(169, 185, 4));
	}


	
	public void updateUser( Model_User_Account_Client user) {
		if (this.user == user) {
			lbName.setText(user.getUserName());
			if (user.isStatus()) {
				setStatusActive();
			}
			else {
				setStatusText("Offline");
			}
			
		}
	}



	public Model_User_Account_Client getUser() {
		return user;
	}

	
	
	
	
}
