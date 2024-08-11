package Tuan9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MyPanel extends JPanel {
	public static final int NO_SHAPE = 0;
	public static final int RECTANGLE = 1;
	public static final int OVAL = 2;

	// initial
	JPanel topPanel, leftPane, drawPanel;
	JButton btnRed, btnBlue, btnClear;
	JRadioButton rdBtnSquare, rdBtnOval, rdBtnFill, rdBtnOutline;
	ButtonGroup shapeGroup, typeGroup;

	//point to draw shape
	ArrayList<Point> points;

	Color color;
	int shape;
	boolean isFill, started;

	public MyPanel() {
		setLayout(new BorderLayout());
		points = new ArrayList<Point>();

		color = Color.GRAY;
		shape = RECTANGLE;

		// Top Panel
		topPanel = new TopPanel();
		add(topPanel, BorderLayout.NORTH);

		leftPane = new LeftPanel();
		add(leftPane, BorderLayout.WEST);

		drawPanel = new DrawPanel();
		add(drawPanel, BorderLayout.CENTER);
	}

	//Border layout North
	public class TopPanel extends JPanel {
		TopPanel() {
			//1. setLayout
			setLayout(new FlowLayout());
			// 2. others setup
			setBackground(Color.PINK);

			// 3. generate elements
			generateColorButton();
			generateRadioButton();
		}

		private void generateRadioButton() {
			// Shape
			rdBtnSquare = new JRadioButton("Square", true);
			//event listener
			rdBtnSquare.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					shape = RECTANGLE;
					System.out.println("Square");
				}
			});
			//add button to TopPanel
			add(rdBtnSquare);

			rdBtnOval = new JRadioButton("Oval");
			rdBtnOval.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					shape = OVAL;
					System.out.println("OVAL");
				}
			});
			add(rdBtnOval);

			// radio button -> add to button group
			shapeGroup = new ButtonGroup();
			shapeGroup.add(rdBtnSquare);
			shapeGroup.add(rdBtnOval);

			// Type
			rdBtnFill = new JRadioButton("Fill");
			rdBtnFill.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					isFill = true;
					System.out.println("Fill");
				}
			});
			add(rdBtnFill);

			rdBtnOutline = new JRadioButton("Outline", true);
			rdBtnOutline.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					isFill = false;
					System.out.println("Outline");
				}
			});
			add(rdBtnOutline);

			typeGroup = new ButtonGroup();
			typeGroup.add(rdBtnFill);
			typeGroup.add(rdBtnOutline);

		}

		private void generateColorButton() {
			// red button
			btnRed = new JButton("Red");
			btnRed.setBackground(Color.RED);
			btnRed.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					color = Color.RED;
				}
			});
			add(btnRed);

			// blue button
			btnBlue = new JButton("Blue");
			btnBlue.setBackground(Color.BLUE);
			btnBlue.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					color = Color.BLUE;
				}
			});
			add(btnBlue);

		}
	}

	class LeftPanel extends JPanel {
		LeftPanel() {
			setLayout(new FlowLayout());
			setBackground(Color.pink);

			btnClear = new JButton("Clear all");
			btnClear.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					points = new ArrayList<>();
					drawPanel.repaint();
				}
			});
			add(btnClear);
		}
	}

	class DrawPanel extends JPanel {
		public DrawPanel() {
			setBackground(Color.yellow);

			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == MouseEvent.BUTTON1) {
						started = true;
					} else if (e.getButton() == MouseEvent.BUTTON3) {
						started = false;
					}
				}
			});

			addMouseMotionListener(new MouseAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					if (started) {
						points.add(new Point(e.getX(), e.getY(), isFill, color, shape));
						repaint();
					}
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(Point p: points) {
				g.setColor(p.color);
				switch(p.shape) {
				case RECTANGLE:{
					if(p.isFill) {
						g.fillRect(p.x, p.y, 20, 20);
					}
					else {
						g.drawRect(p.x, p.y, 20, 20);
					}
					break;
				}
				case OVAL: {
					if(p.isFill) {
						g.fillOval(p.x, p.y, 20, 20);
					}
					else {
						g.drawOval(p.x, p.y, 20, 20);
					}
					break;
				}
				}
			}
		}
	}
}
