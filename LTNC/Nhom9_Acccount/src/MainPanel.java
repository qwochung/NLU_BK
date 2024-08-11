
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	JPanel inforPanel, displayPanel, buttonPanel;
	JLabel numberLabel, nameLabel, moneyLabel;
	JTextField numberField, nameField, moneyField;
	JTable table;
	JScrollPane scrollPane;
	JButton addButton, clearButton, exButton;
	ArrayList< String> listData ;
	
	public MainPanel() {
		setLayout(new BorderLayout());
		listData = new ArrayList<>();
		
		inforPanel  = new JPanel();
		inforPanel.setLayout(new GridLayout(3,2));
		inforPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		numberLabel = new JLabel("Account Number: ");
		nameLabel = new JLabel("Account Name: ");
		moneyLabel = new JLabel("Account Money: ");
		
		
		numberField = new JTextField(30);
		nameField = new JTextField(30);
		moneyField = new JTextField(30);
		
		inforPanel.add(numberLabel);
		inforPanel.add(numberField);
		inforPanel.add(nameLabel);
		inforPanel.add(nameField);
		inforPanel.add(moneyLabel);
		inforPanel.add(moneyField);
		
		displayPanel = new JPanel()	;
		String [] title = {"Acc Number", "Acc Name", "Acc Money"};
		String [][] data = new String [0][title.length];
		
		DefaultTableModel model = new DefaultTableModel(data,title);
		
		table = new JTable(model) ;
		
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		displayPanel.add(scrollPane);
		
		
		
		buttonPanel = new JPanel() ;
		buttonPanel.setLayout(new FlowLayout( FlowLayout.CENTER));
		
		addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (numberField.getText().equals("") || nameField.getText().equals("") || moneyField.getText().equals("") ){
					JOptionPane optionPane = new JOptionPane()	;
					JOptionPane.showMessageDialog(optionPane, "Thiếu dữ liệu");
				}
				else {
					
				String [] accout = {numberField.getText() , nameField.getText(), moneyField.getText() };
//				listData.add( String.join(" ", accout)); // nối các thành phần nằm trong mãng data thàng 1 chuỗi 
				DefaultTableModel updaTableModel = (DefaultTableModel) table.getModel();
				updaTableModel.addRow(accout);
				
				
				}
			}
		});
		
		
		
		clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int selecRow = table.getSelectedRow();
				if (selecRow != -1) {
					DefaultTableModel updaTableModel = (DefaultTableModel ) table.getModel()	;
					updaTableModel.removeRow(selecRow);
				}
			}
		});
		
		
		
		
		
		exButton = new JButton("Exit"); 
		exButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		buttonPanel.add(addButton);
		buttonPanel.add(clearButton);
		buttonPanel.add(exButton);
		
		
		add(inforPanel, BorderLayout.NORTH);
		add(displayPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
	}
	
}
