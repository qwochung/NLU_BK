package Singelton;

public class Account {
	
	private  volatile int balance;
//	private  int balance;
	public static Account instance;
	
	private Account() {
		balance = 1000000;
	}
	
	
	public static Account getInstance () {
		if (instance == null) {
			synchronized (Account.class) {
				if (instance == null) {
					instance = new Account();
				}
			}
		}
		return instance;
	}
	
	
	
	
	int getBalance() {
		return balance;
	}


	void setBalance(int balance) {
		this.balance = balance;
	}


	public static void Withdraw_Money(int amount) {
		System.out.println("=================THỰC HIỆN GIAO DỊCH RÚT TIỀN==========================");
		if (amount<= instance.getBalance()) {
			instance.setBalance(instance.getBalance() - amount );
			System.out.println("Rút tiền thành công. Số dư mới là: " + instance.getBalance());
			
			
			
		}
	}
	
	
	public static void recharge_Money (int amount) {
		System.out.println("=================THỰC HIỆN GIAO DỊCH NẠP TIỀN==========================");
		instance.setBalance(instance.getBalance()+ amount);
		System.out.println("Nạp tiền thành công. Số dư mới là: " + instance.getBalance());
		
		
		
	}
	
	
	
	
	
	
}
