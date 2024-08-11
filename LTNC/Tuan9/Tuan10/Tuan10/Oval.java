package Tuan10;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Shape {
	int width, height;

	public Oval(Point p1, int type, Color color, boolean isFill) {
		super(p1, type, color, isFill);
	}

	@Override
	public void resize(Point p) {
		this.p2 = new Point(p.x, p.y);
		
		this.width = Math.abs(p2.x - p1.x);
		this.height = Math.abs(p2.y - p1.y);
	}

	@Override
	public void draw(Graphics g) {
		if (isFill) {
			g.fillOval(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y), width, height);
		} else {
			g.drawOval(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y), width, height);
		}
	}
}
