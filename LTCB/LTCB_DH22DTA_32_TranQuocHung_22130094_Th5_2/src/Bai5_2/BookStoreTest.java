package Bai5_2;

import junit.framework.TestCase;

public class BookStoreTest  extends TestCase {
	
	Book b1 = new Book("Hoc lam giau ", 1900, 100);
	Book b2 = new Book("Dac nhan tam ", 2020, 10);
	Book b3 = new Book("Sinh hoc ", 2021, 20);
	Book b4 = new Book("Toan ", 2022, 10);
	Book b5 = new Book("Hoa hoc ", 2001, 40);
	
	
	BookStore emty = new MTBook() ;
	BookStore lst1 = new ABook(b1, emty);
	BookStore lst2 = new ABook(b2, lst1);
	BookStore lst3 = new ABook(b3, lst2);
	BookStore lst4 = new ABook(b4, lst3);
	BookStore lst5 = new ABook(b5, lst4);
	
	
	//Test Constructor 
	public void testConstructer () {
		System.out.println( lst5);
	}

}
