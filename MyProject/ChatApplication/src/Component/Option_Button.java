package Component;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;

import javax.swing.JButton;

public class Option_Button extends JButton {

	private static final long serialVersionUID = 1L;
	
	

	
	public Option_Button() {
		super();
		setContentAreaFilled(false);
		setCursor(new Cursor( Cursor.HAND_CURSOR));
	}

	@Override
	public void setSelected(boolean b) {
		super.setSelected(b);
		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (isSelected()) {
			g.setColor(new Color(162, 166, 166));
			g.fillRect(0, getHeight()-2, getWidth(), getHeight());
			
		}
	}
}
