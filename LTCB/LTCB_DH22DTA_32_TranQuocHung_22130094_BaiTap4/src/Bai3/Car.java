/**
 * 
 */
package Bai3;

/**
 * @author ADMIN
 *
 */
public class Car extends Vehicle {
	String manufacturer;
	int yearManufacture, yearRegistration;
	/**
	 * @param maxGuest
	 * @param maxSpeed
	 * @param manufacturer
	 * @param yearManufacture
	 * @param yearRegistration
	 */
	public Car(int maxGuest, int maxSpeed, String manufacturer, int yearManufacture, int yearRegistration) {
		super(maxGuest, maxSpeed);
		this.manufacturer = manufacturer;
		this.yearManufacture = yearManufacture;
		this.yearRegistration = yearRegistration;
	}

}
