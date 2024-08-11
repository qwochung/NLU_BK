package View;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Control.MainEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Withdraw extends JPanel {
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */


	private JTextField txtEnterTheAmount;
	private JTextField txtName;
	MainView mainView;
	private JTextField txtBalance;

	    public Withdraw(MainView mainView) {
	    	this.mainView= mainView;
	        setLayout(null); // Thiết lập layout null để tự do sắp xếp các thành phần

	        JLabel lblNewLabel = new JLabel("Withdraw Cash");
	        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
	        lblNewLabel.setBounds(104, 29, 235, 37);
	        add(lblNewLabel);
	        
	        txtName = new JTextField();
	        txtName.setEditable(false);
	        txtName.setFocusable(false);
	        txtName.setHorizontalAlignment(SwingConstants.CENTER);
	        txtName.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        txtName.setColumns(10);
	        txtName.setBounds(104, 95, 235, 32);
	        add(txtName);
	        
	        
	        txtBalance = new JTextField();
	        txtBalance.setEditable(false);
	        txtBalance.setFocusable(false);
	        txtBalance.setHorizontalAlignment(SwingConstants.CENTER);
	        txtBalance.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        txtBalance.setColumns(10);
	        txtBalance.setBounds(104, 137, 235, 32);
	        add(txtBalance);
	        
	        
	        

	        txtEnterTheAmount = new JTextField();
	        txtEnterTheAmount.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        txtEnterTheAmount.setHorizontalAlignment(SwingConstants.CENTER);
	        txtEnterTheAmount.setText("Enter the amount to withdraw");
	        txtEnterTheAmount.setBounds(104, 193, 235, 32);
	        txtEnterTheAmount.setColumns(10);
	        add(txtEnterTheAmount);

	        // Thêm FocusListener để xử lý khi người dùng nhập
	        txtEnterTheAmount.addFocusListener(new FocusAdapter() {
	            @Override
	            public void focusGained(FocusEvent e) {
	                if (txtEnterTheAmount.getText().equals("Enter the amount to withdraw")) {
	                    txtEnterTheAmount.setText("");
	                }
	            }

	            @Override
	            public void focusLost(FocusEvent e) {
	                if (txtEnterTheAmount.getText().isEmpty()) {
	                    txtEnterTheAmount.setText("Enter the amount to withdraw");
	                }
	            }
	        });
	        
	        
	        
	        
	      
	        
	    
	        
	        

	        JButton btnOK = new JButton("OK");
	        btnOK.setBounds(156, 242, 124, 37);
	        btnOK.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					if (txtEnterTheAmount.getText().isEmpty() || txtEnterTheAmount.getText().equals("Enter the amount to withdraw") ) {
						JOptionPane.showMessageDialog(mainView, "Invalid Amount. Please Re-enter.", "Error", JOptionPane.ERROR_MESSAGE);

					}
					
					else {
						
						int amount = Integer.valueOf(txtEnterTheAmount.getText());
						int balance = MainEvent.getInstances().checkCardBalance();	
						int machineBalance = MainEvent.getInstances().getMachine().getBalance();
						
						if ( amount >= 0 && amount < machineBalance 
								&& amount < balance
								&& amount % 50000 == 0) {
							
							MainEvent.getInstances().getMachine().setAmount(amount);
							mainView.getWithdrawConfirm().setup(amount, balance-amount);
							
							mainView.showCard("withdrawConfirm");
						}
						else {
							JOptionPane.showMessageDialog(mainView, "Invalid Amount. Please Re-enter.", "Error", JOptionPane.ERROR_MESSAGE);
							
						}
					}
					
					
					
				}
			});
	        
	        
	        add(btnOK);
	        
	        
	        
	        
	        
	        
	       
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
	    
	    
	    
	    public void setup(String nameAcc, int balance) {
		      txtName.setText(nameAcc);
		      txtBalance.setText("Current balence: " + String.valueOf(balance ));
			
		}
	   
	}



