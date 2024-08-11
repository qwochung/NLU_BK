package Tuan10;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape{

	public Line(Point p1, int type, Color color, boolean isFill) {
		super(p1, type, color, isFill);
	}

	@Override
	public void resize(Point p) {
		this.p2 = p;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
	}
	
	
}
