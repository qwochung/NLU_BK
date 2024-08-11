import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComponent;

public class Paint extends JFrame {
	public static final int NO_SHAPE = 0;
	public static final int RECTANGLE = 1;
	public static final int OVAL = 2;
	
	Color color;
	int shape;
	boolean isFill, started;
	

	ArrayList<point> points;
	private static final long serialVersionUID = 1L;

	public Paint() {
		
		
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Paint");
		this.setLocationRelativeTo(null);
//		this.add(new panel());
		this.getContentPane().add(new panel());
		
		
		

	}

	// tạo inner class panel
	public class panel extends JPanel {
		
		
		private static final long serialVersionUID = 1L;
		

		public panel() {
			points = new ArrayList<point>();

			color = Color.gray;
			shape = RECTANGLE;
			this.setLayout(new BorderLayout());

			this.add(new topPanel(), BorderLayout.NORTH);
			this.add(new leftPanel(), BorderLayout.WEST);
			this.add(new centerPanel(), BorderLayout.CENTER);

		}

	}


	
	// tạo inner class cho topPanel

	class topPanel extends JPanel {

		private static final long serialVersionUID = 1L;

		public topPanel() {
			setLayout(new FlowLayout());
			setBackground(Color.pink);

			// 2 button ở topPanel
			JButton redButton = new JButton("Red");
			redButton.setBackground(Color.red);
			
			redButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					color = Color.red;
					System.out.println("Red");
					super.mouseClicked(e);
				}
			});
			
			
			
			
			
			
			
			
			JButton blueButton = new JButton("Blue");
			blueButton.setBackground(Color.blue);
		
			blueButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					color = Color.blue;
					System.out.println("Blue");
					super.mouseClicked(e);
				}
			});

			add(redButton);
			add(blueButton);

			// 4 radioButton
			JRadioButton squareButton = new JRadioButton("Square");
			squareButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					shape = RECTANGLE;
					System.out.println("Square");
//					super.mouseClicked(e);
				}
			});
			

			JRadioButton ovalButton = new JRadioButton("Oval");
			ovalButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					shape = OVAL;
					System.out.println("Oval");
//					super.mouseClicked(e);
				}
			});

			JRadioButton fillButton = new JRadioButton("Fill");
			fillButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					System.out.println("Fill");
					isFill = true;
//					super.mouseClicked(e);
				}
			});

			JRadioButton outLineButton = new JRadioButton("Out Line");
			outLineButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					isFill = false;
					System.out.println("Out Line");
//					super.mouseClicked(e);
				}
			});

			ButtonGroup shapeButtonGroup = new ButtonGroup();
			shapeButtonGroup.add(squareButton);
			shapeButtonGroup.add(ovalButton);
			add(squareButton);
			add(ovalButton);

			ButtonGroup typeButtonGroup = new ButtonGroup();
			typeButtonGroup.add(fillButton);
			typeButtonGroup.add(outLineButton);
			add(fillButton);
			add(outLineButton);
		}

	}
	
	 
	class leftPanel extends JPanel{

		
		private static final long serialVersionUID = 1L;

		public leftPanel() {
			 setLayout(new FlowLayout());
			 setBackground(Color.pink);
			 
			 JButton clearButton = new JButton("Clear");
			 clearButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					points.clear();
					Paint.centerPanel centerPanel = new Paint.centerPanel();
					centerPanel.repaint();
					}
				
			});
			 add(clearButton);
			 
			
		}
	}
	

	class centerPanel extends JPanel {
		
		private static final long serialVersionUID = 1L;

		public centerPanel() {
			setBackground(Color.yellow);
			
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == MouseEvent.BUTTON1) {
						started= true;
					}else if (e.getButton() == MouseEvent.BUTTON3){
						started  = false;
					}
//					super.mouseClicked(e);
				}	
			});
			
		addMouseMotionListener(new MouseAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					if (started) {
						points.add(new point(e.getX(), e.getY(), isFill, color, shape));
						repaint()	;
					}
//					super.mouseClicked(e);
				}
			});
			
		}
	
	 
	 protected void paintComponent(Graphics g) {
		 super.paintComponent(g);
		for (point point : points) {
			g.setColor(point.color);
			
			
			switch (point.shape) {
			case RECTANGLE:{
				if (point.isFill ) {
					g.fillRect(point.x, point.y, 20, 20);
					
				}else {
					g.drawRect(point.x, point.y, 20, 20);
				}
				
				break;}
			case OVAL:{
				if (point.isFill ) {
					g.fillOval(point.x, point.y, 20, 20);
					
				}else {
					g.drawOval(point.x, point.y, 20, 20);
				}
				break;
			}
				
			
			}
		}
	}
	 
	 
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	public static void main(String[] args) {
		Paint paint = new Paint();
		paint.setVisible(true);
	}

}
