package Cau3;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

import Cau2.ArtObject;
import Cau2.Painting;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	JPanel lablePanel , inforPanel , buttonPanel, displayPanel ;
	JLabel titleLabel , nameLabel, yearLabel, typeLabel, styleLabel, artistLabel ;
	JTextField nameField , yeField;
	JButton buttonAdd, buttonSort;
	static JTextArea displayArea;
	JComboBox<String> typeBox, styleBox, artistBox;
	String []  typeList, styleList, artistList;
	static int count;
	JScrollPane scrollPane;
	static ArrayList<Painting > list ;
	JTextArea area;
	boolean isSort;
	
	public MyPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		lablePanel = new JPanel()	;
		titleLabel = new JLabel("QUẢN LÍ TÁC PHẨM HỘI HỌA", JLabel.CENTER) ;
		lablePanel.add(titleLabel);
		
		
		
		// panel thông tin
		inforPanel = new JPanel()	;
		inforPanel.setLayout(new GridLayout( 5,2) );
		
		nameLabel = new JLabel("Tên tác phẩm : ");
		yearLabel = new JLabel("Năm sáng tác : ");
		typeLabel = new JLabel("Loại tranh : ");
		styleLabel = new JLabel("Phong cách : ");
		artistLabel = new JLabel("Tên tác giả : ");
		
		nameField = new JTextField(30);
		yeField = new JTextField(30);
		
		typeList = new String[] { "Sơn dầu", "Sơn mài", "Gốm","Đơn sắc", "Men", "Thủy mặc"};
		styleList = new String [] { "Cổ điển", "Hiện đại"};
		artistList = new String[] { "Leonardo Da Vinci" ,"Vincent Vangogh","Botero"};	
		
		typeBox = new JComboBox<String>(typeList);
		styleBox = new JComboBox<String>(styleList);
		artistBox = new JComboBox<String>(artistList);
		
		
		inforPanel.add(nameLabel);
		inforPanel.add(nameField);
		inforPanel.add(yearLabel);
		inforPanel.add(yeField);
		inforPanel.add(typeLabel);
		inforPanel.add(typeBox);
		inforPanel.add(styleLabel);
		inforPanel.add(styleBox);
		inforPanel.add(artistLabel);
		inforPanel.add(artistBox);
		
		
		buttonPanel = new JPanel()	;
		buttonPanel.setLayout(new FlowLayout());
		
		buttonAdd = new JButton("Thêm");
		ImageIcon iconAdd = new ImageIcon("src/Cau3/add.png") ;
		Image scaleImage = iconAdd.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		iconAdd = new ImageIcon(scaleImage);
		buttonAdd.setIcon(iconAdd);
		buttonAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nameField.getText().equals("") || yeField.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
					
				}
				if (checkChar(yeField.getText()) == false) {
					JOptionPane.showInternalMessageDialog(null, "\"Năm sáng tác\" phải là số nguyên ");
				}
				
				else {
					Painting painting = new Painting(nameField.getText(),
							(String) artistBox.getSelectedItem(),Integer.valueOf(yeField.getText()) 
							, (String) typeBox.getSelectedItem() , (String) styleBox.getSelectedItem());
					list.add(painting);
					nameField.setText("");
					yeField.setText("");
					
					if (isSort) {
						Collections.sort(list);
						count  = 1;
						area.setText("");
						for (Painting art : list) {
							
							displayArea.append(String.valueOf(count++) +"-\t" + art.getTitle() + "\t" + art.getArtist() 
												+ "\t" + art.getYear()+ "\t" + art.getPaintType()+ "\t" + art.getStyle() + "\n") ;
						}
					}
					
					
					else {
						area.append((String.valueOf(count++) +"-\t" + painting.getTitle() + "\t" + painting.getArtist() 
								+ "\t" + painting.getYear()+ "\t" + painting.getPaintType()+ "\t" + painting.getStyle() + "\n"));
					}	
					
					
					
					
					
					
				}
			}
		});
		
		
		buttonSort = new JButton("Sắp sếp");
		ImageIcon iconSort = new ImageIcon("src/Cau3/sort.png") ;
		Image scaleImage2 = iconSort.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		iconSort = new ImageIcon(scaleImage2);
		buttonSort.setIcon(iconSort);
		buttonSort.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				isSort = true;
				Collections.sort(list);
				area.setText("");
				count = 1;
				for (Painting art : list) {
					
					displayArea.append(String.valueOf(count++) +"-\t" + art.getTitle() + "\t" + art.getArtist() 
										+ "\t" + art.getYear()+ "\t" + art.getPaintType()+ "\t" + art.getStyle() + "\n") ;
				}
				
				
			}
		});
		
		
		
		
		
		buttonPanel.add(buttonAdd);
		buttonPanel.add(buttonSort);
		
		// 
		
		displayPanel = new JPanel()	;
		displayPanel.setLayout(new GridLayout(1,1));
		Border border = BorderFactory.createLineBorder(Color.black);
		
		displayPanel.setBorder( BorderFactory.createTitledBorder(border, "Thông tin về tác phẩm hội họa"));
		
		area = MyPanel.viewPaintingList();
		
		scrollPane = new JScrollPane(area);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVisible(true);
		
		
		
		
		displayPanel.add(scrollPane);
		
		
		add(lablePanel);
		add(inforPanel);
		add(buttonPanel);
		add(displayPanel);
		
		 
		
	}
	public static JTextArea viewPaintingList( )  {
		displayArea = new JTextArea()	;
//		displayArea.setRows(6);
		displayArea.setForeground(Color.blue);
		displayArea.setEditable(false);
		displayArea.setForeground(SystemColor.activeCaption);
		
		list = ArtObject.createPaintingList()	;
		count = 1;
		for (Painting art : list) {
			
			displayArea.append(String.valueOf(count++) +"-\t" + art.getTitle() + "\t" + art.getArtist() 
								+ "\t" + art.getYear()+ "\t" + art.getPaintType()+ "\t" + art.getStyle() + "\n") ;
		}
		
		return displayArea;
		
	}
	
	public static boolean checkChar( String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))== true ) {
				return false;
			}
			
		}
		
		return true;
	}
	
}
