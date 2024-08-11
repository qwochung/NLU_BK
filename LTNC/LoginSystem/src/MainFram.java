import javax.swing.JFrame;

public class MainFram extends JFrame {
	private static final long serialVersionUID = 1L;

	
	public MainFram () {
		setSize(500,550);
		setTitle("Login System");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		getContentPane().add(new MyPanel(this) );
		
		
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new MainFram();
	}
	
}
