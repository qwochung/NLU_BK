package Control;

import Module.*;

public class MainEvent {

	public static MainEvent instances;
	public ATMMachine machine  ;

	public static MainEvent getInstances() {
		
		
		if (instances == null) {
			instances = new MainEvent();
			return instances;
		}
		

		else {
			return instances;
		}
	}

	
	public ATMMachine getMachine() {
		return machine;
	}

	public void setMachine(ATMMachine machine) {
		this.machine = machine;
	}



/**
 * 				MAIN MENTHOD
 * @return
 */

//	    checkCard
	public boolean checkCard( String idCard, String pin) {
		return machine.checkCard(idCard, pin);
	}
	
	public boolean checkCard( ) {
		return machine.checkCard();
	}
	
	
//		withdrawMoney
	public boolean withdrawMoney() {
		return	 machine.withdrawMoney();
	}
	
	
	
//		depositMoney
	public boolean depositMoney() {
		return machine.depositMoney();
	}
	
	
//		checkCardBalance
	public int checkCardBalance() {
		return machine.checkCardBalance();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
////		checkMoneyLeft kiểm tra tiền còn lại trong máy
//	public int checkMoneyLeft() {
//		return machine.checkMoneyLeft();
//	}
//	
	
	
	
//		printReceipt
	public TransactionHistory printReceipt() {
		return machine.printReceipt();
	}
	
	
	
	public boolean transferMoney() {
		return machine.transferMoney();
	}
	
	
	
	
	
	/**
	 * 					SUB MENTHOD
	 */
	
	public String  getNameByCard( ) {
		return machine.getNameByCard();
	}


	public String getTypeCardById() {
		return machine.getTypeCardById();
	}


	public String getAccountByIdAcc(String idAcc) {
		
		return machine.getAccountByIdAcc(idAcc);
	}
	
	
	public String getIdAccount(String idCard) {
		
		return machine.getIdAcc(idCard);
	}
		

}
