package VD2;

public class Entry {
	Date date ;
	double distance;
	int duration; 
	String comment ;
	/**
	 * @param date
	 * @param distance
	 * @param duration
	 * @param comment
	 */
	public Entry(Date date, double distance, int duration, String comment) {
		super();
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Entry date=" + date.toString() + ", distance=" + distance + ", duration=" + duration + ", comment=" + comment ;
	}
	
	
	
	
	
	
	
	public boolean hasDistanceShorterThan(Entry that) {

		return this.distance <= that.distance;

		}
	
	
	
	
	
	
	
	public double totalDistance(int month) {
		// TODO Auto-generated method stub
		if  (this.date.getMonth() == month )
		
			return this.distance ;
		else 
			return 0; 
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
