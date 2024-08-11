import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;

public class Menu extends JFrame{
	private static final long serialVersionUID = 1L;
	
	
	JMenuBar menuBar;
	JMenu fileMenu , optionMenu, subMenu;
	JMenuItem NewMenuItem, opneMenuItem, emptyMenuItem,   exMenuItem, subMenuItem1, subMenuItem2;
	
	JRadioButton radioButton1, radioButton2;
	JCheckBox checkBox1, checkBox2;
	ButtonGroup groupButton;
	public Menu() {
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setJMenuBar(new myMenu());
		
		
		
		setVisible(true);
		
		
		
		
	}
	class myMenu extends JMenuBar {
		private static final long serialVersionUID = 1L;

		public myMenu() {
			menuBar = new JMenuBar()	;
			
			
			/**
			 *  File menu
			 */
			fileMenu = new JMenu("File");
			fileMenu.setMnemonic('F');
			
			
			// newMenuItem
			NewMenuItem  =  new JMenuItem("New ...");
			NewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
			fileMenu.add(NewMenuItem);
			
			
			
			// Open menu item
			
			opneMenuItem = new JMenuItem("Open...");
			opneMenuItem.setMnemonic('O');
			ImageIcon icon1 = new ImageIcon("src/open-folder.png");
			Image scaleImage1 =	 icon1.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			icon1 = new  ImageIcon(scaleImage1);
			opneMenuItem.setIcon(icon1);
			fileMenu.add(opneMenuItem);
			
			// empty menu item
			
			emptyMenuItem = new JMenuItem();
			ImageIcon icon2 = new ImageIcon("src/out-of-stock.png");
			Image scaleImage2=	 icon2.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			icon2 = new  ImageIcon(scaleImage2);
			emptyMenuItem.setIcon(icon2);
			fileMenu.add(emptyMenuItem);
			 			
					
			fileMenu.addSeparator()	; // thêm dấu phân cách
			
			
			// radio button menu 
			groupButton = new ButtonGroup(); // tạo button group cho 2 radiobutton
			radioButton1 = new JRadioButton("A radio button menu item 1");
			radioButton1.setMnemonic('1');
			
			radioButton2 = new JRadioButton("A radio button menu item 2");
			radioButton2.setMnemonic('2');
			
			
			groupButton.add(radioButton1);
			groupButton.add(radioButton2);
			
			fileMenu.add(radioButton1);
			fileMenu.add(radioButton2);
			
			fileMenu.addSeparator()	; // thêm dấu phân cách

			
			
			// Check box 
			checkBox1 = new JCheckBox("A check box menu item 1");
			checkBox2 = new JCheckBox("A check box menu item 2");
			
			fileMenu.add(checkBox1);
			checkBox1.setMnemonic('c');
			
			fileMenu.add(checkBox2);
			checkBox2.setMnemonic('A');
			
			
			// subMenu
			
			subMenu = new JMenu("A SubMenu");
			subMenu.setMnemonic('s');
			
			subMenuItem1 = new JMenuItem("An item in the subMenu");
			
			subMenuItem2 = new JMenuItem("Another item in the subMenu");
			subMenuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
			
			subMenu.add(subMenuItem1);
			subMenu.add(subMenuItem2);
			
			fileMenu.add(subMenu);
			
			
			// exit menu item
			exMenuItem = new JMenuItem("Exit");
			exMenuItem.setMnemonic('e');
			exMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
			
			
			fileMenu.add(exMenuItem);
			
			
			
			/**
			 *  Option mennu
			 */
			
			optionMenu = new JMenu("Options");
			optionMenu.setMnemonic('p');
			
			
			
			
			add(fileMenu);
			add(optionMenu);
			
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		new Menu();
	}
	
}
