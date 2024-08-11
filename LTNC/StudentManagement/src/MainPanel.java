import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel  extends JPanel{
	private static final long serialVersionUID = 1L;
	JPanel cardPanel, defaultPanel;
	JLabel label ;
	
	CardLayout cardLayout;
	
	public MainPanel() {
		setLayout(new BorderLayout());
		
		cardLayout = new CardLayout();
		cardPanel = new JPanel()	;
		cardPanel.setLayout(cardLayout);
		cardPanel.add("default", new defaultPanel());
		cardPanel.add("point", new pointPanel());
		
		add(cardPanel);
	
	}
	
	// phương thức để thay đối panel hiển thị
	public void changePanel( String namePanel) {
		cardLayout.show(cardPanel, namePanel);
		
	}
	
	
	public class defaultPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		
		public defaultPanel() {
			setLayout(new BorderLayout());
			label = new JLabel("QUẢN LÍ SINH VIÊN KHOA CNTT", JLabel.CENTER);
			add(label, BorderLayout.CENTER);
		}
		
	}
	
}
