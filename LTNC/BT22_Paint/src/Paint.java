import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;

public class Paint extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	boolean isDraw , isFill;
	int shapeType ;
	int starX , starY, endX , endY;
	Color color;

	
	final int NO_SHAPE = 0;
	final int REC = 1;
	final int OVAL = 2;
	final int LINE = 3;
	
	JButton rectButton , ovalButton, lineButton, clearButton, redButton, blueButton, greenButton, yellowButton;
	JRadioButton fillJRadioButton;
	JLabel botLabel ;
	JMenu fileJMenu, shapeJMenu, colorJMenu;
	JMenuItem exItem, rectItem, ovalItem, lineItem, redItem, blueItem, greenItem, yellowItem;
	
	ArrayList<Locate> locates;
	
	public  Paint  (){
		this.setSize(500,500);
		this.setTitle("Paint ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setJMenuBar(new myMenu());
		getContentPane().add( new Panel());
		
		this.setVisible(true);
		
	}
	
	
	
	public class myMenu extends JMenuBar {

		private static final long serialVersionUID = 1L;
		
		public myMenu() {
			fileJMenu = new JMenu("File");
			fileJMenu.setMnemonic('F');
			
			
			shapeJMenu = new JMenu("Shape");
			shapeJMenu.setMnemonic('S');
			
			colorJMenu = new JMenu("Color");
			colorJMenu.setMnemonic('C');
			
			
			add(fileJMenu);
			add(shapeJMenu);
			add(colorJMenu);
			
			
			exItem = new JMenuItem("Exit")	;
			exItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
			exItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			fileJMenu.add(exItem);
			
			
			// shapes Item
			rectItem = new JMenuItem("Rectangel");
			rectItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));

			rectItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					shapeType = REC;
				}
			});
			shapeJMenu.add(rectItem);
			
			
			ovalItem = new JMenuItem("Oval");
			ovalItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));

			ovalItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					shapeType = OVAL;
				}
			});
			shapeJMenu.add(ovalItem);
			
			
			
			lineItem = new JMenuItem("Line");
			lineItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));

			lineItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					shapeType = LINE;
				}
			});
			shapeJMenu.add(lineItem);
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	public class Panel extends JPanel {

		private static final long serialVersionUID = 1L;
		
		public Panel() {
			setLayout(new  BorderLayout());
			add(new centerPanel(), BorderLayout.CENTER);
			add(new topPanel(), BorderLayout.NORTH);
			add(new rightPanel(), BorderLayout.EAST);
			add(new botPanel(), BorderLayout.SOUTH);
			
		}
		
	}
	
	
	
	public class topPanel extends JPanel {
		
		private static final long serialVersionUID = 1L;

		public topPanel() {
			setLayout(new FlowLayout(FlowLayout.LEFT));
			setBackground(Color.pink);
			
			
			rectButton = new JButton("Rect");
			rectButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					shapeType = REC;
					
					
				}
			});
			
			
			ovalButton = new JButton("Oval");
			ovalButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					shapeType= OVAL;
				}
			});
			
			
			lineButton = new JButton("Line");
			lineButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					shapeType= LINE;
				}
			});
			
			
			
			fillJRadioButton  = new JRadioButton("Fill")	;
			fillJRadioButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					isFill = fillJRadioButton.isSelected()	;
				}
			});
			
			
			
			
			add(rectButton);
			add(ovalButton);
			add(lineButton);
			add(fillJRadioButton);
		}
	}
	
	
	
	
	public class rightPanel extends JPanel {
		private static final long serialVersionUID = 1L;

		public rightPanel() {
			setBackground(Color.pink);
			setLayout(new GridLayout( 5,1, 20 ,20));
			clearButton = new JButton("Clear All")	;
			clearButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					locates = new ArrayList<>();
					
					new centerPanel ().repaint();
				}
			});
			
			
			add(clearButton);
			add(colorButton());
		}
		
	}
	
	
	public JPanel colorButton() {
		JPanel resultJPanel = new JPanel()	;
		resultJPanel.setLayout(new GridLayout(2,2));
		
		redButton = new JButton("Red");
		redButton.setBackground(Color.red);
		redButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.red;
			}
		});
		
		
		
		
		blueButton = new JButton("Blue");
		blueButton.setBackground(Color.blue);
		blueButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.blue;
			}
		});
		
		
		
		greenButton = new JButton("Green");
		greenButton.setBackground(Color.green);
		greenButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.green;
			}
		});
		
		
		yellowButton = new JButton("Yelow");
		yellowButton.setBackground(Color.yellow);
		yellowButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.yellow;
			}
		});
		
		
		
		
		resultJPanel.add(redButton);
		resultJPanel.add(blueButton);
		resultJPanel.add(greenButton);
		resultJPanel.add(yellowButton);
		return resultJPanel;
	}
	
	
	public class botPanel extends JPanel {

		private static final long serialVersionUID = 1L;
		public botPanel() {
			botLabel = new JLabel()	;
			JLabel label = new JLabel();
			label.setText("Drawing..." + botLabel);
			add(botLabel);
			
		}
		
	}
	
	
	
	
	
	
	
	public class centerPanel extends JPanel {
		
		private static final long serialVersionUID = 1L;



		public centerPanel (){
			color = Color.black;
			locates = new ArrayList<Locate>();
			shapeType = NO_SHAPE ;
			
			this.setBackground(Color.LIGHT_GRAY);
			
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					super.mouseClicked(e);
					if (e.getButton() == MouseEvent.BUTTON1) {
						starX = e.getX()	;
						starY = e.getY()	;
						isDraw = true;
						if (e.isShiftDown()) {
							shapeType = LINE;
						}
						if (e.isControlDown()) {
							shapeType = OVAL;
						}
						if (e.isAltDown()) {
							shapeType = REC;
						}
					}
					
					if (e.getButton() == MouseEvent.BUTTON3) {
						isDraw = false;
						endX = e.getX();
						endY= e.getY();
						locates.add(new Locate(starX, starY, endX, endY, shapeType, color, isFill) );
//						repaint();
					}
					
					
				}
				
			});
			
			addMouseMotionListener(new MouseAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					super.mouseMoved(e);
					endX = e.getX();
					endY = e.getY();
					repaint();
					
				}
				
			});
			
			
			
			
		}
		
		
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
		
				
			
			
			if (isDraw  ) {
				
				switch (shapeType) {
				case LINE:
					g.setColor(color);
					g.drawLine(starX, starY, endX, endY);
					break;
				case OVAL:
					g.setColor(color);
					g.drawOval(starX, starY, endX - starX, endY - starY);
					break;
				
				case REC:
					g.setColor(color);
					g.drawRect(starX, starY, endX - starX, endY - starY);
					break;
				default:
					break;
				}
				
			}
				
				for (Locate locate : locates) {
					switch (locate.getShapeType()) {
					case NO_SHAPE :{
						break;
					}
					
					case LINE: {// nếu shapeType = 0 thì vẽ đg thẳng
						g.setColor(locate.getColor());
						g.drawLine(locate.getStarX(), locate.getStarY(), locate.getEndX(), locate.getEndY());
						break;}
					
						
					case OVAL:{
						// nếu shapeType = 1 thì vẽ đg hình tròn
						g.setColor(locate.getColor());
						g.drawOval(locate.getStarX(), locate.getStarY(), locate.getEndX() - locate.getStarX() , locate.getEndY() - locate.getStarY());
						break;
					}
					case REC:{
						// nếu shapeType = 2thì vẽ đg hình chữ nhật
						g.setColor(locate.getColor());
						g.drawRect(locate.getStarX(), locate.getStarY(), locate.getEndX() - locate.getStarX(), locate.getEndY() - locate.getStarY());
						break;
					}
						
					
					}
					
				}
					
				
			}
			
			
			
//				
			
		}
		
	
		
		
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Paint()	;
	}
}
