import javax.swing.JFrame;

public class Caculator extends JFrame{

	private static final long serialVersionUID = 1L;

	public Caculator() {
		setTitle("Caculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(400,400);
		
		getContentPane().add(new MainPanel())	;
		
		
		setVisible(true);
		
	
	}
	public static void main(String[] args) {
		new  Caculator()	;
	}
}
