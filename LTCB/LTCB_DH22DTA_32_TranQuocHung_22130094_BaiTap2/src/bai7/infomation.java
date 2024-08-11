package bai7;

public class infomation {
	String name;
	double deposit;
	int maturity;
	/**
	 * Information about the transaction in bank includes customer name,
	  	and deposit amount and maturity (computed in year)
	 *2.7.1 Develop the method interest. It consumes a deposit amount and 
	 	produces the actual amount of interest that the money earns in a year.
	 	 The bank pays a flat 4% per year for deposits of up to $1,000,
	 	  a flat 4.5% for deposits of up to $5,000, 
	 	  and a flat 5% for deposits of more than $5,000 

	 * @param name : name of customer
	 * @param deposit : money 
	 * @param maturity ( year )
	 * @return interest ( % )
	 * 
	 * example :
	 * 		deposit = 1000000$ => interest = 5%
	 * 		deposit = 100$ => interest = 4%
	 * 
	 * 
	 * 
	 */
	
	public infomation(String name, double deposit, int maturity) {
	
		this.name = name;
		this.deposit = deposit;
		this.maturity = maturity;
	}
	
	
	public double interest() {
		if (this.deposit <= 1000.0)
			return 0.04;
		if (this.deposit <= 5000.0)
			return 0.045;
		return 0.05;
	}
	
	
	/**
	 * Some credit card companies pay back a small portion of the charges a customer makes over a year. One company returns 
		0.25% for the first $500 of charges, 
		0.50% for the next $1000 (that is, the portion between $500 and $1500), 
		0.75% for the next $1000 (that is, the portion between $1500 and $2500),
		and 1.0% for everything above $2500. 
 	*Define the payback method, which consumes a charge amount and computes the corresponding pay-back amount.
 	*
 	*	example :
 	*		Profit amount = 500$ 	=> return 500*0.25% =  1.25$
 	*		Profit amount = 1300$   => return 500*0.25% + 800*0.5% = 5.25$
 	*
 	

	 */
	
	public double payBack () {
		double profitAmount = this.deposit * this.interest();
		
		if (profitAmount <=  500.0)
			return profitAmount*0.0025;
		
		if (profitAmount <= 1500.0)
			return 1.25 + (profitAmount-500.0)*0.005;
		
		if (profitAmount <= 2500.0 )
			return 1.25 + 5.0 + (profitAmount - 1500.0)*0.0075;
		
		
		else return 1.25 + 5.0 + 7.5 + (profitAmount - 2500.0)*0.01;
		
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
