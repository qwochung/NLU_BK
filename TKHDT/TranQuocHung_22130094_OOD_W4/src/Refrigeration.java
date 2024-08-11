import java.time.LocalDate;

public class Refrigeration  extends Product {
	LocalDate warranty_Period;
	int voltage;
	int capacity;
	
	public Refrigeration(int id, String name, int price, LocalDate warranty_Period, int voltage, int capacity) {
		super(id, name, price);
		this.warranty_Period = warranty_Period;
		this.voltage = voltage;
		this.capacity = capacity;
	}
}
