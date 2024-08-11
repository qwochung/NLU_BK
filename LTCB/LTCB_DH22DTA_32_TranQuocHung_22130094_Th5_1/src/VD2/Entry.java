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
	

}
