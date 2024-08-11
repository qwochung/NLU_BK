package Component;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;

import Event.PublicEvent;
import ExternalClass.PictureBox;
import net.miginfocom.swing.MigLayout;

public class Chat_Image extends JLayeredPane {

	private static final long serialVersionUID = 1L;

	public Chat_Image() {
		setLayout(new MigLayout("", "[]", "[]"));
		
		
		//	 Test
//		addImage("LYLN0uIA~ps,^+x]S5WXxvW=M|kC");
//		add(new Image_Item() , "cell 0 0");
		
		
	}
	public void addImage(Icon ... images) {
		for (Icon image : images) {
			PictureBox	pic = new PictureBox();
//			pic.setPreferredSize(getAutoSize(image, image.getIconWidth()*50/100 , image.getIconHeight()*50/100));
			pic.setPreferredSize(getAutoSize(image, 300,300));
			pic.setImage(image);
			addEvent(pic, image);
			add(pic , " al center, wrap");
		}
	}
	public void addImage(String ... images) {
		add(new Image_Item() , "wrap");
		for (String image : images) {
			Image_Item	pic = new Image_Item();
			pic.setImage(image);
			pic.setPreferredSize(new Dimension( 300,300));
			add(pic , " al center, wrap");
		}
	}
	private Dimension getAutoSize(Icon image, int w, int h ) {
	    int iw = image.getIconWidth();
	    int ih = image.getIconHeight();
	    double xScale = (double) w / iw;
	    double yScale = (double) h / ih;
	    double scale = Math.min(xScale, yScale);
	    int width = (int) (scale * iw);
	    int height = (int) (scale * ih);
	    return  new Dimension(width, height);
	}
	
	private void addEvent(Component comp, Icon image) {
		comp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		comp.addMouseListener( new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					PublicEvent.getInstance().getEventImageView().imageView(image);
				}
			}
		});
	}
	
}
