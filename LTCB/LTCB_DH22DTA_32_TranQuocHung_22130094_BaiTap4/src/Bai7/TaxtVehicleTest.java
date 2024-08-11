/**
 * 
 */
package Bai7;


import junit.framework.TestCase;

/**
 * @author ADMIN
 *
 */
public class TaxtVehicleTest extends TestCase	{
	
	TaxiVehicle Cab = new  Cab(112, 4, 2, 15);
	TaxiVehicle limo = new Limo(113, 24, 3, 100, 200);
	TaxiVehicle Van = new Van(114, 8, 5, 150, true);
	
	
	// Testing for fare
	public void testFare() {
		assertEquals(Cab.fare(), 30.0);
		assertEquals(limo.fare(), 300.0);
		assertEquals(Van.fare(), 64.0);
			
				//PASSED
		
	}

	
	
	//  Testing for lowerPrice 
	public void testLowerPrice () {
		assertTrue(Cab.lowerPrice(40.0));
		assertTrue(limo.lowerPrice(410.0));
		assertTrue(Van.lowerPrice(500.0));
		
		//PASSED
	}
	
	
	// Testing for cheaperThan 
	public void testCheaperThan () {
		 assertTrue(Cab.cheaperThan(limo));
		 assertTrue(Van.cheaperThan(limo));
		 
		 //PASSED
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
