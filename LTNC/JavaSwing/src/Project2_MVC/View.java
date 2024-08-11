package Project2_MVC;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View  extends JFrame{
	
	private static final long serialVersionUID = 1L;

	CounterModel counterModel ;
	
	JButton buttonUp ;
	JButton buttonDown ;
	JLabel jLabel ;
	JPanel jPanel;
	
	
	public View() {
		this.counterModel = new CounterModel()	;
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Couter");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		buttonUp = new JButton("Up");
		
	
		buttonDown = new JButton("Down");

		
		jLabel = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);
		
		
		jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		
		jPanel.add(buttonUp ,BorderLayout.WEST);
		jPanel.add(buttonDown ,BorderLayout.EAST);
		jPanel.add(jLabel ,BorderLayout.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
		
		
		// tạo action
		ActionListener action = new CounterListener(this);
		
		buttonUp.addActionListener(action);
		buttonDown.addActionListener(action);

		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
