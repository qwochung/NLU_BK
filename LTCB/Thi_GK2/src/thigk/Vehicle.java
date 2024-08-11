package thigk;

public class Vehicle {
	int iid;
	String name;
	int year;
	/**
	 * @param iid
	 * @param name
	 * @param year
	 */
	public Vehicle(int iid, String name, int year) {
		super();
		this.iid = iid;
		this.name = name;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Vehicle iid " + iid + ", name=" + name + ", year=" + year ;
	}
	
	
	
	
	public boolean hadVehice(String name2) {
		// TODO Auto-generated method stub
		return this.name.equals(name2);
	}

}
