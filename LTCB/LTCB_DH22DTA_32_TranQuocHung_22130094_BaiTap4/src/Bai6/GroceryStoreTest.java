/**
 * 
 */
package Bai6;

import junit.framework.TestCase;

/**
 * @author ADMIN
 *
 */
public class GroceryStoreTest extends TestCase {
	
	
	
	GroceryStore Coffe = new Cofee("Trung Nguyên", 100, 2000.0, "decaffeinated");
	GroceryStore Juice = new Juice("Cam ", 100, 1500.0, "Ngọt", "Fresh");
	GroceryStore IceCream = new IceCream(" Tô Châu"	, 50, 	500.0, " Hương Dâu", " Regular Ice Cream");
		
	
	
	//Testing for unitPrice
	
	public void testUnitPrice () {
		assertEquals(Coffe.unitPrice(), 100*2000,0.1 );
		
		assertEquals(Juice.unitPrice(), 100*1500,0.1 );
		
		assertEquals(IceCream.unitPrice(), 50*500,0.1 );
		
			// PASSED
	}

	
	//Testing for lowerPrice 
	public void testLowerPrice () {
		assertTrue(IceCream.lowerPrice(Coffe));
		
//		PASSED
	}
	
	
	
	
	
	
	//Testing for cheaperThan 
	 
	public void testCheaperThan () {
		assertTrue(IceCream.cheaperThan(Coffe));
		assertTrue(Juice.cheaperThan(Coffe));
		
				//PASSED
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
