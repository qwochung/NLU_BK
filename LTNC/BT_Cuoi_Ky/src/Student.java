import java.util.ArrayList;

public class Student {
	int idName, idSubject;
	String name, subject;
	double point;
	public Student(int idName, String name, int idSubject, String subject, double point) {
		super();
		this.idName = idName;
		this.idSubject = idSubject;
		this.name = name;
		this.subject = subject;
		this.point = point	;
	}
	

	
	public int getIdName() {
		return idName;
	}



	public void setIdName(int idName) {
		this.idName = idName;
	}



	public int getIdSubject() {
		return idSubject;
	}



	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public double getPoint() {
		return point;
	}



	public void setPoint(double point) {
		this.point = point;
	}



	public static ArrayList<Student> createStudentList() {
		ArrayList<Student> result = new  ArrayList<>()	;
		Student s1 = new Student(1, "Nguyen Hai", 9999, "Thiết kế hướng đối tượng",0.0);
		Student s11 = new Student(1, "Nguyen Hai", 1111, "Lập trình nâng cao",0.0);
		Student s12 = new Student(1, "Nguyen Hai", 2222, "Lý thuyết đồ thị",0.0);
		Student s2 = new Student(2, "Nguyen Hung", 1111, "Lập trình nâng cao",0.0);
		Student s3 = new Student(3, "Nguyen Nam", 2222, "Lý thuyết đồ thị",0.0);
		Student s4 = new Student(4, "Nguyen Kiet", 3333, "Lập trình cơ bản",0.0);
		Student s5 = new Student(5, "Nguyen Khai", 9999, "Thiết kế hướng đối tượng",0.0);
		
		result.add(s1);
		result.add(s11);
		result.add(s12);
		result.add(s2);
		result.add(s3);
		result.add(s4);
		result.add(s5);
		
		return result;
		
	}
//	public static void main(String[] args) {
//		Student s5 = new Student(005, "Nguyen Khai", 9999, "Thiết kế hướng đối tượng",0.0);
//		System.out.println(s5.getIdName());
//		System.out.println(String.valueOf(s5.getIdName()));
//		System.out.println(Integer.valueOf("001"));
//		ArrayList<Student> students = Student.createStudentList();
//		for (Student student : students) {
//			System.out.println(student);
//		}
//	}
}
