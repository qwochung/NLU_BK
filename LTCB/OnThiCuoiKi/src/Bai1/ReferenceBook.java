package Bai1;

public class ReferenceBook extends LibraryItem {
	String category;

	/**
	 * @param lid
	 * @param title
	 * @param author
	 * @param publisher
	 * @param maxRentedDays
	 * @param price
	 * @param category
	 */
	public ReferenceBook(int lid, String title, Author author, String publisher, int maxRentedDays, Double price,
			String category) {
		super(lid, title, author, publisher, maxRentedDays, price);
		this.category = category;
	}

	@Override
	public String toString() {
		return "ReferenceBook : " + " lid : " + lid + ", title : " + title + ", author : " + author.toString()
				+ ", publisher : " + publisher + ", maxRentedDays : " + maxRentedDays + ", price : " + price + ", Category : " + category  +"\n";
	}

	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return "Referentce" ;
	}

	@Override
	public double lossFee() {
		// TODO Auto-generated method stub
		return this.price*1.2;
	}

	@Override
	protected int howManyStoryAndJournal() {
		// TODO Auto-generated method stub
		return 0;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
