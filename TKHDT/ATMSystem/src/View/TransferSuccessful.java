package View;

import javax.swing.JComponent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TransferSuccessful extends JComponent{
	private static final long serialVersionUID = 1L;
	private JTextField txtAcc;
	private JTextField txtAmount;
	private JTextField txtBalance;
	MainView mainView;
	
	
	public TransferSuccessful(MainView mainView) {
		this.mainView  = mainView;
		JLabel lbTransferSuccess = new JLabel("Transfer successful");
		lbTransferSuccess.setHorizontalAlignment(SwingConstants.CENTER);
		lbTransferSuccess.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbTransferSuccess.setBounds(73, 10, 305, 46);
		add(lbTransferSuccess);
		
		JLabel lbAccount = new JLabel("Account: ");
		lbAccount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbAccount.setBounds(42, 99, 85, 35);
		add(lbAccount);
		
		txtAcc = new JTextField();
		txtAcc.setEditable(false);
		txtAcc.setFocusable(false);
		txtAcc.setColumns(10);
		txtAcc.setBounds(182, 105, 223, 31);
		add(txtAcc);
		
		JLabel lbAmount = new JLabel("Amount: ");
		lbAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbAmount.setBounds(42, 144, 91, 35);
		add(lbAmount);
		
		txtAmount = new JTextField();
		txtAmount.setEditable(false);
		txtAmount.setFocusable(false);
		txtAmount.setColumns(10);
		txtAmount.setBounds(182, 150, 223, 31);
		add(txtAmount);
		
		JLabel lbbalance = new JLabel("Balance:");
		lbbalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbbalance.setBounds(42, 191, 91, 35);
		add(lbbalance);
		
		txtBalance = new JTextField();
		txtBalance.setEditable(false);
		txtBalance.setFocusable(false);
		txtBalance.setColumns(10);
		txtBalance.setBounds(182, 197, 223, 31);
		add(txtBalance);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainView.showCard("homePage");
			}
		});
		btnOk.setBounds(194, 255, 85, 35);
		add(btnOk);
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
	
	
	public void setup(String name, String amount, String balance ) {
		txtAcc.setText(name);
		txtAmount.setText(amount);
		txtBalance.setText(balance);
	}
	
	
}
