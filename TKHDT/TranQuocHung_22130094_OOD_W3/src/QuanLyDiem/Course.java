package QuanLyDiem;

public class Course {
	private String name;
	 private int credits;
	 private Lecturer lecturer;
	 
	 public Course(String name, int credits, Lecturer lecturer) {
	 this.name = name;
	 this.credits = credits;
	 this.lecturer = lecturer;
	 }
	 public String getName() {
	 return name;
	 }
	 public void setName(String name) {
	 this.name = name;
	 }
	 public int getCredits() {
	 return credits;
	 }
	 public void setCredits(int credits) {
	 this.credits = credits;
	 }
	 public Lecturer getLecturer() {
	 return lecturer;
	 }
	 public void setLecturer(Lecturer lecturer) {
	 this.lecturer = lecturer;
}
	 
	 
	public Course checkCourse(String nameCourse) {
		if (this.name.equals(nameCourse)) {
			return this;
		}
		return null;
	}
	
	public boolean checkStudentsOfCourse(Course  course) {
		if (this.name.equals(course.getName())) {
			return true;
		}
		return false;
	}
}
