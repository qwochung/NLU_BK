package Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import ExternalClass.JIMSendTextPane;
import Model.Model_Send_Message_Client;
import Model.Model_User_Account_Client;
import Service.Client_Service;
import io.socket.client.Ack;
import net.miginfocom.swing.MigLayout;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.MatteBorder;

import Event.PublicEvent;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;



public class Chat_Bottom extends JPanel {
	private JIMSendTextPane txt;
	private JScrollPane scrollPane ;
	private JButton sendButton;
	private JButton moreButton;
	private Model_User_Account_Client user;
	private Panel_More panel_More;
	
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Chat_Bottom() {
		setOpaque(false);
		setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(192, 192, 192)));
		setBackground(new Color(255, 255, 255));
		init()	;
	}

	private void init() {
		MigLayout mig = new MigLayout("fillx, filly", "0[fill]0[]0[]2", "2[]2");
		
		 setLayout(mig);
		
//		Scroll Pane
		scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		
		
		ScrollBar bar = new ScrollBar();
		bar.setBackground(new Color(0, 0, 0));
		bar.setOpaque(false);		
		bar.setPreferredSize(new Dimension(3,2));
		scrollPane.setVerticalScrollBar(bar);
		
//		Text Pane
		txt = new JIMSendTextPane();
		txt.setBorder(new EmptyBorder(0, 20, 0, 0));
		txt.setSelectionColor(new Color(192, 192, 192));
		txt.setForeground(new Color(0, 0, 0));
		txt.requestFocus();
		txt.setBackground(new Color(255, 255, 255));
		 
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 if (e.getKeyCode() == KeyEvent.VK_ENTER && !e.isShiftDown()) {
					 e.consume();   // Ignore default enter behavior 
			         sendButton.doClick();
			        }
				 if (e.getKeyCode() == KeyEvent.VK_ENTER && e.isShiftDown()) {
					 int position = txt.getCaretPosition();
			         txt.setText(txt.getText().substring(0, position) + "\n" + txt.getText().substring(position));
			       
					 refresh();
				}
				 else {
					refresh();
				}
			}
	        });
		
		
		
//		txt.setPreferredSize(new Dimension(getWidth(),50));
	
		txt.setHintText("Enter Your Message");
		
	
		add(scrollPane, " width  100%");
		
		scrollPane.setViewportView(txt);
		
//		Button Panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);
		buttonPanel.setLayout(new MigLayout("","",""));
		
		sendButton = new JButton();
		
		sendButton.setBorderPainted(false);
		sendButton.setContentAreaFilled(false);
		sendButton.setOpaque(false);
		sendButton.setIcon(new ImageIcon(getClass().getResource("/Image_Icon/send.png")));
		
		
		moreButton = new JButton();
		
		moreButton.setBorderPainted(false);
		moreButton.setContentAreaFilled(false);
		moreButton.setOpaque(false);
		moreButton.setIcon(new ImageIcon(getClass().getResource("/Image_Icon/more_disable.png")));
		
		
		
		
	
		buttonPanel.add(moreButton, "bottom");
		buttonPanel.add(sendButton, "bottom");
		
		
//		panle more
		panel_More = new Panel_More();
		panel_More.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(192, 192, 192)));
		panel_More.setVisible(false);
		
		
		
		
//		add action
		
		
		
		sendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txt.getText().trim();
				if (!text.equals("")) {
					Model_Send_Message_Client message = new Model_Send_Message_Client(Client_Service.getInstance().getUser_Client().getUserID(), user.getUserID(), text);
					send(message);
					PublicEvent.getInstance().getEventChat().sendMessage(message);
					txt.setText("");
					txt.grabFocus();
					refresh();
				}
				else {
					txt.grabFocus();
				}
			}
		});
		
		
		
		moreButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (panel_More.isVisible()) {
					moreButton.setIcon(new ImageIcon(getClass().getResource("/Image_Icon/more_disable.png")));
					panel_More.setVisible(false);
					mig.setComponentConstraints(panel_More, "dock south, h 0!");
					
					
				}else {
					moreButton.setIcon(new ImageIcon(getClass().getResource("/Image_Icon/more.png")));
					panel_More.setVisible(true);
					mig.setComponentConstraints(panel_More, "dock south, h 170!");
						
					
				}
				
			}
		});
		
		
		
		add(buttonPanel, "wrap");
		add(panel_More, "height 0!, dock south");
		
		
		
		
		
		
		
		
//		Request focus for txt when Chat_Bottom is displayed.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				txt.requestFocus();
			}
		});
	}
	
	 
	
	
//	 refresh
	private void refresh() {
		revalidate();
	}

	public Model_User_Account_Client getUser() {
		return user;
	}

	public void setUser(Model_User_Account_Client user) {
		this.user = user;
	}
	
	private void send(Model_Send_Message_Client data) {
		
		Client_Service.getInstance().getClient().emit("send_to_user" , data.toJsonObject(), new Ack() {
			
			@Override
			public void call(Object... args) {
				
			}
		});
	}
	
	
}
