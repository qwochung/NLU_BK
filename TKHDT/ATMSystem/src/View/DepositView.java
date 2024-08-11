package View;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.SwingConstants;

import Control.MainEvent;

import javax.swing.JTextField;
import javax.swing.JButton;

public class DepositView extends JComponent {

	private static final long serialVersionUID = 1L;
	private JTextField txtDepositAmount;
	MainView mainView;
	
	public DepositView(MainView mainView) {
		this.mainView = mainView;
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

		JLabel lblDeposit = new JLabel("Deposit");
		lblDeposit.setBounds(120, 25, 230, 55);
		lblDeposit.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeposit.setFont(new Font("Tahoma", Font.PLAIN, 35));
		panel.add(lblDeposit);
		
		
		
		txtDepositAmount = new JTextField();
		txtDepositAmount.setHorizontalAlignment(SwingConstants.CENTER);
		txtDepositAmount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtDepositAmount.setColumns(10);
		txtDepositAmount.setBounds(103, 127, 235, 32);
		panel.add(txtDepositAmount);
		

		
		
		
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConfirm.setBounds(70, 220, 150, 25);
		btnConfirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String amount = txtDepositAmount.getText();
				if (amount.isEmpty()) {
					JOptionPane.showMessageDialog(mainView, "Please Enter The Amount", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				else {
					
					MainEvent.getInstances().getMachine().setAmount(Integer.valueOf(amount));
					if (!MainEvent.getInstances().depositMoney() ) {
						JOptionPane.showMessageDialog(mainView, "Invalid Amount. Please Re-enter.", "Error", JOptionPane.ERROR_MESSAGE);
						
					}
					
					else  {
						int balence = MainEvent.getInstances().checkCardBalance();
						mainView.annoucementView.setup("Deposit Money" , amount, balence, LocalDate.now());
						mainView.showCard("annoucementView");
					}
				}
				
				
			}
		});
		
		panel.add(btnConfirm);
		

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.setBounds(250, 220, 150, 25);
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainView.showCard("homePage");
			}
		});
		panel.add(btnCancel);
		
		

		JLabel lblNewLabel = new JLabel("Enter Deposit Amount");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(158, 90, 141, 25);
		panel.add(lblNewLabel);
	}

	
	public void setup() {
		txtDepositAmount.setText("");
	}
	
	
}
