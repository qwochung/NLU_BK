package Bai5_2;

public class ABook implements BookStore {
	Book first;
	BookStore rest ;
	/**
	 * @param first
	 * @param rest
	 */
	public ABook(Book first, BookStore rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return this.first.toString() +"\n"
				+ this.rest.toString();
	}
	

}
