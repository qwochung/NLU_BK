package View;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Control.MainEvent;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TransferConfirm extends JComponent{
	private static final long serialVersionUID = 1L;
	private JTextField txtAcc;
	private JTextField txtAmount;
	private JTextField txtAccNum;
	MainView mainView;
	
	public TransferConfirm(MainView mainView) {
		this.mainView = mainView;
		JLabel lbTransferConfirm = new JLabel("Transfer Confirm");
		lbTransferConfirm.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbTransferConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lbTransferConfirm.setBounds(86, 10, 263, 34);
		add(lbTransferConfirm);
		
		txtAcc = new JTextField();
		txtAcc.setEditable(false);
		txtAcc.setFocusable(false);
		txtAcc.setColumns(10);
		txtAcc.setBounds(181, 100, 223, 31);
		add(txtAcc);
		
		JLabel lbAccount = new JLabel("Account: ");
		lbAccount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbAccount.setBounds(31, 94, 85, 35);
		add(lbAccount);
		
		txtAmount = new JTextField();
		txtAmount.setEditable(false);
		txtAmount.setFocusable(false);
		txtAmount.setColumns(10);
		txtAmount.setBounds(181, 182, 223, 31);
		add(txtAmount);
		
		JLabel lbAmount = new JLabel("Amount: ");
		lbAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbAmount.setBounds(31, 176, 91, 35);
		add(lbAmount);
		
		txtAccNum = new JTextField();
		txtAccNum.setEditable(false);
		txtAccNum.setFocusable(false);
		txtAccNum.setColumns(10);
		txtAccNum.setBounds(181, 141, 223, 31);
		add(txtAccNum);
		
		JLabel lbStk = new JLabel("Account Number:");
		lbStk.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbStk.setBounds(10, 139, 161, 35);
		add(lbStk);
		
		JButton btnYes = new JButton("Yes");
		btnYes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnYes.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				MainEvent.getInstances().getMachine().setIdAccReceiver(txtAccNum.getText());
				MainEvent.getInstances().getMachine().setAmount(Integer.valueOf(txtAmount.getText()));
				
				if (	MainEvent.getInstances().transferMoney()) {
					
					mainView.getTransferSuccessful().setup(txtAcc.getText(), txtAmount.getText(),
							String.valueOf(MainEvent.getInstances().checkCardBalance()));
					
					mainView.showCard("transferSuccessful");
					
				}
				
			}
		});
		btnYes.setBounds(119, 256, 85, 34);
		add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainView.showCard("homePage");
			}
		});
		btnNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNo.setBounds(264, 256, 85, 34);
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

	
	
	
	public void setup(String name, String idAcc, String amount) {
		txtAcc.setText(name);
		txtAccNum.setText(idAcc);
		txtAmount.setText(amount);
	}
	
	
	
	
}
