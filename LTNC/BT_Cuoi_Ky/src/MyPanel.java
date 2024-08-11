
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	JPanel introPanel,  pointPanel, cardPanel;
	JLabel qLyJLabel;
	CardLayout cardLayout;
	ArrayList<Student> list;
	
	public MyPanel() {
		list = Student.createStudentList()	;
		setLayout(new BorderLayout());
		
		// các bước đầu tiên cbi cho cardpanel
		cardLayout = new CardLayout()	;
		cardPanel = new JPanel();
		cardPanel.setLayout(cardLayout);
		
		
		// intropanel
		introPanel = new JPanel();
//		introPanel.setLayout(new BorderLayout());
		qLyJLabel = new JLabel("Quản Lí Sinh Viên khoa CNTT.");
		introPanel.add(qLyJLabel);
		introPanel.setBackground(Color.gray);
	
		
//		
//		class defaultPanel extends JPanel {
//			
//			private static final long serialVersionUID = 1L;
//
//			public defaultPanel() {
//				setLayout(new BorderLayout());
//				JLabel label;
//				label = new JLabel("QUẢN LÍ SINH VIÊN KHOA CNTT", JLabel.CENTER);
//				add(label, BorderLayout.CENTER);
//			}
//			
//		}
		
		
		
		
		// thêm các panel con vào cardPanel
		
//		cardPanel.add("intro", new defaultPanel());
		cardPanel.add("intro", introPanel);
		cardPanel.add("subject" , new subjectPanel(list));
		cardPanel.add("point", new pointPanel(list));		
		
		
		
		add(cardPanel,BorderLayout.CENTER);
	}


	public void changePanel(String namePanel) {
		cardLayout.show(cardPanel, namePanel);
	
		

		

	}
	
		
}
