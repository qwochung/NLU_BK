
public class Honda  extends SupperCar {
	private String hondaColor;
	
	
	
	
	public Honda(int noOfDoors, int noOfWhels, String hondaColor) {
		super(noOfDoors, noOfWhels, hondaColor);
		this.hondaColor= hondaColor;
		
	}

	
	
	public Honda(String color) {
		super.setColor(color);
		System.out.println(super.color);
	}


	
	
	public void setHondaColor(String color) {
		this.hondaColor = color;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Honda hondaCar = new Honda(1,2,"red");
		
		hondaCar.setHondaColor("blue");
		
		hondaCar.setColor("green");

		
	}

}
