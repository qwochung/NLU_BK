package bai2;

public class Performance {
	int customer;
	double fare;

	public Performance(int customer,double fare) {
		
		this.customer = customer;
		this.fare=fare;
	}
	
	
	/**
	 * An old fashioned movie theater has a simple profit making method. 
	 * Each customer pays a ticket, for example $5.
	 *  Each performance costs the theater some amount, such as $20, and plus a service fee per attendee, such as $0.50.
	 *  TotalProfit method development.
	 *   It consumes the number of attendees (of a performance) and generates how much income the attendees earn
	Example:
			total profit (40) returns $160
			
	 * @param cost :  cost of a performance
	 * @param service_charge : service fee per attendee
	 * 
	 */
	public double totalProfit(  double cost, double service_charge   ) {
		return this.customer * this.fare - (cost + service_charge * this.customer) ;
	}
	

}
