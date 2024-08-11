package Bai2;

public class author {
	String name;
	birthYear birthYear;
//	private Object brithYear;
	public author(String name, Bai2.birthYear birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	
	
	
	// delegate form currentAuthor'book
	public boolean currentAuthor() {
	
		return this.birthYear.currentAuthor() ;
	}
	
	
	
	// delegate form thisAuthor'book
	
	public boolean thisAuthor(author that) {
		
		return this.name.equals(that.name)
			&& this.birthYear.thisAuthor(that.birthYear) ;
	}

	
	
	
//	public boolean sameAuthor (author that) {
//		
//	}


	public boolean sameGeneration(book book2) {
		// TODO Auto-generated method stub
		return this.birthYear.sameGeneration(book2);
	}
	
	
	
	
	/**
	 * Design equals() method for Author to use in
	 * thisAuthor() and sameAuthor() methods
	 * 
	 */
	
	public  boolean equal(Object obj) {
		if ( obj == null || !(obj instanceof author))
			return false;
		else 
		{
			author that = (author) obj;
			return this.name.equals(that.name)
					&& this.birthYear.equal(that.birthYear);
			
					
		}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
