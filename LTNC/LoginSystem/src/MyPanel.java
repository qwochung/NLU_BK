
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	JPanel loginPanel, imagePanel, buttonJPanel;
	JTextField userNameField;
	JPasswordField passwordField ;
	JButton loginButton, logoutButton;
	JLabel userNameLabel, passwordLabel ;
	
	ArrayList<Account> listAccounts;
	Account acc ;
	ImageIcon imageIcon;

//	private JFrame mainFrame;
	
	
	public MyPanel ( JFrame mainFrame) {
		setLayout(new BorderLayout());
//		this.mainFrame = mainFrame;
		// panel login
		
		loginPanel = new JPanel()	;
		loginPanel.setLayout(new GridLayout(3,2));
		
		userNameLabel = new JLabel("User Name : ");
		userNameField = new JTextField(15)	;
		
		loginPanel.add(userNameLabel);
		loginPanel.add(userNameField);
		
		passwordLabel = new JLabel("Password : ");	
		passwordField = new JPasswordField(15)	;
		
		
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordField);
		
		add(loginPanel, BorderLayout.NORTH);
		
		
		
		// image panel 
		imagePanel = new JPanel();
		JLabel imageLabel = new JLabel()	;
		imageIcon = new ImageIcon("src/image.jpg");
		imageLabel.setIcon(imageIcon);
		imageLabel.setHorizontalAlignment(JLabel.CENTER	);
		imageLabel.setVerticalAlignment(JLabel.CENTER);
		
		
		
		imagePanel.add(imageLabel);
		
		
		add(imagePanel, BorderLayout.CENTER);
		
		
		
		//button panel
		buttonJPanel = new JPanel()	;
		listAccounts = new ArrayList<>();
		loginButton = new JButton("Log in");
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (userNameField.getText().isEmpty()   || passwordField.getPassword().length ==0 ) {
					JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng!" );
				}
				else {
					 acc = new Account(userNameField.getText(), new String (passwordField.getPassword()) );
					if (  listAccounts.contains(acc)  == false )  {
						JOptionPane.showMessageDialog(null, "Đăng kí tài khoản thành công.\n Nhấn ok để tiếp tục.");	
						listAccounts.add(acc);
						imageIcon = new ImageIcon("src/gif.gif");
						imageLabel.setIcon(imageIcon);
						
						
					}
					else {
						for (Account account : listAccounts) {
							if (account.getName().equals(userNameField.getText()) == true
								&& account.getPass().equals(new String(passwordField.getPassword())) == true	) {
								imageIcon = new ImageIcon("src/gif.gif");
								imageLabel.setIcon(imageIcon);

							}
							if (account.getName().equals(userNameField.getText()) == true
									&& account.getPass().equals(new String(passwordField.getPassword())) == false	) {
								JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng!" );
							}
								
						}
					}					
					
					
					
					
					
					
				}
			}
		});
		
		
		
		
		
		logoutButton = new JButton("Log out");
		logoutButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				userNameField.setText("");
				passwordField.setText("");
				imageIcon = new ImageIcon("src/image.jpg");
				imageLabel.setIcon(imageIcon);
			}
		});
		
		
		buttonJPanel.add(loginButton);
		buttonJPanel.add(logoutButton);
	
		add(buttonJPanel, BorderLayout.SOUTH);
	
	
	
	
	
	}
	
	
	
	
	public class imageFrame extends JFrame {
		private static final long serialVersionUID = 1L;

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
