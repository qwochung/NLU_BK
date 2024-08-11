package Project1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyDemo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int count = 0;
	

	public MyDemo() {
		setTitle("My Demo");
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2,1));
		addComps();
		
		getContentPane().setBackground(Color.PINK);
	}

	public void addComps() {
		// create panel
		JPanel panel = new JPanel();
		
		
		
		
		
		// create lable and add it to the panle
		JLabel label = new JLabel();
		label.setText( "Number of button clicks : " + count);
		

		
		
		
				
		// create button
		JButton button = new JButton("Cick here to....");

		// create action for button

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JButton actionButton = (JButton) e.getSource();
			
				if (actionButton.getText().equalsIgnoreCase(button.getText())) {
					count ++;
					label.setText( "Number of button clicks : " + count);
				}

			}
		});
		panel.setBackground(Color.darkGray);
		panel.add(button);
//		panel.add(label);
		getContentPane().add(panel);
		getContentPane().add(label);
	
	}

	public static void main(String[] args) {
		new MyDemo();
	}
}
