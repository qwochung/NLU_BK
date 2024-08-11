package Bai1;

public class Story extends LibraryItem {

	public Story(int lid, String title, Author author, String publisher, int maxRentedDays, Double price) {
		super(lid, title, author, publisher, maxRentedDays, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Story : " + ", lid : " + lid + ", title : " + title + ", author : " + author.toString() + ", publisher : " + publisher
				+ ", maxRentedDays : " + maxRentedDays + ", price : " + price + "\n";
	}

	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return "Story" ;
	}

	@Override
	public double lossFee() {
		// TODO Auto-generated method stub
		return this.price*1.2;
	}

	@Override
	protected int howManyStoryAndJournal() {
		// TODO Auto-generated method stub
		return 1;
	}

}
