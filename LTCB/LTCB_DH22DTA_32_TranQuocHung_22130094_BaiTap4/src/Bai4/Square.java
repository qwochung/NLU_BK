/**
 * 
 */
package Bai4;

/**
 * @author ADMIN
 *
 */
public class Square extends Ashape {
	double size;

	/**
	 * @param loc
	 * @param size
	 */
	public Square(cartPT loc, double size) {
		super(loc);
		this.size = size;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.size * this.size ;
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
		if ( 
			point.x >= this.loc.getX()	&&
			
			point.x <= this.loc.getX() + this.size &&
			
			point.y >= this.loc.getY()	&&
			
			point.y <= this.loc.getY() + this.size
			)

			return true;
		else return false;
	}

	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		return new Square(this.loc, 0.0);
	}
	
	
	public boolean equals(Object obj) {
		if (null == obj || !(obj instanceof Square))
			return false;
		else {
			Square that = (Square) obj;
			return (this.loc.equals(that.loc)
					&& this.size == that.size);
		}
	
	
	}
	
	
	
	
	
	

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.size * 4;
	}
}
