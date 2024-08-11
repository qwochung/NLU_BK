package Tuan9;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Rectangle extends JFrame{
	public Rectangle  (){
		this.setSize(300,300);
		
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.fillOval(20, 20, 50, 40);
	}
public static void main(String[] args) {
	Rectangle rectangle = new 	Rectangle()	;
	rectangle.setVisible(true);
	
	
	
}
}
