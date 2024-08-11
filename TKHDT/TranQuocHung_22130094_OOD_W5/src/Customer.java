import java.time.LocalDate;
import java.util.List;

public abstract class Customer {
	int id;
	String name;
	LocalDate birth;
	String phone;
	List<Product> listProducts;
	boolean flagDiscout = false;
	
	public Customer(int id, String name, LocalDate birth, String phone, List<Product> listProducts) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		this.listProducts = listProducts;
	}

	String getPhone() {
		return phone;
	}

	void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public abstract double total();
	
	
}
