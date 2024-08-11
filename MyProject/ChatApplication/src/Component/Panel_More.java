package Component;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;

import Emoji.Emogi;
import Emoji.Model_Emoji;
import ExternalClass.WrapLayout;
import View.View_Chat;
import net.miginfocom.swing.MigLayout;

public class Panel_More extends JPanel {
	private JPanel	panelHeader;
	private JPanel panelDetail;
	

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Panel_More() {
		setBackground(new Color(244, 245, 253));
		init();

	}
	
	private void init() {
		setLayout(new MigLayout("fillx"));
		panelHeader = new JPanel();
		panelHeader.setBackground(new Color(244, 245, 253));
		panelHeader.setLayout(new BoxLayout(panelHeader, BoxLayout.LINE_AXIS));
		panelHeader.add(getButtonFile());
		panelHeader.add(getEmojiStye1());
		panelHeader.add(getEmojiStye2());
		add(panelHeader, "w 100%, h 30!, wrap");
		
		panelDetail = new JPanel();
		panelDetail.setBackground(new Color(244, 245, 253));
		panelDetail.setLayout(new WrapLayout(WrapLayout.LEFT));
		JScrollPane ch = new JScrollPane(panelDetail);
		ch.setBorder(null);
		ch.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		ch.setVerticalScrollBar(new ScrollBar());
		
		add(ch, "w 100%, h 100%");
		
		
	}

	private JButton getButtonFile() {
		Option_Button option_Button = new Option_Button();
		option_Button.setIcon(new ImageIcon(getClass().getResource("/Image_Icon/link.png")));
		option_Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.showOpenDialog(View_Chat.getFrames()[0]);
			}
		});
		
		
		return option_Button;
	}
	
	
	
	private JButton  getEmojiStye1() {
		Option_Button option_Button = new Option_Button();
		option_Button.setIcon( Emogi.getInstance().getEmoji(1).toSize(25, 25).getIcon());
		
		option_Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clearSelected();
				option_Button.setSelected(true);
				panelDetail.removeAll();
				for (Model_Emoji emoji : Emogi.getInstance().getStyle1()) {
					JButton button= new JButton(emoji.getIcon());
					button.setName(emoji.getId()+"");
					button.setBorder(new EmptyBorder(3,3,3,3));
					button.setCursor( new Cursor(Cursor.HAND_CURSOR));
					button.setContentAreaFilled(false);
					panelDetail.add(button);
				}
				
				
				panelDetail.repaint();
				panelDetail.revalidate();
			}
		});
		
		
		return option_Button;
	}
	
	
	
	private JButton  getEmojiStye2() {
		Option_Button option_Button = new Option_Button();
		option_Button.setIcon( Emogi.getInstance().getEmoji(21).toSize(25, 25).getIcon());
		
		option_Button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clearSelected();
				option_Button.setSelected(true);
				panelDetail.removeAll();
				for (Model_Emoji emoji : Emogi.getInstance().getStyle2()) {
					JButton button= new JButton(emoji.getIcon());
					button.setName(emoji.getId()+"");
					button.setBorder(new EmptyBorder(3,3,3,3));
					button.setCursor( new Cursor(Cursor.HAND_CURSOR));
					button.setContentAreaFilled(false);
					panelDetail.add(button);
				}
				
				
				panelDetail.repaint();
				panelDetail.revalidate();
			}
		});
		
		
		return option_Button;
	}
	
	
	
	
	
	
	
	private void clearSelected() {
		for (Component comp : panelHeader.getComponents()) {
			if (comp instanceof Option_Button) {
				((Option_Button)comp).setSelected(false);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
