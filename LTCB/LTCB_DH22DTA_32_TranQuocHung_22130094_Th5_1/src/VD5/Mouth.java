	package VD5;

public class Mouth {
	Location location;

	/**
	 * @param location
	 */
	public Mouth(Location location) {
		super();
		this.location = location;
	}

	@Override
	public String toString() {
		return "Mouth " + location.toString() ;
	}

}
