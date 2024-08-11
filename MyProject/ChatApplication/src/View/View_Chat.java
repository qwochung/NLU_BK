package View;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;

import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;

import Event.EventImageView;
import Event.EventMain;
import Event.PublicEvent;
import ExternalClass.ComponentResizer;
import Model.Model_User_Account_Client;
import Service.Client_Service;
import form.Home;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import form.View_Image;
import form.LoginAndRegister;
import Component.Loading;

public class View_Chat extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private int pX;
	private int pY;
	private Home home;
	View_Image viewImage;
	JLayeredPane body ;
	LoginAndRegister login;
	Loading loading ;

		/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatArcIJTheme.setup()	;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Chat window = new View_Chat();
					window.frame.setVisible(true);
				} catch (Exception e) { 
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View_Chat() {
		
		initialize();
		init();
	}

	
/*
 * 	init
 */
	private void init () {
		frame.setIconImage(new ImageIcon(getClass().getResource("/Image_Icon/icon.png")).getImage());
		ComponentResizer comp = new ComponentResizer()	;
		comp.registerComponent(frame);
		comp.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
		
		comp.setMinimumSize(new Dimension(110,700));
		comp.setSnapSize(new Dimension(10,10));
		login.setVisible(true);
		viewImage.setVisible(false);
		loading.setVisible(false);
		
		initEvent()	;
		Client_Service.getInstance().startServer();
		
	}
	
	

	private void initialize() {	
/*
 * 	frame
 */
		frame = new JFrame();
		frame.setMinimumSize(new Dimension(850,500));
		frame.setPreferredSize(new Dimension(1100, 700));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setBounds(100, 100, 1100, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setUndecorated(true);
		
		
/*
 * 		create boder 
 */
		JPanel border = new JPanel();
		border.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(border);
		border.setLayout(new BorderLayout(0, 0));
		
		JPanel background = new JPanel();
		background.setBackground(Color.WHITE);
		background.setBorder(new LineBorder(Color.GRAY));
		border.add(background, BorderLayout.CENTER);
		background.setLayout(new BorderLayout(0, 0));
		
		
		
/*
 * 		panel title
 */
		JPanel title = new JPanel();
		
				//		format tile
		title.setToolTipText("");
		title.setBackground(new Color(192, 192, 192));
		background.add(title, BorderLayout.NORTH);
		title.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));
		
				//		add event
		title.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 // Get x,y and store them
                pX = e.getX();
                pY = e.getY();

			}
		});
		
		title.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				frame.setLocation(frame.getLocation().x + e.getX() - pX,
                        frame.getLocation().y + e.getY() - pY);
			}
		});
		
		
		
		
		
/*
 * Buttons
 */
		
		//		zoom out Button
		JButton minsize = new JButton("");
		minsize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
		});
		minsize.setBorderPainted(false);
		minsize.setContentAreaFilled(false);
		minsize.setBorder(null);
		minsize.setBackground(new Color(255, 255, 255));
		minsize.setIcon((new ImageIcon(View_Chat.class.getResource("/Image_Icon/minsize.png"))));
		title.add(minsize);
		
		
		//		zoom in Button
		JButton maxSize = new JButton("");
		maxSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((frame.getExtendedState() & JFrame.MAXIMIZED_BOTH) == JFrame.MAXIMIZED_BOTH) {
		            frame.setExtendedState(JFrame.NORMAL);
		            
		        } else {
		            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		        }
			}
		});
		
		maxSize.setBorderPainted(false);
		maxSize.setContentAreaFilled(false);
		maxSize.setBorder(null);
		maxSize.setIcon(new ImageIcon(View_Chat.class.getResource("/Image_Icon/maxsize.png")));
		title.add(maxSize);
		
		
		//		close Button
		JButton close = new JButton("");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		close.setBorderPainted(false);
		close.setContentAreaFilled(false);
		close.setBorder(null);
		close.setIcon(new ImageIcon(View_Chat.class.getResource("/Image_Icon/close.png")));
		title.add(close);
		
		
		
/*
 *  Body Panel
 */
		body = new JLayeredPane();
		body.setOpaque(true);
		body.setBackground(new Color(255, 255, 255));
		background.add(body, BorderLayout.CENTER);
		body.setLayout(new CardLayout(0, 0));
		home = new Home();
		body.setLayer(home, 1);
		
		
		
		
		
/*
 * view Image
 */
		viewImage = new View_Image();
		
		body.setLayer(viewImage, 2);
		
/*
* Login
*/
		login = new LoginAndRegister();
		login.setMinimumSize(new Dimension(1100,700));
		login.setBackground(new Color(255, 255, 255));
		body.setLayer(login, 1);
		
		
/**
 * Loading
 */
		loading = new Loading();
		body.setLayer(loading, 2);
		
		
		
/*
 * Add component
 */
		body.add(login, "login");
		body.add(loading, "loading");
		body.add(viewImage, "viewImage");
		body.add(home, "home");
		
	}
	
	
	
/*
* initEvent 
*/	
	public void initEvent() {
		PublicEvent.getInstance().addEventMain(new EventMain() {
			
			@Override
			public void showLoading(boolean show) {
				loading.setVisible(show);
				
			}
			
			@Override
			public void initChat() {
				loading.setVisible(false);
				home.setVisible(true);
				login.setVisible(false);
				Client_Service.getInstance().getClient().emit("list_user", Client_Service.getInstance().getUser_Client().getUserID());
				
			}

			@Override
			public void selectUser(Model_User_Account_Client user) {
				home.setUser(user);
				
			}

			@Override
			public void updateUser(Model_User_Account_Client user) {
				home.updateUser(user);
				
				
			}
		});
		
		
		
		PublicEvent.getInstance().addEventImageView(new EventImageView() {
			
			@Override
			public void imageView(Icon image) {
				
	            viewImage.viewImage(image);
				
			}

			@Override
			public void saveImage(Icon image) {
  				System.out.println("saved");
			}
		});
		
	}
	
	
	
	
}
