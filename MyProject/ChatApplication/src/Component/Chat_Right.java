package Component;

import javax.swing.Icon;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
public class Chat_Right extends JLayeredPane {

	private static final long serialVersionUID = 1L;
	Chat_Item txt;
	/**
	 * Create the panel.
	 */
	public Chat_Right() {
		setLayout(new BorderLayout(10, 10));
		
		txt = new Chat_Item();
		
		txt.setBackground(new Color(151, 249, 249).brighter());
		add(txt);

	}
	
//	set Text
 	public void setText(String text) {
 		txt.setBorder(new EmptyBorder(15,0,0,0));
 		if (!txt.isEmpty()) {
			txt.hideText();
		}
		else {
			txt.setText(text);
		}
		
		
	}
// 	Set Time
	public void setTime() {
		txt.setTime("16:10 PM", SwingConstants.RIGHT);
	}
	
//	Set Image ( Icon )
	public void setImage( Icon...images) {
		txt.setImage(true, images);
	}
	
	
//	set file
	public void setFile( String fileName, String fileSize) {
		txt.setFile(fileName, fileSize);
	}
	 
}
