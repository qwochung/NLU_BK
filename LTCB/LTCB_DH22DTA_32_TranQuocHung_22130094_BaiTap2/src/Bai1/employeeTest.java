package Bai1;

import junit.framework.TestCase;


// Test class
public class employeeTest extends TestCase{
	public void testConstructer () {
		new employee("adsdas",10);
		
		}
	
/**
 * testing for wage
 */
	public void testWage () {
		assertEquals(new employee("sdasd", 10).wage(12), 120.0,  0.001);
	}
	
	

// Testing for tax

	public void testTax () {
		assertEquals ( new employee("das", 10).tax(0.15),18,0.001);
	}

	
	
	
//Testing for getNetpay 

	public void testGetNetpay() {
		assertEquals(new employee("hung", 10).getNetpay(), 102.0);
		
	}

	
	
//	Testting for raisedWage
	
	public void testRaisedWage () {
		assertEquals(new employee("hung", 10).raisedWage(14.0), 134.0);
	}





// Testing for checkovertime
	
	public void testCheckOverTime() {
		assertTrue( new employee("hung", 200).checkOverTime());
	}




// Testing for taxWithRate
	public void testTaxWithRate() {
		assertEquals(new employee("assd", 10).taxWithRate(), 0.0);

	}

	
// Testing for netpay
	
	public void testNetPay() {
		assertEquals(new employee("asdas", 10).netpay(), 120.0);
//		assertEquals(new employee("asdas", 50).netpay(), 432.0);
		
	}


	















}


