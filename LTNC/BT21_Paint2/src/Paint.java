import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Paint extends JFrame {
	private static final long serialVersionUID = 1L;



	public Paint () {
		this.setSize(500,500);
		this.setTitle("Paint");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.getContentPane().add(new myPanel());
		
		
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		setVisible(true);
	}

	
	public class myPanel extends JPanel{
	
		private static final long serialVersionUID = 1L;
		JPanel topPanel , rightPanel, botPanel, centerPanel;
		JRadioButton fillButton;
		JButton rectButton, ovlButton , lineButton, redButton, blueButton, yellowButton, greenButton, clearButton;
		int shapeType;
		public final int RECT = 1;
		public final int OVAL = 2;
		public final int LINE = 3;
		
		public myPanel (){
			setLayout(new BorderLayout());
			topPanel = new topPanel()	;
			rightPanel = new rightPanel();
			botPanel = new botPanel();
			centerPanel= new centerPanel();
			
			
			add(topPanel , BorderLayout.NORTH);
			add(rightPanel, BorderLayout.EAST);
			add(botPanel, BorderLayout.SOUTH);
			add(centerPanel, BorderLayout.CENTER);
			
		}
		
		
		
		
		
		
		
		
		public class topPanel extends JPanel{
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public topPanel () {
				setBackground(Color.pink);
				shapeType = 0;
				// button Rect
				rectButton = new JButton("Rect");
				add(rectButton);
				rectButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						shapeType = RECT;
					}
				});
				
				
				
				// button Ovla
				ovlButton = new JButton("Ovla");
				add(ovlButton);
				ovlButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						shapeType = OVAL;
					}
				});
				
				
				
				// button Line
				
				lineButton = new JButton("Line");
				add(lineButton);
				lineButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						shapeType = LINE;
					}
				});
				
				
				fillButton = new JRadioButton("Fill");
				add(fillButton);
				
				
				
			}
		}
		
		
		
		
		
		
		public class rightPanel extends JPanel {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public rightPanel() {
				setLayout(new GridLayout(6, 1, 20, 20));
				setBackground(Color.pink);
				clearButton = new JButton("Clear All")	;
//				clearButton.setPreferredSize(new Dimension(30,30));
				add(clearButton);
				add(new buttonColor());
				
				

			}
		}
		
		
		public class buttonColor extends JButton {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public buttonColor() {
				setLayout(new GridLayout(2,2));
				
				
				redButton = new JButton("Red") ;
				redButton.setBackground(Color.red);
				
				
				blueButton = new JButton("BLue") ;
				blueButton.setBackground(Color.blue);
				
				
				greenButton = new JButton("Green") ;
				greenButton.setBackground(Color.green);
				
				
				yellowButton = new JButton("Yellow") ;
				yellowButton.setBackground(Color.yellow);
				
				add(redButton);
				add(blueButton);
				add(greenButton);
				add(yellowButton);
				
			}
		}
		
		
		
		
		
		public class botPanel extends JPanel{
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public botPanel() {
				setBackground(Color.pink);

				JLabel label = new JLabel(" Drawing");
				add(label);
			}
		}
		
		
		
		
		
		public class centerPanel extends JPanel {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public centerPanel() {
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Paint();
	}
}
