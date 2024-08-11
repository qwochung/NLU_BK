package thigk;

import junit.framework.TestCase;

public class EmployeeTest  extends  TestCase {
	
	// tạo các xe
	Vehicle xe1  = new Vehicle(01, "xe tai", 2019);
	Vehicle xe2 = new Vehicle( 02, "bus" , 2010);
	Vehicle xe3 = new Vehicle(03, "xe hoi", 2020);
	
	// tạo MTVehicle
	ListVehicle noVehicle = new MTVehicle()	;
	
	// tao listVehicle
	ListVehicle lst1 = new ConsVehicle(xe1, noVehicle);
	ListVehicle lst2 = new ConsVehicle(xe2, lst1);
	ListVehicle lst3 = new ConsVehicle( xe3, lst2);
	
	
	// tao staff
	
	Employee t1 = new  Staff(999, "Ngoc", new Date(12, 4, 2000), "PKD");
	Employee t2 = new  Staff(998, "Bich", new Date(10, 2, 2000), "PKD");
	Employee t3 = new  Staff(997, "Trang", new Date(11, 9, 2000), "PKD");


	// tao driver
	
	Employee d1 = new Driver(111, "Hung", new Date(1, 9, 1999), lst1);
	Employee d2 = new Driver(112, "Vu", new Date(14, 5 , 1999), lst2);
	Employee d3 = new Driver(113, "Hao", new  Date(23, 9, 1999), lst3);
	
	
	// tao MTEmployee
	
	LstEmployee Emty = new MTEmployee()	;
	// tao ConsEmployee
	
	
	ConsEmployee c1 = new ConsEmployee(t1, Emty);	
	ConsEmployee c2 = new ConsEmployee(t2, c1);
	ConsEmployee c3 = new ConsEmployee(t3, c2);
	ConsEmployee c4 = new ConsEmployee(d1, c3);
	ConsEmployee c5 = new ConsEmployee(d2, c4);
	
	LstEmployee c6 = new ConsEmployee(d3, c4);

	public void testConstructor () {
		System.out.println(c6);
	}


	public void testGetDriver () {
		
		System.out.println( "==========================================================================");
		
		
		System.out.println("getDriver" + c6.getDriver("xe tai"));
		
		System.out.println( "==========================================================================");
	}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
