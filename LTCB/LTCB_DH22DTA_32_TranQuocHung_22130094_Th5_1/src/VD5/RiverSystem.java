package VD5;

public class RiverSystem {
	Mouth mouth;
	ARiver river;
	/**
	 * @param mouth
	 * @param river
	 */
	public RiverSystem(Mouth mouth, ARiver river) {
		super();
		this.mouth = mouth;
		this.river = river;
	}
	@Override
	public String toString() {
		return this.mouth.toString() + "\n"
				+ this.river.toString();
	}
	

}
