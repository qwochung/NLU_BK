/**
 * 
 */
package Bai7;

/**
 * @author ADMIN
 *
 */
public class Van extends TaxiVehicle {
	boolean access ;

	/**
	 * @param idNum
	 * @param passenger
	 * @param pricePerMile
	 * @param distance
	 * @param access
	 */
	public Van(int idNum, int passenger, int pricePerMile, int distance, boolean access) {
		super(idNum, passenger, pricePerMile, distance);
		this.access = access;
	}

	@Override
	public double fare() {
		// TODO Auto-generated method stub
		return this.passenger * this.passenger;
	}

	
	

}
