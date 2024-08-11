package Facade;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		
		Account a1 = new Account(111, "Tran Quoc Hung", 10000);
		Account a2 = new Account(112, "Le Van Sy", 3000);
		Account a3 = new Account(113, "Nguyen Huu Huan", 30000);
		Account a4 = new Account(114, "Nguyen Van Thanh", 15000);
		Account a5 = new Account(115, "Nguyen Ba Thong", 7000);
		Account a6 = new Account(116, "Dao Van Chuong", 10000);
		
		
		List<Account> list = new ArrayList<Account>();
		list.add(a1);		
		list.add(a2);		
		list.add(a3);		
		list.add(a4);		
		list.add(a5);		
		list.add(a6);		
		
		SystemBankFacade systemBank = new SystemBankFacade();
		AccountManage accountManage = new AccountManage(list);
		
		systemBank.setAccountManage(accountManage);
		
		Account account = new Account(111, "Tran Quoc Hung", 10000);
		
		systemBank.login(111, "Tran Quoc Hung");
		
		systemBank.withDrawMoney(100);
		
		systemBank.rechargeMoney(3400);
		
		
	}

}
