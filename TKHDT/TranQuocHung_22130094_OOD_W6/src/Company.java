import java.util.List;

public class Company {
	int id;
	String name;
	List<Customer> customers;
	
	
	
	
	
	
	public Company(int id, String name, List<Customer> customers) {
		super();
		this.id = id;
		this.name = name;
		this.customers = customers;
	}



	int getId() {
		return id;
	}



	void setId(int id) {
		this.id = id;
	}



	List<Customer> getCustomers() {
		return customers;
	}



	void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}



	String getName() {
		return name;
	}



	void setName(String name) {
		this.name = name;
	}



	public int  cost() {
	    return  customers.stream().mapToInt(x -> x.cost()).sum();
	}
	
	public void bill() {
		int count= 0;
		for (Customer customer : customers) {
			System.out.println( "Khách hàng " + count ++);
			customer.bill();
			System.out.println("---------------------------------------------------------------------");
		}
		System.out.println( "Tổng danh thu: " + cost());
	}
	
	
}

