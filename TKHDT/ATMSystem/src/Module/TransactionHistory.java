package Module;

import java.time.LocalDate;

public class TransactionHistory {
	private String accountID;
	private String transactionID;
	private double transactionAmount;
	private LocalDate dateOfTransaction;
	private String transactionType;

	
	
	
	public TransactionHistory(String accountID, String transactionID, double transactionAmount, LocalDate dateOfTransaction,
			String transactionType) {
		this.accountID = accountID;
		this.transactionID = transactionID;
		this.transactionAmount = transactionAmount;
		this.dateOfTransaction = dateOfTransaction;
		this.transactionType = transactionType;
	}

	
	
	
	
	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public LocalDate getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(LocalDate dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}





	@Override
	public String toString() {
		return "TransactionHistory [accountID=" + accountID + ", transactionID=" + transactionID
				+ ", transactionAmount=" + transactionAmount + ", dateOfTransaction=" + dateOfTransaction
				+ ", transactionType=" + transactionType + "]";
	}
	
	
	
	

}
