/**
 * 
 */
package Bai4;


import junit.framework.TestCase;

/**
 * @author ADMIN
 *
 */
public class testShape extends TestCase{
	
	Ishape Dot = new Dot(new cartPT(3, 4));
	Ishape Square = new Square(new cartPT(11, 10), 5);
	Ishape Circle = new Circle(new cartPT(2, 1), 4);
	Ishape Rectangle = new Rectangles(new cartPT(4, 6), 10, 6);
	
	
	
	
	// Testing for area
	public void testArea () {
		assertEquals(new Dot(new cartPT(10, 20)).area(), 0.0);
		assertEquals( Square.area() , 25.0);
		assertEquals(Rectangle.area(), 60.0);
	}
	

//	 Testing for distanceToO
	
	public void testDistanceToO () {
		assertEquals(Dot.distanceToO(), 5.0);
		assertEquals(Rectangle.distanceToO(), 7.211,0.01);
		
		
	}
	
	
	
// Testing for distanceTo 
	public void testDistanceTo() {
		assertTrue( Square.distanceTo(new cartPT(12, 11)));
		Ishape rectangle = new Rectangles(new cartPT(12, 10), 10, 20);
		assertTrue(rectangle.distanceTo(new cartPT(12, 25)));
	}
		
	
	
	Ishape Dot2 = new Dot(new cartPT(3, 4));
	
//Testing for boundingBox
	public void testBoundingBox() 	{
		assertEquals( new Dot(new cartPT(1, 2)).boundingBox(), new Square( new cartPT(1, 2), 0.0));
		assertEquals(Rectangle.boundingBox(), new Square(new cartPT(4, 6), 10));
	}



// Testing for perimeter 
	public void testPerimeter () {
		assertEquals(Rectangle.perimeter(), 16*2, 0.0);
		assertEquals(Dot.perimeter(), 0.0);
	}

	
	
	
	
	
	
}
