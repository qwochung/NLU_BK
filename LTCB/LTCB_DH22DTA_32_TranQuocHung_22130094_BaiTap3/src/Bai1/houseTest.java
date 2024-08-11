package Bai1;

import junit.framework.TestCase;

public class houseTest extends TestCase{
	House h1= new House("Ranch", 10, 500.000, new address(001, "Maple", "NewYork"));
	House h2= new House("Colonial", 1, 500.000, new address(001, "Maple", "NewYork"));
	
	// Testing For hasMoreRoom
	public void testHasMoreRoom() {
		
		assertTrue(h1.hasMoreRoom(h2));
	}
	

	//Testing for inThisCity
	public void testsInThisCity() {
		assertTrue(h1.inThisCity("NewYork"));
	}
	
	
	//Testing for sameCity
	public void testSameCity() {
		assertTrue(h1.sameCity(h2));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
