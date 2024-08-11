package bai7;


import junit.framework.TestCase;

public class weatherTest extends TestCase {
	public void testConstructer() {
		new weather (new Date(12,01,2022)  , new  EmperatureRange(32,58),  new  EmperatureRange(23,65), new  EmperatureRange (43,54), 12.23 );
		
	}

}
