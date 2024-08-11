package ThiGk;

public class ConsDriver implements IDriver {
	Driver first;
	IDriver rest;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsDriver(Driver first, IDriver rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

}
