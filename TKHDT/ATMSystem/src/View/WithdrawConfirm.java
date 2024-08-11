package View;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Control.MainEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class WithdrawConfirm extends JComponent{
	private static final long serialVersionUID = 1L;
	private JTextField txtTranferred;
	private JTextField txtBalance;
	MainView mainView;
	
	
	public WithdrawConfirm(MainView mainView) {
		this.mainView = mainView;
		JLabel lblWithdrawConfirm = new JLabel("Withdraw Confirm");
		lblWithdrawConfirm.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblWithdrawConfirm.setBounds(81, 10, 282, 37);
		add(lblWithdrawConfirm);
		
		txtTranferred = new JTextField();
		txtTranferred.setEditable(false);
		txtTranferred.setHorizontalAlignment(SwingConstants.CENTER);
		txtTranferred.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTranferred.setColumns(10);
		txtTranferred.setFocusable(false);
		txtTranferred.setBounds(179, 104, 235, 32);
		add(txtTranferred);
		
		
		JLabel lbTransferred = new JLabel("Trasferred:");
		lbTransferred.setHorizontalAlignment(SwingConstants.RIGHT);
		lbTransferred.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbTransferred.setBounds(59, 100, 99, 32);
		add(lbTransferred);
		
		JLabel lbBalance = new JLabel("Balance:");
		lbBalance.setHorizontalAlignment(SwingConstants.RIGHT);
		lbBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbBalance.setBounds(10, 152, 148, 32);
		add(lbBalance);
		
		txtBalance = new JTextField();
		txtBalance.setEditable(false);
		txtBalance.setFocusable(false);
		txtBalance.setHorizontalAlignment(SwingConstants.CENTER);
		txtBalance.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtBalance.setColumns(10);
		txtBalance.setBounds(179, 156, 235, 32);
		add(txtBalance);
	
		
		
		JButton btnYes = new JButton("Yes");
		btnYes.setBounds(71, 211, 124, 37);
		btnYes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (!MainEvent.getInstances().withdrawMoney()) {
					JOptionPane.showMessageDialog(mainView, "Invalid Amount. Please Re-enter.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else {
					int amount = MainEvent.getInstances().getMachine().getAmount();
					int balance = MainEvent.getInstances().checkCardBalance();
					mainView.getWithdrawalSuccessful().setup("Withdraw Money",String.valueOf(amount) , balance, LocalDate.now());
					mainView.showCard("withdrawalSuccessful");

				}
				
			}
		});
		add(btnYes);
		
		
		
		
		JButton btnNo = new JButton("No");
		btnNo.setBounds(262, 211, 124, 37);
		btnNo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainView.showCard("homePage");
			}
		});
		add(btnNo);
		
	
		
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
	
	
	public void setup(int amount, int balance) {
		txtTranferred.setText(String.valueOf(amount));
		txtBalance.setText(String.valueOf(balance));
		
	}
	
	
}
