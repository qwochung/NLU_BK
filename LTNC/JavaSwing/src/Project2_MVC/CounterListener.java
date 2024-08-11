package Project2_MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
	View view ;
	
	
	public CounterListener(View view) {
		super();
		this.view = view;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Bạn đã nhấn nút ");
		
		
	}

}
