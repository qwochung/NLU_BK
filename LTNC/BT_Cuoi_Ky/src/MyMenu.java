
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MyMenu extends JMenuBar {
	private static final long serialVersionUID = 1L;

	
	JMenu fileMenu, qlyMenu;
	JMenuItem exItem, subjectItem, pointItem;
	
	public MyMenu(  MainFrame mainFrame) {
		
		// File Menu
		fileMenu = new JMenu("File");
		exItem = new JMenuItem("Exit");
		exItem.setMnemonic('E');
		exItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		
		exItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		fileMenu.add(exItem);
		
		
		
		
		// Menu quản lí sinh viên
		
		qlyMenu = new JMenu("Quản lí sinh viên")	;
		
		
		subjectItem = new JMenuItem("Quản Lí Môn Học")	;
		subjectItem.setMnemonic('M');
		subjectItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.changePanel("subject");
				
			
			}
		});
		
		pointItem = new JMenuItem("Quản Lí Điểm");
		pointItem.setMnemonic('Đ');
		pointItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.changePanel("point");
			}
		});
		
		
		
		
		
		qlyMenu.add(subjectItem);
		qlyMenu.add(pointItem);
		
		
		
		add(fileMenu);
		add(qlyMenu);
		
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
