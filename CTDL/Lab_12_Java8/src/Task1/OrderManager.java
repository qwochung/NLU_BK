package Task1;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OrderManager {
	List<Order> orders;

	public OrderManager(List<Order> orders) {
		super();
		this.orders = orders;
	}
	
	
//	Product maxProduct() tìm ra sản phẩm có giá bán cao nhất.
	
	 private Product maxProduct() {
		 Comparator<OrderItem> comp = new Comparator<OrderItem>() {
			
			@Override
			public int compare(OrderItem o1, OrderItem o2) {
				// TODO Auto-generated method stub
				return o1.getPrice() - o2.getPrice();
			}
		};
		 return orders.stream().flatMap(order -> order.getItems().stream()).max(comp).get().getItem();
	}
	
	
	
	
//  HashMap<String, Integer> productTypesStatistics() trả về loại sản phẩm và số lượng bán ra cho mỗi loại.
	 public   HashMap<String, Integer> productTypesStatistics() {
		 return (HashMap<String, Integer>) orders.stream().flatMap(order -> order.getItems().stream())
				 .collect(Collectors.
						 toMap(OrderItem::getType, OrderItem::getAmount,(amount1, amount2) -> amount1+ amount2 ));
		
	}
	
	
//	 TreeSet<Order> ordersByCost() trả về danh sách các hóa đơn sắp xếp giảm dần 
//	 theo giá trị của hóa đơn. Nếu 2 hóa đơn có cùng giá trị thì xếp theo ngày.

	public TreeSet<Order> ordersByCost() {
		Comparator<Order> comp = new Comparator<Order>() {

			@Override
			public int compare(Order o1, Order o2) {
				int i1 = o1.getItems().stream().mapToInt((x) -> x.getAmount() * x.getPrice()).sum()	;
				int i2 = o2.getItems().stream().mapToInt((x) -> x.getAmount() * x.getPrice()).sum()	;
				if (i1 == i2) {
					return o1.getDate().compareTo(o2.getDate());
				}
				return i1-i2;
			}
		};
		return (TreeSet<Order>) orders.stream().collect(Collectors.toCollection( () -> new TreeSet<>(comp)));
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "OrderManager [orders=" + orders.toString() + "]";
	}


	public static void main(String[] args) {
//				Product
		Product p1 = new Product("But", "type1",10, LocalDate.of(2023, 12, 31));
		Product p2 = new Product("Thuoc", "type1",5, LocalDate.of(2023, 10, 1));
		Product p3 = new Product("Tap", "type1",6, LocalDate.of(2023, 9, 3));
		
		Product p4 = new Product("Dien thoai", "type2",90, LocalDate.of(2023, 11, 21));
		Product p5 = new Product("Laptop", "type2",120, LocalDate.of(2023, 9, 11));
		Product p6 = new Product("Ipad", "type2",70, LocalDate.of(2023, 12, 18));
		Product p7 = new Product("Tai nghe", "type2",50, LocalDate.of(2023, 2, 28));
		
		
		
		Product p8 = new Product("Quan", "type3",30, LocalDate.of(2023, 6, 21));
		Product p9 = new Product("Ao", "type3",25, LocalDate.of(2023, 12, 12));
		Product p10 = new Product("Giay", "type3",40, LocalDate.of(2023, 10, 29));
		
//				OrderItem
		OrderItem oItem1 = new OrderItem(p1, 5);
		OrderItem oItem2 = new OrderItem(p2, 1);
		OrderItem oItem3 = new OrderItem(p3, 3);
		OrderItem oItem4 = new OrderItem(p4, 2);
		OrderItem oItem5 = new OrderItem(p5, 4);
		OrderItem oItem6 = new OrderItem(p6, 7);
		OrderItem oItem7 = new OrderItem(p7, 9);
		OrderItem oItem8 = new OrderItem(p8, 7);
		OrderItem oItem9 = new OrderItem(p9, 2);
		OrderItem oItem10 = new OrderItem(p10, 1);
		
//				Order
		Order order1 = new  Order("1", "NVA", "Dat", LocalDate.of(2024, 1, 12), List.of(oItem1, oItem2));
		Order order2 = new  Order("2", "NVB", "Dat", LocalDate.of(2024, 10, 11), List.of(oItem3, oItem4));
		Order order3 = new  Order("3", "NVC", "Dat", LocalDate.of(2024, 11, 1), List.of(oItem5, oItem6));
		Order order4 = new  Order("4", "NVD", "Dat", LocalDate.of(2024, 8, 12), List.of(oItem7, oItem8));
		Order order5 = new  Order("5", "NVE", "Dat", LocalDate.of(2024, 11, 11), List.of(oItem9, oItem10));
		
		
		OrderManager manager = new OrderManager(List.of(order1, order2, order3, order4, order5));
		
		
		
//		System.out.println(manager);
//		System.out.println(manager.maxProduct());
//		System.out.println(manager.productTypesStatistics());
		System.out.println(manager.ordersByCost());
		
	}
}
