package Task3;

import java.util.List;
import java.util.stream.Collectors;

public class Book {
	private String id , title;
	private int price;
	private String typel;
	private int year;
	List<Author> authors ;
	public Book(String id, String title, int price, String typel, int year, List<Author> authors) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.typel = typel;
		this.year = year;
		this.authors = authors;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public boolean hasAuthor_Year( String authorName, int year) {
		
		return (this.year== year) && this.authors.stream().filter(y -> y.hasAuthor(authorName)).count()> 0;
	}
	
	

}
