package VD5;

public abstract class ARiver {
	Location location;
	double length;
	/**
	 * @param location
	 * @param length
	 */
	public ARiver(Location location, double length) {
		super();
		this.location = location;
		this.length = length;
	}
	@Override
	public String toString() {
		return "ARiver " + location.toString() + ", length = " + length + "\n";
	}

}
