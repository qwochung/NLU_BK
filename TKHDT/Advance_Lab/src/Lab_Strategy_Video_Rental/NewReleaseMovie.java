package Lab_Strategy_Video_Rental;

public class NewReleaseMovie  extends MovieType {
	
	
	public NewReleaseMovie( String movieName, FrequenRenterPoint frequenRenterPoint) {
		super();
		this.movieName = movieName;
		this.frequenRenterPoint= frequenRenterPoint;
	}

	@Override
	protected double getCharge(int rentDays) {
		return 4000 * rentDays ;
	}

	@Override
	protected int getPoint(int rentDay) {
		return frequenRenterPoint.getPoint(rentDay);
	}

}
