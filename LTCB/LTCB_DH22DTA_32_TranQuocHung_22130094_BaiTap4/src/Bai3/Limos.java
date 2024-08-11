/**
 * 
 */
package Bai3;

/**
 * @author ADMIN
 *
 */
public class Limos extends Vehicle {
	int nRoom;
	String service, quality;
	/**
	 * @param maxGuest
	 * @param maxSpeed
	 * @param nRoom
	 * @param service
	 * @param quality
	 */
	public Limos(int maxGuest, int maxSpeed, int nRoom, String service, String quality) {
		super(maxGuest, maxSpeed);
		this.nRoom = nRoom;
		this.service = service;
		this.quality = quality;
	}

}
