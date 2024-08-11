package Task3;

public class Author {
	private String name;
	private int birthYear;
	public Author(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	public boolean hasAuthor(String author) {
		// TODO Auto-generated method stub
		return this.name.equals(author);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
