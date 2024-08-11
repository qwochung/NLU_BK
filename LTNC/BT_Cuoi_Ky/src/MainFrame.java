import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
		MyPanel myPanel;
	
	public MainFrame() {
		setSize(600,400);
		setTitle("Khoa Công Nghệ Thông Tin");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		myPanel = new MyPanel()	;
		getContentPane().add(myPanel);
		setJMenuBar(new MyMenu( this));
		
		
		setVisible(true);
		
		
	
	
	}
	public void changePanel( String namePanel) {
		myPanel.changePanel( namePanel);
		
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
