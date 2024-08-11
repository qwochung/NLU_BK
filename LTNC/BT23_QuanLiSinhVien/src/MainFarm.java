
import javax.swing.JFrame;

public class MainFarm extends JFrame{
	private static final long serialVersionUID = 1L;

	
	
	
	
	
	
	public MainFarm () {
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Quản lí sinh viên");
		setJMenuBar(new Menu());
		
		
		
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new MainFarm()	;
	}
}
