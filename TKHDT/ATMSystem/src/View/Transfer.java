package View;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JTextField;

import Control.MainEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transfer extends JComponent{


	private static final long serialVersionUID = 1L;
	private JTextField txtIDAcc;
	private JTextField txtAmount;
	MainView mainView;
	
	
	public Transfer(MainView mainView) {
		
		this.mainView = mainView;
		
		JLabel lbTransferCash = new JLabel("Transfer Cash");
		lbTransferCash.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbTransferCash.setBounds(114, 10, 223, 35);
		add(lbTransferCash);
		
		JLabel lbAmount = new JLabel("Amount: ");
		lbAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbAmount.setBounds(20, 132, 91, 35);
		add(lbAmount);
		
		txtIDAcc = new JTextField();
		txtIDAcc.setBounds(160, 93, 223, 31);
		add(txtIDAcc);
		txtIDAcc.setColumns(10);
		
		
		JLabel lbAccount = new JLabel("Account: ");
		lbAccount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbAccount.setBounds(20, 87, 85, 35);
		add(lbAccount);
		
		txtAmount = new JTextField();
		txtAmount.setColumns(10);
		txtAmount.setBounds(160, 138, 223, 31);
		add(txtAmount);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainView.showCard("homePage");
			}
		});
		btnCancel.setBounds(279, 209, 104, 35);
		add(btnCancel);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (txtIDAcc.getText().isEmpty() || txtAmount.getText().isEmpty()) {
					JOptionPane.showMessageDialog(mainView, "Invalid Information. Please Re-enter.", "Error", JOptionPane.ERROR_MESSAGE);

				}
				
				else if (getAccountByIdAcc(txtIDAcc.getText()) == null) {
					JOptionPane.showMessageDialog(mainView, "Account is Invalid. Please Re-enter.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else {
					
					int amount = Integer.valueOf(txtAmount.getText());
					int balance = MainEvent.getInstances().checkCardBalance();
					
					
					if ( amount < 0|| amount > balance ) {
						JOptionPane.showMessageDialog(mainView, "Invalid Amount. Please Re-enter.", "Error", JOptionPane.ERROR_MESSAGE);
						
					}
					
					String idCard = MainEvent.getInstances().getMachine().getIdCard();
					String idAcc = MainEvent.getInstances().getIdAccount(idCard);
					
					if (txtIDAcc.getText().equals(idAcc)) {
						JOptionPane.showMessageDialog(mainView, "Invalid Information. Please Re-enter.", "Error", JOptionPane.ERROR_MESSAGE);

					}
				
					
					else {
						String nameAcc= getAccountByIdAcc(txtIDAcc.getText());
						mainView.getTransferConfirm().setup(nameAcc, txtIDAcc.getText(), txtAmount.getText());
						
						mainView.showCard("transferConfirm");
						
					}
				}
				
			}
		});
		btnConfirm.setBounds(94, 209, 104, 35);
		add(btnConfirm);
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
	
	
	
	
	public String  getAccountByIdAcc( String idAcc) {
		 return MainEvent.getInstances().getAccountByIdAcc( idAcc);
	}
	
	
	
	
	

}