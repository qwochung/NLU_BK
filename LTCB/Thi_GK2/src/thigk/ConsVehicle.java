package thigk;

public class ConsVehicle implements ListVehicle {
	Vehicle first ;
	ListVehicle rest;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsVehicle(Vehicle first, ListVehicle rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return  "\n ***************" + this.first.toString() + "\n"	 + this.rest ;
	}
	
	
	
	
	
	@Override
	public boolean hadVehicle(String name) {
		// TODO Auto-generated method stub
		return this.first.hadVehice (name) || this.rest.hadVehicle(name);
	}
	
}
