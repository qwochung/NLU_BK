package Bai1;

public class ConsLstLibraryItem implements LstLibraryItem {
	LibraryItem first;
	LstLibraryItem rest;
	/**
	 * @param first
	 * @param rest
	 */
	
	
	
	
	public ConsLstLibraryItem(LibraryItem first, LstLibraryItem rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	
	
	
	
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.first.getType() + "\n" + this.rest.getType();
	}





	@Override
	public int howManyStoryAndJournal() {
		// TODO Auto-generated method stub
		return this.first.howManyStoryAndJournal() + this.rest.howManyStoryAndJournal();
	}





	@Override
	public LstLibraryItem getItemsOfPublisher(String name) {
		// TODO Auto-generated method stub
		if  ( this.first.getPublisher().equals(name))
			
			return new ConsLstLibraryItem(first, rest.getItemsOfPublisher(name));
		else 
			return this.rest.getItemsOfPublisher(name);
				
	}





	@Override
	public String toString() {
		return  first.toString() + rest.toString() ;
	}





	@Override
	public LstLibraryItem sortByAuthor() {
		// TODO Auto-generated method stub
	
		return this.rest.sortByAuthor().insert (this.first);
	}





	@Override
	public LstLibraryItem insert(LibraryItem item) {
		// TODO Auto-generated method stub
		
		if  ( this.first.sosanhAuthor(item))
			
			return new ConsLstLibraryItem(item, this);
		else 
			return new ConsLstLibraryItem(this.first, this.rest.insert(item));
	}
	
	
	
	
	
	
}
