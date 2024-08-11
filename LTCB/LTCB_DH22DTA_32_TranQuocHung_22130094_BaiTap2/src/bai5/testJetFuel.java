package bai5;

import junit.framework.TestCase;

public class testJetFuel extends TestCase {
	
	
	// Testing for totalcost
	public void testTotalCost() {
		assertEquals(new jetFuel(10, "height", 1000).totalCost(), 10000);
	}
	
	
	
	
	
	
	// Testing for Discount
	public void testDiscount() {
		assertEquals(new jetFuel(10, "height", 10000000).discount(), 0.1);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
