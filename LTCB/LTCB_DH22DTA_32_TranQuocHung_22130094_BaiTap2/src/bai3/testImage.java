package bai3;

import junit.framework.TestCase;

public class testImage extends TestCase {
	
	
//Testing for isPortrait
	public void testIsPortrait () {
		assertTrue( new image(10, 20, "src ", "FHD").isPortrait()       );
	
	}
	
	
//	Testing for size
	public void testSize () {
		assertEquals(new image(12, 10, "src", "4k").size(), 120);
	}
	
	
//Testing for islarger
	public void testIsLarger() {
		assertTrue(new image(1244, 120, "src","2k").isLarger(new image(12, 20, "src", "FHD")));
	}
	
	
	
// Testing for same
	public void testSame () {
		assertTrue(new image(11, 10, "src", "FHD").same(new image(11, 10, "src", "FHD")));
	}
	
	

	
// Testing for sizeString
	public void testSizeString() {
		assertEquals(new image(1000,10000,"src","4k").sizeString(), "large");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
