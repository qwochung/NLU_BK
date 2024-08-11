package Bai2;

public class birthYear {
	int day, month, year;

	public birthYear(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	// curentAuthor
	public boolean currentAuthor() {
	
		return this.year > 1940;
	}


	public boolean thisAuthor(birthYear that) {
		// TODO Auto-generated method stub
		return this.day == that.day
				&& this.month == that.month
				&& this.year == that.year;
	}


	public boolean sameGeneration(book book2) {
		// TODO Auto-generated method stub
		//if ((Math.abs(this.year - book2.year)) <= 10) ko chạy!
		
		if (((this.year - book2.year)) <= 10) // chạy
			return true;
		else return false;
	}


	public boolean equal(Object obj) {
		// TODO Auto-generated method stub
		if ( obj == null || !(obj instanceof birthYear))
			return false;
		else 
		{
			birthYear that = (birthYear) obj;
			return this.day == that.day
					&& this.month == that.month
					&& this.year == that.year;
		
		}
	
	}
}
