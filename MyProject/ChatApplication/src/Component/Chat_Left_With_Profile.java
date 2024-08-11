package Component;


import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;

import ExternalClass.ImageAvatar;

public class Chat_Left_With_Profile extends JLayeredPane {
	private static final long serialVersionUID = 1L;
	Chat_Item txt ; 
	ImageAvatar imageAvatar;
	
	
	
	public Chat_Left_With_Profile() {
		
		setLayout(new BorderLayout(0, 0));
		
		
		txt = new Chat_Item(); 
		txt.setBackground(new Color(251, 220, 243));
		
		add(txt, BorderLayout.CENTER);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(null);
		add(layeredPane, BorderLayout.WEST);
		layeredPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		imageAvatar = new ImageAvatar();
		imageAvatar.setBorder(new EmptyBorder(15, 15, 15, 15));
		imageAvatar.setMinimumSize(new Dimension(30, 30));
		imageAvatar.setImage(new ImageIcon(Chat_Left_With_Profile.class.getResource("/Image_Icon/Cat.jpg")));
		imageAvatar.setBorderSize(0);
		imageAvatar.setPreferredSize(new Dimension(30, 30));
		layeredPane.add(imageAvatar);
		
//		Test
//		txt.setImage(false,"LYLN0uIA~ps,^+x]S5WXxvW=M|kC");
	}


	

	
// User Profile
	public void setUserProfile(String user) {
		txt.setUserProfile(user);
	}
	
//	Set Text
	public void setText(String text) {
		txt.setText(text);
	}
	
//	Set Time
	public void setTime() {
		txt.setTime("11:10 PM", SwingConstants.LEFT);
	}
	
//	Image Profile
	public void setImageProfile( Icon image) {
		imageAvatar.setImage(image);
	}
	
//	Set Image ( Icon )
	public void setImage( Icon ... images) {
		txt.setImage( false, images);
		
	}
//	Set Image ( String )
	public void setImage( String ... images) {
		txt.setImage( false, images);
		
	}
//	Hide Text
	public void hideText() {
		txt.hideText();
	}
	
//	Set name and size of File
	public void setFile( String fileName, String fileSize) {
		txt.setFile(fileName, fileSize);
	}





	public boolean isEmpty() {
		return txt.isEmpty();
	}
	
	
	
	
	
	
	
	
	
}
