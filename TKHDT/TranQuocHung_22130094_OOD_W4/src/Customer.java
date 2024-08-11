import java.time.LocalDate;
import java.util.List;

public abstract class Customer {
	int id;
	String name;
	LocalDate birthD;
	Point point;
	List<Product> products;
	PaymentType type;
	
	public Customer(int id, String name, LocalDate birthD, Point point, List<Product> products, PaymentType type) {
		super();
		this.id = id;
		this.name = name;
		this.birthD = birthD;
		this.point = point;
		this.products = products;
		this.type = type;
	}

	public double totalBill() {
		 return  products.stream().mapToDouble(product -> product.getPrice()).sum();
	}
	
	public abstract double pay();
	
	
}
