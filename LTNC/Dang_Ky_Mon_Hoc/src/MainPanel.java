
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	JPanel titlePanel, registerPanel;
	JLabel titleLabel,  idStudentLabel, nameStudentLabel, idClassLabel,
			listSubjectLabel;
	JTextField idStudentField, nameStudentField, idClassField;
	JComboBox<String> subComboBox;
	String [] subList = {"Lập trình nâng cao", "Toán rời rạc", "Lý thuyết đồ thị" ,"Lập trình mạng"};
	JButton submitButton, cancelButton, countCoursesButton, removeButton;
	ArrayList<Student> listStudents;
	Object[][] data;
	JTable table ;
	JScrollPane scrollPane;
	int count;
	
	
	public MainPanel () {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//		setLayout(new GridLayout(4,1));
		
		

		//label " Form Đăng kí môn học" 
		titlePanel = new JPanel();
		titleLabel = new JLabel("Form Đăng kí môn học", JLabel.CENTER);
		titlePanel.add(titleLabel);
		
	
		//panel đăng kí 
		registerPanel = new JPanel() ;
		registerPanel.setLayout(new FlowLayout());
		
		
		// tại panel chứa thông tin sinh viên
		JPanel inforPanel  = new JPanel()	;
		inforPanel.setLayout(new GridLayout(3,2 ));
		idStudentLabel = new JLabel("Mã số sinh viên : ");
		nameStudentLabel = new JLabel("Họ và tên : ");
		idClassLabel = new JLabel("Mã số lớp : ");
		
		idStudentField = new JTextField(20);
		nameStudentField = new JTextField(20);
		idClassField = new JTextField(20);
	
		inforPanel.add(idStudentLabel);
		inforPanel.add(idStudentField);
		inforPanel.add(nameStudentLabel);
		inforPanel.add(nameStudentField);
		inforPanel.add(idClassLabel);
		inforPanel.add(idClassField);
		
		
		// tạo panel chứa danh sách các môn học
		JPanel subPanel = new JPanel()	;
		subPanel.setLayout(new FlowLayout());
		
		listSubjectLabel = new JLabel("Danh sách môn học : ");
		subComboBox = new JComboBox<>();
		subComboBox.setModel(new DefaultComboBoxModel<String>( subList));
		
		subPanel.add(listSubjectLabel);
		subPanel.add(subComboBox);
		
		
		
		registerPanel.add(inforPanel);
		registerPanel.add(subPanel);
		
		
		// tạo panel cho các nút nhấn
		
		JPanel buttonPanel = new JPanel()	;
		buttonPanel.setLayout(new FlowLayout( FlowLayout.CENTER));
		listStudents = new  ArrayList<>()	;
		
		 count = 1;
		submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (idStudentField.getText().length() !=0 && nameStudentField.getText().length() !=0 && idClassField.getText().length() !=0 ) {
					
				
				Student student = new Student(idStudentField.getText(), nameStudentField.getText()
												, idClassField.getText(), (String)(subComboBox.getSelectedItem()));
				
				listStudents.add(student);
				
					DefaultTableModel newModel = (DefaultTableModel) table.getModel();
					String[] newRow  = { String.valueOf(count++), student.getId(),student.getName()	, student.getIdclass(), student.getSubject()    };
					newModel.addRow(newRow);
				
				
				
				}		
			}
		});
		
		
		
		
		
		
		
		
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				idStudentField.setText("");
				nameStudentField.setText("");
				idClassField.setText("");
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		countCoursesButton = new JButton("CountCourses");
		removeButton = new JButton("Remove");
		
		buttonPanel.add(submitButton);
		buttonPanel.add(cancelButton);
		buttonPanel.add(countCoursesButton);
		buttonPanel.add(removeButton);
		
		
		
		//titlepanel
		JPanel subPanel2 = new JPanel()	;
		subPanel2.setLayout(new GridLayout(1,4));
		JLabel sttLabel = new JLabel("STT");
		JLabel maSVLabel = new JLabel("Mã SV");
		JLabel hotenLabel = new JLabel("Họ tên");
		JLabel lopLabel = new JLabel("Lớp");
		JLabel monhocLabel = new JLabel("Môn học");
		
		subPanel2.add(sttLabel);
		subPanel2.add(maSVLabel);
		subPanel2.add(hotenLabel);
		subPanel2.add(lopLabel);
		subPanel2.add(monhocLabel);
		
		
		
		String[] columns = {"STT","Mã sinh viên", "Họ và tên", "Lớp", "Môn học"};
		Object[][] data = new Object [0][columns.length];
				
		DefaultTableModel model = new DefaultTableModel(data, columns);
		table = new JTable(model);
		
		
		
		
		scrollPane = new JScrollPane( table	);
		
		// add các component vào MainPanel
		add(titlePanel);
		add(registerPanel);
		add(buttonPanel);
//		add(subPanel2);
		add(scrollPane);
		
	
	
	
	}
	
}
