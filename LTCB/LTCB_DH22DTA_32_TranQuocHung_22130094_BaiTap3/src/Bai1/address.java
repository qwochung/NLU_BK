/**
 * 
 */
package Bai1;

/**
 * @author ADMIN
 *
 */
public class address {
	int houseNumber;
	String street, city;
	public address(int houseNumber, String street, String city) {
		
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
	}

	public boolean inThisCity(String city) {
		// TODO Auto-generated method stub
		return this.city.equals(city);
	}
	
	
	public boolean sameCity(address address) {
		// TODO Auto-generated method stub
		
		return this.city.equals(address.city);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
