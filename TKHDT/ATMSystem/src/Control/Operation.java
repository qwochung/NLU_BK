package Control;

import Module.TransactionHistory;

public abstract class Operation {
	
	public abstract boolean checkCard(String id, String pin);
	
	public abstract boolean withdrawMoney(String idCard, int amount);
	
	public abstract boolean depositMoney(String idCard, int amount);
	
	
	public abstract int checkCardBalance(String idCard);
	
	public abstract TransactionHistory printReceipt();
	
	public abstract boolean transferMoney ( String idCardDepositors ,String idAccReceiver, int amount );

	
	
}
