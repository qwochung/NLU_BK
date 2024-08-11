package Component;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

public class Line extends JLabel {

	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(210, 210, 210));
		g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
	}

}
