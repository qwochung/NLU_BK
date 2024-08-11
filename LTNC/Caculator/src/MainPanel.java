
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	JTextField dispalyField;
	JPanel buttonJPanel;
	
	public MainPanel() {
		
		setLayout(new BorderLayout());
		
		
		dispalyField = new JTextField();
		dispalyField.setEditable(false);
		dispalyField.setPreferredSize(new Dimension( 400,80));
		
		buttonJPanel = new JPanel() ;
		buttonJPanel.setLayout(new GridLayout(4,4));
		
		String [] listButton = { "7", "8","9", "/",
								"4","5","6","*",
								"1", "2", "3", "-",
								"0" , ".", "=", "+"};
		
		for (String string : listButton) {
			JButton button = new JButton(string);
			buttonJPanel.add(button);
		}
		
		
		
		add(dispalyField, BorderLayout.NORTH);
		add(buttonJPanel, BorderLayout.CENTER);
		
	}
}
