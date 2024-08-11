import java.time.LocalDate;

public class Cosmetics extends Product {
	LocalDate productionDate;
	LocalDate expirationDate;
	
	public Cosmetics(int id, String name, int price, String address, LocalDate productionDate,
			LocalDate expirationDate) {
		super(id, name, price, address);
		this.productionDate = productionDate;
		this.expirationDate = expirationDate;
	}
}
