package Component;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JButton;

public class Menu_Button extends JButton {

	private static final long serialVersionUID = 1L;
	
	private Icon iconSimple;
	private Icon iconSelected;
	
	
	public Icon getIconSimple() {
		return iconSimple;
	}


	public void setIconSimple(Icon iconSimple) {
		this.iconSimple = iconSimple;
	}


	public Icon getIconSelected() {
		return iconSelected;
	}


	public void setIconSelected(Icon iconSelected) {
		this.iconSelected = iconSelected;
	}


	public Menu_Button() {
		setContentAreaFilled(false);
		setCursor(new Cursor(Cursor.HAND_CURSOR));

	}

	
	@Override
	public void setSelected(boolean b) {
		super.setSelected(b);
		if (b) {
			setIcon(iconSelected);
		}
		else {
			setIcon(iconSimple);
		}
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
