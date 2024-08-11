package VD3;

public class Intersection {
	int avenue, street;

	/**
	 * @param avenue
	 * @param street
	 */
	public Intersection(int avenue, int street) {
		super();
		this.avenue = avenue;
		this.street = street;
	}

	@Override
	public String toString() {
		return "avenue=" + avenue + ", street=" + street ;
	}
	
}
