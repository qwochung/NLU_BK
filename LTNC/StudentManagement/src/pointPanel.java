
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class pointPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	JPanel addSubjectPanel, operationPanel  ;
	JTextArea displayArea;
	JLabel idLabel, nameLabel, subjectLabel, pointLabel;
	JTextField idTextField, nameTextField,  poinTextField;
	JComboBox<String > comboSubject;
	JButton addPointButton, findStudentButton;
	
	public pointPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		
		// tạo panel để nhập thông tin sinh viên
		addSubjectPanel = new JPanel();
		addSubjectPanel.setLayout(new BorderLayout());
		
		JPanel inforPanel = new JPanel();
		inforPanel.setLayout(new GridLayout(4,2));
		
				//label
		idLabel = new JLabel("MSSV");
		nameLabel = new JLabel("Họ và Tên");
		subjectLabel = new JLabel("Môn Học");
		pointLabel = new JLabel("Điểm");
		
		
				// text field
		idTextField = new JTextField();
		idTextField.setPreferredSize(new Dimension(250,30));
		nameTextField = new JTextField(1);
		poinTextField = new JTextField(10);
		
		String [] listSubject = { "1111 Lập trình nâng cao", "2222 Lý thuyết đồ thị", "3333 Lập trình cơ bản", "9999 Thiết kế hướng đối tượng" };
		comboSubject = new JComboBox<String>(listSubject);
		
		
		inforPanel.add(idLabel);
		inforPanel.add(idTextField);
		inforPanel.add(nameLabel);
		inforPanel.add(nameTextField);
		inforPanel.add(subjectLabel);
		inforPanel.add(comboSubject);
		inforPanel.add(pointLabel);
		inforPanel.add(poinTextField);
		
		addSubjectPanel.add(inforPanel, BorderLayout.EAST);
		
		
		
		// operation panel
		operationPanel = new JPanel()	;
		
		addPointButton = new JButton("Thêm điểm");
		findStudentButton = new JButton("Tìm sinh viên");
		
		operationPanel.add(addPointButton);
		operationPanel.add(findStudentButton);
		
		
		
		
		// text area
		displayArea = new JTextArea();
		
		
		
		
		add(addSubjectPanel);
		add(operationPanel);
		add(displayArea);
	}
	
}
