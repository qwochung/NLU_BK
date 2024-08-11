package Lab_Strategy_Video_Rental;

public class ChildrenMovie  extends MovieType {
	
	
	public ChildrenMovie( String movieName, FrequenRenterPoint frequenRenterPoint) {
		super();
		this.movieName = movieName;
		this.frequenRenterPoint= frequenRenterPoint;
	}

	@Override
	protected double getCharge(int rentDays) {
		if (rentDays > 3) {
			return 1500 + (rentDays-3) * 1000;
		}
		else {
			return 1500;
		}
	}

	@Override
	protected int getPoint(int rentDay) {
		return frequenRenterPoint.getPoint(rentDay);
	}

}
