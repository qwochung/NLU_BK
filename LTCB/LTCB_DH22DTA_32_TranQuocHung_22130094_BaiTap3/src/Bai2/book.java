package Bai2;


/**
 * Develop a program that assists bookstore employees.
 *  For each book, the program should track the book’s title, its price, its year of publication, and the author. 
 *  A author has a name and birth year.
 * @author ADMIN
 *
 */
public class book {
	String tilte;
	double price;
	int year;
	author author;
	public book(String tilte, double price, int year, Bai2.author author) {
		super();
		this.tilte = tilte;
		this.price = price;
		this.year = year;
		this.author = author;
	}
	
	
	
	
	/**
	 * currentBook that checks whether the book was published in 2004 or 2003;
	 * example:
	 * 		this.year == 2003 => True
	 * 		this.year == 2004 => True
	 * 		this.year == 2005 => False
	 * @return
	 */
	public boolean currentBook() {
		return this.year == 2003 || this.year == 2004;
		
	}
	
	
	
	
	
	
	
	/**
	 * currentAuthor that determines whether a book was written by a current author (born after 1940);
	 * example:
	 * 		book b1 =new book("abc", 200.0, 2003, new author("Jhon", new birthYear(10, 10, 1960))); => True
	 * 		book b1 =new book("abc", 200.0, 2003, new author("Jhon", new birthYear(10, 10, 1910))); => False
	 * 	
	 */
	
	
	public boolean currentAuthor() {
		return this.author.currentAuthor() ;
	}
	
	
	
	
	
	
	/**
	 * thisAuthor that determines whether a book was written by the specified author;
	 * example: 
	 * 
	 */
	public boolean thisAuthor(author that) {
		return this.author.thisAuthor(that)    ;
	}
	
	
	/**
	 * sameAuthor that determines whether one book was
	 * written by the same author as some other book;
	 * example :
	 *  book b1 =new book("abc", 200.0, 2003, new author("John", new birthYear(10, 10, 1960)))
	 *  
	 *  book b2 =new book("QƯERT", 323.0, 2013, new author("John", new birthYear(10, 10, 1960)))
	 *  
	 *  b1.sameAuthor(b2) => True
	 *
	 */
	
	public boolean sameAuthor ( book book2) {
		return this.thisAuthor(book2.author);
	}
	
	
	
	
	/**
	 * sameGeneration that determines whether two books were
	 * written by two authors born less than 10 year apart.
	 * 
	 * example:
	 * 		book b1 =new book("abc", 200.0, 2003, new author("John", new birthYear(10, 10, 1960)))
	 *  
	 * 		book b2 =new book("QƯERT", 323.0, 2013, new author("Thomson", new birthYear(1, 18, 1968)))
	 * 
	 * 		this.author.sameGeneration(book2) => true
	 *  
	 */
	public boolean sameGeneration(book book2){
		return this.author.sameGeneration(book2);
		
		
	}
	

	/**
	 * Design equals() method for Author to use in
thisAuthor() and sameAuthor() methods
	 * @param book2
	 * @return
	 * example :
	 * 		book b1 =new book("abc", 200.0, 2003, new author("John", new birthYear(10, 10, 1960)))
	 *  
	 *  	book b2 =new book("QƯERT", 323.0, 2013, new author("John", new birthYear(10, 10, 1960)))
	 *  
	 *  	b1.sameAuthor2(b2) => True
	 *
	 * 		
	 */
	
	public boolean sameAuthor2 ( book book2) {
		return this.author.equal(book2.author);
	}
	
	
	
	
	
	
	
	
}
