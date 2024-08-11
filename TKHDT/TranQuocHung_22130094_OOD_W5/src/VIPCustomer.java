import java.time.LocalDate;
import java.util.List;

public class VIPCustomer extends Customer implements obDisount, obProduct {
	int point;

	public VIPCustomer(int id, String name, LocalDate birth, String phone, List<Product> listProducts) {
		super(id, name, birth, phone, listProducts);
		point = 50;
	}

	@Override
	public void updateProduct(String name, String message) {
		System.out.println(name + " gởi đến số điện thoại " + getPhone() + " với thông tin :" + message);
		
	}

	@Override
	public void updateDiscount(String name, String message) {
		flagDiscout = true;
		System.out.println(name + " gởi đến số điện thoại " + getPhone() + " với nội dung khuyến mãi :" + message);
		
	}

	@Override
	public double total() {
		
		double 	result= listProducts.stream().mapToInt(x-> x.getPrice()).sum();
		if (flagDiscout) {
			result = result - result*2/100;
		}
		
		if (point >= 50) {
			result = result - result*5/100;
		}
		
		return result;
	}
	
	
	
	
}
