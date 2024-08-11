package ThiGk;



public abstract class Employee implements LstEmployee {
	int eid;
	String name;
	Date date;
	double salaryRate;
	/**
	 * @param eid
	 * @param name
	 * @param date
	 * @param salary
	 */
	public Employee(int eid, String name, Date date, double salaryRate) {
		super();
		this.eid = eid;
		this.name = name;
		this.date = date;
		this.salaryRate = salaryRate;
	}

	
	
	
	
	
	// phuong thuc getBirthday
	
	
	public Date getBirthday () {
		return new Date(this.date.getDay(),this.date.getMonth()	, this.date.getYear()); 
		
	}



	

// overide de so sanh date
	@Override
	public boolean equals(Object obj) {
		return this.date.equals(obj);
	}
	
	
	
	// phuong thuc salary
	
	
	public abstract double salary ();
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
