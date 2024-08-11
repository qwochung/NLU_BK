package Control;

import Module.BankSystem;


public class Server {
	private static Server instances;
	private BankSystem bankSystem;

	public static Server getInstances () {
		if (instances == null) {
			instances = new Server();
			return instances;
		}
		
		else {
			return instances;
		}
	}
	

	
	
	public BankSystem getBankSystem() {
		return bankSystem;
	}




	 public void setBankSystem(BankSystem bankSystem) {
		this.bankSystem = bankSystem;
	}
















	public boolean checkCard() {
		return false;
		
	}
	public void withDrawMoney() {
		
	}
	public void dispositMoney() {
		
	}
	public boolean checkMoneyLeft() {
		return false;
		
	}
	public void deduction() {
		
	}
	public void adddition() {
		
	}
	public double checkCardBalance() {
		return 0;
		
	}
	public void printReceipt() {
		
	}
}
