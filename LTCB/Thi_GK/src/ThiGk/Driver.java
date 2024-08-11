package ThiGk;

public class Driver extends Employee {
	Ivehicle lstVehicle ;

	/**
	 * @param eid
	 * @param name
	 * @param date
	 * @param salary
	 * @param lstVehicle
	 */
	public Driver(int eid, String name, Date date, double salary, Ivehicle lstVehicle) {
		super(eid, name, date, salary);
		this.lstVehicle = lstVehicle;
	}

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return this.salaryRate * 900000;
	}
	

	
	
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
