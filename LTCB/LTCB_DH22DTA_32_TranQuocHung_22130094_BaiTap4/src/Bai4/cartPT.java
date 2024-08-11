/**
 * 
 */
package Bai4;

/**
 * @author ADMIN
 *
 */
public class cartPT {
	int x ,y;

	/**
	 * @param x
	 * @param y
	 */
	public cartPT(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	
	/**
	 * @return
	 */
	public double distanceToO() {
		// TODO Auto-generated method stub
		return( Math.sqrt(this.x * this.x + this.y * this.y));
	}

	/**
	 * @param point
	 * @return
	 */
	public double distanceTo(cartPT point) {
		// TODO Auto-generated method stub
		return Math.sqrt(   
				Math.pow(this.x - point.x, 2)
				+ Math.pow( this.y - point.y, 2)
					);
	}
	
	
	
	public boolean equals(Object obj) {
		if (null == obj || !(obj instanceof cartPT))
			return false;
		else {
			cartPT that = (cartPT) obj;
			return (this.x == that.x) && (this.y == that.y);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
