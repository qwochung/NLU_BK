
public class Customer {
	int id;
	String ten;
	Service service;
	
	public Customer(int id, String ten, Service service) {
		super();
		this.id = id;
		this.ten = ten;
		this.service = service;
	}
	
	public int 	cost() {
		return service.cost();
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getTen() {
		return ten;
	}

	void setTen(String ten) {
		this.ten = ten;
	}

	public void bill() {
		System.out.println("Mã khách hàng: " + getId() + "                Tên khách hàng: " + getTen());
		System.out.println("Nội dung								Đơn giá");
		service.bill();
		
	
	}
	
	
}
