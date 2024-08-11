package View;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void show( String title) {
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	
	public void show( String title, int with, int height) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setTitle(title);
		this.setSize(with,height);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MyWindow m1 = new MyWindow()	;
		m1.show("Java");
		m1.setSize(300, 300);

		MyWindow m2 = new MyWindow()	;
		m2.show("Java" , 400, 250);
	}
}
