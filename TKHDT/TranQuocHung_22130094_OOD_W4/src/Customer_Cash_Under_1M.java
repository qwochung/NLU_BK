import java.time.LocalDate;
import java.util.List;

public class Customer_Cash_Under_1M extends Customer {

	public Customer_Cash_Under_1M(int id, String name, LocalDate birthD, Point point, List<Product> products,
			PaymentType type) {
		super(id, name, birthD, point, products, type);
		
	}

	@Override
	public double pay() {
		
		return totalBill() - ( totalBill()*type.discount()/100 + point.pointDiscout());
	}
	
	
	

}
