/**
 * 
 */
package Bai2;

import junit.framework.TestCase;

/**
 * @author ADMIN
 *
 */
public class testGallery  extends TestCase	{

	public void testConstructer () {
		new Text("src", 100, 10);
		new Image("Src", 200, 10, 20, "FHD");
		new Sound("src", 4000, 600);
		
	}
}
