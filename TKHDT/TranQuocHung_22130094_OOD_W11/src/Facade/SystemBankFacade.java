package Facade;

import java.time.LocalDate;

public class SystemBankFacade {
	Account account;
	AccountManage accountManage;
	TransactionProcess transaction;

	public SystemBankFacade() {
		super();
	}

	Account getAccount() {
		return account;
	}

	void setAccount(Account account) {
		this.account = account;
	}

	AccountManage getAccountManage() {
		return accountManage;
	}

	void setAccountManage(AccountManage accountManage) {
		this.accountManage = accountManage;
	}

	TransactionProcess getTransaction() {
		return transaction;
	}

	void setTransaction(TransactionProcess transaction) {
		this.transaction = transaction;
	}

	
	
	
	
	public boolean login(int id, String name) {
		Account account = new Account(id, name, 0);
		if (accountManage.login(account)) {
			this.setAccount(account);
			return true;
		} else {
			System.out.println("Đăng nhập không thành công.");
			return false;
		}

	}

	public boolean verify(Account account) {
		return accountManage.verify(account);
	}

	public void withDrawMoney(int amount) {

		if (verify(account)) {
			transaction = new TransactionProcess(account, LocalDate.now());
			transaction.operation(TransactionProcess.TYPE_WITHDRAW_MONEY, amount);
		}

		else {
			System.out.println("Tài Khoảng không hợp lệ.");
		}
	}

	public void rechargeMoney(int amount) {

		if (verify(account)) {
			transaction = new TransactionProcess(account, LocalDate.now());
			transaction.operation(TransactionProcess.TYPE_RECHARGE_MONEY, amount);
		}

		else {
			System.out.println("Tài Khoảng không hợp lệ");
		}
	}

	public void checkTrasaction(int idTransaction) {

		if (verify(account)) {
			transaction = new TransactionProcess(account, LocalDate.now());
			transaction.operation(TransactionProcess.TYPE_CHECK, idTransaction);
		}

		else {
			System.out.println("Tài Khoảng không hợp lệ.");
		}
	}

}
