package Bai4;

import junit.framework.TestCase;

public class testTrainStrip extends TestCase{
	route route1 =new route ("Ben Tre", "TP.HCM");
	clockTime clockTimeLeave = new clockTime(12, 30);
	clockTime clockTimeArrivel = new clockTime(22, 30);
	
	schedule schedule1= new schedule(clockTimeLeave, clockTimeArrivel);
	
	trainStrip trainStrip1= new trainStrip(schedule1, route1, true);
			
	// Testing for  destination 
	public void testdestination() {
		assertTrue(trainStrip1.destination("TP.HCM"));
	}
	
	// Testing for whatTime 
	public void testWhatTime() {
		clockTime out = trainStrip1.whatTime();
		assertTrue(out.hour== 12 && out.minute==30);
		
	}
	

	//Testing for howLong
	public void testHowLong() {
		clockTime Long = trainStrip1.howLong();
		assertTrue ( Long.hour ==10 && Long.minute == 0 );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
