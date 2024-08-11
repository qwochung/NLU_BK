import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	MainMenu mainMenu;
	MainPanel mainPanel;
	public MainFrame() {
		setTitle("Quản lí sinh viên khoa CNTT");
		setSize(800,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		mainPanel = new MainPanel();
		mainMenu = new MainMenu( this);
		
		setJMenuBar(mainMenu);
		
		
		getContentPane().add(mainPanel);
		
		
		setVisible(true);
		
	}
	
	public void changePanel( String namePanel) {
		mainPanel.changePanel(namePanel);
	}
	
	public static void main(String[] args) {
		new MainFrame();
		
	}
	
}
