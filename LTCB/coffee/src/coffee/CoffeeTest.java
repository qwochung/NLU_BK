package coffee;

import junit.framework.TestCase;

public class CoffeeTest extends TestCase{
	public void testConstructer() {
		assertEquals( new Coffee("dasda", 10.0, 120).sotien(),1200.0,000.1);
		new Coffee ( "zxcz",12.4,5);
	}
	

}
