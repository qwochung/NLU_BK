package VD3;

import junit.framework.TestCase;

public class RestaurantTest  extends TestCase	{
	Intersection i1 = new Intersection(12, 10);
	Intersection i2 = new Intersection(42, 13);
	Intersection i3 = new Intersection(53, 32);
	
	Restaurent r1= new Restaurent("ABC", "Mon Chay", " 20 - 50 ", i1);
	Restaurent r2= new Restaurent("DEF", "Mon Man", " 30 - 70 ", i2);
	Restaurent r3= new Restaurent("XYZ", "Mon Chay va Mon Man", " 30 - 150 ", i3);

	IRestaurant emty = new MTRestaurant();
	IRestaurant ir1 = new ConsRestaurant(r1, new ConsRestaurant(r2, new ConsRestaurant(r3, emty)));
	
	
	
	public void testIRestaurant () {
		System.out.println(ir1);
	}

}
