import java.time.LocalDate;

public class Fashion extends Product {
	LocalDate warrantyPeriod;

	public Fashion(int id, String name, int price, String address, LocalDate warrantyPeriod) {
		super(id, name, price, address);
		this.warrantyPeriod = warrantyPeriod;
	}
	
	
	
}
