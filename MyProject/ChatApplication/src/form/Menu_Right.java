package form;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Menu_Right extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Menu_Right() {
		setBackground(new Color(245, 245, 245));
		setLayout(new MigLayout("fillx, filly"));
		
		JLabel lblNewLabel = new JLabel("Menu Right");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(35, 105, 81, 50);
		add(lblNewLabel);

	}
}
