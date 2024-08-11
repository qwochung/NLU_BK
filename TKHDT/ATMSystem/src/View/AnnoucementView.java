package View;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AnnoucementView extends JComponent {
	
	private static final long serialVersionUID = 1L;
	private JTextField txtField_TranferAmount;
	private JTextField txtField_NewBalance;
	private JTextField txtField_Date;
	private JTextField txtField_TransactionType;
	MainView mainView;

	public AnnoucementView(MainView mainView) {
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

		JLabel lblMain = new JLabel("Successful Transaction");
		lblMain.setBounds(49, 22, 354, 43);
		lblMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblMain.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel.add(lblMain);

		JLabel lblTransferAmount = new JLabel("Transferred:");
		lblTransferAmount.setBounds(49, 121, 134, 25);
		lblTransferAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTransferAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblTransferAmount);

		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(49, 191, 134, 25);
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblDate);

		JLabel lblNewBalance = new JLabel("New Balance:");
		lblNewBalance.setBounds(49, 156, 134, 25);
		lblNewBalance.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewBalance);

		txtField_TransactionType = new JTextField();
		 txtField_TransactionType.setForeground(new Color(65, 20, 1));
		txtField_TransactionType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtField_TransactionType.setEditable(false);
		txtField_TransactionType.setColumns(10);
		txtField_TransactionType.setBorder(null);
		txtField_TransactionType.setBounds(193, 86, 210, 25);
		txtField_TransactionType.setOpaque(false);
		panel.add(txtField_TransactionType);

		txtField_TranferAmount = new JTextField();
		txtField_TranferAmount.setForeground(new Color(65, 20, 1));
		txtField_TranferAmount.setBounds(193, 121, 210, 25);
		txtField_TranferAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtField_TranferAmount.setEditable(false);
		txtField_TranferAmount.setColumns(10);
		txtField_TranferAmount.setBorder(null);
		txtField_TranferAmount.setOpaque(false);
		panel.add(txtField_TranferAmount);

		txtField_NewBalance = new JTextField();
		txtField_NewBalance.setForeground(new Color(65, 20, 1));
		txtField_NewBalance.setBounds(193, 156, 210, 25);
		txtField_NewBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtField_NewBalance.setEditable(false);
		txtField_NewBalance.setColumns(10);
		txtField_NewBalance.setBorder(null);
		txtField_NewBalance.setOpaque(false);
		panel.add(txtField_NewBalance);

		txtField_Date = new JTextField();
		txtField_Date.setForeground(new Color(65, 20, 1));
		txtField_Date.setBounds(193, 191, 210, 25);
		txtField_Date.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtField_Date.setEditable(false);
		txtField_Date.setColumns(10);
		txtField_Date.setBorder(null);
		txtField_Date.setOpaque(false);
		panel.add(txtField_Date);

		JLabel labelTransactionType = new JLabel("Type:");
		labelTransactionType.setHorizontalAlignment(SwingConstants.RIGHT);
		labelTransactionType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTransactionType.setBounds(49, 86, 134, 25);
		panel.add(labelTransactionType);

		JButton printReceiptBttn = new JButton("Print receipt");
		printReceiptBttn.setBounds(70, 240, 121, 35);
		printReceiptBttn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(printReceiptBttn);

		JButton finishBttn = new JButton("Finish");
		finishBttn.setBounds(261, 240, 121, 35);
		finishBttn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		finishBttn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainView.showCard("homePage");
			}
		});
		
		panel.add(finishBttn);

	}

	public void setup(String type, String amount, int balance, LocalDate localDate) {
		txtField_TransactionType.setText(type);
		txtField_TranferAmount.setText((amount));
		txtField_NewBalance.setText(String.valueOf(balance));

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// Chuyển LocalDate thành chuỗi
		String formattedDate = localDate.format(formatter);

		txtField_Date.setText(String.valueOf(formattedDate));

	}

}
