/**
 * 
 */
package Bai4;

/**
 * @author ADMIN
 *
 */
public class Rectangles extends Ashape {
	int height, width;

	/**
	 * @param loc
	 * @param height
	 * @param width
	 */
	public Rectangles(cartPT loc, int height, int width) {
		super(loc);
		this.height = height;
		this.width = width;
	}
	
	

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.height * this.width;
	}

	
	
	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return this.loc.distanceToO();
	}

	
	
	
	@Override
	public boolean distanceTo(cartPT point) {
		// TODO Auto-generated method stub
		if ( 
				point.x >= this.loc.getX()	&&
				
				point.x <= this.loc.getX() + this.height &&
				
				point.y >= this.loc.getY()	&&
				
				point.y <= this.loc.getY() + this.width
				)

				return true;
			else return false;
	}
	
	




	@Override
	public Square boundingBox() {
		// TODO Auto-generated method stub
		if ( this.height > this.width)
			return new Square(this.loc, this.height);
		else return new Square(this.loc, this.width);
	}



	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (this.height + this.width ) * 2 ;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
