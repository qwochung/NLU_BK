package ExternalClass;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

public class PanelSlide extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;

	public int getAnimate() {
		return animate;
	}

	public void setAnimate(int animate) {
		this.animate = animate;
	}

	public PanelSlide() {
		setPreferredSize(new Dimension(300, 300));
		list = new ArrayList<>();
		timer = new Timer(0, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				animate();
			}
		});

	}

	private final List<Component> list;
	private final Timer timer;
	private Component comExit;
	private Component comShow;
	private int currentShowing;
	private boolean animateRight;
	private int animate = 8;
	private int locateXCom;

	public void init(Component... com) {
		if (com.length > 0) {
			for (Component c : com) {
				list.add(c);
				c.setSize(getPreferredSize());

				c.setVisible(false);
				this.add(c);
			}
			// get first componect to show on panel when init
			Component show = list.get(0);
			show.setVisible(true);
			show.setLocation(0, 0);
		}
	}

	public void show(int index) {
		if (!timer.isRunning()) {
			if (list.size() > 1 && index < list.size() && index != currentShowing) {
				comShow = list.get(index);

				comExit = list.get(currentShowing);
				animateRight = index < currentShowing;
				currentShowing = index;
				comShow.setVisible(true);
				if (animateRight) {
					comShow.setLocation(-comShow.getWidth(), 0);
					
                    locateXCom = comShow.getX();

				} else {

					comShow.setLocation(getWidth(), 0);
					locateXCom = comShow.getX();

				}
				timer.start();
			}
		}
	}

	private void animate() {
		
		;
		if (animateRight) {
			

			if (locateXCom < 0) {
			
				comShow.setLocation(locateXCom + animate, 0);
				locateXCom += animate;
				comExit.setLocation(comExit.getLocation().x + animate, 0);
			} else {
				// Stop animate
			
				comShow.setLocation(0, 0);
				timer.stop();
				comExit.setVisible(false);
			}
		} else {

			if (locateXCom > getX()) {

				comShow.setLocation(locateXCom - animate, 0);
				locateXCom -= animate;
				comExit.setLocation(comExit.getLocation().x - animate, 0);
			} else {

				comShow.setLocation(0, 0);
				timer.stop();
				comExit.setVisible(false);
			}
		}
	}
}