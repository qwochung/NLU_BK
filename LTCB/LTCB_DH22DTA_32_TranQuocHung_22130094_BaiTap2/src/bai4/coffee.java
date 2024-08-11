package bai4;

/**
 * Develop a program that computes the cost of selling bulkcoffee at a specialty coffee seller from a receipt
 *  that includes the kind of coffee, the unit price, and the total amount (weight) sold.
 *   If the sale is for less than 5,000 pounds, there is no discount.
 *    For sales of 5,000 pounds to 20,000 pounds, 
 *    the seller grants a discount of 10%. 
 *    For sales of 20,000 pounds or more, the discount is 25%. . . .

 * @author ADMIN
 *example :
 *	new coffee("avc",100.0,50).discount() => 0.1
 */
	
public class coffee {
	String name;
	double price	;
	int weight;
	
	
	
	
	
	
	
	public coffee(String name, double price, int weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
	}


	
	
	
		
	public double sotien() {
		return  this.price * this.weight;
		
	}
	
	
	public double discount () {
		if (this.sotien() < 5000.0)
			return 0.0 ;
		
		if (this.sotien() < 20000.0)
			return 0.1;
		
		else return 0.25 ; 
		
		
	}	
}



