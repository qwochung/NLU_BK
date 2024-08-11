package form;

import javax.swing.Icon;
import javax.swing.JComponent;

import Event.PublicEvent;
import ExternalClass.PictureBox;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View_Image extends JComponent {
	private static final long serialVersionUID = 1L;
	PictureBox pic;
	JPanel dispalyPanel;
	Icon image;
	
	
	public View_Image() {
		setLayout(new BorderLayout(0, 0));
		
/*
* Display Panel
*/
		dispalyPanel = new JPanel();
		dispalyPanel.setBackground(new Color(0, 0, 0, 180));
		add(dispalyPanel, BorderLayout.CENTER);
		dispalyPanel.setLayout(new BorderLayout(0, 0));
		dispalyPanel.setBorder(new LineBorder(getBackground()));
		
/*
 * 	PictureBox
 */
		
		pic = new PictureBox();
		dispalyPanel.add(pic);
		pic.setLayout(new BorderLayout(0, 0));
		
/*
 * Button Panel
 */
		JPanel btnPanel = new JPanel();
		dispalyPanel.add(btnPanel, BorderLayout.SOUTH);
		btnPanel.setBackground(new Color(206, 206, 206));
		
		JButton btndownload = new JButton("");
		
		btndownload.setFocusPainted(false);
		btndownload.setBorder(null);
		btndownload.setBorderPainted(false);
		btndownload.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btndownload.setContentAreaFilled(false);
		ImageIcon icon = new ImageIcon(View_Image.class.getResource("/Image_Icon/download.png"));
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		btndownload.setIcon(icon);
		btndownload.setPreferredSize(new Dimension(40,40));
		btnPanel.add(btndownload);

		
			//add action
		btndownload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PublicEvent.getInstance().getEventImageView().saveImage(image);
			}
		});
		
/*
 * add mouse event
 */
		pic.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
			}
		});
		

	}
	
	public void viewImage(Icon image) {
		this.image = image;
		 pic.setImage(image);
		 setVisible(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	
	
	
	
	
}
