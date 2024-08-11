package Module;

import Control.Operation;

public abstract class ATMCard extends Operation{

	protected String idCard;
	protected String pin;
	protected Account account;
	
	public ATMCard(String idCard, String pin, Account account) {
		this.idCard = idCard;
		this.pin = pin;
		this.account = account;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
	
	/**
	 * 				MAIN MENTHOD
	 * @return
	 */

	
	//checkCard 
	public abstract boolean checkCard(String idCard, String pin) ;
	public abstract boolean checkCardByID(String idCard) ;
	
	
	
	public String getIdAccount(String idCard) {
		
		return this.getAccount().getIdAccount(idCard);
	}
	
	
	public abstract boolean withdrawMoney(String idCard, int amount);
	public abstract boolean depositMoney(String idCard, int amount);
	public  abstract int checkCardBalance(String idCard) ;
	
	
	
	
	
	
	/**
	 * 					SUB MENTHOD
	 */
	

	@Override
	public String toString() {
		return "ATMCard \nidCard: " + idCard + "\npin: " + pin + "";
	}

	public String getNameByCard(String idCard2) {
		
		return this.getAccount().getName();
	}

	protected abstract String getType();


	
	
	
}
