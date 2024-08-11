package bai4;

import junit.framework.TestCase;
//Testing for coffee

public class testCoffee extends TestCase{

	public void testDiscount() {
		assertEquals(new coffee("avc",100.0,50).discount(),0.1);
	}

}
