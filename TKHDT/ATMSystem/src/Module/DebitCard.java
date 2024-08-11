package Module;

public class DebitCard extends ATMCard {

	public DebitCard(String idCard, String pin, Account account) {
		super(idCard, pin, account);
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
		return this.getAccount().withdrawMoney(idCard, amount); 
	}


	
	@Override
	public boolean depositMoney(String idCard, int amount) {
		return this.getAccount().depositMoney(idCard, amount);
	}



	@Override
	public int checkCardBalance(String idCard) {
		return this.getAccount().checkCardBalance(idCard);
	}



	@Override
	public TransactionHistory printReceipt() {
		// TODO Auto-generated method stub
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
		return "Debit Card";
	}


}
