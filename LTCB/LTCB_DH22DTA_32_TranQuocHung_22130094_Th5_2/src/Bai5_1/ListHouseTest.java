package Bai5_1;

import junit.framework.TestCase;

public class ListHouseTest  extends TestCase	{
	Address ad1 = new Address("Nguyen Hue" , "TP.HCM");
	Address ad2 = new Address("Tran Phu" , "TP.HCM");
	Address ad3 = new Address("Xa lo HN" , "TP.HCM");
	Address ad4 = new Address("Ton Duc Thang" , "TP.HCM");
	
	
	House h1 = new House("Name1", 120, ad1);
	House h2 = new House("Name2", 90, ad2);
	House h3 = new House("Name3", 150, ad3);
	House h4 = new House("Name4", 70, ad4);
	
	ListHouse emty = new MTHouse()	;
	
	ListHouse lst1 = new AHouse(h1, emty);
	ListHouse lst2 = new AHouse(h2, lst1);
	ListHouse lst3 = new AHouse(h3, lst2);
	
	
	// TestConstructer
	
	 public void testConstructor () {
		 System.out.println(lst3);
	 }
	
	

}
