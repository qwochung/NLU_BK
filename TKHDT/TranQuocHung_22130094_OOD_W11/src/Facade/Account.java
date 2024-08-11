package Facade;

public class Account {
	int id;
	String name;
	int balance;
	
	
	protected Account(int id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}


	int getId() {
		return id;
	}


	void setId(int id) {
		this.id = id;
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	int getBalance() {
		return balance;
	}


	void setBalance(int balance) {
		this.balance = balance;
	}

	
	
	public boolean login(Account account) {
		if (this.getId() == account.getId() && this.getName().equals(account.getName())) {
			
			account.setBalance(this.getBalance());
			return true;
			
		}
		return false;

	}
	

	public boolean equals(Account account) {
		
		return this.getId() == account.getId() &&
				this.getName().equals(account.getName())
				&& this.getBalance() == account.getBalance();		
	}


	public boolean withDrawMoney(int amount) {
		if (getBalance() > amount) {
			setBalance( getBalance() - amount);
			System.out.println("Thực hiện rút tiền thành công.");
			System.out.println("Số dư hiện tại là: " + getBalance());
			return true;
		}
		else {
			return false;
		}
		
	}


	public boolean rechargeMoney(int amount) {
		setBalance( getBalance() + amount);
		System.out.println("Thực hiện nạp tiền thành công.");
		System.out.println("Số dư hiện tại là: " + getBalance());
		return true;
		
	}



	
	
	
	
	
	

}
