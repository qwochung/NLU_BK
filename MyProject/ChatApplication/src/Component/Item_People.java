package Component;

import javax.swing.JPanel;

import ExternalClass.*;
import Model.Model_User_Account_Client;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Event.PublicEvent;

import java.awt.Font;

public class Item_People extends JPanel {

	private static final long serialVersionUID = 1L;
	private Model_User_Account_Client user;
	ImageAvatar imageAvatar;
	JLabel lbName ;
	JLabel lblStatus;
	ActiveStatus activeStatus;
	private boolean mouseOver;
	

	/**
	 * Create the panel.
	 */
	public Item_People(Model_User_Account_Client user) {
		this.user = user;
		 
		setPreferredSize(new Dimension(254, 52));
		setBackground(new Color(204, 204, 255));
		
		imageAvatar = new ImageAvatar();
		imageAvatar.setToolTipText("");
		imageAvatar.setImage(new ImageIcon(Item_People.class.getResource("/Image_Icon/user.png")));
		imageAvatar.setBorderSize(0);
		imageAvatar.setPreferredSize(new Dimension(40, 40));
			
		lbName = new JLabel("Name");
		lbName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbName.setPreferredSize(new Dimension(135,50));
		lbName.setText(user.getUserName());
		
		lblStatus = new JLabel("New User");
		lblStatus.setForeground(new Color(0, 128, 64));
		lblStatus.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblStatus.setPreferredSize(new Dimension(135, 50));
		
		
		
		activeStatus = new ActiveStatus();
		activeStatus.setActive(user.isStatus());
		
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(imageAvatar, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblStatus, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(activeStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(128))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lbName, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbName, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(activeStatus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
					.addContainerGap(13, Short.MAX_VALUE))
				.addComponent(imageAvatar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
		);
		setLayout(groupLayout);
		init();

	}
	private void init() {
		addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(new Color(190,190,240));
				mouseOver = true;
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(new Color(204,204,255));
				mouseOver= false;
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				if (mouseOver) {
					PublicEvent.getInstance().getEventMain().selectUser(user);
				}
			}
		});
	}
	
	
	
	
	public Model_User_Account_Client getUser() {
		return user;
	}
	
	public void updateStatus() {
		activeStatus.setActive(user.isStatus());
		revalidate();
	}
	
	
	
	
}
