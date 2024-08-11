package ExternalClass;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JComponent;

public class ActiveStatus extends JComponent {
	private static final long serialVersionUID = 1L;
	private boolean active;
	
	
	
	
	public ActiveStatus() {
		setPreferredSize(new Dimension(8,8));
	}




	public boolean isActive() {
		return active;
	}




	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	@Override
	public void paint(Graphics g) {
		if (active) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2.setColor(new Color(62,165,49));
			g2.fillOval(0, (getHeight()/2)-4, 7, 7);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
