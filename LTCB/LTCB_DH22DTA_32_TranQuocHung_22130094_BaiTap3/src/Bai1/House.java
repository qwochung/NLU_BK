package Bai1;

/**
 * Develop a "real estate assistant'' program.
 *  The "assistant'' helps the real estate agent locate houses of interest for clients.
 *  The information about a house includes its kind, the number of rooms, the asking price, and its address.
 *   An address consists of a house number, a street name, and a city.
 *   Represent the following examples using your classes:
		Ranch, 7 rooms, $375,000, 23 Maple Street, Brookline
		Colonial, 9 rooms, $450,000, 5 Joye Road, Newton
		Cape, 6 rooms, $235,000, 83 Winslow Road, Waltham

 * @author ADMIN
 *
 */


public class House {
	String kind;
	int numberOfRoom;
	double pice;
	address address;
	public House(String kind, int numberOfRoom, double pice, Bai1.address address) {
	
		this.kind = kind;
		this.numberOfRoom = numberOfRoom;
		this.pice = pice;
		this.address = address;
	}
	
	/**
	 * hasMoreRooms, which determines whether one house has more rooms than some other house;
	 * 
	 * example:
	 *  	
	 */
	
	
	public boolean hasMoreRoom(House that) {
		return this.numberOfRoom    >  that.numberOfRoom    ;
		
	}
	
	
	
	
	
	/**
	 * inThisCity, which checks whether the advertised house is in some given city (assume we give the method a city name);
	 * 
	 * city:  
	 * 
	 * exmaple: 
	 * 
	 */
	public boolean inThisCity (String city) {
		return this.address.inThisCity(city) ;
	}
	
	
	
	
	
	
	
	/**
	 * sameCity, which determines whether one house is in the same city as some other house
	 *  
	 *  example:
	 *  	
	 */
	public boolean sameCity(House that) {
		return this.address.sameCity(that.address);
		
	}
	

}
