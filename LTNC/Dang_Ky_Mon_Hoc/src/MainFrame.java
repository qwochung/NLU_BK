import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public MainFrame () {
		setSize(800,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Đăng Kí Môn Học");
		getContentPane().add(new MainPanel());
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
