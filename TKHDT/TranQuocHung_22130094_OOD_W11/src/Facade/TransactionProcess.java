package Facade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionProcess {
	public static final int TYPE_WITHDRAW_MONEY = 1; 
	public static final int TYPE_RECHARGE_MONEY = 2; 
	public static final int TYPE_CHECK = 0
			; 
	int id;
	Account account;
	LocalDate date;
	List<TransactionProcess> transactionHistory = new ArrayList<TransactionProcess>();
	String type;
	
	
	protected TransactionProcess( Account account, LocalDate date) {
		super();
		this.id++;
		this.account = account;
		this.date = date;
	}


	int getId() {
		return id;
	}





	Account getAccount() {
		return account;
	}


	void setAccount(Account account) {
		this.account = account;
	}


	LocalDate getDate() {
		return date;
	}


	void setDate(LocalDate date) {
		this.date = date;
	}

	
	
	
	

	String getType() {
		return type;
	}


	void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "TransactionProcess id=" + id + ", account=" + account.getId() + ", date=" + date + "type transaction = " + this.getType();
	}


	public void operation (int type , int ... amount) {
		switch (type) {
		case 0: {
			for (TransactionProcess t: transactionHistory) {
				if (t.getId() == amount[0]) {
					t.toString();
					break;
				}
			}
			
			break;
			
		}
		case 1: {
			// rut tien
			
			if (account.withDrawMoney ( amount[0])) {
				this.setType("Rut tien");
				transactionHistory.add(this);
				
			}
			
			break;
			
			
		}
		case 2: {
			if (account.rechargeMoney ( amount[0])) {
				this.setType("Nap tien");
				transactionHistory.add(this);
			}
			break;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		
	}
	
	

}
