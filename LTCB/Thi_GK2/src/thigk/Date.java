package thigk;

public class Date {
	int day , month, year;

	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return " ----Birth :  " + day +"/" + month + "/" + year ;
	}

}
