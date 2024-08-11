/**
 * 
 */
package Bai7;

/**
 * @author ADMIN
 *
 */
public class Limo extends TaxiVehicle {
	int minRental;

	/**
	 * @param idNum
	 * @param passenger
	 * @param pricePerMile
	 * @param distance
	 * @param minRental
	 */
	public Limo(int idNum, int passenger, int pricePerMile, int distance, int minRental) {
		super(idNum, passenger, pricePerMile, distance);
		this.minRental = minRental;
	}

	@Override
	public double fare() {
		if ( ( this.distance * this.pricePerMile )  > this.minRental )
			return this.distance * this.pricePerMile;
		else return this.minRental ;
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
