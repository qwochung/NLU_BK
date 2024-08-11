package thigk;

public abstract class Employee {
	int eid;
	String name;
	Date birth;
	/**
	 * @param eid
	 * @param name
	 * @param birth
	 */
	public Employee(int eid, String name, Date birth) {
		super();
		this.eid = eid;
		this.name = name;
		this.birth = birth;
	}
	
	
	
	@Override
	public abstract String toString() ;
	
	
	public abstract boolean isDriver ();



	protected abstract Employee getDriver(String name2);
	
	

}
