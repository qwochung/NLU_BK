package View;

import java.util.ArrayList;
import java.util.List;

import Control.MainEvent;
import Control.Server;
import Module.ATMCard;
import Module.ATMMachine;
import Module.Account;
import Module.BankSystem;
import Module.TransactionHistory;

public class Test {
	public static void main(String[] args) {
		
		// bank system
		// account ATMCard card1 = new MasterCard("1111", "1111", null);
		 List<ATMCard> cardList = new ArrayList<ATMCard>();
		 List<Account> accountList = new ArrayList<Account>();
		 List<TransactionHistory> tranList = new ArrayList<TransactionHistory>();
		
		BankSystem bankSystem = new BankSystem(cardList, accountList, tranList);
		bankSystem.init();
		System.out.println(bankSystem);
		
//		Khởi tạo
		MainEvent.getInstances().setMachine(new ATMMachine("MC01") );
		Server.getInstances().setBankSystem(bankSystem);
		
		
		
		
		MainEvent.getInstances().getMachine().setIdCard("2222");
		MainEvent.getInstances().getMachine().setCardPin("2222");
		MainEvent.getInstances().getMachine().setAmount(200000);
		
		
		
//		// kiểm tra check card  ------ PASSED
//		System.out.println(MainEvent.getInstances().getMachine().checkCard());
//	
//		
//		
//		
//		// Kiểm tra rút tiền  --------- PASSED
//		System.out.println(	MainEvent.getInstances().getMachine().withdrawMoney());
//	
//		
//		
//		
//		
//		// Kiểm tra nạp tiền  --------- PASSED
		System.out.println(	MainEvent.getInstances().getMachine().depositMoney());
//		
//		
//		
//		
//		// Kiểm tra tiền còn lại trong máy --------- PASSED
//		System.out.println(	MainEvent.getInstances().getMachine().checkMoneyLeft());
//	
//		
//		
//		
//		// Kiểm tra tiền còn lại trong tài khoản --------- PASSED
		System.out.println(	MainEvent.getInstances().getMachine().checkCardBalance());
//	
//		
//		
		// Kiểm tra tiền in biên lai--------- PASSED
		System.out.println(	MainEvent.getInstances().getMachine().printReceipt().toString());
//		
//		
//		
//		
////		// Kiểm tra chuyển tiền tài khoản
////		
//		 MainEvent.getInstances().getMachine().setIdAccReceiver("555");
//		 MainEvent.getInstances().getMachine().setAmount(12345);
//		
//		
//		System.out.println("Chuyển tiền vào tài khoảng cùng ngân hàng");
//		System.out.println(	MainEvent.getInstances().getMachine().transferMoney());
		
		
		
		
		
		
		
		
		
		
	}

}
