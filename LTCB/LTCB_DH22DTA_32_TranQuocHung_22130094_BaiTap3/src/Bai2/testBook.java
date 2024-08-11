package Bai2;

import junit.framework.TestCase;

public class testBook  extends TestCase{
	
	book b1 =new book("abc", 200.0, 2003, new author("John", new birthYear(10, 10, 1960)));
	book b2 =new book("QƯERT", 323.0, 2013, new author("John", new birthYear(10, 10, 1960)));
	book b3 =new book("QƯERT", 323.0, 2013, new author("Tom", new birthYear(10, 10, 1967)));
	
	
	//Testing for currentBook 
	public void testCurrentBook() {
		assertTrue(b1.currentBook());
		
	}
	
	
	
	
	//Testing for currentAuthor
	public void testCurrentAuthor () {
		assertTrue(b1.currentAuthor());
		
	}

	
	
	//Testing for thisAuthor
	public void testThisAuthor () {
		assertTrue( b1.thisAuthor(new author("John", new birthYear(10, 10, 1960))));
	}
	
	
	//Testing for sameAuthor
	public void testSameAuthor() {
		assertTrue(b1.sameAuthor(b2));
	}
	
	
	
	
	// Testing for sameGeneration
	public void testSameGeneration() {
		assertTrue(b1.sameGeneration(b3));
	}
	
	
	public void tetsSameauthor2 (){
		assertTrue(b1.sameAuthor2(b2));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
