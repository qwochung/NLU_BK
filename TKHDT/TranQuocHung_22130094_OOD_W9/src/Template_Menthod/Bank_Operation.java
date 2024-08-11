package Template_Menthod;

public abstract class Bank_Operation {

	 void steptransaction (int amout){
		System.out.println("==================================ĐANG THỰC HIỆN GIAO DỊCH=======================================");
		login();
		confirm();
		operation(amout);
		transactionHistory();
		
	};
	
	
	public void login() {
		System.out.println("Đăng nhập thành công.");
	}
	
	public void confirm() {
		System.out.println("Xác thực thành công.");
	}
	
	public abstract void operation(int amount);
	public abstract void transactionHistory();
	
	
	
	
}
