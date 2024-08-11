package Bai5_1;

public class Address {
	String Street, city;

	/**
	 * @param street
	 * @param city
	 */
	public Address(String street, String city) {
		super();
		Street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Street : " + Street + ", city :" + city + " )";
	}
	
}
