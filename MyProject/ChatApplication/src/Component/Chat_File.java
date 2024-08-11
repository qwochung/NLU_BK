package Component;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import Component.Progress.ProgressType;
public class Chat_File extends JPanel {
	JLabel lbFileName;
	JLabel lbFileSize ;
	private static final long serialVersionUID = 1L;

	public Chat_File() {
		setOpaque(false);
		setLayout(new BorderLayout(0, 0));
		setMinimumSize(new Dimension(300,50));
		
		
		
		
//		panelLeft
		JPanel panelLeft = new JPanel();
		panelLeft.setOpaque(false);
		panelLeft.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		Progress progress = new Progress();
		progress.setProgressType(ProgressType.FILE);
		progress.setBackground(new Color(255, 255, 255));
		progress.setBorderPainted(false);
		progress.setPreferredSize(new Dimension(40,40));
		panelLeft.add(progress);
		
		add(panelLeft, BorderLayout.WEST);
		panelLeft.revalidate();
		panelLeft.repaint();
		
		
//		panelCenter
		JPanel panelCenter = new JPanel();
		panelCenter.setOpaque(false);
		add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(new GridLayout(2, 1, 10, 0));
		
		
//		label 
		lbFileName = new JLabel("My File");
		lbFileName.setMinimumSize(new Dimension(40, 50));
		lbFileName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelCenter.add(lbFileName);
		
		lbFileSize= new JLabel("5 MB");
		lbFileSize.setMinimumSize(new Dimension(46, 50));
		lbFileSize.setForeground(new Color(6, 181, 243));
		lbFileSize.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panelCenter.add(lbFileSize);

	}
	
	
//	Set name and size of File
	public void setFile( String fileName, String fileSize) {
		lbFileName.setText(fileName);
		lbFileSize.setText(fileSize);
	}
	
	
	

}
