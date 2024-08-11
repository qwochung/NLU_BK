/**
 * 
 */
package Bai6;

/**
 * @author ADMIN
 *
 */
public class Juice extends GroceryStore {
	String flavor;
	String packaged;
	/**
	 * @param brandName
	 * @param weight
	 * @param price
	 * @param flavor
	 * @param packaged
	 */
	public Juice(String brandName, int weight, double price, String flavor, String packaged) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this.packaged = packaged;
	}
	
}
