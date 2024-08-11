package Bai5_2;

public class Book {
	String name;
	int year;
	double price;
	/**
	 * @param name
	 * @param year
	 * @param price
	 */
	public Book(String name, int year, double price) {
		super();
		this.name = name;
		this.year = year;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book name : " + name + ", year publication : " + year + ", price : " + price + "$";
	}
	

}
