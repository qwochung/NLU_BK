package ThiGk;

public class Staff extends Employee {
	String department;

	/**
	 * @param eid
	 * @param name
	 * @param date
	 * @param salary
	 * @param department
	 */
	public Staff(int eid, String name, Date date, double salary, String department) {
		super(eid, name, date, salary);
		this.department = department;
	}

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return this.salaryRate * 	1000000;
	}
	

}
