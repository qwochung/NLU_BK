package Component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Event.EventMessage;
import Event.PublicEvent;
import Model.Model_Message_Client;
import Model.Model_Register_Client;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register_Component extends JPanel {
	private JTextField userNameField;
	private JPasswordField passwordField;
	private JPasswordField rePasswordField;
	JLabel lbError;
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Register_Component() {setBackground(new Color(255, 255, 255));
	setLayout(new BorderLayout(0, 0));
	setPreferredSize(new Dimension(300, 365));
	JLabel lbTitle = new JLabel("Register");
	lbTitle.setBorder(new EmptyBorder(10, 0, 0, 0));
	lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
	lbTitle.setForeground(new Color(81, 82, 82));
	lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
	add(lbTitle, BorderLayout.NORTH);
	
	
	
//	BodyPanel
	JPanel bodyPanel = new JPanel();
	bodyPanel.setBackground(new Color(255, 255, 255));
	add(bodyPanel, BorderLayout.CENTER);
	bodyPanel.setLayout(new MigLayout(" fillx", "20[fill]20", "10[]10"));
	
//	 User name
	JLabel lbName = new JLabel("User Name:");
	bodyPanel.add(lbName, "cell 0 0,alignx center");
	
	userNameField = new JTextField();
	bodyPanel.add(userNameField, "cell 0 1,alignx center");
	userNameField.setColumns(10);
	
//	Create Password
	JLabel lbPass = new JLabel("Password:");
	bodyPanel.add(lbPass, "cell 0 2,alignx center");
	
	passwordField = new JPasswordField();
	bodyPanel.add(passwordField, "cell 0 3,alignx center");
	passwordField.setColumns(10);
	
	
//	Confirm Password
	JLabel lbConfirm = new JLabel("Confirm Password:");
	bodyPanel.add(lbConfirm, "cell 0 4,alignx center"); 
	
	rePasswordField = new JPasswordField();
	bodyPanel.add(rePasswordField, "cell 0 5,alignx center");
	passwordField.setColumns(10);

	bodyPanel.add(new JLabel(), "cell 0 6,height 5%");
	
	JButton btn_Register = new JButton("Register");
	
	
// 	 add action
	btn_Register.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String userName = userNameField.getText().trim();
			String password = String.valueOf(passwordField.getPassword());
			String rePassword = String.valueOf(rePasswordField.getPassword());
			
			if (userName.equals("")) {
				userNameField.grabFocus();
			}
			else if (password.equals("")) {
				passwordField.grabFocus();
			} 
			else if (!rePassword.equals(password)) {
				rePasswordField.grabFocus();
			} 
			
			else {
				Model_Register_Client register_Client = new Model_Register_Client(userName, rePassword);
				PublicEvent.getInstance().getEventLogin().register(register_Client, new EventMessage() {
					
					@Override
					public void callMessage(Model_Message_Client message_Client) {
						if (!message_Client.isAction()) {
							lbError.setText(message_Client.getMessage());
						}
						else {
							PublicEvent.getInstance().getEventMain().initChat();
						}
						
					}
				});
			}
			
			
		}
	});
	btn_Register.setBackground(new Color(217, 218, 218));
	btn_Register.setBorder(new EmptyBorder(10, 10, 10, 10));
	bodyPanel.add(btn_Register, "cell 0 7,alignx center");
	
	JButton btn_BackLogin = new JButton("Login");
//	 add action
	btn_BackLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			PublicEvent.getInstance().getEventLogin().goLogin();
		}
	});
	btn_BackLogin.setContentAreaFilled(false);
	btn_BackLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	btn_BackLogin.setBackground(new Color(255, 255, 255));
	btn_BackLogin.setForeground(new Color(4, 173, 139));
	btn_BackLogin.setBorderPainted(false);
	btn_BackLogin.setBorder(new EmptyBorder(10, 10, 10, 10));
	bodyPanel.add(btn_BackLogin, "cell 0 8,alignx center");
	
	lbError = new JLabel("");
	lbError.setForeground(new Color(255, 0, 0));
	lbError.setHorizontalAlignment(SwingConstants.CENTER);
	bodyPanel.add(lbError, "cell 0 9");

	}

}
