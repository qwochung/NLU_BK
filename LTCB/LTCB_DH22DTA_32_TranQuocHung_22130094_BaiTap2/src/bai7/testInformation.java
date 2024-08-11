package bai7;

import junit.framework.TestCase;

public class testInformation extends TestCase{
	
	
// Testing for interest 
	public void testInterest() {
		assertEquals(new infomation("abc", 100000.0, 3).interest(), 0.05);
	}
	
	// Testing for payBack
//	 5000$ => 1.25 + 5 + 7.5 + 2500*1% =
	public void testPayback() {
		assertEquals(new infomation("tzxc", 100000.0, 3).payBack(), 38,75);
	}
	
	
	
	
	
	
	
	
	
}
