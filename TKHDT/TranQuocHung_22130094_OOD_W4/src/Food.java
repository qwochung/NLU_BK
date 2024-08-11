import java.time.LocalDate;

public class Food extends Product {

	

	LocalDate production_Date, expiration_Date;

	public Food(int id, String name, int price, LocalDate production_Date, LocalDate expiration_Date) {
		super(id, name, price);
		this.production_Date = production_Date;
		this.expiration_Date = expiration_Date;
	}
	
}
