package bai8;

import junit.framework.TestCase;

public class trainTest extends TestCase {
	public static void testconstructer() {
		new train (new Schedule ( new ClockTime(12,40),new ClockTime(15,00) ), new Route ("zczxc","afasfa") , true);
		
	}

}
