package HelloSwing;

import javax.swing.JFrame;

public class HelloSwing {

	/**
	 * 
	 */
	public HelloSwing() {
		JFrame farme = new JFrame( "Java Swing");

		farme.setSize(400, 400); // size cua khung
		
		farme.setVisible(true); // hiển thị cho người dùng
		
		farme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // đóng chương trinhg khi cửa sổ đóng
		
	}
	
	
	
	public static void main (String [] arg) {
		new HelloSwing();
		
	}

}
