package Bai1;

public abstract class typeAccount implements bankAccount {
	int id;
	String name;
	double currentBalance;
	/**
	 * @param id
	 * @param name
	 */
	
	public typeAccount(int id, String name, double currentBalance) {
		super();
		this.id = id;
		this.name = name;
		this.currentBalance = currentBalance;
	}
	

}
