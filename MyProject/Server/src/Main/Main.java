package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Connection.DatabaseConnection;
import Service.Server_Service;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Cursor;
import javax.swing.border.EmptyBorder;

public class Main {

	private JFrame frame;
	JTextArea txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				try {
					DatabaseConnection.getInstance().connectToDatabase();
					Server_Service.getInstance(txt).startServer(); 
					
				} catch (Exception e2) {
					txt.append("Error :" + e + "\n");
				}
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txt = new JTextArea();
		txt.setEnabled(false);
		txt.setBorder(new EmptyBorder(10, 10, 10, 10));
		txt.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txt.setEditable(false);
		frame.getContentPane().add(txt, BorderLayout.CENTER);
	}

}
