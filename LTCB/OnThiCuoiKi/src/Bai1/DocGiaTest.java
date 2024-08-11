package Bai1;

import junit.framework.TestCase;

public class DocGiaTest extends TestCase	{
	
	public void testsosanh () {
		assertTrue("abcd".compareTo("abc") >0);
	}
	
	

	//Sách tham khảo:
	LibraryItem R1 = new ReferenceBook(101	, "Bậc thầy môi giới địa ốc", new Author("Henry Huỳnh Anh Dũng", 1960), "NXB Trẻ", 7, 30000.0, "Kinh tế");
	LibraryItem R2 = new ReferenceBook(102, "Nhạc lý căn bản và nâng cao ", new Author ( "Lương Bằng Vinh ", 1970), "NXB Thị Nghè", 7, 30000.0, "Nhạc" );
	
	
	// Truyện :
	
	LibraryItem S1 = new Story( 201, "Doremon", new Author ("Fujiko. F. Fujio", 1950), "NXB Kim Đồng", 3, 20000.0);
	LibraryItem S2 = new Story (202, "Tôi thấy hoa vàng trên cỏ xanh", new Author (" Nguyễn Nhật Ánh" , 1955), "NXB Trẻ", 3, 45000.0);
	LibraryItem S3 = new Story (203, "Harry Potter and the Half-Blood Prince ", new Author ("J.K. Rowling", 1965)," Bloomsbury Publishing PLC", 3,270000.0);
	
	
	
	
	//Tạp chí:
	
	LibraryItem J1 = new Journal(301, "Thế giới Vi Tính số 256", new Author("", 0) , "PC World Việt Nam" ,1,	 20000.0 ,new Date(14,2,2014 ));
	LibraryItem J2 = new Journal ( 302," Nhịp cầu đầu tư số 387", new Author("", 0), "MTV Ấn Phẩm" , 1, 15000.0,new Date(20, 6, 2014) );
	
	
	
	
	// Tạo MTLstLibraryItem 
	LstLibraryItem empty1 = new MTLstLibraryItem() ;
	
	
	// Tạo ConsLstLibraryItem
	
	LstLibraryItem lstitem1 = new ConsLstLibraryItem(J1, empty1);
	
	LstLibraryItem lstitem2 = new ConsLstLibraryItem(J2, lstitem1);
	
	LstLibraryItem lstitem3 = new ConsLstLibraryItem(R1, lstitem2);
	
	LstLibraryItem lstitem4 = new ConsLstLibraryItem(R2, lstitem3);
	
	LstLibraryItem lstitem5 = new ConsLstLibraryItem(S1, lstitem4);
	
	LstLibraryItem lstitem6 = new ConsLstLibraryItem(S2, lstitem5) ;
	
	LstLibraryItem lstitem7 = new ConsLstLibraryItem(S3, lstitem6);
	
	
	
	// Tạo RentItem cho Tuấn
	
	RentItem rent1 = new RentItem(R1, 4);
	RentItem rent2 = new RentItem(J1, 3);
	
	
	// Tạo RentItem cho Lan
	
	RentItem rent3 = new RentItem(R2, 10);
	RentItem rent4 = new RentItem(S2, 3);
	
	
	// Tạo MTItem 
	
	LstItem empty2 = new MTItem() ;
	
	// Tạo LstItem 
	
	LstItem lst1 = new Consitem(rent1, empty2);
	LstItem lstOfTuan = new Consitem(rent2, lst1); // Tạo xong cho Tuấn 
	
	
	LstItem lst3 = new Consitem(rent3, empty2); 
	LstItem LstOfLan = new Consitem(rent4, lst3);
	
	
	
	// Tạo DocGia hoàn chỉnh 
	
	DocGia D1 = new DocGia("Nguyen Tuan " , "tuanng@gmail.com", lstOfTuan);
	
	DocGia D2 = new DocGia("Le Phuong Lan" , "lanphuong@gmail.com", LstOfLan);
	
	
	
	// test constructor
	public void testConstructer () {
		System.out.println( D1 );
	}
	
	
	
	//test getType
	public void testGetType () {
		System.out.println(lstitem7.getType());
	}
	
	
	
	// test isAuthor
	
	public void testIsAuthor () { 
		assertTrue(R1.isAuthor("Henry Huỳnh Anh Dũng"));
		assertTrue(S2.isAuthor(" Nguyễn Nhật Ánh"));
	}
	
	
	// test lossFee 
	public void testLossFee () {
		assertTrue(R1.lossFee() == 36000.0);
		assertTrue(S2.lossFee() == 54000.0);
		assertTrue(J1.lossFee() == 16000.0);
	}
	
	
	
	// test howManyStoryAndJournal 
	
	public void testHowManyStoryAndJournal () {
		assertTrue(lstitem7.howManyStoryAndJournal() == 5);
	}
	
	
	// test getItemsOfPublisher 
	
	public void testgetItemsOfPublisher() {
		System.out.println(" Test getItemsOfPublisher  ");
		System.out.println( lstitem7.getItemsOfPublisher("NXB Kim Đồng") + "\n" + "\n " );
	}
	
	
	
	
	
	// test sort 
	public void testSort () {
		System.out.println(lstitem7 );
		System.out.println("----------------------------------------------------");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(lstitem7.sortByAuthor());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	
	
	
	
	
	
	
	
	
}
