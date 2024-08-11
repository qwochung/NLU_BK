/**
 * 
 */
package Bai6;

/**
 * @author ADMIN
 * 
 * Develop a program that keeps track of the items in the grocery store.
 *  For now, assume that the store deals only with ice cream, coffee, and juice.
 *  Each of the items is specified by its brand name, weight (gram) and price  (cents).
 *   Each coffee is also labeled as either regular or decaffeinated. 
 *   Juice items come in different flavors, and can be packaged as frozen, fresh, bottled, or canned. \
 *    Each package of ice cream specifies its flavor and whether this is a sorbet, a frozen yogurt, or regular ice cream.
 *    
 *    
 *    Example :
 *    		GroceryStore Coffe = new Cofee("Trung Nguyên", 100, 2000.0, "decaffeinated");
			GroceryStore Juice = new Juice("Cam ", 100, 1500.0, "Ngọt", "Fresh");
			GroceryStore IceCream = new IceCream(" Tô Châu"	, 50, 	500.0, " Hương Dâu", " Regular Ice Cream");
 *
 */
public abstract class GroceryStore {
	String brandName ;
	int weight;
	double price;
	/**
	 * @param brandName
	 * @param weight
	 * @param price
	 */
	public GroceryStore(String brandName, int weight, double price) {
		super();
		this.brandName = brandName;
		this.weight = weight;
		this.price = price;
	}
	
	

	
	
	/**
	 * unitPrice, which computes the unit price (cents per gram) of some grocery item;
	 * Example :
	 * 		Coffe.unitPrice() => 200000
	 * 		Juice.unitPrice() => 150000
	 * 		IceCream.unitPrice() => 25000
	 * 
	 */
	
	
	public double unitPrice () {
		return this.price * this.weight;
	}
	
	
	
	
	
	/**
	 * lowerPrice, which determines whether the unit price of some grocery item is lower than some given amount;
	 * 
	 * Exampel :
	 * 		IceCream.lowerPrice(Coffe) => True
	 * 
	 */
	
	
	public boolean lowerPrice (GroceryStore that) {
		return this.price < that.price;
	}
	
	
	
	
	/**
	 * cheaperThan, which determines whether a grocery item is cheaper than some other, given one in terms of the unit cost.
	 * 
	 * 	Example :
	 * 			IceCream.cheaperThan(Coffe) => True
	 * 			Juice.cheaperThan(Coffe) => True 
	 * 
	 */
	
	
	public boolean cheaperThan (GroceryStore that) {
		return this.unitPrice() < that.unitPrice();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
