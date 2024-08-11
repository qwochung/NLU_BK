package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBalanceView extends JComponent{
	private static final long serialVersionUID = 1L;
	private JTextField txtCardType;
	private JTextField txtAccount;
	private JTextField txtBalance;
	MainView mainView;
	
	public CheckBalanceView(MainView mainView) {
		this.mainView= mainView;
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
		
		JLabel lblNewLabel = new JLabel("Card Information");
		lblNewLabel.setBounds(110, 10, 266, 43);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel.add(lblNewLabel);
		
		JLabel lbType = new JLabel("Card type:");
		lbType.setForeground(new Color(65, 20, 1));
		lbType.setHorizontalAlignment(SwingConstants.RIGHT);
		lbType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbType.setBounds(24, 89, 134, 25);
		panel.add(lbType);
		
		JLabel lbAcc = new JLabel("Account:");
		lbAcc.setForeground(new Color(65, 20, 1));
		lbAcc.setHorizontalAlignment(SwingConstants.RIGHT);
		lbAcc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbAcc.setBounds(24, 135, 134, 25);
		panel.add(lbAcc);
		
		JLabel lbBalance = new JLabel("Balance:");
		lbBalance.setForeground(new Color(65, 20, 1));
		lbBalance.setHorizontalAlignment(SwingConstants.RIGHT);
		lbBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbBalance.setBounds(24, 180, 134, 25);
		panel.add(lbBalance);
		
		txtCardType = new JTextField();
		lbType.setLabelFor(txtCardType);
		txtCardType.setOpaque(false);
		txtCardType.setHorizontalAlignment(SwingConstants.CENTER);
		txtCardType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCardType.setEditable(false);
		txtCardType.setColumns(10);
		txtCardType.setBorder(null);
		txtCardType.setBounds(174, 85, 202, 33);
		panel.add(txtCardType);
		
		txtAccount = new JTextField();
		txtAccount.setOpaque(false);
		txtAccount.setHorizontalAlignment(SwingConstants.CENTER);
		txtAccount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAccount.setEditable(false);
		txtAccount.setColumns(10);
		txtAccount.setBorder(null);
		txtAccount.setBounds(174, 131, 202, 33);
		panel.add(txtAccount);
		
		txtBalance = new JTextField();
		txtBalance.setOpaque(false);
		txtBalance.setHorizontalAlignment(SwingConstants.CENTER);
		txtBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtBalance.setEditable(false);
		txtBalance.setColumns(10);
		txtBalance.setBorder(null);
		txtBalance.setBounds(174, 176, 202, 33);
		panel.add(txtBalance);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.setBounds(170, 232, 125, 33);
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainView.showCard("homePage");
			}
		});
		panel.add(btnCancel);
	}
	

	public void setup(String cardType, String nameAcc, int balance) {
		txtCardType.setText(cardType);
		txtAccount.setText(nameAcc);
		txtBalance.setText(String.valueOf(balance));
	}
	

}
