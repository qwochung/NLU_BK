package DSSV_ArrList;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		SinhVien svTest = new SinhVien(1, "Hung" , 2004, 7.0);
		
	
		Scanner sc = new Scanner(System.in);
		ListDSSV DSSV = new ListDSSV();
		int luachon = 0;
		do {
			System.out.println("\nMENU ---------- ");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println(
					  "1.	Thêm sinh viên vào danh sách.\n" 
					+ "2.	In danh sách sinh viên ra màn hình.\n"
					+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
					+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n" 
					+ "5.	Làm rỗng danh sách sinh viên.\n"
					+ "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
					+ "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
					+ "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
					+ "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n" 
					+ "0.   Thoát khỏi chương trình");
			luachon = sc.nextInt();
			
			switch (luachon) {
			case 1:
				System.out.println(" Nhập mã sinh viên"); int maSingVien = sc.nextInt()	;
				sc.nextLine(); 
				System.out.println(" Nhập Họ và Tên sinh viên" ); String hoVaTen = sc.nextLine()	;
				System.out.println(" Nhập năm sinh"); int namSinh = sc.nextInt()	;
				System.out.println(" Nhập số điểm trung bình"); double dimTrungBinh= sc.nextDouble()	;
				SinhVien sv  = new SinhVien(maSingVien, hoVaTen, namSinh, dimTrungBinh);
				DSSV.themSinhVien(sv);
				break;
				
				
			case 2:
				DSSV.printDanhSach();
				break;
				
				
			case 3:
				if (DSSV.kiemTraDSRong()== true	) {
					System.out.println("Danh sách rỗng.");
				}
				else System.out.println( "Không rỗng.");
				break;
				
				
			case 4:
				System.out.println( "Số lượng sinh viên là : " + DSSV.soLuongSV() );
				break;
				
				
			case 5:
				DSSV.lamRongDS();
				System.out.println("Đã làm rỗng danh sách.");

				break;
			case 6:
				System.out.println("Nhập mssv  : ");  
				int maSinhVien =  sc.nextInt();
				SinhVien sVien = new SinhVien(maSinhVien);
				System.out.print( "Kết quả kiểm tra là : " );
				 DSSV.KtraTonTai(sVien);
				
				break;

			case 7:
				System.out.println("Nhập mssv  : ");  
				int maSinhVienXoa =  sc.nextInt()	;
				SinhVien sinhVienXoa = new SinhVien(maSinhVienXoa);
				DSSV.xoaSinhVien(sinhVienXoa);
				break;
			case 8:
				System.out.println("Nhập tên muốn tìm kiếm  : ");  
				String tenString = sc.nextLine()	;
				DSSV.timSinhVien(tenString );
				break;
			case 9:
				DSSV.sapXep();
				DSSV.printDanhSach();
				break;
			case 0:
				System.out.println("Đã thoát khỏi chương trình!!!!!!!");

				break;

			default:
				break;
			}
		} while (luachon < 10 && luachon != 0);

	}

}
