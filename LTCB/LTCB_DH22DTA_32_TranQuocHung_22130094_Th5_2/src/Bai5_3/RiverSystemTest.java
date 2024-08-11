package Bai5_3;

import junit.framework.TestCase;

public class RiverSystemTest extends TestCase  {
	
	// tao mouth 
	Mouth mouth  = new Mouth( "m", new CartPt(7	, 5));
	
	
	// tao River
	
	River river1 = new River("s", 	new CartPt(1, 1	), 120);
	River river2 = new River("t", new CartPt(1, 5), 50);
	River river3 = new River( "u", new CartPt(3, 7), 100);
	
	
	// tao MTRiver 
	LstRiver empty = new MTRiver();
	
	
	// tạo LstRiver
	LstRiver lstRiver1 = new ConsRiver(river1, empty);
	LstRiver lstRiver2 = new ConsRiver(river2, lstRiver1);
	
	LstRiver lstRiver3 = new ConsRiver(river3, lstRiver2); 
	
	
	
	// tạo confluence cho diem b
	
	Confluence confluence1 = new Confluence("b"	, new CartPt(3, 3), lstRiver1);
	
	
	
	// tao LstConfluence cho diem b
	
	LstConfluence lstConfluence1 = new ConsConfluence(confluence1, new MTConfluence());
	
	
	
	// tao Confluence cho diem a
	
	Confluence confluence2 = new Confluence("a", new CartPt(5	, 5), new ConsRiver(river3, empty));
	
	
	// tao LstConfluence cho diem a
	
	LstConfluence lstConfluence2 = new ConsConfluence(confluence2, lstConfluence1);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
