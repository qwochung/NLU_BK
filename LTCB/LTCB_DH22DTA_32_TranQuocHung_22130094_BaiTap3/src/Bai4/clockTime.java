package Bai4;

public class clockTime {
	int hour, minute;

	public clockTime(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}

	



	public int getHour() {
		return hour;
	}





	public void setHour(int hour) {
		this.hour = hour;
	}





	public int getMinute() {
		return minute;
	}





	public void setMinute(int minute) {
		this.minute = minute;
	}





	// delegate from schedule
	public clockTime whatTime() {
		// TODO Auto-generated method stub
		return new clockTime(this.hour, this.minute);
	}

}
