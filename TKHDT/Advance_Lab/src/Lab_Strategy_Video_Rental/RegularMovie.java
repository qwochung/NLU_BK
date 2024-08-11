package Lab_Strategy_Video_Rental;

public class RegularMovie extends MovieType {

	public RegularMovie( String movieName, FrequenRenterPoint frequenRenterPoint) {
		super();
		this.movieName = movieName;
		this.frequenRenterPoint= frequenRenterPoint;
	}

	@Override
	protected double getCharge(int rentDays) {
		if (rentDays > 2) {
			return 3000 + (rentDays-2) * 1000;
		}
		else {
			return 3000;
		}
		
		
	}

	@Override
	protected int getPoint( int rentDay) {
		return frequenRenterPoint.getPoint(rentDay);
	}
	
	

	

}
