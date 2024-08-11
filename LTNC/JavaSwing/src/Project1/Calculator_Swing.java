package Project1;

import java.awt.BorderLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator_Swing extends JFrame{
	
	private static final long serialVersionUID = 1L;



	public Calculator_Swing() {
		setTitle("Calculator");
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JPanel jPanelDisplay = new JPanel()	;
		jPanelDisplay.setLayout(new BorderLayout());
		
		JTextField jTextField = new JTextField(110);
		
		jPanelDisplay.add(jTextField,BorderLayout.CENTER);
		
		
		// tạo button
		JButton jButton0 = new JButton("0")	;
		JButton jButton1 = new JButton("1")	;
		JButton jButton2 = new JButton("2")	;
		JButton jButton3 = new JButton("3")	;
		JButton jButton4 = new JButton("4")	;
		JButton jButton5 = new JButton("5")	;
		JButton jButton6 = new JButton("6")	;
		JButton jButton7 = new JButton("7")	;
		JButton jButton8 = new JButton("8")	;
		JButton jButton9 = new JButton("9")	;
		JButton jButton_Cong = new JButton("+")	;
		JButton jButton_Tru = new JButton("-")	;
		JButton jButton_Nhan = new JButton("*")	;
		JButton jButton_Chia = new JButton("/")	;
		JButton jButton_Bang = new JButton("=")	;
		
		// tạo Jpanle cho các button
		JPanel jPanelButton = new JPanel()	;
		jPanelButton.setLayout(new GridLayout(5,3));
		
		jPanelButton.add(jButton0);
		jPanelButton.add(jButton1);
		jPanelButton.add(jButton2);
		jPanelButton.add(jButton3);
		jPanelButton.add(jButton4);
		jPanelButton.add(jButton5);
		jPanelButton.add(jButton6);
		jPanelButton.add(jButton7);
		jPanelButton.add(jButton8);
		jPanelButton.add(jButton9);
		jPanelButton.add(jButton_Cong);
		jPanelButton.add(jButton_Tru);
		jPanelButton.add(jButton_Nhan);
		jPanelButton.add(jButton_Chia);
		jPanelButton.add(jButton_Bang);
		
		
		this.add(jPanelDisplay, BorderLayout.NORTH);
		this.add(jPanelButton, BorderLayout.CENTER);
		setVisible(true);

	}
	
	

	
	
	public static void main(String[] args) {
		new Calculator_Swing();
	}
}
