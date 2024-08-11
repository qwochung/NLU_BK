package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Control.Event_Singleton;
import Modun_Strategy.Covert;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainView() throws HeadlessException {
		JFrame frame = new JFrame("MVC Strategy");
		frame.setSize(new Dimension(500, 200));
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// panel input
		JPanel inputPanel = new JPanel();

		inputPanel.setLayout(new BorderLayout());
		inputPanel.setBackground(Color.black);

		JPanel centerPanel = new JPanel();
		JLabel inputJLabel = new JLabel("Nhập số nguyên hệ DEC : ");
		JTextField inputField = new JTextField(20);

		centerPanel.add(inputJLabel);
		centerPanel.add(inputField);

		inputPanel.add(centerPanel, BorderLayout.CENTER);

		
		
		
		
		
		// button panel
		JPanel buttonPanel = new JPanel();

		JButton btn_Bin = new JButton("Covert Bin");
		JButton btn_Oct = new JButton("Covert Oct");
		JButton btn_Hex = new JButton("Covert Hex");

		buttonPanel.add(btn_Bin);
		buttonPanel.add(btn_Oct);
		buttonPanel.add(btn_Hex);
		
		
		
		

		
		
		
		
		
		
		// result Panel
		JPanel resultPanel = new JPanel();

		resultPanel.setLayout(new BorderLayout());
		resultPanel.setBackground(Color.black);

		JPanel centerResultPanel = new JPanel();
		JLabel resultxJLabel = new JLabel("Result : ");
		JTextField resultField = new JTextField(20);
		resultField.setEditable(false);
		
		
		
		centerResultPanel.add(resultxJLabel);
		centerResultPanel.add(resultField);

		resultPanel.add(centerResultPanel, BorderLayout.CENTER);

		
		
		
		
		
		
		// add event
		
				btn_Bin.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						
						
						if (inputField.getText().isEmpty()) {
							System.err.println("trống");
						}
						
						
						
						else {
							int input = Integer.parseInt(inputField.getText());
							Object result =  Event_Singleton.getInstance().getCovert().converTo(input, Covert.BIN);
							resultField.setText(String.valueOf(result));
							
							
						}
						
						
						
					}
				});
				
				
				
				btn_Oct.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						
						
						if (inputField.getText().isEmpty()) {
							System.err.println("trống");
						}
						
						
						
						else {
							int input = Integer.parseInt(inputField.getText());
							Object result =  Event_Singleton.getInstance().getCovert().converTo(input, Covert.OCT);
							resultField.setText(String.valueOf(result));
							
							
						}
						
						
						
					}
				});
				btn_Hex.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						
						
						if (inputField.getText().isEmpty()) {
							System.err.println("trống");
						}
						
						
						
						else {
							int input = Integer.parseInt(inputField.getText());
							Object result =  Event_Singleton.getInstance().getCovert().converTo(input, Covert.HEX);
							resultField.setText(String.valueOf(result));
							
							
						}
						
						
						
					}
				});
		
		
		
		
		
		
		
		
		frame.add(inputPanel, BorderLayout.NORTH);
		frame.add(buttonPanel, BorderLayout.CENTER);
		frame.add(resultPanel, BorderLayout.SOUTH);

		frame.setVisible(true);

	}

	public static void main(String[] args) {
		MainView mainView = new MainView();

	}
}
