package Bai1;

public class MTLstLibraryItem implements LstLibraryItem{

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int howManyStoryAndJournal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LstLibraryItem getItemsOfPublisher(String name ) {
		// TODO Auto-generated method stub
		return new MTLstLibraryItem() ;
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public LstLibraryItem sortByAuthor() {
		// TODO Auto-generated method stub
		return new MTLstLibraryItem();
	}

	@Override
	public LstLibraryItem insert(LibraryItem first) {
		// TODO Auto-generated method stub
		return new ConsLstLibraryItem(first, new MTLstLibraryItem());
	}

	

}
