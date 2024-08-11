package Tuan10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {
	JMenuBar menubar;
	JMenu fileMenu, shapeMenu, colorMenu;
	JMenuItem exitItem, rectItem, ovalItem, lineItem;
	
	MainPanel mainPanel;
	
	public Frame() {
		mainPanel = new MainPanel();
		
		setSize(600, 400);
		setTitle("Painting");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(mainPanel);
		setLocationRelativeTo(null);

		// Menubar
		menubar = new JMenuBar();
		setJMenuBar(menubar);

		// fileMenu
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');
		
		//file menu item
		exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		fileMenu.add(exitItem);
		
		menubar.add(fileMenu);

		// shapeMenu
		shapeMenu = new JMenu("Shape");
		shapeMenu.setMnemonic('S');
		//initial
		rectItem = new JMenuItem("Rectangle");
		rectItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainPanel.setType(MainPanel.RECTANGLE);
			}
		});
		
		ovalItem = new JMenuItem("Oval");
		ovalItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainPanel.setType(MainPanel.OVAL);
			}
		});
		
		lineItem = new JMenuItem("Line");
		lineItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainPanel.setType(MainPanel.LINE);
			}
		});
		
		//add to shapeMenu
		shapeMenu.add(rectItem);
		shapeMenu.add(ovalItem);
		shapeMenu.add(lineItem);
		
		menubar.add(shapeMenu);

		// colorMenu -> tu lam
		colorMenu = new JMenu("Color");
		menubar.add(colorMenu);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Frame();
	}
}
