package Module;

import java.util.List;

import Control.Operation;

public class BankSystem extends Operation {

	private List<ATMCard> cardList;
	private List<Account> accountList;
	private List<TransactionHistory> tranList;
	public BankSystem(List<ATMCard> cardList, List<Account> accountList,List<TransactionHistory> tranList) {
		super();
		this.cardList = cardList;
		this.accountList = accountList;
		this.tranList = tranList;
	}
	
	
	
	
	
	
	List<TransactionHistory> getTranList() {
		return tranList;
	}

	void setTranList(List<TransactionHistory> tranList) {
		this.tranList = tranList;
	}

	public void init() {
		
		ATMCard card1 = new DebitCard("1111", "1111", null);
		ATMCard card2 = new DebitCard("2222", "2222", null);
		ATMCard card3 = new CreditCard("3333", "3333", null);
		ATMCard card4 = new CreditCard("4444", "4444", null);
		ATMCard card5 = new DebitCard("5555", "5555", null);
				
		Account account1 = new Account("Dao Cong Vinh", "222", 200000,List.of(card1));
		Account account2 = new Account("Pham Tuan Khoa", "333", 500000,List.of(card2));
		Account account3 = new Account("Huynh Van Si", "444", 300000,List.of(card3));
		Account account4 = new Account("Tu Chi Ha", "555", 400000,List.of(card4));
		Account account5 = new Account("Tran Quoc Hung", "111", 100000, List.of(card5));

		//Truong hop 1 card/1 acc
		card1.setAccount(account1);
		card2.setAccount(account2);
		card3.setAccount(account3);
		card4.setAccount(account4);
		card5.setAccount(account5);
		
		cardList.add(card1);
		cardList.add(card2);
		cardList.add(card3);
		cardList.add(card4);
		cardList.add(card5);

		accountList.add(account1);
		accountList.add(account2);
		accountList.add(account3);
		accountList.add(account4);
		accountList.add(account5);
		
		
		//Truong hop 2 card/1 acc
		ATMCard card6 = new DebitCard("6666", "6666", null);
		ATMCard card7 = new DebitCard("7777", "7777", null);
		ATMCard card8 = new CreditCard("8888", "8888", null);
		ATMCard card9 = new CreditCard("9999", "9999", null);
		ATMCard card10 = new DebitCard("1010", "1010", null);
		ATMCard card11 = new DebitCard("1234", "1234", null);
		ATMCard card12 = new DebitCard("1212", "1212", null);
		ATMCard card13 = new CreditCard("1313", "1313", null);
		ATMCard card14 = new CreditCard("1414", "1414", null);
		ATMCard card15 = new DebitCard("1515", "1515", null);
		
		Account account6 = new Account("Dao Cong Vinh", "222", 600000,List.of(card6,card7));
		Account account7 = new Account("Pham Tuan Khoa", "333", 700000,List.of(card8,card9));
		Account account8 = new Account("Huynh Van Si", "444", 800000,List.of(card10,card11));
		Account account9 = new Account("Tu Chi Ha", "555", 900000,List.of(card12,card13));
		Account account10 = new Account("Tran Quoc Hung", "111", 1100000, List.of(card14,card15));
		
		
		card6.setAccount(account6);
		card7.setAccount(account6);
		card8.setAccount(account7);
		card9.setAccount(account7);
		card10.setAccount(account8);
		card11.setAccount(account8);
		card12.setAccount(account9);
		card13.setAccount(account9);
		card14.setAccount(account10);
		card15.setAccount(account10);
		
		cardList.add(card6);
		cardList.add(card7);
		cardList.add(card8);
		cardList.add(card9);
		cardList.add(card10);
		cardList.add(card11);
		cardList.add(card12);
		cardList.add(card13);
		cardList.add(card14);
		cardList.add(card15);

		accountList.add(account6);
		accountList.add(account7);
		accountList.add(account8);
		accountList.add(account9);
		accountList.add(account10);
	}





	
	
	/**
	 * 				MAIN MENTHOD
	 * @return
	 */


	@Override
	//checkCard
	public boolean checkCard(String id, String pin) {
        for (ATMCard card : cardList) {
        	if( card.checkCard(id, pin )) {
        		return true;
        	}
        } 
        return false;
    }





	@Override
	//withdrawMoney
	public boolean withdrawMoney(String idCard, int amount) {
		for (ATMCard card : cardList) {
		
			if ((card.checkCardByID(idCard))) {
				
				return card.withdrawMoney(idCard, amount);
			}
		}
		return false;
	}

 
	
	
	
	
	
		@Override

		public boolean depositMoney(String idCard, int amount) {
			for (ATMCard card : cardList) {
				if (card.getIdCard().equals(idCard)) {

					return card.depositMoney(idCard, amount);
				}
			}
			return false;
		}









	@Override
	public int checkCardBalance(String idCard) {
		 for (ATMCard card : cardList) {
			 if (card.getIdCard().equals(idCard))
				 
				 return card.checkCardBalance( idCard);
		 }
		return -1;
		 
	 }


	
	
	
	

	@Override
	public boolean transferMoney(String idCardDepositors, String idAccReceiver, int amount) {
		for (Account account : accountList) {
			if (account.checkAccount(idAccReceiver)) {
				 account.depositMoney( amount);
				withdrawMoney(idCardDepositors, amount);
				return true;
				
			};
		}
		return false;
	}




	
	
	
	
	
	


	@Override
	public TransactionHistory printReceipt() {
		// TODO Auto-generated method stub
		return null;
		
	}










	@Override
	public String toString() {
		return "BankSystem [cardList=" + cardList.size() + ", accountList=" + accountList.size() + ", tranList=" + tranList.size() + "]";
	}






	/**
	 * 					SUB MENTHOD
	 */
	



	public boolean createTransation ( TransactionHistory tras) {
		return this.tranList.add(tras);
	}


	public TransactionHistory printReceipt(String idTran) {
		for (TransactionHistory  tran : tranList) {
			if (tran.getTransactionID().equals(idTran)) {
				return tran;
			}
		}
		return null;
		
	}

	


	public String getIdAccount(String idCard) {
		for (ATMCard card : cardList) {
			if (card.getIdCard().equals(idCard)) {
				return card.getIdAccount(idCard);
			}
		}
		return null;
	}






	public String getNameByCard(String idCard) {
		for (ATMCard atmCard : cardList) {
			if (atmCard.getIdCard().equals(idCard)) {
				return atmCard.getNameByCard(idCard);
			}
		}
		return null;
	}






	public String getTypeCardById(String idCard) {
		for (ATMCard atmCard : cardList) {
			if (atmCard.getIdCard().equals(idCard)) {
				return atmCard.getType();
			}
		}
		return null;
	}






	public String getAccountByIdAcc(String idAcc) {
		for (Account account : accountList) {
			if (account.getId().equals(idAcc)) {
				return account.getName();
			}
		}
		return null;
	}

	
	

	
	
	
}
