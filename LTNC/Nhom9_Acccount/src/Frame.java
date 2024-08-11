import javax.swing.JFrame;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;

	public Frame() {
		
		setTitle("Acccount");
		setSize(500,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().add(new MainPanel());		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Frame();
	}
}
