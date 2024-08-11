/**
 * 
 */
package Bai4;

/**
 * @author ADMIN
 *
 */
public interface Ishape {
	
	/**
	 *  Compute the area of a shape
	 * @return
	 *  Example :
	 *  	Ishape Dot = new Dot(new cartPT(10, 20));
			Ishape Square = new Square(new cartPT(11, 1), 5);
			Ishape Circle = new Circle(new cartPT(2, 1), 4); 
			    ( Use for every where )
			
	 *  		Square.area() => 25
	 *  		Dot.area() => 0	
	 */
	public double area ();

	
	/**
	 * Compute the distance of a shape to the origin
	 * 
	 *  Example :
	 *  		
	 */
	
	public double distanceToO() ;
	
	
	/**
	 * Determine whether some point is inside the shape
	 * 
	 * Example :
	 * 		new Dot(new CartPt(100, 200)).contains(new CartPt(100, 200)) // should be true

			new Dot(new CartPt(100, 200)).contains(new CartPt(80, 220)) // should be false

			new Square(new CartPt(100, 200), 40).contains(new CartPt(120, 220)) // should be true

			new Square(new CartPt(100, 200), 40).contains(new CartPt(80, 220)) // should be false

			new Circle(new CartPt(0, 0), 20).contains(new CartPt(4, 3)) // should be true

			new Circle(new CartPt(0, 0), 10).contains(new CartPt(12, 5)) // should be false
	 * 
	 * 
	 */
	
	public boolean distanceTo(cartPT point);
	
	
	
	/**
	 * Compute the bounding box of a shape

		All of these methods clearly work with shapes in general
	but may have to compute different results depending on
	the concrete shape on which they are invoked

		For example, a Dot has no true area; a Square's area is
	computed differently from a Circle's area

		In an object-oriented language, we can express this
	requirement with the addition of a method signature to
	the IShape interface
	*
	*
	* Example :
	* 	new Dot(new CartPt(5, 5)).boundingBox()
// should be:		new Square(new CartPt(5, 5), 0)
 * 

		new Square(new CartPt(4, 3), 40).boundingBox()
// should be: 			new Square(new CartPt(4, 3), 40)
 * 

		new Circle(new CartPt(10, 30), 20).boundingBox()
// should be:			new Square(new CartPt(-10, 10), 40))
	* 
	*
	*/
	
	
	public Square boundingBox();
	
	
	
	
	/**
	 * Design an extension for the class hierarchy of
shapes that deals with Rectangles.
The extension should cope with all the abstract
methods in AShape

4.4.2 Design an extension for the class hierarchy of
shapes so that a program can request the length of the
perimeter for each shape in the hierarchy


	 */
	
	public double perimeter ();
	
	
	
	
	
	
	
	
}
