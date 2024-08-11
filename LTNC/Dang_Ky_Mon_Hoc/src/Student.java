
public class Student {
	String id, name, idclass , subject;
	public Student(String id, String name, String idclass, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.idclass = idclass;
		this.subject = subject;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdclass() {
		return idclass;
	}
	public void setIdclass(String idclass) {
		this.idclass = idclass;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", idclass=" + idclass + ", subject=" + subject + "]";
	}
	

}
