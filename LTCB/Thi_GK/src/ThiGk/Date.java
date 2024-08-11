package ThiGk;

public class Date {
	int day, month, year ;

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

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

	
	
	
	// viet overide 
	public boolean equals (Object obj) {
		if ( obj == null || ! (obj  instanceof Date) )
			return false ;
		else {
			Date that = (Date ) obj;
			return this.day == that.day &&
					this.month == that.month &&
					this.year == that.year ;
		}
		
			
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
