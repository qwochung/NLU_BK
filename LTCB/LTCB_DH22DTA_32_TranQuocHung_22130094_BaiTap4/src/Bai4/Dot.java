/**
 * 
 */
package Bai4;

/**
 * @author ADMIN
 *
 */
public class Dot extends Ashape {

	/**
	 * @param loc
	 */
	public Dot(cartPT loc) {
		super(loc);
	}

	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.0;
	}



	
//	 menthod distanceToO in subclass
	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return this.loc.distanceToO();
	}



	
	
//	 menthod distanceTo in subclass
	
	@Override
	public boolean distanceTo(cartPT point) {
		// TODO Auto-generated method stub
		return this.loc.distanceTo( point)== 0.0;
	}


	
	
	
//	 menthod boundingBox in subclass

	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub

		return new Square(this.loc, 0.0);
				
	}



	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	


	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
