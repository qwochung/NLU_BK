package VD4;

public class Rectangle extends ASingleShape {
	int width, height;

	/**
	 * @param location
	 * @param width
	 * @param height
	 */
	public Rectangle(CartPT location, int width, int height) {
		super(location);
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle : width=" + width + ", height=" + height + this.location.toString();
	}

}
