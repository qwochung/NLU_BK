package Layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex_BorderLayout extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ex_BorderLayout() {
		this.setTitle("BorderLayout");
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// căn giữa cửa sổ
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		// set layout
//		BorderLayout layout1 = new BorderLayout();
		BorderLayout layout2 = new BorderLayout(20, 50);
		
		this.setLayout(layout2);

		// thêm button
		JButton jButton1 = new JButton("Nút 1");
		JButton jButton2 = new JButton("Nút 2");
		JButton jButton3 = new JButton("Nút 3");
		JButton jButton4 = new JButton("Nút 4");
		JButton jButton5 = new JButton("Nút 5");

		// thêm thành phần jButton
		this.add(jButton1, BorderLayout.NORTH);
		this.add(jButton2, BorderLayout.WEST);
		this.add(jButton3, BorderLayout.EAST);
		this.add(jButton4, BorderLayout.SOUTH);
		this.add(jButton5, BorderLayout.CENTER);

		
	}

	public static void main(String[] args) {
		new Ex_BorderLayout();
	}
}
