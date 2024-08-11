package bai6;

import junit.framework.TestCase;

public class testQuadraticEquation extends TestCase {
	public void testWhatKind() {
		assertEquals(new quadraticEquation(7,1, 0).whatKind(), "Two");
	}
	

}
