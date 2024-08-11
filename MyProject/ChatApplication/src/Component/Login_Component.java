package Component;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.EmptyBorder;

import Event.PublicEvent;
import Model.Model_Login_Client;

import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_Component extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField userField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Login_Component() {
		
		setBackground(new Color(255, 255, 255));
		setLayout(new BorderLayout(0, 0));
		setPreferredSize(new Dimension(262, 312));
		JLabel lbTitle = new JLabel("Login");
		lbTitle.setBorder(new EmptyBorder(10, 0, 0, 0));
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setForeground(new Color(81, 82, 82));
		lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		add(lbTitle, BorderLayout.NORTH);
		
		
		
//		BodyPanel
		JPanel bodyPanel = new JPanel();
		bodyPanel.setBackground(new Color(255, 255, 255));
		add(bodyPanel, BorderLayout.CENTER);
		bodyPanel.setLayout(new MigLayout("fillx", "20[fill]20", "10[]10"));
		
		
//		User Name
		JLabel lbName = new JLabel("User Name:");
		bodyPanel.add(lbName, "al center, wrap");
		
		userField = new JTextField();
		bodyPanel.add(userField, "al center,wrap");
		userField.setColumns(10);
		
//		 Password
		JLabel lbPass = new JLabel("Password:");
		bodyPanel.add(lbPass, "al center,wrap");
		
		passwordField = new JPasswordField();
		bodyPanel.add(passwordField, "al center,wrap");
		passwordField.setColumns(10);
		
		bodyPanel.add(new JLabel(), "wrap, h 5%");

		
		
		
		
		
		
		
		
//		 Login Button
		JButton btn_Login = new JButton("Login");
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PublicEvent.getInstance().getEventLogin().login(new Model_Login_Client(userField.getText(), String.valueOf(passwordField.getPassword()) ));
			}
			
		});
		
		
		
		
		btn_Login.setBackground(new Color(217, 218, 218));
		btn_Login.setBorder(new EmptyBorder(10, 10, 10, 10));
		bodyPanel.add(btn_Login, "al center,wrap");
		
		
//		Register
		JButton btn_Register = new JButton("Register");
		btn_Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PublicEvent.getInstance().getEventLogin().goRegister();
			}
		});
		btn_Register.setContentAreaFilled(false);
		btn_Register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Register.setBackground(new Color(255, 255, 255));
		btn_Register.setForeground(new Color(4, 173, 139));
		btn_Register.setBorderPainted(false);
		btn_Register.setBorder(new EmptyBorder(10, 10, 10, 10));
		bodyPanel.add(btn_Register, "al center,wrap");

	}

}
