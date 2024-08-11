package Component;

import java.awt.Dimension;

import javax.swing.JScrollBar;

import ExternalClass.ModernScrollPane;

public class ScrollBar extends JScrollBar {

	private static final long serialVersionUID = 1L;
	
		public ScrollBar() {
			setUI(new ModernScrollPane.ModernScrollBarUI());
			setPreferredSize(new Dimension(5,5));
			setUnitIncrement(25);
		}

}
