package Tuan11;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Frame extends JFrame {
	MyPanel panel;
	JMenuBar menubar;
	JMenu fileMenu, manageMenu;
	JMenuItem itemExit, itemSubject, itemPoint;

	Frame() {
		setSize(600, 400);
		setTitle("Quản lý sinh viên");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		panel = new MyPanel();
		getContentPane().add(panel);

		// JMenubar
		menubar = new JMenuBar();
		createMenu();
		createMenuItem();
		setJMenuBar(menubar);

		setVisible(true);
	}

	private void createMenuItem() {
		// File Menu Item
		itemExit = new JMenuItem("Exit");
		fileMenu.add(itemExit);
		itemExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//mange action
		ActionListener manageAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.change(e.getActionCommand());
			}
		};

		// Manage Menu Item
		itemSubject = new JMenuItem("Quản lý Môn học");
		manageMenu.add(itemSubject);
		
		itemPoint = new JMenuItem("Quản lý Điểm");
		itemPoint.setActionCommand("point");
		itemPoint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		itemPoint.addActionListener(manageAction);
		manageMenu.add(itemPoint);
		
		JMenuItem itemdefault = new JMenuItem("Default");
		itemdefault.setActionCommand("default");
		itemdefault.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		itemdefault.addActionListener(manageAction);
		manageMenu.add(itemdefault);
		
	}

	private void createMenu() {
		// File menu
		fileMenu = new JMenu("File");
		fileMenu.setFont(new Font(null, 1, 15));
		fileMenu.setMnemonic('F');
		menubar.add(fileMenu);

		// Manage menu
		manageMenu = new JMenu("Quản lý Sinh viên");
		manageMenu.setFont(new Font(null, 1, 15));
		manageMenu.setMnemonic('S');
		menubar.add(manageMenu);
		
		

	}

	public static void main(String[] args) {
		new Frame();
	}
}
