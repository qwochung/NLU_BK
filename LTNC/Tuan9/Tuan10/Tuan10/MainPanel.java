package Tuan10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainPanel extends JPanel {

	public static final int NO_SHAPE = 0;
	public static final int RECTANGLE = 1;
	public static final int OVAL = 2;
	public static final int LINE = 3;

	JPanel topPanel, rightPanel, botPanel, drawPanel;
	JRadioButton rdBtnFill;
	JButton btnRect, btnOval, btnLine, btnClear, btnRed, btnBlue, btnYellow, btnGreen;

	int type;
	Color color;

	boolean started;

	ArrayList<Shape> shapes;

	public MainPanel() {
		setLayout(new BorderLayout());
		type = NO_SHAPE;
		color = Color.black;
		shapes = new ArrayList<Shape>();
		started = false;

		topPanel = new TopPanel();
		rightPanel = new RightPanel();
		botPanel = new BottomPanel();
		drawPanel = new DrawPanel();

		add(topPanel, BorderLayout.NORTH);
		add(rightPanel, BorderLayout.EAST);
		add(botPanel, BorderLayout.SOUTH);
		add(drawPanel, BorderLayout.CENTER);

	}

	public void setType(int type) {
		this.type = type;
	}

	class TopPanel extends JPanel {

		public TopPanel() {
//			setLayout(new FlowLayout());
			setBackground(Color.pink);
			// Rectangle button
			btnRect = new JButton("RECT");
			btnRect.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					type = RECTANGLE;
				}
			});
			add(btnRect);

			// Oval button
			btnOval = new JButton("OVAL");
			btnOval.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					type = OVAL;
				}
			});
			add(btnOval);

			// Line button
			btnLine = new JButton("Line");
			btnLine.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					type = LINE;
				}
			});
			add(btnLine);

			// Radio button Fill
			rdBtnFill = new JRadioButton("Fill");
			add(rdBtnFill);
		}
	}

	class RightPanel extends JPanel {

		public RightPanel() {
			setLayout(new GridLayout(5, 1, 0, 20));
			setBackground(Color.pink);
			btnClear = new JButton("Clear All");
			add(btnClear);

			// Color
			add(createColorPanel());
		}

		public JPanel createColorPanel() {
			JPanel colorPanel = new JPanel();
			colorPanel.setLayout(new GridLayout(2, 2));

			btnRed = new JButton();
			btnRed.setBackground(Color.red);
			btnRed.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					color = Color.red;
				}
			});
			colorPanel.add(btnRed);

			btnBlue = new JButton();
			btnBlue.setBackground(Color.blue);
			btnBlue.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					color = Color.blue;
				}
			});
			colorPanel.add(btnBlue);

			btnGreen = new JButton();
			btnGreen.setBackground(Color.green);
			btnGreen.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					color = Color.green;
				}
			});
			colorPanel.add(btnGreen);

			btnYellow = new JButton();
			btnYellow.setBackground(Color.yellow);
			btnYellow.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					color = Color.yellow;
				}
			});
			colorPanel.add(btnYellow);

			return colorPanel;
		}
	}

	class BottomPanel extends JPanel {
		JLabel label;

		public BottomPanel() {
			setBackground(Color.pink);
			label = new JLabel("DRAWING...");
			label.setFont(new Font(null, 1, 15));
			add(label);

		}
	}

	class DrawPanel extends JPanel {

		public DrawPanel() {
			setBackground(Color.lightGray);

			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == MouseEvent.BUTTON1) {
						if(type == NO_SHAPE) {
							return;
						}
						if (!started) {
							started = true;
							switch (type) {
							case RECTANGLE: {
								shapes.add(new Rectangle(new Point(e.getX(), e.getY()), type, color,
										rdBtnFill.isSelected()));
								break;
							}
							case OVAL: {
								shapes.add(new Oval(new Point(e.getX(), e.getY()), 
											type, color, rdBtnFill.isSelected()));
								break;
							}
							case LINE: {
								shapes.add(new Line(new Point(e.getX(), e.getY()), 
											type, color, rdBtnFill.isSelected()));
								break;
							}
							}
						} else {
							started = false;
							Shape s = shapes.get(shapes.size() - 1);
							s.resize(new Point(e.getX(), e.getY()));
							repaint();
						}
					} else {
						started = false;
					}
				}

			});

		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (Shape s : shapes) {
				g.setColor(s.color);
				s.draw(g);
			}
		}
	}

}
