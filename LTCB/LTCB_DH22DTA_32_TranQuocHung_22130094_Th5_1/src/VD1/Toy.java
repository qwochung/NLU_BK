package VD1;

public class Toy {
	String name;
	double price ;
	int available;
	/**
	 * @param name
	 * @param price
	 * @param available
	 */
	public Toy(String name, double price, int available) {
		super();
		this.name = name;
		this.price = price;
		this.available = available;
	}
	@Override
	public String toString() {
		return "Toy name=" + name + ", price=" + price + ", available=" + available + "";
	}
	

}
