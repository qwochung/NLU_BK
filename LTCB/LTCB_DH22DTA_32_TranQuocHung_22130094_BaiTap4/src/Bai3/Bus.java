/**
 * 
 */
package Bai3;

/**
 * @author ADMIN
 *
 */
public class Bus extends Vehicle {
	String departure, destination;
	int fare;
	/**
	 * @param maxGuest
	 * @param maxSpeed
	 * @param departure
	 * @param destination
	 * @param fare
	 */
	public Bus(int maxGuest, int maxSpeed, String departure, String destination, int fare) {
		super(maxGuest, maxSpeed);
		this.departure = departure;
		this.destination = destination;
		this.fare = fare;
	}

}
