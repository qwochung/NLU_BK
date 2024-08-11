package Template_Menthod;

public class Withdraw_Money extends Account {
	int old_balance;
	public Withdraw_Money(int id, String hoTen, int balance) {
		super(id, hoTen, balance);
	}

	@Override
	public void operation( int amount) {
		System.out.println("============================Hoạt động rút tiền================================");
		
		if (amount <= balance) {
			old_balance = balance;
			balance+= amount;
			System.out.println("Số dư mới là :" + balance);
		}
		
		else {
			System.out.println("số tiền giao dịch ko đủ.");
		}
		
	}

	@Override
	public void transactionHistory() {
		System.out.println("============================Lịch sử giao dịch================================");
		
		System.out.println(" Loại giao dịch: Rút tiền");
		System.out.println(" Số dư cũ: " + old_balance);
		System.out.println(" Số dư mới :" + balance);
		
		
	}

}
