
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar {
	private static final long serialVersionUID = 1L;
	
	JMenu fileJMenu, quanLySinhVienJMenu;
	JMenuItem exitItem;
	
	
	public Menu () {
		
		fileJMenu = new JMenu("File")	;
		fileJMenu.setMnemonic('F');
		
		
		
		
		
		
		
		
		
		add(fileJMenu);
				
	}

}
