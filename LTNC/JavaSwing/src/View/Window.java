package View;

import javax.swing.JFrame;

public class Window {
	public static void main(String[] args) {
		
		// tạo 1 cửa sổ chương trình
		JFrame jFrame = new JFrame();
		
		//  Hiển thị cửa sổ
		jFrame.setVisible(true);
		
		// đặt kích thước cho cửa sổ
		jFrame.setSize(400, 600);
		
		// set tiêu đề
		jFrame.setTitle("Java Swing");
		
		// thoát khỏi chương trình khi bấm X
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	
	
	}
}
