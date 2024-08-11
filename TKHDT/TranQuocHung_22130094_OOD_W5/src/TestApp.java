import java.time.LocalDate;
import java.util.List;

public class TestApp {
	
	
	public static void main(String[] args) {
		
		Product sp1 = new Cosmetics(110, "Nuoc hoa", 100, "Ha Noi", LocalDate.of(2022, 10, 12), LocalDate.of(2025, 10, 11));
		Product sp2 = new Cosmetics(111, "Son moi", 70, "Ha Noi", LocalDate.of(2022, 10, 12), LocalDate.of(2025, 10, 11));
		Product sp3 = new Cosmetics(112, "Kem chong nang", 60, "Ha Noi", LocalDate.of(2022, 10, 12), LocalDate.of(2025, 10, 11));
		
		
		Product sp4 = new Fashion(220, "Ao", 90, "Trung quoc", LocalDate.of(2024, 12, 10));
		Product sp5 = new Fashion(221, "Non", 40, "Trung quoc", LocalDate.of(2024, 12, 10));
		Product sp6 = new Fashion(222, "Giay", 200, "Trung quoc", LocalDate.of(2024, 12, 10));
		
		
		List<Product> list1 = List.of(sp1, sp4, sp2);
		List<Product> list2 = List.of(sp6, sp5, sp3);
		
		
		NomalCustomer p1 = new NomalCustomer(11, "Jhin", LocalDate.of(2013, 12, 23) , "0122222300330", list1);
		
		VIPCustomer d1 = new VIPCustomer(11, "Tim", LocalDate.of(2013, 12, 23) , "09338183341", list2);
		
		
		Store store = new Store("Cong Ty abc ", "", "");
		store.registerDiscount(p1);
		store.registerDiscount(d1);
		store.registerProdut(d1);
		store.setInforProduct("Đã có hàng mới ");
		store.setInforDiscount("Giảm giá 20% cho sản phẩm Nước hoa");
		
		
	}

}
