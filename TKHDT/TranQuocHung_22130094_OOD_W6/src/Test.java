import java.util.List;

public class Test {
	public static void main(String[] args) {

		
//		Service
		Service service1= new FullService(910, "Xây nhà trọn gói");
		Service service2= new BasicService(911, "Xây nhà phần thô");
		Service service3= new DesignService(912, "Bản thiết kế nhà");
		Service service4= new LandscapeDecorate(920, "Trang trí khuôn viên", service2); // Gói trang trí + Xây phần thô
		Service service5= new RepaintDecorate(921, "Sơn đổi màu", service1); // Gói sơn lại + Xây trọn gói
		Service service6= new LandscapeDecorate(920, "Sơn đổi màu", null); // Gói sơn lại + Xây trọn gói
		
		
//		Customer 
		Customer customer1 = new Customer(222, "Tran Quoc Hung", service4);
		Customer customer2 = new Customer(222, "Le Van Khoa", service3);
		Customer customer3 = new Customer(222, "Nguyen Minh Chau", service5);
		Customer customer4 = new Customer(222, "Dao Minh Quan", service6);
		
		
		
//		Company
		Company company = new Company(111, "Công ty NovaLand" , List.of(customer1, customer2, customer3, customer4));
		
		
		System.out.println("Khách hàng " + customer1.getTen() +" có tổng chi phí là : " + customer1.cost());
		System.out.println("Khách hàng " + customer2.getTen() +" có tổng chi phí là : " + customer2.cost());
		System.out.println("Khách hàng " + customer3.getTen() +" có tổng chi phí là : " + customer3.cost());
		System.out.println("Khách hàng " + customer4.getTen() +" có tổng chi phí là : " + customer4.cost());
		
		System.out.println("===================================================================");
		
		System.out.println("Tổng danh thu của công ty " + company.getName() + " là : " + company.cost());
		
		System.out.println("===================================================================");
		System.out.println("                    HÓA ĐƠN KHÁCH HÀNG                   ");
		company.bill();
		
	}

}
