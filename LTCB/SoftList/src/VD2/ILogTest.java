package VD2;

import junit.framework.TestCase;

public class ILogTest  extends TestCase {
	
	
	Date date1 = new Date(12, 1, 2022);
	Date date2 = new Date(13, 1, 2022);
	Date date3 = new Date(14, 1, 2022);
	
	
	
	Entry entry1 = new Entry(date1, 1.5, 60, "good");
	
	Entry entry2 = new Entry(date2, 1.8, 70, "good");
	
	Entry entry3 = new Entry(date3, 2.0, 90, "good");
	
	
	ILog emty	=  new MTLog();
	
	ILog lst = new ConsLog(entry1, emty);
	ILog lst2 = new ConsLog(entry2, lst);
	ILog lst3 = new ConsLog(entry3, lst2);
	
	
	public void testConstructer () {
		
		ILog d = lst3.sortByDistance();
		
		System.out.println(d);
		
		
		
	}
	
	
	
	
	// test totalDistance
	public void testTotalDistance () {
		System.out.println(lst3.totalDistance(1) ); 
		//PASSED
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
