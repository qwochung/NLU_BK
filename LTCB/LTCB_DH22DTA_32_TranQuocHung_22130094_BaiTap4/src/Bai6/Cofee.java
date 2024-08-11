/**
 * 
 */
package Bai6;

/**
 * @author ADMIN
 *
 */
public class Cofee extends GroceryStore {
	String labeled ;

	/**
	 * @param brandName
	 * @param weight
	 * @param price
	 * @param labeled
	 */
	public Cofee(String brandName, int weight, double price, String labeled) {
		super(brandName, weight, price);
		this.labeled = labeled;
	}

}
