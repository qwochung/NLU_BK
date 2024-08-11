package Template_Menthod;

public class Recharge_Money  extends Account{
	int old_balance;
	public Recharge_Money(int id, String hoTen, int balance) {
		super(id, hoTen, balance);
	}

	
	

	@Override
	public void operation( int amount) {
		System.out.println("============================Hoạt động nạp tiền================================");
		
		old_balance = balance;
		balance-= amount;
		System.out.println("Số dư mới là :" + balance);
	}

	@Override
	public void transactionHistory() {
		System.out.println("============================Lịch sử giao dịch================================");
		
		System.out.println(" Loại giao dịch: Nạp tiền");
		System.out.println(" Số dư cũ: " + old_balance);
		System.out.println(" Số dư mới :" + balance);
		
		
	}
	
}
