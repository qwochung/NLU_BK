package Cau3;

import javax.swing.JFrame;

public class ArtManegement extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public ArtManegement() {
		setTitle("Art Manegement");
		setResizable(false);
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().add(new MyPanel());
		
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new ArtManegement();
	}
}
