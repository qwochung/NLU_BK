/**
 * 
 */
package Bai6;

/**
 * @author ADMIN
 *
 */
public class IceCream extends GroceryStore {
	String flavor, type;

	/**
	 * @param brandName
	 * @param weight
	 * @param price
	 * @param flavor
	 * @param type
	 */
	public IceCream(String brandName, int weight, double price, String flavor, String type) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this.type = type;
	}
	
}
