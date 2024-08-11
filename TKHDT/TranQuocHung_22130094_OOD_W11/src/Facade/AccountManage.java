package Facade;

import java.util.List;

public class AccountManage {
	List<Account> listAccounts;
	

	public AccountManage(List<Account> listAccounts) {
		super();
		this.listAccounts = listAccounts;
	}

	
	
	

	public boolean verify(Account account) {
		for (Account a : listAccounts) {
			if (a.equals(account)) {
				System.out.println("Tài Khoản hợp lệ.");
				return true;
			}
		}
		
		return false;
	}





	public boolean login(Account account) {
		for (Account a : listAccounts) {
			if (a.login(account)) {
				account.setBalance(a.getBalance());
				System.out.println("Tài Khoản hợp lệ.");
				return true;
			}
		}
		return false;
	}
	
	
	
	
	

}
