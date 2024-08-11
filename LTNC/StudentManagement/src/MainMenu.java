import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MainMenu extends JMenuBar {
	private static final long serialVersionUID = 1L;

	JMenu fileMenu, manageMenu;
	JMenuItem exMenuItem, subjectItem, pointItem;
	
	ActionListener manageAction;
	
	public MainMenu( MainFrame mainFrame) {
		//file menu
		fileMenu = new JMenu("File");
		
		exMenuItem = new JMenuItem("Exit");
		exMenuItem.setMnemonic('E');
		exMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		fileMenu.add(exMenuItem);
		
		
		// manage menu
		manageMenu = new JMenu("Quản lí sinh viên");
		
		manageAction = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.changePanel(e.getActionCommand());
			}
		};
		
		subjectItem = new JMenuItem("Quản lí Môn học");
		subjectItem.setMnemonic('M');
		subjectItem.setActionCommand("subject");
		subjectItem.addActionListener(manageAction);
		subjectItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
		
		
		pointItem = new JMenuItem("Quản lí Điểm");
		pointItem.setMnemonic('Đ');
		pointItem.setActionCommand("point");
		pointItem.addActionListener(manageAction);
		pointItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));

		manageMenu.add(subjectItem);
		manageMenu.add(pointItem);
		
		
						
		add(fileMenu);
		add(manageMenu);
		
		
		
	
	}
	
	
}
