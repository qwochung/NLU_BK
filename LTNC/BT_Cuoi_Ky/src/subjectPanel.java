
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class subjectPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	JPanel inforPanel, subInforPanel, operationPanel, displayPanel;
	JLabel idLabel, nameLabel, idSubjectLabel, subjectLabel;
	JTextField idField, nameField, idSubjectField, subjectField;
	JButton addSubjectButton, findButton;
	JTextArea dispalyArea;
	JScrollPane scrollPane;
	String []listSubject;
	
	public subjectPanel(ArrayList<Student> list) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		

		
		
		// inforpanel
		inforPanel = new JPanel()	;
		inforPanel.setLayout(new BorderLayout());
		Border border = BorderFactory.createLineBorder(Color.blue);
		inforPanel.setBorder(BorderFactory.createTitledBorder(border, "Thêm Môn Hoc"));
		
		
		subInforPanel = new JPanel()	;
		subInforPanel.setLayout(new GridLayout(4, 2));
		
		
		idLabel = new JLabel("MSSV:") ;
		nameLabel = new JLabel("Họ và Tên:");
		idSubjectLabel = new JLabel("Mã Môn Học:");
		subjectLabel = new JLabel("Tên Môn Học:");
		
		idField = new JTextField(25);
		nameField = new JTextField(25);
		nameField.setEditable(false);
		idSubjectField = new JTextField(25);
		subjectField = new JTextField(25);
		
		subInforPanel.add(idLabel);
		subInforPanel.add(idField);
		subInforPanel.add(nameLabel);
		subInforPanel.add(nameField);
		subInforPanel.add(idSubjectLabel);
		subInforPanel.add(idSubjectField);
		subInforPanel.add(subjectLabel);
		subInforPanel.add(subjectField);
		
		inforPanel.add(subInforPanel, BorderLayout.EAST);
		
	
		
		// operation panel
		operationPanel = new JPanel();
		operationPanel.setBorder(BorderFactory.createTitledBorder(border, "Thao tác"));
		
		
		listSubject = new String[] {"Thiết kế hướng đối tượng","Lập trình nâng cao","Lý thuyết đồ thị","Lập trình cơ bản" };
		
		
		addSubjectButton = new JButton("Thêm Môn Học");
		addSubjectButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 1;
				if (nameField.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập MSSV và ấn tìm kiếm.!");
				}
				else if (idSubjectField.getText().isEmpty() || subjectField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ mã và tên môn học!!.");
				} 
				else if (checkSubject(listSubject, subjectField.getText()) == false) {
					JOptionPane.showMessageDialog(null, "Không tìm thấy môn học.");
				}
				else {
					Student student = new Student(Integer.valueOf(idField.getText()), nameField.getText(), Integer.valueOf(idSubjectField.getText())
							, subjectField.getText(), 0.0);	
					list.add(student);
					dispalyArea.append("\n"+String.valueOf(count) +" \t " + student.getSubject() + "\t\t\t\t " + student.getPoint());
					
				}
				
			}
		});
		
		
		
		
		
		
		
		
		findButton = new JButton("Tìm Sinh Viên");
		
		findButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 int count = 1;
				if (idField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nhập Mã Số Sinh Viên.");
				}
				
				
				
				
				if (find(list, idField.getText()) ) {
					for (Student student : list) {
						if (  student.getIdName() == Integer.valueOf(idField.getText()))    {
							dispalyArea.append("\n"+String.valueOf(count) +" \t " + student.getSubject() + "\t\t\t\t " + student.getPoint());
							nameField.setText(student.getName());
						}
					}
					
				}
				
				
				
				
				else {
					JOptionPane.showMessageDialog(null, "Nhập Mã Số sai.");
				}
				
			}
		});
		
		
		
		
		
		operationPanel.add(addSubjectButton);
		operationPanel.add(findButton);
		
		
		
		
		
		// display panel
		displayPanel = new JPanel()	;
		displayPanel.setLayout(new BorderLayout());
		
		dispalyArea = new JTextArea(); 
		dispalyArea.append("STT \t Tên Môn Học \t\t\t\t\t Điểm");
		
		
		
		scrollPane = new JScrollPane()	;
		scrollPane.setViewportView(dispalyArea);
		
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		displayPanel.add(scrollPane);
		
		
		
		
		add(inforPanel);
		add(operationPanel);
		add(displayPanel);
		
	}
	
	public static boolean find(ArrayList<Student> list, String id) {
		for (Student student : list) {
			if (  student.getIdName() == Integer.valueOf(id))    {
				return true;
			
			}
		}
		return false;
		
	}
	
	
	public static boolean checkSubject( String [] list, String subject) {
		for (String string : list) {
			if (string.equals(subject)) {
				return true;
			}
		}
		return false;
	}
	
}
