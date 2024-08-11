import java.time.LocalDate;
import java.util.List;

public class NomalCustomer extends Customer implements obDisount{

	public NomalCustomer(int id, String name, LocalDate birth, String phone, List<Product> listProducts) {
		super(id, name, birth, phone, listProducts);
	}

	@Override
	public void updateDiscount(String name, String message) {
		flagDiscout = true;
		System.out.println(name + " gởi đến số điện thoại " + getPhone() + " với thông tin :" + message);
		
	}

	@Override
	public double total() {
		double 	result= listProducts.stream().mapToInt(x-> x.getPrice()).sum();
		if (flagDiscout) {
			result = result - result*2/100;
		}
		
		
		return result;
	}

}
