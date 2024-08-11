import java.time.LocalDate;
import java.util.List;

public class Customer_Cash_Above_1M extends Customer {

	public Customer_Cash_Above_1M(int id, String name, LocalDate birthD, Point point, List<Product> products,
			PaymentType type) {
		super(id, name, birthD, point, products, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double pay() {
		return totalBill() - ( totalBill()*type.discount()/100 + point.pointDiscout());
	}
	

}
