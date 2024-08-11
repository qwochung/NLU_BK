package VD4;

public class Circle extends ASingleShape {
	int darius;

	/**
	 * @param location
	 * @param darius
	 */
	public Circle(CartPT location, int darius) {
		super(location);
		this.darius = darius;
	}

	@Override
	public String toString() {
		return "Circle : darius= " + darius + this.location.toString();
	}

}
