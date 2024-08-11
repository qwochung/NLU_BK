package VD4;

import junit.framework.TestCase;

public class ShapeTest extends TestCase	{
	
	ASingleShape dot = new  Dot(new CartPT(1, 3));
	ASingleShape square = new Square(new CartPT(2, 4), 12);
	ASingleShape circle = new Circle(new CartPT(1, 9),	 4);
	ASingleShape rectangle = new Rectangle(new CartPT(9, 3), 11, 9);
	
	
	
	
	Shape lst1 = new CompositeShape(circle, dot);
	Shape lst2 = new CompositeShape(lst1, square);
	
	public void testConstructor () {
		System.out.println( lst2);
	}
}
