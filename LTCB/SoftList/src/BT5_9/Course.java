package BT5_9;

public class Course {
	int number;
	String title;
	int credit;
	/**
	 * @param number
	 * @param title
	 * @param credit
	 */
	public Course(int number, String title, int credit) {
		super();
		this.number = number;
		this.title = title;
		this.credit = credit;
	}
	@Override
	public String toString() {
		return " number : " + number + ", title : " + title + ", credit : " + credit ;
	}
	
	
	
	
	public int getCredit() {
		return credit;
	}
	
	
	
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	
	
	// howManyCredit()
	
	public int howManyCredit() {
		// TODO Auto-generated method stub
		return this.credit;
	}

}
