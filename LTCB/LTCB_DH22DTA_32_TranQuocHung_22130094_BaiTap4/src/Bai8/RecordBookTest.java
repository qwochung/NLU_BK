/**
 * 
 */
package Bai8;

import junit.framework.TestCase;

/**
 * @author ADMIN
 *
 */
public class RecordBookTest extends TestCase {
	
	
	RecordBook h1 = new HardcoverBooks(" abc", "To Hoai", 100000.0, 2010, 0.2);
	RecordBook s1 = new SaleBooks(" ETSA ", "To Hoai", 50000.0, 2015, 0.5);
	RecordBook p1 = new Paperbacks(" XZC ", "Tran Tuan", 70000.0, 2019, 0.0);
	
	
	//Testing for salePrice 
	 
	public void testSalePrice () {
		assertEquals(h1.salePrice(), 80000.0);
		assertEquals(s1.salePrice(), 25000.0);
		assertEquals(p1.salePrice(), 70000.0);
		// PASSED 
	}
	
	
	// Tesing for cheaperThan 
	
	public void testCheaperThan () {
		assertTrue(s1.cheaperThan(h1));
		assertTrue(p1.cheaperThan(h1));
		//PASSED
		
		
	}
	
	
	
	public void testSameAuthor () {
		assertTrue(h1.sameAuthor(s1));
		
		//PASSed
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
