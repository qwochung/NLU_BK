package form;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Component.Item_People;
import Component.Menu_Button;
import Component.ScrollBar;
import Event.EventMenuLeft;
import Event.PublicEvent;
import Model.Model_User_Account_Client;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.GridLayout;
import java.awt.Point;

public class Menu_Left extends JPanel {

	private static final long serialVersionUID = 1L;
	 
	Border emp = new EmptyBorder(0, 0, 0, 0);
	private List<Model_User_Account_Client> user_Account_Clients;
	JLayeredPane menuList;
	/**
	 * Create the panel.
	 */
	public Menu_Left() {
		
		setBackground(new Color(220, 220, 220));
		setLayout(new BorderLayout(0, 0));
		
				
		
		JLayeredPane menu = new JLayeredPane();
		add(menu, BorderLayout.NORTH);
		menu.setLayout(new GridLayout(0, 3, 0, 0)); 
		
		
//		Button
		Menu_Button menuMess =  new Menu_Button();
		menuMess.setSelectedIcon(new ImageIcon(Menu_Left.class.getResource("/Image_Icon/messSelect2.png")));
		menuMess.setSelected(true);
		menuMess.setIconSelected(new ImageIcon(Menu_Left.class.getResource("/Image_Icon/messSelect2.png")));
		menuMess.setIconSimple(new ImageIcon(Menu_Left.class.getResource("/Image_Icon/mess30px.png")));
		menuMess.setBorderPainted(false);
		menuMess.setFocusPainted(false);
	
		menuMess.setIcon(new ImageIcon(Menu_Left.class.getResource("/Image_Icon/mess30px.png")));
		menu.add(menuMess);
		
		
		
		Menu_Button menuGroup = new Menu_Button();
		menuGroup.setFocusPainted(false);
		menuGroup.setIconSimple(new ImageIcon(Menu_Left.class.getResource("/Image_Icon/group.png")));
		menuGroup.setIconSelected(new ImageIcon(Menu_Left.class.getResource("/Image_Icon/groupSelect.png")));
		menuGroup.setBorderPainted(false);
		menuGroup.setIcon(new ImageIcon(Menu_Left.class.getResource("/Image_Icon/group.png")));
		menu.add(menuGroup);
		
		Menu_Button menuBox = new Menu_Button();
		menuBox.setFocusPainted(false);
		menuBox.setIconSimple(new ImageIcon(Menu_Left.class.getResource("/Image_Icon/mail.png")));
		menuBox.setIconSelected(new ImageIcon(Menu_Left.class.getResource("/Image_Icon/mailSelect.png")));
		menuBox.setBorderPainted(false);
		menuBox.setIcon(new ImageIcon(Menu_Left.class.getResource("/Image_Icon/mail.png")));
		menu.add(menuBox);
		
		

		
		
		
//		scrollbar
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(5,5));
		scrollPane.setBorder(null);
		add(scrollPane, BorderLayout.CENTER);
		scrollPane.setVerticalScrollBar(new ScrollBar());
	
		
//		menuList
		menuList = new JLayeredPane();
		menuList.setLayout(new MigLayout("", "0[center]0", "5[]0"));
			scrollPane.setViewportView(menuList);
		
		user_Account_Clients = new ArrayList<>();
		
		
		PublicEvent.getInstance().addEventMenuLeft(new EventMenuLeft() {
			
			@Override
			public void newUser(List<Model_User_Account_Client> users) {
				
				
				for (Model_User_Account_Client u : users) {
					
					user_Account_Clients.add(u);
					
					menuList.add(new Item_People(u), ",wrap");
				}
				showMessage();  
			}

			
			
			@Override
			public void userConnect(int userID) {
				for (Model_User_Account_Client user : user_Account_Clients) {
					if (user.getUserID() == userID) {
						user.setStatus(true);
						PublicEvent.getInstance().getEventMain().updateUser(user);
						
						break;
					}
				}
				if (menuMess.isSelected()) {
					for (Component comp : menuList.getComponents()) {
						Item_People item = (Item_People)comp;
						if (item.getUser().getUserID() == userID) {
							item.updateStatus();
							refreshMenuList();
							break;
						}
						
					}
				}
				
			}

			@Override
			public void userDisconnect(int userID) {
				for (Model_User_Account_Client user : user_Account_Clients) {
					if (user.getUserID() == userID) {
						user.setStatus(false);
						PublicEvent.getInstance().getEventMain().updateUser(user);
						
						break;
					}
				}
				if (menuMess.isSelected()) {
					for (Component comp : menuList.getComponents()) {
						Item_People item = (Item_People)comp;
						if (item.getUser().getUserID() == userID) {
							item.updateStatus();
							refreshMenuList();
							break;
						}
						
					}
				}
				
			}
			
			
			
		}); 
		
		
		
		
		
	
	
	
//	action for buttons
	menuMess.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			menuMess.setSelected(true);
			menuGroup.setSelected(false);
			menuBox.setSelected(false);
			showMessage();
			scrollPane.getViewport().setViewPosition(new Point(0,0));
			
		}
	});
	menuGroup.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			menuMess.setSelected(false);
			menuGroup.setSelected(true);
			menuBox.setSelected(false);
			showGroup();
			scrollPane.getViewport().setViewPosition(new Point(0,0));
		}
	});
	
	menuBox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			menuMess.setSelected(false);
			menuGroup.setSelected(false);
			menuBox.setSelected(true);
			showBox();
			scrollPane.getViewport().setViewPosition(new Point(0,0));
		}
	});
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	









//		test data	
	private void showMessage() {
		
		menuList.removeAll();
		for (Model_User_Account_Client user_Account_Client : user_Account_Clients) {
			
			menuList.add(new Item_People(user_Account_Client), ",wrap");
		}
		refreshMenuList();
		
		
	}
	
	
	private void showGroup() {
		menuList.removeAll();
		for (int i = 0; i < 20; i++) {
			menuList.add(new Item_People(null),"cell 0 " + i +",wrap");
		}
		refreshMenuList();
	}
	private void showBox() {
		menuList.removeAll();
		for (int i = 0; i < 1; i++) {
			menuList.add(new Item_People(null),"cell 0 " + i +",wrap");
		}
		refreshMenuList();
	}
	
	private void refreshMenuList() {
		menuList.repaint();
		menuList.revalidate();
	}

	
	
	
	
	
	
	
	
}
