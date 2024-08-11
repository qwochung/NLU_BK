package thigk;

public class Staff extends Employee {
	String department;

	/**
	 * @param eid
	 * @param name
	 * @param birth
	 * @param department
	 */
	public Staff(int eid, String name, Date birth, String department) {
		super(eid, name, birth);
		this.department = department;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " eid : " + this.eid + " ----Name : " +this.name 
				+this.birth.toString() + " ----Department : " +this.department;
	}

	@Override
	public boolean isDriver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Employee getDriver(String name2) {
		
		return null;
	}

	

}
