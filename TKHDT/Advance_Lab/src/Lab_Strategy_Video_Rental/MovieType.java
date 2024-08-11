package Lab_Strategy_Video_Rental;

public abstract class MovieType {
	String movieName;
	FrequenRenterPoint frequenRenterPoint;
	protected abstract double getCharge(int rentDays);
	protected abstract int getPoint(int rentDay);
	
	
	
	
	
	

}
