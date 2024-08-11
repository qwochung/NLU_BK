package Component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class Loading extends JComponent {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Loading() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lb = new JLabel("");
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		lb.setBackground(new Color(255, 255, 255));
		lb.setIcon(new ImageIcon(Loading.class.getResource("/Image_Icon/loading.gif")));
		add(lb);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g.create();
		g2.setColor(new Color(255, 255,255, 150));
		g2.fillRect(0, 0, getWidth(), getHeight());
		g2.dispose();
	}
}
