/**
 * 
 */
package Bai7;

/**
 * @author ADMIN
 *
 */
public class Cab extends TaxiVehicle {
	
	public Cab(int idNum, int passenger, int pricePerMile , int distance ) {
		super (idNum,passenger,pricePerMile,distance);
		
	}

	@Override
	public double fare() {
		// TODO Auto-generated method stub
		return this.distance * this.pricePerMile;
	}
	
}
