/**
 * 
 */
package Bai8;

/**
 * Develop a program that assists a bookstore manager in a discount bookstore. 
 * The program should keep a record for each book.
 *  The record must include its title, the author's name, its price, and its publication year.
 *   In addition, there are three kinds of books with different pricing policy.
 *    The hardcover books are sold at 20% off.
 *     The sale books are sold at 50% off. 
 *      The paperbacks are sold at the list price.
 * @author ADMIN
 * 
 * 		Example :
 * 			RecordBook h1 = new HardcoverBooks(" abc", "To Hoai", 100000.0, 2010, 0.2);
			RecordBook s1 = new SaleBooks(" ETSA ", "To Hoai", 50000.0, 2015, 0.0);
			RecordBook p1 = new Paperbacks(" XZC ", "Tran Tuan", 70000.0, 2019, 0.5);
 * 		
 * 			
 */
public abstract class RecordBook {
	String title , authorName ;
	double price;
	int publicationYear;
	double discount ;
	
	
	
	public RecordBook(String title, String authorName, double price, int publicationYear, double discount) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.price = price;
		this.publicationYear = publicationYear;
		this.discount = discount;
	}
	

	
	
	/**
	 *salePrice, which computes the sale price of each book;
	 * 
	 * Example :
	 * 		h1.salePrice() => 80000.0
	 * 		s1.salePrice()=> 25000.0 
	 * 		p1.salePrice()=> 70000.0
	 * 
	 * 
	 */
	
	
	public double salePrice () {
		return this.price * (1 - this.discount);
	}
	
	
	
	
	/**
	 * cheaperThan, which determines whether a book is cheaper than another book;
	 * 	Example :	
	 * 		s1.cheaperThan(h1) => True
	 * 		p1.cheaperThan(h1) =>  True
	 * 
	 * 		
	 */
	
	
	public boolean cheaperThan ( RecordBook that) {
		return this.salePrice() < that.salePrice()	;
	}
	
	
	
	/**
	 * sameAuthor, which determines whether a book was written by some given author which wrote another book.
	 * Example :
	 * 
	 * 		h1.sameAuthor(s1) => True
	 * 
	 */
	
	
	
	public boolean sameAuthor ( RecordBook that	) {
		return this.authorName.equals(that.authorName);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
