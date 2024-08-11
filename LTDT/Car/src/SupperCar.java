
public  class SupperCar {

	int noOfDoors ;
	int noOfWhels;
	String color;
	

	
	public SupperCar(int noOfDoors, int noOfWhels, String color) {
		super();
		this.noOfDoors = noOfDoors;
		this.noOfWhels = noOfWhels;
		this.color = color;
	}
	
	
	

	public SupperCar(String color) {
		super();
		this.color = color;
	}




	public SupperCar() {
		
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfWhels() {
		return noOfWhels;
	}

	public void setNoOfWhels(int noOfWhels) {
		this.noOfWhels = noOfWhels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	
	


}
