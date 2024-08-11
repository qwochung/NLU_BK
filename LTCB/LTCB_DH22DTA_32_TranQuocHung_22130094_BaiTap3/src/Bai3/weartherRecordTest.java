package Bai3;

import junit.framework.TestCase;

public class weartherRecordTest extends TestCase {
	date day1 = new date(12, 10, 2020);
	temperatureRange today = new temperatureRange(29, 40);
	temperatureRange nomal = new temperatureRange( 25, 40);
	temperatureRange record = new temperatureRange(20, 45);
	temperatureRange today2 = new temperatureRange(10, 40);
	
	
	weartherRecord w1 = new weartherRecord(day1, today, nomal, record, 28.0);
	weartherRecord w2 = new weartherRecord(day1, today2, nomal, record, 28.0);
	
	
	// Testing withInRange
	public void  testWithInRange() {
		weartherRecord w1 = new weartherRecord(day1, today, nomal, record, 28.0);
		assertTrue(w1.withInRange(nomal));
		
		
	}

	
	
	// Testing for rainyDay
	public void testRainyDay () {
		assertTrue(w1.rainyDay(10.48));
	}
	
	
	
	// Testing for recordDay
	
	public void testRecordDay () {
		assertTrue(w2.recordDay());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
