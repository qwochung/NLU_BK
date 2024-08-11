package ThiGk;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
	public void testConstructer() {

		// tao ds xe
		Vehicle v1 = new Vehicle(101, "xe tai " , 2020);
		Vehicle v2 = new Vehicle( 102, "xe khach ", 2016);
		Vehicle v3 = new Vehicle(103, "xe bus ", 2012);
		Vehicle v4 = new Vehicle(104, "xe ban tai ", 2010);
		
		
		
		
		Ivehicle emty	= new MTVehicle();
	
		Ivehicle lst1 = new ConsVehicle(v2, emty);
		Ivehicle lst2 = new ConsVehicle(v3, lst1);
		
		System.out.println(lst2); // PASSED
		
		
		// test Staff
		Employee t1 = new Staff(11, " Tran Quoc Hung", new Date(04, 04, 2004), 9.0, " PKD");
		Employee t2 = new Staff(11, " Nguyen Van ABC", new Date(12	, 4, 2003), 2.0, " PKT");
		
		
		
		// test Driver 
		Employee d1 = new Driver(201, "Ta Phap Quan" , new Date(12, 01, 1990), 2.9, lst2);
		Employee d2 = new Driver(202, "Thien Dinh" , new Date(12, 04, 1992), 3.0, new ConsVehicle(v1, new ConsVehicle(v3, new MTVehicle())));
		
		
		
		
	}

	
	
	// tao ds xe
			Vehicle v1 = new Vehicle(1, "ba gac " , 2010);
			Vehicle v2 = new Vehicle( 12, "xe loi ", 2002);
			Vehicle v3 = new Vehicle(23, "xe tank ", 1990);
			
			
			
			Ivehicle emty	= new MTVehicle();
		
			Ivehicle lst1 = new ConsVehicle(v2, emty);
			Ivehicle lst2 = new ConsVehicle(v3, lst1);
			
			
			
			
			// test Staff
			Employee t1 = new Staff(11, " Tran Quoc Hung", new Date(04, 04, 2004), 9.0, " PKD");
			Employee t2 = new Staff(11, " Nguyen Van ABC", new Date(12	, 4, 2003), 2.0, " PKT");
			
			
			
			// test Driver 
			Employee d1 = new Driver(201, "Ta Phap Quan" , new Date(12, 01, 1990), 2.9, lst2);
			Employee d2 = new Driver(202, "Thien Dinh" , new Date(12, 04, 1992), 3.0, new ConsVehicle(v1, new ConsVehicle(v3, new MTVehicle())));
			
	
	
	
	
	
	// Test getBirthday
	public void testGetBirthday () {
		assertEquals(t1.getBirthday(), new Date(04, 04, 2004));
		assertEquals(d2.getBirthday(), new Date(12, 04, 1992));
		
	}
	
	
	
	
	
	// test salary
	public void testSalary () {
		assertEquals(d2.salary(), 2700000.0);
		assertEquals(d1.salary(), 2610000.0);
		assertEquals(t2.salary(), 2000000.0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
