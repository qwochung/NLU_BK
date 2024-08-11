package Bai5_1;

public class House {

	String name;
	int area ;
	Address address;
	/**
	 * @param name
	 * @param area
	 * @param address
	 */
	public House(String name, int area, Address address) {
		super();
		this.name = name;
		this.area = area;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "House name : " + name + ", area = " + area + ", address ( " + address.toString() ;
	}
	
}
