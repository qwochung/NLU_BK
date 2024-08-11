/**
 * 
 */
package Bai3;

/**
 * @author ADMIN
 *
 */
public abstract class Vehicle {
	int maxGuest, maxSpeed;

	/**
	 * @param maxGuest
	 * @param maxSpeed
	 */
	public Vehicle(int maxGuest, int maxSpeed) {
		super();
		this.maxGuest = maxGuest;
		this.maxSpeed = maxSpeed;
	}

}
