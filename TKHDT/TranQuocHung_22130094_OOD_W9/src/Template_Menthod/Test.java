package Template_Menthod;

public class Test {

	public static void main(String[] args) {
		Bank_Operation withdraw = new Withdraw_Money(111, "Trần Quốc Hưng", 10000000);
		Bank_Operation recharge = new Recharge_Money(111, "Trần Quốc Hưng", 10000000);
		
		withdraw.steptransaction(1000);
		recharge.steptransaction(1000);
	}
}
