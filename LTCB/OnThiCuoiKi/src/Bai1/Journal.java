package Bai1;

public class Journal extends LibraryItem {
	Date publishedDate;

	/**
	 * @param lid
	 * @param title
	 * @param author
	 * @param publisher
	 * @param maxRentedDays
	 * @param price
	 * @param publishedDate
	 */
	public Journal(int lid, String title, Author author, String publisher, int maxRentedDays, Double price,
			Date publishedDate) {
		super(lid, title, author, publisher, maxRentedDays, price);
		this.publishedDate = publishedDate;
	}

	@Override
	public String toString() {
		return "Journal : " + " publishedDate : " + publishedDate + ", lid : " + lid + ", title : " + title + ", author : " + author.toString()
				+ ", publisher : " + publisher + ", maxRentedDays : " + maxRentedDays + ", price : " + price + "\n";
	}

	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return "Journal" ;
	}

	@Override
	public double lossFee() {
		// TODO Auto-generated method stub
		return this.price*0.8;
	}

	@Override
	protected int howManyStoryAndJournal() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
