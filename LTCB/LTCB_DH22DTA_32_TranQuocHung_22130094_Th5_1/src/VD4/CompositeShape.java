package VD4;

public class CompositeShape implements Shape {
	Shape top;
	Shape bottom;
	/**
	 * @param top
	 * @param bottom
	 */
	public CompositeShape(Shape top, Shape bottom) {
		super();
		this.top = top;
		this.bottom = bottom;
	}
	@Override
	public String toString() {
		return this.top.toString() + "\n"
				+ this.bottom.toString();
	}
	

}
