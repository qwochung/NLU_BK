/**
 * 
 */
package Bai7;

/**
 * @author ADMIN
 *
 */
public abstract class TaxiVehicle {
	int idNum ,passenger , pricePerMile	,distance;

	/**
	 * @param idNum
	 * @param passenger
	 * @param pricePerMile
	 * @param distance
	 * 
	 * 	Example :
	 * 		TaxiVehicle Cab = new  Cab(112, 4, 2, 15);
			TaxiVehicle limo = new Limo(113, 24, 3, 100, 200);
			TaxiVehicle Van = new Van(114, 8, 5, 150, true);
	 * 
	 */
	public TaxiVehicle(int idNum, int passenger, int pricePerMile, int distance) {
		super();
		this.idNum = idNum;
		this.passenger = passenger;
		this.pricePerMile = pricePerMile;
		this.distance = distance;
	}

	

	

	
	

	
	/**
	 * Add the following methods to the appropriate classes in the
hierarchy:

	fare, which computes the fare for a vehicle, based on the number of miles traveled, and using the following formulas for different vehicles:

		passengers in a cab just pay flat fee per mile

		passengers in a limo must pay at least the minimum rental fee, otherwise they pay by the mile

		passengers in a van pay $1.00 extra for each passenger
		
		*
		* Example :
		* 		Cab.fare() =>  30.0
		* 		limo.fare() => 300.0
		* 		Van.fare()=> 64.0
		*
		*
	 */
	
	public abstract double fare () ;
	
	
	
	
	
	
	
	/**
	 * lowerPrice, which determines whether the fare for a given number of miles is lower than some amount;\
	 * 
	 * 		Example :
	 * 			Cab.lowerPrice(40.0) => True
	 * 			limo.lowerPrice(10.0 ) => flase
	 * 
 	 * 
	 * 
	 */
	public boolean lowerPrice (double amount) {
		return this.fare() < amount ;
		
	}
	
	
	
	
	/**
	 * cheaperThan, which determines whether the fare in one vehicle 
	 * is lower than the fare in another vehicle for the same number of miles
	 * 
	 *  Example :
	 *  		Cab.cheaperThan(limo) => True
	 *  		limo.cheaperThan(Van)  => Flase
	 *  
	 *  		
	 */
	
	
	
	public boolean cheaperThan ( TaxiVehicle that) {
		return this.fare() < that.fare() ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}