package Tuan10;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	Point p1, p2;
	int type;
	Color color;
	boolean isFill;
	public Shape(Point p1, int type, Color color, boolean isFill) {
		super();
		this.p1 = p1;
		this.type = type;
		this.color = color;
		this.isFill = isFill;
	}
	
	public abstract void resize(Point p);
	
	public abstract void draw(Graphics g);
}
