package DS_SinhVien_arr;

import java.util.Scanner;

public class Test_DS_SinhVien {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in );
		
		DS_SinhVien_arr dssv = new DS_SinhVien_arr() ;
		
		int luaChon = 0 ;
		
		do {
			System.out.println( " MENU: ");
			System.out.println( 
						"1. Thêm 1 Sinh Viên \n" + 
						"2. In DS Sinh Viên \n" + 
						"3. Ktra  Sinh Viên có rỗng ko ? \n" + 
						"4. Số lượng Sinh Viên \n" + 
						"5. Làm rỗng DS Sinh Viên \n" + 
						"6. Tìm Sinh Viên dựa theo mã sinh viên \n" + 
						"7. Xóa 1 Sinh Viên theo mã sinh viên \n" + 
						"8. Tìm kím các Sinh Viên  \n" +
						"9. Thêm Sinh Viên theo tên nhập từ bàn phím \n" + 
						"0. Xuất ra DS Sinh Viên có điểm từ thấp đến cao \n" +
						"0. Thoát chương trình \n" );
			
			
			
			
			
			
			luaChon = sc.nextInt();	
			sc.nextLine();
			
			
			if  ( luaChon  == 1 ) // Thêm sinh viên
			{ 
				System.out.println( " Nhập mã Sinh viên"); String maSinhvien = sc.nextLine();
				System.out.println( " Nhập Họ và Tên"); String hoTen = sc.nextLine();
				System.out.println( " Nhập năm sinh"); int  namsinh = sc.nextInt();
				System.out.println( " Nhập điểm trung bình"); double diemTB = sc.nextDouble();
				
				SinhVien sv = new SinhVien(maSinhvien, hoTen, namsinh, diemTB);
				dssv.addSinhVien(sv);
				
				
				
			}else if  ( luaChon  == 2) {
				dssv.inDS();
				
				
			}else  if  ( luaChon  == 3 ) {
				
				if ( dssv.ktraRong() == true  ) 
					System.out.println( "Rỗng");
				else 
					System.out.println( "Đéo Rỗng");
				
				
				
			}else if  ( luaChon  == 4 ) {
				dssv.soLuongSV();
				
				
			}else if  ( luaChon  == 5 ) {
				dssv.lamRongDS();
				
				
			}else if  ( luaChon  == 6 ) {
				System.out.println( " Nhập mssv ");  String maSinhVien = sc.nextLine();
				dssv.findOneSinhVien(maSinhVien);
				
				
				
			}else if  ( luaChon  == 7 ) {
				System.out.println(" Nhập mã sinh viên muốn xóa"); 
				String maString =  sc.nextLine();
				
				dssv.removeSinhVien(maString);
				
				
			}else if  ( luaChon  == 8 ) {
				
				
				
			}else if  ( luaChon  == 9 ) {
				
			}
				
			
			
			
		} while ( luaChon != 0 || luaChon > 9);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
