package Lab_Strategy_Video_Rental;

public class RegularPoints implements FrequenRenterPoint {

	@Override
	public int getPoint(int rentDay) {
		return 1;
	}

}
