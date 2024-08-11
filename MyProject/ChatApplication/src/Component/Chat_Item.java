package Component;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;

import ExternalClass.JIMSendTextPane;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.BorderLayout;
import javax.swing.text.Caret;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class Chat_Item extends JLayeredPane {

	private static final long serialVersionUID = 1L;
	JIMSendTextPane txt;
	JPanel layerContent;
	/**
	 * Create the panel.
	 */
	public Chat_Item() {
		setBorder(null);
		setBackground(new Color(255, 255, 255));
		setLayout(new BorderLayout(0, 0));
		
//		layerContent contains txt and image 
		layerContent = new JPanel();
		layerContent.setBorder(null);
		layerContent.setOpaque(false);
		layerContent.setLayout(new BorderLayout(0, 0));
		
		
		txt = new JIMSendTextPane();
		txt.setSelectionColor(new Color(225, 226, 226));
		txt.setOpaque(false);
		txt.setCaret(blankCaret);
		txt.setBorder(new EmptyBorder(0, 10, 0, 10));
		txt.setEditable(false);
		layerContent.add(txt, BorderLayout.NORTH);
		
		add(layerContent, BorderLayout.CENTER);

		
		
//		test
//		setText("tẽttt input");
//		setTime("zxczx", SwingConstants.RIGHT);
//		setUserProfile("Jhon");
//		setImage(true, new ImageIcon(getClass().getResource("/Component/meo.jpg")),new ImageIcon(getClass().getResource("/Component/meo.jpg")),new ImageIcon(getClass().getResource("/Component/meo.jpg")));
//		setImage(false, "LYLN0uIA~ps,^+x]S5WXxvW=M|kC");
//		setFile("anh.abc", "5mb");
		}
	
	
	
//	 Set Text
	public void setText(String txtIn) {
		txt.setText(txtIn);
	}
	
	
//	Check if Text is Empty 
	public boolean isEmpty() {
		return txt.getText().equals("")? true : false;
	}
	
	
//	Hide text
	public void hideText() {
		txt.setVisible(false);
	}
	
	
//	add time of messenger
	public void setTime(String time, int pos) {
		JLabel label= new JLabel(time);
		label.setBorder(new EmptyBorder(5, 10, 5, 10));
		label.setHorizontalAlignment(pos);
		label.setForeground(new Color(183, 183, 183));
		add(label,BorderLayout.SOUTH);
		sendSuccess(label, time);
		
	}
	
//	User Profile
	public void setUserProfile(String user) {
		JLayeredPane layer = new JLayeredPane();
		layer.setBorder(null);
		layer.setLayout(new BorderLayout());
		JButton cmd = new JButton(user);
		cmd.setForeground(new Color(5, 170, 148));
		cmd.setFont(new Font("Tahoma", Font.BOLD, 13));
		cmd.setFocusPainted(false);
		cmd.setBorderPainted(false);
		cmd.setContentAreaFilled(false);
		cmd.setFocusable(true);
		cmd.setCursor(new Cursor(Cursor.HAND_CURSOR));
		layer.add(cmd, BorderLayout.WEST);
		add(layer, BorderLayout.NORTH);
	}
	

	public void sendSuccess(JLabel label, String time) {
		if (time != null) {
			label.setIcon(new ImageIcon(Chat_Item.class.getResource("/Image_Icon/Tick.png")));
		}
	}
	
	
	
//	set image ( icon )
	public void setImage(boolean right ,Icon ... images) {
		if (images.length >0) {
			Chat_Image chatImage= new Chat_Image();
			chatImage.setBorder(new EmptyBorder(0, 0, 0, 0));
			chatImage.addImage(images);
			
			JLayeredPane layeredImage = new JLayeredPane();
			layeredImage.setBorder(new EmptyBorder(0, 0, 0, 0));
			layeredImage.add(chatImage);
			layerContent.add(layeredImage, BorderLayout.SOUTH);
			layeredImage.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
		}
		
	}
	
//	set image ( String ) 
	public void setImage(boolean right ,String...images) {
		Chat_Image chatImage= new Chat_Image();
		chatImage.setBorder(new EmptyBorder(0, 0, 0, 0));
		chatImage.addImage(images);
		
		JLayeredPane layeredImage = new JLayeredPane();
		layeredImage.setBorder(new EmptyBorder(0, 0, 0, 0));
		layeredImage.add(chatImage);
		layerContent.add(layeredImage, BorderLayout.SOUTH);
		layeredImage.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
	}

//		Set name and size of File
	public void setFile(String fileName ,String fileSize) {
		Chat_File chatFile = new Chat_File(); 
//		chatFile.setBorder(new LineBorder(new Color(0, 0, 0)));
		chatFile.setFile(fileName, fileSize);
		
		JLayeredPane layeredImage = new JLayeredPane();
		layeredImage.setBorder(null);
		layeredImage.add(chatFile);
		layerContent.add(layeredImage, BorderLayout.CENTER);
		layeredImage.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		
	}

	
	
//	anonymous clas used for text to hide rect cursor
	Caret blankCaret = new DefaultCaret() {
		private static final long serialVersionUID = 1L;
		@Override
	    protected synchronized void damage(java.awt.Rectangle r) {}
	    @Override
	    public void paint(java.awt.Graphics g) {}
	};

	
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(getBackground());
		g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
	}

	
	
	
	
	
	
	
}
