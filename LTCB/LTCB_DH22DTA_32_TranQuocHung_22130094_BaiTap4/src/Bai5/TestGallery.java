/**
 * 
 */
package Bai5;

import junit.framework.TestCase;

/**
 * @author ADMIN
 *
 */
public class TestGallery extends TestCase {
	
	// Test constructer
	public void testConstructer () {
		new Text("Text1", 100, 10);
		new Image("Phong canh", 200, 10, 20, "FHD");
		new Sound("Some thing", 4000, 600);
		
	}
	
	
	
	



	Gallery Text = new Text("Text1", 100, 10);
	Gallery Image = new Image("Phong canh", 200, 10, 20, "FHD");
	Gallery Sound = new Sound("Some thing", 4000, 600);
	
	
	
	// Testing for timeToDownload
	public void testTimeToDownload () {
		assertEquals(Text.timeToDownload() , 100.0);
		assertEquals(Image.timeToDownload() , 200.0);
		assertEquals(Sound.timeToDownload() , 4000.0);
	}
	
	
	
	
	//Testing for smallerThan
	
	public void testSmallerThan () {
		assertTrue(Text.smallerThan(1024));
		assertTrue(Image.smallerThan(1024));
		assertTrue(Sound.smallerThan(10240));
		
		
	}
	
	
	
	// Testing for sameName
	
	public void testsameName() {
		assertTrue(Text.sameName("Text1"));
		assertTrue(Image.sameName("Phong canh"));
		assertTrue(Sound.sameName("Some thing"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}