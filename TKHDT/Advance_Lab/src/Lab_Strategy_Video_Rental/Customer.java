package Lab_Strategy_Video_Rental;

import java.util.List;

public class Customer {
	String name;
	List<RentItem> rent;
	
	
	public Customer(String name, List<RentItem> rent) {
		if (rent.size() > 5) {
			this.name = null;
			this.rent = null;
			System.out.println("Khách hàng "+ name +" đã mượn quá số lượng phim cho phép");
		}
		else {
			this.name = name;
			this.rent = rent;
		}
	
		
	}
	
	
//	 Tính tiền thuê
	public double getCharge() {
		return rent.stream().mapToDouble(item -> item.getCharge()).sum();
	}
	
	
//	 Tính điểm thưởng
	public int getPoint() {
		return rent.stream().mapToInt(x -> x.getPoint()).sum();
	}
	

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	
	
}
