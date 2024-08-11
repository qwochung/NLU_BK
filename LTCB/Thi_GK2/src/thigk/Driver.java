package thigk;

public class Driver extends Employee {
	ListVehicle lst;

	/**
	 * @param eid
	 * @param name
	 * @param birth
	 * @param lst
	 */
	public Driver(int eid, String name, Date birth, ListVehicle lst) {
		super(eid, name, birth);
		this.lst = lst;
	}

	@Override
	public String toString() {
		return " eid : " + this.eid + " ----Name : " + this.name + this.birth.toString() + this.lst.toString();
	}

	@Override
	public boolean isDriver() {
		// TODO Auto-generated method stub
		return true;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public  Employee getDriver(String name2) {
		
		// TODO Auto-generated method stub
		if ( this.lst.hadVehicle( name2 ) ) {
			return this;
	}
		else return null;

	}

}
