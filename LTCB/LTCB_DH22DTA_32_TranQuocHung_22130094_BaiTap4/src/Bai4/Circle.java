/**
 * 
 */
package Bai4;

/**
 * @author ADMIN
 *
 */
public class Circle extends Ashape {

	int R;

	/**
	 * @param loc
	 * @param r : radius of circle
	 */
	public Circle(cartPT loc, int r) {
		super(loc);
		R = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(R, 2) * Math.PI;
	}
	
	
	
	
	
//	 menthod distanceToO in subclass
	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return this.loc.distanceToO();
	}

	
	
	
	
//	 menthod distanceToO in subclass

	@Override
	public boolean distanceTo(cartPT point) {
		// TODO Auto-generated method stub
		return this.loc.distanceTo(point) <= this.R ;
	}

	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return Math.PI * 2 * this.R;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
