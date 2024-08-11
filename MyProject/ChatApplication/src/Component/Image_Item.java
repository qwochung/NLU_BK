package Component;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;

import ExternalClass.BlurHash;
import ExternalClass.PictureBox;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Rectangle;
import Component.Progress.ProgressType;

public class Image_Item extends JLayeredPane {

	private static final long serialVersionUID = 1L;
	PictureBox pic;
	Progress progress;
	/**
	 * Create the panel.
	 */
	public Image_Item() {
		setSize(new Dimension(300, 300));
		setLayout(new BorderLayout(0, 0));
		pic = new PictureBox();
		setLayer(pic, 1);
		
		add(pic, BorderLayout.CENTER);
		pic.setLayout(null);
		
		progress = new Progress();
		progress.setProgressType(ProgressType.CANCEL);
		progress.setBounds(new Rectangle(155, 155, 90, 90));
		progress.setBounds(125, 125, 50, 50);
		progress.setForeground(new Color(255, 255, 255));
		progress.setBorder(null);
		progress.setPreferredSize(new Dimension(50,50));
		progress.setValue(100);
		pic.add(progress);
		
			// Test		
//		setImage("LYLN0uIA~ps,^+x]S5WXxvW=M|kC");
	}
	
	
	public void setImage( String image) {
		int width = 400;
		int height = 400;
		int[] data = BlurHash.decode(image, width, height, 1);
		BufferedImage img = BlurHash.decodeAndDraw(image,width, height,1, BufferedImage.TYPE_INT_RGB);
		img.setRGB(0, 0, width, height, data, 0, width);
		Icon icon = new ImageIcon(img);
		
		pic.setImage(icon);
	}
	
	
	
	

	public static void main(String[] args) throws IOException {
		BufferedImage image = ImageIO.read(new File("D:/NLU/MyProject/ChatApplication/src/Image_Icon/keyboard.jpg"));
		String blurhashStr = BlurHash.encode(image);
		System.out.println((blurhashStr));
		System.out.println( BlurHash.decode("LKC?im9F~qIU-;M{-;WBozWBxuof", 300, 300, 1));
	}
}
