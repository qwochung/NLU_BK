package Template_Menthod;

public abstract class Account extends Bank_Operation {
	int id;
	String hoTen;
	int balance;
	public Account(int id, String hoTen, int balance) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.balance = balance;
	}
	
	

}
