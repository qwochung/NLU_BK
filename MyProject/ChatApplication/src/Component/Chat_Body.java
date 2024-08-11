package Component;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import net.miginfocom.swing.MigLayout;

import java.awt.Adjustable;
import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

import Model.Model_Receive_Message_Client;
import Model.Model_Send_Message_Client;

public class Chat_Body extends JPanel {

	private static final long serialVersionUID = 1L;
	JScrollPane sp;
	ScrollBar bar ;
	JPanel body;
	

	/**
	 * Create the panel.
	 */
	public Chat_Body() {
		
		
		setBorder(null);
		setLayout(new BorderLayout(0, 0));
		
		
//		scrollbar
		sp = new JScrollPane();
		bar = new ScrollBar();
		sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		sp.setBorder(null);
		add(sp, BorderLayout.CENTER);
		sp.setVerticalScrollBar(bar);
		sp.getVerticalScrollBar().setBackground(Color.WHITE);
		
		
		
		
		
//		panel body
		body = new JPanel();
		body.setBorder(null);
		sp.setViewportView(body);
		body.setBackground(new Color(255, 255, 255));
		body.setLayout(new MigLayout(" fillx", "0[]0", "4[]4"));
		
		
		
		
		

		
		
//		addItemLeft("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello()",
//				"Jhon");
//		addItemRight("hello" + "gg");
//		addItemLeft("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello(). Tiếp theo, chúng ta sử dụng một anonymous class để triển khai interface này ngay trong phương thức", "John");
//		addItemLeft("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello(). Tiếp theo, chúng ta sử dụng một anonymous class để triển khai interface này ngay trong phương thức", "John");
//		addItemLeft("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello(). Tiếp theo, chúng ta sử dụng một anonymous class để triển khai interface này ngay trong phương thức", "John");
//		addItemLeft("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello(). Tiếp theo, chúng ta sử dụng một anonymous class để triển khai interface này ngay trong phương thức", "John");
//		addItemLeft("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello(). Tiếp theo, chúng ta sử dụng một anonymous class để triển khai interface này ngay trong phương thức", "John");
//		addItemLeft("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello(). Tiếp theo, chúng ta sử dụng một anonymous class để triển khai interface này ngay trong phương thức", "John",new ImageIcon(getClass().getResource("/Image_icon/meo.jpg")));
//		addItemRight("hello" + "gg");
//		addDate("21/02/2024");
//		String img[] = {"LYLN0uIA~ps,^+x]S5WXxvW=M|kC", "LERyHV00rq_LD4Mzn4x[[9?vVZDj"};
//		addItemRight("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello(). Tiếp theo, chúng ta sử dụng một anonymous class để triển khai interface này ngay trong phương thức");
//		addItemRight("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello(). Tiếp theo, chúng ta sử dụng một anonymous class để triển khai interface này ngay trong phương thức");
//		addItemRight("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello(). Tiếp theo, chúng ta sử dụng một anonymous class để triển khai interface này ngay trong phương thức");
//		addItemRight("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello(). Tiếp theo, chúng ta sử dụng một anonymous class để triển khai interface này ngay trong phương thức");
//		addItemRight("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello(). Tiếp theo, chúng ta sử dụng một anonymous class để triển khai interface này ngay trong phương thức");
//		addItemRight("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello(). Tiếp theo, chúng ta sử dụng một anonymous class để triển khai interface này ngay trong phương thức");
//		addDate("26/02/2024");
//		addItemLeft("hello", "John", img);
//		addItemLeft("", "John", new ImageIcon(getClass().getResource("/Image_icon/meo.jpg")),new ImageIcon(getClass().getResource("/Image_icon/cat2.jpg")));
//		addItemRight("Trong ví dụ này, chúng ta định nghĩa một interface Greeting có một phương thức sayHello()", new ImageIcon(getClass().getResource("/Image_icon/cat.jpg")));
//		addItemRight("", new ImageIcon(getClass().getResource("/Image_icon/keyboard.jpg")), new ImageIcon(getClass().getResource("/Image_icon/keyboard.jpg")));
//		addItemFileLeft("file", "Toro", "HinhAnh.jpeg", "2MB");
//		addItemFileRight("",  "HinhAnh.jpeg", "2MB");
//		addItemFileRight("name",  "HinhAnh.jpeg", "2MB");

	
	
		SwingUtilities.invokeLater(()-> bar.setValue(bar.getMaximum()));
	}
	

	
	public void addItemLeft( Model_Receive_Message_Client data) {
		Chat_Left item = new Chat_Left();
		
		item.setText(data.getText());
		item.setTime();
		body.add(item,"wrap, w :: 80%"); // w :: 80% : set width 80% 
		repaint();
		revalidate();
	}
	
//	 Item Left
	public void addItemLeft( String text, String user, String[]images) {
		Chat_Left item = new Chat_Left();
		item.setText(text);
		item.setImage(images);
		item.setTime();
		item.setUserProfile(user);
		body.add(item,"wrap, al left, w :: 80%"); // w :: 80% : set width 80% 
		repaint();
		revalidate();
	}
	
//	Item Right
	public void addItemRight( Model_Send_Message_Client data) {
		Chat_Right  item = new Chat_Right();
		item.setText(data.getText());
		item.setTime();
		body.add(item,"wrap, align right, w :: 80%"); // w :: 80% : set width 80% 
		revalidate();
		repaint();
		scrollToBottom();
		
	}
	
//	add File on the left
	public void addItemFileLeft( String text, String user, String fileName, String fileSize) {
		Chat_Left item = new Chat_Left();
		item.setText(text);
		item.setFile(fileName,fileSize);
		item.setTime();
		item.setUserProfile(user);
		body.add(item,"wrap, w :: 80%"); // w :: 80% : set width 80% 
		body.repaint();
		body.revalidate();
	}
	
	
//	add File on the Right
	public void addItemFileRight( String text, String fileName, String fileSize) {
		Chat_Right  item = new Chat_Right();
		item.setText(text);
		item.setFile(fileName,fileSize);
		item.setTime();
		body.add(item,"wrap, align right, w :: 80%"); // w :: 80% : set width 80% 
		body.repaint();
		body.repaint();
		body.revalidate();
		scrollToBottom();
		
	}
	
	
	
	
//	 add Date
	public void addDate(String date) {
		Chat_Date itemDate = new Chat_Date();
		itemDate.setDate(date);
		body.add(itemDate, "wrap, al center");
		body.repaint();
		body.revalidate();
		
		
	}
	private void scrollToBottom( ) {
		
	    JScrollBar verticalBar = sp.getVerticalScrollBar();
	    AdjustmentListener downScroller = new AdjustmentListener() {
	        @Override
	        public void adjustmentValueChanged(AdjustmentEvent e) {
	            Adjustable adjustable = e.getAdjustable();
	            adjustable.setValue(adjustable.getMaximum());
	            verticalBar.removeAdjustmentListener(this);
	        }
	    };
	    verticalBar.addAdjustmentListener(downScroller);
	}
	
	
	public void clearChat () {
		body.removeAll();
		repaint();
		revalidate();
	}
	

}
