package Component;

import javax.swing.Icon;
import javax.swing.JLayeredPane;

import java.awt.BorderLayout;

public class Chat_Left extends JLayeredPane {

	private static final long serialVersionUID = 1L;
	Chat_Left_With_Profile txt;
	/**
	 * Create the panel.
	 */
	public Chat_Left() {
		setLayout(new BorderLayout(10, 10));
		
		txt = new Chat_Left_With_Profile();
		add(txt);
		
//		Test
//		txt.setImage("LYLN0uIA~ps,^+x]S5WXxvW=M|kC");

	}
	
	
//	 Set Text
	public void setText(String text) {
		if (!txt.isEmpty()) {
			txt.hideText();
		}
		else {
			txt.setText(text);
		}
		
		
	}
	
//	 Set Time
	public void setTime() {
		txt.setTime();
	}
	
	
//	 Set Image ( Icon )
	public void setImage( Icon...images) {
		txt.setImage(images);
	}
	
//	 Set Image ( String )
	public void setImage( String...images) {
		txt.setImage(images);
	}
	
//  Set User Profile
	public void setUserProfile(String user) {
		txt.setUserProfile(user);
	}
	
//	Set File
	public void setFile( String fileName, String fileSize) {
		txt.setFile(fileName, fileSize);
	}
	 
	
	
}
