import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.awt.event.ActionEvent;

public class NewApp {

	private JFrame frame;
	private JTextField fieldTenMien;
	JButton traIP;
	JTextArea ketQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewApp window = new NewApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lbTenMien = new JLabel("Tên Miền");
		lbTenMien.setHorizontalAlignment(SwingConstants.CENTER);
		
		fieldTenMien = new JTextField();
		fieldTenMien.setColumns(10);
		
		traIP = new JButton("Tra cứu IP");
		traIP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tenMien = fieldTenMien.getText();
				
				try {
					InetAddress ipAddress = InetAddress.getByName(tenMien);
					String ip = ipAddress.getHostAddress()	;
					ketQua.append( "IP : " + ip + "\n");
					
					
				} catch (Exception e2) {
					ketQua.append( "Không tìm thấy IP \n ");
				}
				
				
				
			}
		}); 
		
		ketQua = new JTextArea();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbTenMien, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(fieldTenMien, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(traIP, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(14))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(ketQua, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
					.addGap(25))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbTenMien, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
						.addComponent(fieldTenMien, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(traIP, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(32)
					.addComponent(ketQua, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(53))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
