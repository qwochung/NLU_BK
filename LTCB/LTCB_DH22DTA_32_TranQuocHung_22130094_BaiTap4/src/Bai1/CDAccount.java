package Bai1;

public class CDAccount extends typeAccount {
	double rate;
	int maturity;
	/**
	 * @param id
	 * @param name
	 * @param currentBalance
	 * @param rate
	 * @param maturity
	 */
	public CDAccount(int id, String name, double currentBalance, double rate, int maturity) {
		super(id, name, currentBalance);
		this.rate = rate;
		this.maturity = maturity;
	}

	
}
