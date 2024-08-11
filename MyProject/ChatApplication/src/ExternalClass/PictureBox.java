package ExternalClass;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;

public class PictureBox extends JLayeredPane {

	private static final long serialVersionUID = 1L;
	private Icon image ;
	
	
	
	
	
	
	public Icon getImage() {
		return image;
	}

	public void setImage(Icon image) {
		this.image = image;
	}

@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null) {
			Rectangle size = getAutoSize(image);
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR); 
			g2.drawImage(toImage(image), size.getLocation().x,size.getLocation().y, size.getSize().width, size.getSize().height, null);
		
		}
		
		
	}


	private Rectangle getAutoSize(Icon image) {
		int w = getWidth();
		int h = getHeight();
		int iw = image.getIconWidth();
		int ih = image.getIconHeight();
		if (iw < w || ih < h) {
	        // Tính toán tỉ lệ scale để phóng to ảnh
	        double scale = Math.max((double) w / iw, (double) h / ih);
	        iw = (int) (iw * scale * 80/100);
	        ih = (int) (ih * scale * 80/100);
	        
	    }
		if (iw > w || ih > h) {
	        // Nếu vượt quá frame, tính toán tỉ lệ scale để thu nhỏ hình ảnh
	        double scale = Math.min((double) w / iw, (double) h / ih);
	        iw = (int) (iw * scale);
	        ih = (int) (ih * scale);
	    }

	    // Tính toán vị trí để căn giữa hình ảnh trong panel
	    int x = (w - iw) / 2;
	    int y = (h - ih) / 2;

	    return new Rectangle(new Point(x, y), new Dimension(iw, ih));
		
	}
	
	private Image toImage(Icon icon ) {
		return ((ImageIcon)icon).getImage();
	}
}
