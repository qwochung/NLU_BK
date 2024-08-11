package Emoji;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Model_Emoji {
	int id;
	Icon icon;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Icon getIcon() {
		return icon;
	}
	public void setIcon(Icon icon) {
		this.icon = icon;
	}
	
	
	
	public Model_Emoji(int id, Icon icon) {
		super();
		this.id = id;
		this.icon = icon;
	}
	
	
	
	public Model_Emoji() {
		super();
	}
	
	public Model_Emoji toSize (int x, int y) {
		return new Model_Emoji(id, new ImageIcon(((ImageIcon) icon ).getImage().getScaledInstance(y, x, Image.SCALE_SMOOTH)));
	}
	
}
