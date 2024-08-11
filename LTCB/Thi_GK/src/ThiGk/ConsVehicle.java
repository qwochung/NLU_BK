package ThiGk;

public class ConsVehicle implements Ivehicle {
	Vehicle first;
	Ivehicle rest;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsVehicle(Vehicle first, Ivehicle rest) {
		super();
		this.first = first;
		this.rest = rest;
		
		
	
		
	}
	@Override
	public String toString() {
		return this.first.toString() + "\n"
				+ this.rest.toString();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
