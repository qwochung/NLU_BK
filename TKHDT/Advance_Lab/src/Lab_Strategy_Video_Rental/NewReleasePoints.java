package Lab_Strategy_Video_Rental;

public class NewReleasePoints  implements FrequenRenterPoint{

	@Override
	public int getPoint(int rentDay) {
		if (rentDay > 1) {
			return 2;
		}
		return 1;
	}

}
