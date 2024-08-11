package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainView extends JFrame {
	JPanel mainPanel, topPanel, bottomPanel;
	JTextField inputField, outputField;
	JLabel inputLabel;
	JComboBox<String> typeBox;
	JCheckBox 
	
	public void init() {
		JFrame frame = new JFrame();
		frame.setSize(new Dimension(400,200));
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		//Main Panel
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		mainPanel.setBackground(Color.orange);
		
		// top Panel
		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		topPanel.setPreferredSize(new Dimension(400, 50));
		
		inputField = new JTextField(20);
		inputLabel = new JLabel("Nhập đơn vị (m) :");
		
		topPanel.add(inputField, BorderLayout.WEST);
		topPanel.add(inputLabel, BorderLayout.EAST);
		
		
		
		// Bottom Panel
		bottomPanel =new JPanel();
		bottomPanel.setLayout(new BorderLayout());
		bottomPanel.setPreferredSize(new Dimension(400, 50));
		
		outputField = new JTextField(20);
		outputField.setEditable(false);
		outputField.setFocusable(false);
		
		String []item = { "Yard", "Feet", "Inch"};
		typeBox = new JComboBox<String>(item) ;
		
		
		bottomPanel.add(outputField, BorderLayout.WEST);
		bottomPanel.add(typeBox, BorderLayout.EAST);
		
		
		
		
		mainPanel.add(topPanel);
		mainPanel.add(bottomPanel);
		
		
		frame.setContentPane(mainPanel);
		frame.setVisible(true);
	}

	
	
	
	public static void main(String[] args) {
		MainView mainView = new MainView();
		mainView.init();
	}
}
