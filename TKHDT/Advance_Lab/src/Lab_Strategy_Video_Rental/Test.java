package Lab_Strategy_Video_Rental;

import java.time.LocalDate;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		MovieType m1 = new RegularMovie("Regular 1", new RegularPoints());
		MovieType m2 = new NewReleaseMovie("NewReleaseMovie 1", new NewReleasePoints());
		MovieType m3 = new ChildrenMovie("ChildrenMovie 1", new RegularPoints());
		MovieType m4 = new NewReleaseMovie("NewReleaseMovie 2", new NewReleasePoints());
		MovieType m5 = new NewReleaseMovie("NewReleaseMovie 3", new NewReleasePoints());
		MovieType m6 = new RegularMovie("Regular 2", new RegularPoints());
		
		RentItem rent1 = new RentItem(LocalDate.of(2024, 4, 1), m1);
		RentItem rent2 = new RentItem(LocalDate.of(2024, 4, 2), m2);
		RentItem rent3 = new RentItem(LocalDate.of(2024, 3, 12), m3);
		RentItem rent4 = new RentItem(LocalDate.of(2024, 2, 11), m4);
		RentItem rent5 = new RentItem(LocalDate.of(2024, 4, 8), m5);
		RentItem rent6 = new RentItem(LocalDate.of(2024, 4, 1), m6);
		
		
		List<RentItem> listError= List.of(rent1	, rent2, rent3, rent4, rent5, rent6);
		List<RentItem> listCorrect= List.of(rent1, rent2, rent3, rent4, rent5);
		
		
		Customer customer1 = new Customer("Customer1", listCorrect);
		Customer customer2 = new Customer("Customer2", listError);
		
		System.out.println("Số tiền khách hàng " + customer1.getName() + " là : "+ customer1.getCharge());
		System.out.println("Số tiền khách hàng " + customer2.getName() + " là : "+ customer2.getCharge()); 
		
		System.out.println("Số điểm tích lũy được của khác hàng " + customer1.getName() + " là : " + customer1.getPoint());
		
	}

}
