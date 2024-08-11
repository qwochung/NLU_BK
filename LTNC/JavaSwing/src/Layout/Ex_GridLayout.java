package Layout;


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex_GridLayout extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Ex_GridLayout() {
		
		this.setTitle("FlowLayout");
		this.setSize(400,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// căn giữa cửa sổ 
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		// set layout
//		GridLayout layout1 = new GridLayout();
//		GridLayout layout2 = new GridLayout(9, 4);
		GridLayout layout3 = new GridLayout(9, 4, 50, 10);
		
		
		// thêm button
//		JButton jButton1 = new JButton("Nút 1")	;
//		JButton jButton2 = new JButton("Nút 2")	;
//		JButton jButton3 = new JButton("Nút 3")	;
		
		
		// thêm thành phần jButton
//		this.add(jButton1);
//		this.add(jButton2);
//		this.add(jButton3);
//		
		
		// tạo button và thêm vào bằng vòng lặp
		for (int i = 0; i < 36; i++) {
			JButton jButton = new JButton("Nút " + i);
			this.add(jButton);
		} 

		

		this.setLayout(layout3);
}
	public static void main(String[] args) {
		new Ex_GridLayout()	; 
	}
}
