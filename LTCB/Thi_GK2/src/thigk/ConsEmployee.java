package thigk;

public  class ConsEmployee implements LstEmployee {
	
	Employee first;
	LstEmployee rest;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsEmployee(Employee first, LstEmployee rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	
	
	@Override
	public String toString() {
		return  this.first + "\n" + this.rest ;
	}


	
	
	
	@Override
	public LstEmployee getDriver(String name) {
		if (this.first.isDriver())
			return new ConsEmployee(this.first.getDriver(name), rest.getDriver(name));
		else 
			return this.rest.getDriver(name);
	}
	
	

}
