package bai5;
/**
 * Design the class JetFuel, whose purpose it is to represent the sale of some quantity of jet fuel. 
	Each instance contains the quantity sold (in integer gallons),the quality level (a string),
 	and the current base price of jet fuel (in integer cents per gallon).
 	
 	
 	
 
 */
public class jetFuel {
	int quantity_sold;
	String quality_level;
	int base_price;
	
	
	public jetFuel(int quantity_sold, String quality_level, int base_price) {
		
		this.quantity_sold = quantity_sold;
		this.quality_level = quality_level;
		this.base_price = base_price;
	}
	
	
	/**
	 *  The class should come with two methods:
	-totalCost, which computes the cost of the sale, 
	
 * @author ADMIN
 *example :
 *	new jetFuel(10, "height", 1000).totalCost() => 10000
 *
 *	new jetFuel(10, "height", 10000000).discount() => 0.1
	 * @return
	 */
	
	
	public int totalCost() {
		return this.quantity_sold * this.base_price;
	}
	
	
	/**
	 * -discountPrice, which computes the discounted price :
		The buyer gets a 10% discount if the sale is for more than 100,000 gallons
	 
	 *example :	
	 *	new jetFuel(10, "height", 10000000).discount() => 0.1
	 *
	 *
	 */
	public double discount() {
		if (this.totalCost() > 100000)
			return 0.1;
		else return 0.0;
		
	}
	 
	
	
	
	
	
	
	
}
