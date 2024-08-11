package Layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex_FlowLayout extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ex_FlowLayout() {
		
		this.setTitle("FlowLayout");
		this.setSize(400,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// căn giữa cửa sổ 
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
		// set layout
//		FlowLayout flowLayout1 = new FlowLayout()	;
//		FlowLayout flowLayout2 = new FlowLayout(FlowLayout.CENTER);
		FlowLayout flowLayout3 = new FlowLayout(FlowLayout.CENTER,50, 40)	;
//		this.setLayout(flowLayout1);
//		this.setLayout(flowLayout2);
		this.setLayout(flowLayout3);
		
		
		
		JButton jButton1 = new JButton("Nút 1")	;
		JButton jButton2 = new JButton("Nút 2")	;
		JButton jButton3 = new JButton("Nút 3")	;
		
		
		// thêm thành phần jButton
		this.add(jButton1);
		this.add(jButton2);
		this.add(jButton3);

	}

	public static void main(String[] args) {
		new Ex_FlowLayout();
	}
}
