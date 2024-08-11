package Tuan11;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PointPanel extends JPanel{
	JPanel subjectPanel, operationPanel;
	JTextArea area;
	
	JLabel mssv, hoten, monhoc, diem;
	JTextField mssvf, hotenf, diemf;
	JComboBox<String> comboMonhoc;
	
	JButton themdiem, timsv;
	
	public PointPanel(){
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		subjectPanel = new SubjectPanel();
		add(subjectPanel);
		
		operationPanel = new OperationPanel();
		add(operationPanel);
		
		area = new JTextArea(5, 3);
		area.setBackground(Color.white);
		area.setText("STT \t Tên Môn học \t Điểm");
		
		JScrollPane scrollPane = new JScrollPane(area, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		add(scrollPane);
		
	}
	
	class SubjectPanel extends JPanel{
		SubjectPanel(){
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			Border border = BorderFactory.createLineBorder(Color.BLUE);
			
			setBorder(BorderFactory.createTitledBorder(border, "Thêm Môn học"));
			
			
			JPanel mssvPanel = new JPanel();
			mssvPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
			mssv = new JLabel("MSSV");
			mssvf = new JTextField();
			mssvf.setPreferredSize(new Dimension(250, 30));
			mssvPanel.add(mssv);
			mssvPanel.add(mssvf);
			add(mssvPanel);
			
			JPanel hotenPanel = new JPanel();
			hotenPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
			hoten = new JLabel("Họ và Tên");
			hotenf = new JTextField();
			hotenf.setPreferredSize(new Dimension(250, 30));
			hotenPanel.add(hoten);
			hotenPanel.add(hotenf);
			add(hotenPanel);
			
			JPanel monhocPanel = new JPanel();
			monhocPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
			monhoc = new JLabel("Môn học");
			String[] arrayMonhoc = {"11111 Lập trình nâng cao", "2222 Lý thuyết đồ thị"};
			comboMonhoc = new JComboBox<String>(arrayMonhoc);
			comboMonhoc.setPreferredSize(new Dimension(250, 30));
			monhocPanel.add(monhoc);
			monhocPanel.add(comboMonhoc);
			add(monhocPanel);
			
			JPanel diemPanel = new JPanel();
			diemPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
			diem = new JLabel("Điểm");
			diemf = new JTextField();
			diemf.setPreferredSize(new Dimension(250, 30));
			diemPanel.add(diem);
			diemPanel.add(diemf);
			add(diemPanel);
		}
	}
	
	class OperationPanel extends JPanel{
		
		public OperationPanel() {
			setLayout(new FlowLayout());
			Border border = BorderFactory.createLineBorder(Color.blue);
			setBorder(BorderFactory.createTitledBorder(border, "Thao tác"));
			themdiem = new JButton("Thêm điểm");
			add(themdiem);
			
			timsv = new JButton("Tìm Sinh viên");
			add(timsv);
		}
	}
}
