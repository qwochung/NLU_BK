package Module;


import java.util.List;

import Control.Operation;

public class Account extends Operation {
	private String name;
	private String id;
	private double balance;
	private List<ATMCard> cards;
	
	
	public Account(String name, String id, double balance, List<ATMCard> cards) {
        this.setName(name);
        this.id = id;
        this.balance = balance;
        this.cards = cards;
    }
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	List<ATMCard> getCards() {
		return cards;
	}
	void setCards(List<ATMCard> cards) {
		this.cards = cards;
	}
	
	
	

	/**
	 * 				MAIN MENTHOD
	 * @return
	 */

	
	//checkAccount
	public  boolean checkAccount(Account account) {
		
		return this.getId().equals(account.getId())
				&& this.getName().equals(account.getName())
				&& this.getBalance() == account.getBalance();
	}


	
	
	
	
	
	
	
	@Override
	public boolean withdrawMoney(String idCard, int amount) {
		this.setBalance(this.getBalance() - amount);
		
		return true;
		
	}
	
	
	
	@Override
	public boolean depositMoney(String idCard, int amount) {
		this.setBalance(this.getBalance() + amount);
		return true;
	}
	public boolean depositMoney( int amount) {
		this.setBalance(this.getBalance() + amount);
		return true;
	}
	
	
	
	
	

	@Override
	public int checkCardBalance(String idCard) {
		return (int) this.getBalance();
	}
	
	
	
	
	@Override
	public TransactionHistory printReceipt() {
		return null;
	}





	@Override
	public boolean checkCard(String id, String pin) {
		// TODO Auto-generated method stub
		return false;
	}



	public String getIdAccount(String idCard) {
		for (ATMCard atmCard : cards) {
			if (atmCard.getIdCard().equals(	idCard)) {
				return this.getId();
			}
		}
		return null;
	}

	
	public boolean checkAccount( String idAcc) {
		return this.getId().equals(idAcc);
	}



	@Override
	public boolean transferMoney(String idCardDepositors, String idAccReceiver, int amount) {
		// TODO Auto-generated method stub
		return false;
	}


	/**
	 * 					SUB MENTHOD
	 */
	
	
	
}
