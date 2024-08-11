package Bai1;

public abstract  class LibraryItem {
	int lid;
	String title;
	Author author;
	String publisher;
	int maxRentedDays;
	Double price;
	/**
	 * @param lid
	 * @param title
	 * @param author
	 * @param publisher
	 * @param maxRentedDays
	 * @param price
	 */
	public LibraryItem(int lid, String title, Author author, String publisher, int maxRentedDays, Double price) {
		super();
		this.lid = lid;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.maxRentedDays = maxRentedDays;
		this.price = price;
	}
	
	
	
	
	@Override
	public  abstract String toString() ;
	
	
	
	protected abstract String getType();
	
	
	public   boolean isAuthor (String name ) {
		return this.author.getName().equals(name);
	}
	
	public abstract double lossFee () ;




	protected abstract int howManyStoryAndJournal();




	public String getPublisher() {
		return publisher;
	}




	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	public boolean sosanhAuthor (LibraryItem that) {
		return this.author.getName().compareTo(that.author.getName()) > 0;
	}
	
	
	
	
}
