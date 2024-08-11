package Bai1;

public class Author {
	String name;
	int bithYear ;
	/**
	 * @param name
	 * @param bithYear
	 */
	public Author(String name, int bithYear) {
		super();
		this.name = name;
		this.bithYear = bithYear;
	}
	@Override
	public String toString() {
		return "name : " + name + ", bithYear : " + bithYear ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
