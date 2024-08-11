package form;

import javax.swing.*;

import Component.Login_Component;
import Component.Register_Component;
import Event.EventLogin;
import Event.EventMessage;
import Event.PublicEvent;

import java.awt.*;

import javax.swing.GroupLayout.Alignment;
import ExternalClass.PictureBox;
import Model.Model_Login_Client;
import Model.Model_Message_Client;
import Model.Model_Register_Client;
import Model.Model_User_Account_Client;
import Service.Client_Service;
import io.socket.client.Ack;
import ExternalClass.PanelSlide;
import javax.swing.border.LineBorder;


public class LoginAndRegister extends JPanel {
	private static final long serialVersionUID = 1L;
	 private Login_Component login;
	 private Register_Component register;
	 PanelSlide panelSlide;
	 

	/**
	 * Create the panel.
	 */
	public LoginAndRegister() {
		setMinimumSize(new Dimension(1100, 700));
		setBackground(new Color(255, 255, 255));
		setPreferredSize(new Dimension(1100,700));
		
		JPanel imagePanel = new JPanel();
		
		imagePanel.setBackground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 255, 255)));
		panel.setMaximumSize(new Dimension(400, 400));
		panel.setBackground(new Color(0, 255, 255));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
					.addGap(51)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
					.addGap(37))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(imagePanel, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(137)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
					.addGap(158))
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setMaximumSize(new Dimension(400, 400));
		panel_1.setBackground(new Color(255, 255, 255));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
		);
		
		panelSlide = new PanelSlide();
		panelSlide.setMaximumSize(new Dimension(400, 400));
		panelSlide.setBorder(null);
		panelSlide.setMinimumSize(new Dimension(250,250));
		panelSlide.setBackground(new Color(255, 255, 255));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelSlide, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelSlide, GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		
		
		
		
		imagePanel.setLayout(new BorderLayout(0, 0));
		
		PictureBox pictureBox = new PictureBox();
		pictureBox.setMinimumSize(new Dimension(500,500));
		pictureBox.setImage(new ImageIcon(LoginAndRegister.class.getResource("/Image_Icon/login.jpg")));
		imagePanel.add(pictureBox);
		setLayout(groupLayout);
//		init();
		
		
		login = new Login_Component();
		register = new Register_Component();
		panelSlide.init(login, register);
		init();
		
	}


	private void init() {
		PublicEvent.getInstance().addEventLogin(new EventLogin() {

			@Override
			public void login(Model_Login_Client data) {
				
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						PublicEvent.getInstance().getEventMain().showLoading(true);
						
						
						Client_Service.getInstance().getClient().emit("login", data.toJsonObject(), new Ack() {
							
							@Override
							public void call(Object... os) {
								
								if (os.length > 0 ) {
									 
									boolean action = (Boolean) os[0];
									if (action) {
										
										Client_Service.getInstance().setUser_Client(new Model_User_Account_Client(os[1]));
										PublicEvent.getInstance().getEventMain().showLoading(false);
										PublicEvent.getInstance().getEventMain().initChat();
									
									}
									else {
										// passwword wrong
									 
										PublicEvent.getInstance().getEventMain().showLoading(false);
									}
								}
								else {
									
									PublicEvent.getInstance().getEventMain().showLoading(false);
								}
								
							}
						});
					
						
					}
				}).start();
				
			}

			@Override
			public void register( Model_Register_Client register_Client, EventMessage message) {
				Client_Service.getInstance().getClient().emit("register", register_Client.toJSonObject(), new Ack() {
				
					@Override
					public void call(Object... obj) {
					
						if (obj.length >0) {
							Model_Message_Client message_Client = new Model_Message_Client( (boolean)obj[0], obj[1].toString());
						
							if (message_Client.isAction()) {
								Model_User_Account_Client user = new Model_User_Account_Client(obj[2]); // [2] is data form Server_Service
								Client_Service.getInstance().setUser_Client(user);
							}
							message.callMessage(message_Client);
							
						}
						
					}
				});
			}
			
			
		

			@Override
			public void goLogin() {
				panelSlide.show(0);
				
			}

			@Override
			public void goRegister() {
				panelSlide.show(1);
				
			}
		});
		
	}
	}
	
	

