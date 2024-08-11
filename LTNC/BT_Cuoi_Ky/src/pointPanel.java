
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class pointPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	JPanel inforPanel, subInforPanel, operationPanel, displayPanel;
	JLabel idLabel, nameLabel, SubjectLabel, pointLabel;
	JTextField idField, nameField,  pointField;
	JComboBox<String> subjectBox;
	JButton addPointButton, findButton;
	JScrollPane scrollPane;
	JTable dispalyTable;

	public pointPanel(ArrayList<Student> list) {

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		// inforpanel
		inforPanel = new JPanel();
		inforPanel.setLayout(new BorderLayout());
		Border border = BorderFactory.createLineBorder(Color.blue);
		inforPanel.setBorder(BorderFactory.createTitledBorder(border, "Thêm Môn Hoc"));

		subInforPanel = new JPanel();
		subInforPanel.setLayout(new GridLayout(4, 2));

		idLabel = new JLabel("MSSV:");
		nameLabel = new JLabel("Họ và Tên:");
		SubjectLabel = new JLabel("Mã Môn Học:");
		pointLabel = new JLabel("Điểm:");

		idField = new JTextField(25);
		nameField = new JTextField(25);
		nameField.setEditable(false);
		pointField = new JTextField(25);
		
		String [] listSub = { "Lập trình nâng cao", "Lý thuyết đồ thị", "Lập trình cơ bản", "Thiết kế hướng đối tượng"};
		subjectBox = new JComboBox<String>(listSub);
		
		
		
		
		
		subInforPanel.add(idLabel);
		subInforPanel.add(idField);
		subInforPanel.add(nameLabel);
		subInforPanel.add(nameField);
		subInforPanel.add(SubjectLabel);
		subInforPanel.add(subjectBox);
		subInforPanel.add(pointLabel);
		subInforPanel.add(pointField);

		inforPanel.add(subInforPanel, BorderLayout.EAST);

		// operation panel
		
		operationPanel = new JPanel();
		operationPanel.setBorder(BorderFactory.createTitledBorder(border, "Thao tác"));

		
		
		
		
		
		addPointButton = new JButton("Thêm Điểm");
		addPointButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nameField.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập MSSV và ấn tìm kiếm.!");
				}
				else if (pointField.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập số điểm!");
				}
				else {
					for (Student student : list) {
						if (student.getIdName() == Integer.valueOf(idField.getText()) 
								&&  student.getSubject().equalsIgnoreCase( String.valueOf(subjectBox.getSelectedItem())) ) {
							
							list.remove(student);
							student.setPoint(Double.valueOf(pointField.getText()));
							list.add(student);
							
							updateTable(dispalyTable, pointField.getText(), String.valueOf(subjectBox.getSelectedItem()));
							
							break;
							
							
						}
					}
				}
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		findButton = new JButton("Tìm Sinh Viên");
		findButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 1;
				
				DefaultTableModel Model = (DefaultTableModel) dispalyTable.getModel()	;
				Model.setRowCount(0);
				
				if (idField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nhập Mã Số Sinh Viên.");
				}
				
				
				
				
				if (find(list, idField.getText()) ) {
					for (Student student : list) {
						if (  student.getIdName() == Integer.valueOf(idField.getText()))    {
							
							String [] newRow = { String.valueOf(count++),student.getSubject(), String.valueOf( student.getPoint()) };
							DefaultTableModel newModel = (DefaultTableModel) dispalyTable.getModel()	;
							newModel.addRow(newRow);

							
							nameField.setText(student.getName());
						}
					}
					
				}
				
				
				
				
				else {
					JOptionPane.showMessageDialog(null, "Nhập Mã Số sai.");
				}
				
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		operationPanel.add(addPointButton);
		operationPanel.add(findButton);

		// display panel
		displayPanel = new JPanel();
		displayPanel.setLayout(new BorderLayout());
		
		String [] column = { "STT" ,"Tên Môn Học" , "Điểm"};
		String [][] data = new String [0][column.length];
		DefaultTableModel model = new DefaultTableModel(data, column);
		
		dispalyTable = new JTable(model);

		scrollPane = new JScrollPane();
		scrollPane.setViewportView(dispalyTable);

		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		displayPanel.add(scrollPane);

		add(inforPanel);
		add(operationPanel);
		add(displayPanel);

	};
	
	
	public static boolean find(ArrayList<Student> list, String id) {
		for (Student student : list) {
			if (  student.getIdName() == Integer.valueOf(id))    {
				return true;
			
			}
		}
		return false;
		
	}
	
	
	
	public static void updateTable ( JTable table, String value, String subject) {
		
		DefaultTableModel newModel = (DefaultTableModel) table.getModel()	;
		
		for (int row = 0; row < table.getRowCount(); row++) {
			String name_Sub_In_Table = String.valueOf( table.getValueAt(row, 1));
			if (name_Sub_In_Table.equalsIgnoreCase(subject)) {
				newModel.setValueAt(value, row, 2);
				newModel.fireTableCellUpdated(row, 2);
				
		}
		
	}
	
		table.revalidate();
		table.repaint();
	
	
	
	
	}}	
	
	

