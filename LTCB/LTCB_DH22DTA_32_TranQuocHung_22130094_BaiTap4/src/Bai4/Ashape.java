/**
 * 
 */
package Bai4;

/**
 * @author ADMIN
 *
 */
public abstract class Ashape implements Ishape {
	cartPT loc;

	/**
	 * @param loc : location of shape
	 */
	public Ashape(cartPT loc) {
		super();
		this.loc = loc;
	}
	
	
	// menthod area
	public abstract double area () ;
	

	
	// menthod distanceToO 
	
	public abstract double distanceToO() ;
	
	
	
	// menthod distanceTo
	public abstract boolean distanceTo (cartPT point);
	
	
	
	 
	// menthod boundingBox
	public abstract Square boundingBox();
	
	
	// menthod perimeter
	public abstract double perimeter ();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
