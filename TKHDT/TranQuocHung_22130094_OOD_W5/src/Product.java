
public abstract class Product {
	int id;
	String  name;
	int price;
	String address;
	
	public Product(int id, String name, int price, String address) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.address = address;
	}

	int getPrice() {
		return price;
	}
	
}
