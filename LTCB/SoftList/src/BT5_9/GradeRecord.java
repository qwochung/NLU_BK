package BT5_9;

public class GradeRecord {
	Course course;
	double grade;
	
	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}


	
	public GradeRecord(Course course, double grade) {
		super();
		this.course = course;
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		return "course : " + course.toString() + ", grade : " + grade + "\n";
	}


	


	public int howManyCredit() {
		// TODO Auto-generated method stub
		return this.course.howManyCredit();
	}


	public double  tichDiemSo() {
		// TODO Auto-generated method stub
		return  (this.grade * this.course.getCredit());
	}

	
	
}
