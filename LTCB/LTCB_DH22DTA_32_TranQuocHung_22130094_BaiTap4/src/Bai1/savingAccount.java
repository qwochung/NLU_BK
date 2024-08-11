/**
 * 
 */
package Bai1;

/**
 * @author ADMIN
 *
 */
public class savingAccount extends typeAccount {
	double rate;

	/**
	 * @param id
	 * @param name
	 * @param currentBalance
	 * @param rate
	 */
	public savingAccount(int id, String name, double currentBalance, double rate) {
		super(id, name, currentBalance);
		this.rate = rate;
	}

}
