package VD4;

public class Square extends ASingleShape {
	int size ;

	/**
	 * @param location
	 * @param size
	 */
	public Square(CartPT location, int size) {
		super(location);
		this.size = size;
	}

	@Override
	public String toString() {
		return "Square : size = " + size + this.location.toString();
	}

}
