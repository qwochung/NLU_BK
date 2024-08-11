package View;

import javax.swing.*;

import Control.MainEvent;

import java.awt.*;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class WithdrawalSuccessful extends JComponent{
	private static final long serialVersionUID = 1L;
	private JTextField txtTranferred;
	private JTextField txtBalence;
	private JTextField txtDate;
	private JTextField txtType;
	MainView mainView;
	
	public WithdrawalSuccessful(MainView mainView) {
		this.mainView = mainView;
		setEnabled(false);
		
		JPanel panel = new JPanel() {
			private static final long serialVersionUID = 1L;

			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				// Vẽ hình nền
				ImageIcon background = new ImageIcon("background.jpg");
				Image bgImage = background.getImage();
				// Vẽ hình ảnh phù hợp với kích thước của panel
				g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);
			}
		};
		
		panel.setBounds(0, 0, 470, 340);
		add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Successful Withdrawal");
		label.setBounds(49, 22, 354, 43);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel.add(label);
		
		JLabel lbTransfer = new JLabel("Trasferred:");
		lbTransfer.setBounds(49, 121, 134, 25);
		lbTransfer.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTransfer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lbTransfer);
		
		JLabel lbDate = new JLabel("Date:");
		lbDate.setBounds(49, 191, 134, 25);
		lbDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lbDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lbDate);
		
		JLabel lbBalance = new JLabel("New Balance:");
		lbBalance.setBounds(49, 156, 134, 25);
		lbBalance.setHorizontalAlignment(SwingConstants.RIGHT);
		lbBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lbBalance);
		
		txtTranferred = new JTextField();
		txtTranferred.setForeground(new Color(65, 20, 1));
		txtTranferred.setBounds(193, 121, 210, 25);
		txtTranferred.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTranferred.setEditable(false);
		txtTranferred.setColumns(10);
		txtTranferred.setBorder(null);
		txtTranferred.setOpaque(false);
		panel.add(txtTranferred);
		
		txtBalence = new JTextField();
		txtBalence.setForeground(new Color(65, 20, 1));
		txtBalence.setBounds(193, 156, 210, 25);
		txtBalence.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtBalence.setEditable(false);
		txtBalence.setColumns(10);
		txtBalence.setBorder(null);
		txtBalence.setOpaque(false);
		panel.add(txtBalence);
		
		txtDate = new JTextField();
		txtDate.setForeground(new Color(65, 20, 1));
		txtDate.setBounds(193, 191, 210, 25);
		txtDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDate.setEditable(false);
		txtDate.setColumns(10);
		txtDate.setBorder(null);
		txtDate.setOpaque(false);
		panel.add(txtDate);
		
		txtType = new JTextField();
		txtType.setForeground(new Color(65, 20, 1));
		txtType.setOpaque(false);
		txtType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtType.setEditable(false);
		txtType.setColumns(10);
		txtType.setBorder(null);
		txtType.setBounds(193, 86, 210, 25);
		txtType.setOpaque(false);
		panel.add(txtType);
		
		JButton btnNewButton = new JButton("Print receipt");
		btnNewButton.setBounds(70, 240, 121, 35);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(MainEvent.getInstances().printReceipt());
			}
		});
		panel.add(btnNewButton);
		
		
		
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.setBounds(261, 240, 121, 35);
		btnFinish.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFinish.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainView.showCard("homePage");
			}
		});
		panel.add(btnFinish);
		
		JLabel labelNewLabel_1 = new JLabel("Type:");
		labelNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		labelNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelNewLabel_1.setBounds(49, 86, 134, 25);
		panel.add(labelNewLabel_1);
	}
	
	
	
	public void setup(String type, String amount, int balance, LocalDate localDate) {
		txtType.setText(type);
		txtTranferred.setText((amount));
		txtBalence.setText(String.valueOf(balance));

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// Chuyển LocalDate thành chuỗi
		String formattedDate = localDate.format(formatter);

		txtDate.setText(String.valueOf(formattedDate));

	}
	
}
	

