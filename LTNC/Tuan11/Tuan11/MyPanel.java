package Tuan11;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyPanel extends JPanel{
	JPanel cardPanel, defaultPanel;
	
	CardLayout cardLayout;
	
	
	MyPanel(){
		setLayout(new BorderLayout());
		cardLayout = new CardLayout();
		
		cardPanel = new JPanel();
		cardPanel.setLayout(cardLayout);
		
		cardPanel.add("default", new DefaultPanel());
		cardPanel.add("point", new PointPanel());
		
		add(cardPanel, BorderLayout.CENTER);
	}
	
	public void change(String panelName) {
		cardLayout.show(cardPanel, panelName);
	}
	
	class DefaultPanel extends JPanel{
		JLabel label;
		
		public DefaultPanel() {
			setLayout(new BorderLayout());
			label = new JLabel("Quản lý sinh viên K.CNTT", JLabel.CENTER);
			label.setFont(new Font(null, 1, 15));
			add(label, BorderLayout.CENTER);
		}
	}
}
