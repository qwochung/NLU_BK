package View;

import javax.swing.*;

import Control.MainEvent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JComponent {
	private static final long serialVersionUID = 1L;
	MainView mainView;
	
	public HomePage(MainView mainView) {
		this.mainView = mainView;
		setLayout(null); // Thiết lập layout null để tự do sắp xếp các thành phần

		JLabel lblNewLabel = new JLabel("Transactions");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(118, 10, 198, 48);
		add(lblNewLabel);
		
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(0, 207, 113, 41);
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		
		add(btnCancel);
		
		
		
		JButton btnDeposit = new JButton("Deposit cash");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainView.getDepositView().setup();
				mainView.showCard("depositView");
			}
		});
		btnDeposit.setBounds(0, 77, 113, 41);
		add(btnDeposit);


		JButton btnTranfer = new JButton("Transfer cash");
		btnTranfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainView.showCard("transfer");
			}
		});
		btnTranfer.setBounds(0, 142, 113, 41);
		add(btnTranfer);

		JButton btnWithdraw = new JButton("Withdraw cash");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nameAcc = MainEvent.getInstances().getNameByCard();
				int balance = MainEvent.getInstances().checkCardBalance();
				mainView.getWithdraw().setup(nameAcc, balance);
				
				mainView.showCard("withdraw");
			
			}
		});
		btnWithdraw.setBounds(325, 77, 125, 41);
		add(btnWithdraw);

		JButton btnCheckBalance = new JButton("Check balance");
		btnCheckBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cardType = MainEvent.getInstances().getTypeCardById();
				String nameAcc = MainEvent.getInstances().getNameByCard();
				int balance = MainEvent.getInstances().checkCardBalance();
				
				mainView.getCheckBalanceView().setup(cardType, nameAcc, balance);
				mainView.showCard("checkBalanceView");		
			}
		});
		btnCheckBalance.setBounds(325, 177, 125, 41);
		add(btnCheckBalance);

		
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		// Vẽ hình nền trước
		super.paintComponent(g);
		ImageIcon background = new ImageIcon("background.jpg");
		Image bgImage = background.getImage();
		g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);

		// Vẽ các thành phần con sau khi hình nền đã được vẽ
		super.paintChildren(g);
	}
}
