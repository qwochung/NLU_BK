package VD5;

public class Confluence extends ARiver {
	ARiver left;
	ARiver right;
	/**
	 * @param location
	 * @param length
	 * @param left
	 * @param right
	 */
	public Confluence(Location location, double length, ARiver left, ARiver right) {
		super(location, length);
		this.left = left;
		this.right = right;
	}
	@Override
	public String toString() {
		return left.toString() +  right.toString() ;
	}

}
