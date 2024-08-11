package Module;

import java.time.LocalDate;

import Control.Server;

public class ATMMachine {
	private int balance;
	private String idATM;
	private String idCard;
	private int amount;
	private String cardPin;
	private int count;
	private String idAccReceiver;
	
	
	public ATMMachine(String idATM) {
		this.idATM = idATM;
		
		this.balance = 50000000;
	}

	public String getIdATM() {
		return idATM;
	}

	public void setIdATM(String idATM) {
		this.idATM = idATM;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public String getCardPin() {
		return cardPin;
	}

	public void setCardPin(String cardPin) {
		this.cardPin = cardPin;
	}

	public int getBalance() {
		return balance;
	}
 
	public void setBalance(int balance) {
		this.balance = balance;
	}

	 
	 
	 
	 public String getIdAccReceiver() {
		return idAccReceiver;
	}

	public void setIdAccReceiver(String idAccReceiver) {
		this.idAccReceiver = idAccReceiver;
	}

	@Override
	public String toString() {
		return "Machine " + idATM + "\nAmount: " + amount;
	}

	
	
	
	/**
	 * 				MAIN MENTHOD
	 * @return
	 */

	
	
//		checkCard
	public boolean checkCard(String id, String pin) {
		return Server.getInstances().getBankSystem().checkCard(this.getIdCard() , this.getCardPin()) ;
	}

	
	public boolean checkCard() {
		return Server.getInstances().getBankSystem().checkCard(this.getIdCard() , this.getCardPin()) ;
	}

	
	
	
	
	//withdrawMoney
	public boolean withdrawMoney() {
		
		
		
		if ( checkCard() && amount >= 0 && amount < this.balance 
				&& amount < this.checkCardBalance() && amount % 50000 == 0) {
			
			if(Server.getInstances().getBankSystem().withdrawMoney(idCard, amount)) {
				TransactionHistory tran = new TransactionHistory(this.getIdAcc(this.getIdCard()), this.getIdATM() + this.getCount() +"",
						amount, LocalDate.now(),"Withdraw");
				Server.getInstances().getBankSystem().createTransation(tran);
				this.setBalance(this.getBalance() - amount)	;
				count++;
				System.out.println(" Rút tiền thành công -- ATM");
				return true;
			}
		}
		System.out.println(" Rút tiền Không thành công -- ATM");
		return false;
		
	}
	
	
	
	
	
	

	
	public boolean depositMoney() {
		
		if(amount >= 0 && amount % 50000 == 0) {
			if(Server.getInstances().getBankSystem().depositMoney(idCard, amount)) {
				TransactionHistory tran = new TransactionHistory(this.getIdAcc(this.getIdCard()), this.getIdATM() + this.getCount() + "", amount, LocalDate.now(),"Deposit");
				this.setBalance(this.getBalance() + amount);
		    	Server.getInstances().getBankSystem().createTransation(tran);
				count++;
				System.out.println(" Nạp tiền thành công -- ATM");
				return true;
			}
		}
		System.out.println(" Nạp tiền Không thành công -- ATM");
		return false;
	}
	
	
	
	
	public int checkCardBalance() {
		if (checkCard() == true) {
			return Server.getInstances().getBankSystem().checkCardBalance(getIdCard());
		}
		
		System.out.println("Card sai");
		return -1;
	}

	
	
	
	
	
	
	

	public boolean transferMoney() {
		if ( amount <= checkCardBalance() 
			&& Server.getInstances().getBankSystem().transferMoney(idCard, idAccReceiver, amount) ) {
			TransactionHistory tranIdAccReceiver = new TransactionHistory(idAccReceiver, this.getIdATM() + this.getCount() + "", amount, LocalDate.now(),"Deposit");
	    	Server.getInstances().getBankSystem().createTransation(tranIdAccReceiver);
			count++;
			
			
			TransactionHistory tranIdCard = new TransactionHistory(this.getIdAcc(this.getIdCard()), this.getIdATM() + this.getCount() + "", amount, LocalDate.now(),"Transfer Money");
			Server.getInstances().getBankSystem().createTransation(tranIdCard);
			count++;
			System.out.println(" Chuyển tiền thành công -- ATM");
			return true;
		}
		return false;
	}

	
	
	public TransactionHistory printReceipt() {
		return Server.getInstances().getBankSystem().printReceipt(this.getIdATM() + (getCount()-1));
		
	}

	
	
	
	public String getIdAcc(String idCard) {
		return Server.getInstances().getBankSystem().getIdAccount (idCard);
		
		
	}

	
	
	
		/**
		 * 					SUB MENTHOD
		 */
		

	public int checkMoneyLeft() {
			return (int) this.getBalance();
	}

		public String getNameByCard() {
			return Server.getInstances().getBankSystem().getNameByCard(this.getIdCard());
		}

		public String getTypeCardById() {
			return Server.getInstances().getBankSystem().getTypeCardById(this.getIdCard());
		}

		public String getAccountByIdAcc(String idAcc) {
			return Server.getInstances().getBankSystem().getAccountByIdAcc(idAcc);
		}
	
	
		
	
	
	
	
	
	
	
	
	
	
	



	
}
