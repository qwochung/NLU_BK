package Module;

public class CreditCard extends ATMCard{
	private int cardLimit ; // Hạn mức thẻ là 10tr
	
	


	public CreditCard(String idCard, String pin, Account account) {
		super(idCard, pin, account);
		 cardLimit = 10000000;
	}


	int getCardLimit() {
		return cardLimit;
	}


	void setCardLimit(int cardLimit) {
		this.cardLimit = cardLimit;
	}



	
	
	
	
	/**
	 * 				MAIN MENTHOD
	 * @return
	 */

	
	@Override
	//  checkCard
	public boolean checkCard(String idCard, String pin) {
		{
			
			if ((idCard.equals(this.idCard)) && (pin.equals(this.pin))) {
				return account.checkAccount(this.account);
			} else {
				return false;
			}
		}
	}

	

	@Override
	public boolean withdrawMoney(String idCard, int amount) {
		this.setCardLimit(this.getCardLimit()- amount);
		return true;
	}
	
	
	
	
	

	@Override
	public boolean depositMoney(String idCard, int amount) {
		this.setCardLimit(this.getCardLimit()+ amount);
		return true;
	}
	
	
	
	
	



	@Override
	public int checkCardBalance(String idCard) {
		// TODO Auto-generated method stub
		return this.getCardLimit();
	}

	@Override
	public TransactionHistory printReceipt() {
		return null;
		
	}




	@Override
	public boolean transferMoney(String idCardDepositors, String idAccReceiver, int amount) {
		// TODO Auto-generated method stub
		return false;
	}



	
	
	
	/**
	 * 					SUB MENTHOD
	 */
	
	@Override
	public boolean checkCardByID(String idCard) {
		return this.getIdCard().equals(idCard);
	}


	@Override
	protected String getType() {
		return "Credit Card";
	}



}
