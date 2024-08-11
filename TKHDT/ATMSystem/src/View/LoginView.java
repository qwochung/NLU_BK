package View;

import javax.swing.*;

import Control.MainEvent;

import java.awt.*;
import java.awt.event.*;

public class LoginView extends JComponent {
	
	private static final long serialVersionUID = 1L;
	private JPasswordField pinField;
	private JButton loginButton;
	private JLabel pinLabel;
	private JPanel panel;
	private JTextField idCardField;
	 private MainView mainView;

	public LoginView(MainView mainView) {
		this.mainView = mainView;
		// Tạo panel chính với layout null để tự do sắp xếp các thành phần
		panel = new JPanel() {
			
			private static final long serialVersionUID = 1L;

			@Override
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

		// Tạo nhãn và ô nhập liệu cho tên đăng nhập
		pinLabel = new JLabel("PIN code");
		pinLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		pinLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pinLabel.setBounds(20, 147, 93, 15);
		pinLabel.setForeground(Color.WHITE);
		panel.add(pinLabel);

		pinField = new JPasswordField(50);
		pinLabel.setLabelFor(pinField);
		panel.add(pinField);

		// Tạo nút Login
		loginButton = new JButton("Login");
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(loginButton);

		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {


				
				if (checkCredentials()) {
					mainView.showCard("homePage");
				}
				else {
					JOptionPane.showMessageDialog(LoginView.this.mainView, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		
		JLabel lblNewLabel = new JLabel("Log in");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(142, 10, 154, 60);
		panel.add(lblNewLabel);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.setBounds(152, 214, 154, 25);
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel.add(btnCancel);
		
		idCardField = new JTextField(50);
		idCardField.setBounds(133, 109, 214, 25);
		panel.add(idCardField);
		
		JLabel pinLabel_1 = new JLabel("ID Card");
		pinLabel_1.setLabelFor(idCardField);
		pinLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		pinLabel_1.setForeground(Color.WHITE);
		pinLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pinLabel_1.setBounds(20, 112, 93, 15);
		panel.add(pinLabel_1);

		
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				centerComponents();
			}
		});

		centerComponents();
	}

	private void centerComponents() {
		pinField.setBounds(133, 144, 214, 25);
		loginButton.setBounds(152, 179, 154, 25);
	}

	
	
	
	
	private boolean checkCredentials() {
		
		String idCard = idCardField.getText();
		String pin = String.valueOf(pinField.getPassword());
		setupMachine(idCard, pin);
		return MainEvent.getInstances().checkCard();
		
	}
	
	
	private void setupMachine(String idCard, String pin) {
		MainEvent.getInstances().getMachine().setIdCard(idCard);
		MainEvent.getInstances().getMachine().setCardPin(pin);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
