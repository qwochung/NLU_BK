package View;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.MainEvent;
import Control.Server;
import Module.ATMCard;
import Module.ATMMachine;
import Module.Account;
import Module.BankSystem;
import Module.TransactionHistory;

import java.awt.BorderLayout;
import java.awt.CardLayout;

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;
	public static MainView mainView;
	private JPanel contentPane;
	public CardLayout cardLayout;
    private  JPanel cardPanel;

    public LoginView loginView;
    private  HomePage homePage;
    private  Withdraw	withdraw;
    public WithdrawConfirm withdrawConfirm;
    public WithdrawalSuccessful withdrawalSuccessful;
	public DepositView depositView;
	public AnnoucementView annoucementView;
	public CheckBalanceView checkBalanceView;
	public Transfer transfer;
	public TransferConfirm transferConfirm;
	public TransferSuccessful transferSuccessful;
	
	
	
	


	/**
	 * Create the frame.
	 */
	public MainView() {
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		cardPanel = new JPanel();
		contentPane.add(cardPanel);
		
		cardLayout = new CardLayout();
		cardPanel.setLayout(cardLayout);
		
		
		
		
	    loginView = new LoginView(this);
		homePage = new HomePage(this);

		withdraw = new Withdraw(this);
		withdrawConfirm = new WithdrawConfirm(this);
		withdrawalSuccessful = new WithdrawalSuccessful(this);
		
		depositView = new DepositView(this);
		annoucementView = new AnnoucementView(this);
		
		
		checkBalanceView = new CheckBalanceView(this);
		
		
		transfer = new Transfer(this);
		transferConfirm = new TransferConfirm(this);
		transferSuccessful = new TransferSuccessful(this);
		
		
		
		
		
		cardPanel.add(loginView,"loginView");
		cardPanel.add(homePage,"homePage");
		
		cardPanel.add(withdraw,"withdraw");
		cardPanel.add(withdrawConfirm,"withdrawConfirm");
		cardPanel.add(withdrawalSuccessful,"withdrawalSuccessful");
		
		
		
		cardPanel.add(depositView,"depositView");
		cardPanel.add(annoucementView,"annoucementView");
		
		
		cardPanel.add(checkBalanceView,"checkBalanceView");
		
		cardPanel.add(transfer, "transfer");
		cardPanel.add(transferConfirm, "transferConfirm");
		cardPanel.add(transferSuccessful, "transferSuccessful");
		
		
		
	
	
		
		
	}
	
	
	
	
	public static MainView getInstance() {
		if (mainView == null) {
			mainView = new MainView();
		}
		return mainView;
		
	}
	
	
	
	

	public  CardLayout getCardLayout() {
		
		return cardLayout;
	}


	
	


	JPanel getCardPanel() {
		return cardPanel;
	}




	public  void showCard(String namePanel) {
		cardLayout.show(cardPanel, namePanel);
		
	}
	
	
	
	public void init() {
		// bank system
				// account ATMCard card1 = new MasterCard("1111", "1111", null);
				 List<ATMCard> cardList = new ArrayList<ATMCard>();
				 List<Account> accountList = new ArrayList<Account>();
				 List<TransactionHistory> tranList = new ArrayList<TransactionHistory>();
				
				BankSystem bankSystem = new BankSystem(cardList, accountList, tranList);
				bankSystem.init();
				System.out.println(bankSystem);
				
//				Khởi tạo
				MainEvent.getInstances().setMachine(new ATMMachine("MC01") );
				Server.getInstances().setBankSystem(bankSystem);
				
				
				
				
	}
	


 
	
	
	
	
	
	
	
	
	
	
	
	HomePage getHomePage() {
		return homePage;
	}




	void setHomePage(HomePage homePage) {
		this.homePage = homePage;
	}




	Withdraw getWithdraw() {
		return withdraw;
	}




	void setWithdraw(Withdraw withdraw) {
		this.withdraw = withdraw;
	}




	LoginView getLoginView() {
		return loginView;
	}




	void setLoginView(LoginView loginView) {
		this.loginView = loginView;
	}


	
	
	


	DepositView getDepositView() {
		return depositView;
	}




	void setDepositView(DepositView depositView) {
		this.depositView = depositView;
	}




	AnnoucementView getAnnoucementView() {
		return annoucementView;
	}




	void setAnnoucementView(AnnoucementView annoucementView) {
		this.annoucementView = annoucementView;
	}




	WithdrawConfirm getWithdrawConfirm() {
		return withdrawConfirm;
	}




	void setWithdrawConfirm(WithdrawConfirm withdrawConfirm) {
		this.withdrawConfirm = withdrawConfirm;
	}



	
	
	
	

	WithdrawalSuccessful getWithdrawalSuccessful() {
		return withdrawalSuccessful;
	}




	void setWithdrawalSuccessful(WithdrawalSuccessful withdrawalSuccessful) {
		this.withdrawalSuccessful = withdrawalSuccessful;
	}

	
	
	



	CheckBalanceView getCheckBalanceView() {
		return checkBalanceView;
	}




	void setCheckBalanceView(CheckBalanceView checkBalanceView) {
		this.checkBalanceView = checkBalanceView;
	}
	
	
	
	
	
	
	
	Transfer getTransfer() {
		return transfer;
	}
	
	
	
	
	void setTransfer(Transfer transfer) {
		this.transfer = transfer;
	}
	
	
	
	
	TransferConfirm getTransferConfirm() {
		return transferConfirm;
	}
	
	
	
	
	void setTransferConfirm(TransferConfirm transferConfirm) {
		this.transferConfirm = transferConfirm;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	






	TransferSuccessful getTransferSuccessful() {
		return transferSuccessful;
	}




	void setTransferSuccessful(TransferSuccessful transferSuccessful) {
		this.transferSuccessful = transferSuccessful;
	}




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.setVisible(true);
					frame.init();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	
	
}
