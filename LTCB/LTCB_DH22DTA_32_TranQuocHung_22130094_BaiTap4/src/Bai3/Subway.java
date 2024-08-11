/**
 * 
 */
package Bai3;

/**
 * @author ADMIN
 *
 */
public class Subway extends Vehicle {
	int weight, fare;

	/**
	 * @param maxGuest
	 * @param maxSpeed
	 * @param weight
	 * @param fare
	 */
	public Subway(int maxGuest, int maxSpeed, int weight, int fare) {
		super(maxGuest, maxSpeed);
		this.weight = weight;
		this.fare = fare;
	}
	

}
