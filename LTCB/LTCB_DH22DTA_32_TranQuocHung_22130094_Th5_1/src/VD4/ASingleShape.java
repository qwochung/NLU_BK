package VD4;

public abstract class ASingleShape implements Shape {
	CartPT location;

	/**
	 * @param location
	 */
	public ASingleShape(CartPT location) {
		super();
		this.location = location;
	}

	@Override
	public abstract String toString() ;
		


}
