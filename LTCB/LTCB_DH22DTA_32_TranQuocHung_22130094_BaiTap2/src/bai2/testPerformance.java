package bai2;

import junit.framework.TestCase;

public class testPerformance extends TestCase{
	public void testTotalProfit() {
		assertEquals(new Performance(100, 5).totalProfit(30, 0.5),420.0 );
	}

}
