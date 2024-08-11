import java.time.LocalDate;

public class Houseware extends Product {
	LocalDate warranty_Period;

	
	public Houseware(int id, String name, int price, LocalDate warranty_Period) {
		super(id, name, price);
		this.warranty_Period = warranty_Period;
	}
	
}
