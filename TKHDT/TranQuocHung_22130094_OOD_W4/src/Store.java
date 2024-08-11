import java.util.Arrays;
import java.util.List;

public class Store {
	List<Customer> customers; 
	
	public static void main(String[] args) {
		Product p1 = new Houseware(21, "Nồi cơm", 200, null);
		Product p2 = new Houseware(22, "Chảo", 150, null);
		Product p3 = new Houseware(23, "Dao", 100, null);
		
		Product p4 = new Food(31, "Rau xanh", 20, null, null);
		Product p5 = new Food(32, "Thịt heo", 80, null, null);
		Product p6 = new Food(33, "Đồ hộp", 50, null, null);
		
		Product p7 = new Refrigeration(41, "Tủ lạnh", 6000, null, 0, 0);
		Product p8 = new Refrigeration(42, "Bàn ủi", 400, null, 0, 0);
		Product p9 = new Refrigeration(43, "Máy sấy tóc", 300, null, 0, 0);
		
		List<Product> underList = Arrays.asList(p1,p4,p6,p9,p2);
		List<Product> aboveList = List.of(p7,p3,p1,p9,p8,p5);
		
		
		
		Customer c1 = new Customer_Cash_Under_1M(11, "Jem", null, new Point_Under_1M(), underList, new Cash());
		Customer c2 = new Customer_Cash_Above_1M(11, "Tom", null, new Point_Above_1M(), aboveList, new Cash());
		
		
		System.out.println(c1.totalBill());
		System.out.println(c1.pay());
		System.out.println(c2.pay());
	}

}
