package HocVien;

public class Test {

	public static void main(String[] args) {
		HocVien DSNV = new HocVien()	;
		
		
		NhanVien quanLi1 = new NhanVienQuanLi (001, " Le Thi Anh", "Đại học " , 2.8, "Maketting" , 0.89) ;
		NhanVien  quanLi2 = new NhanVienQuanLi (002, "Li Ha", "Cao Đẳng", 2.4, " Nhân sự", 0.75);
		
		
		NhanVien nghienCuu1 = new NhanVienNgienCuu (003, "Nguyen Vu" , " Đại học" , 2.8, 1.0);
		NhanVien nghienCuu2 = new NhanVienNgienCuu (004, "Nguyen Duong" , " Đại học" , 0.0, 1.0);
		
		
		NhanVien phucVu1 = new NhanVienPhucVu (005, "Đặng Nam", "Sinh viên " , 1.5);
		
		
		DSNV.themNV(quanLi1);
		DSNV.themNV(quanLi2);
		DSNV.themNV(nghienCuu1);
		DSNV.themNV(nghienCuu2);
		DSNV.themNV(phucVu1);

		DSNV.inDanhSach();
		System.out.printf("%.2f",DSNV.tongLuong());
		System.out.println("\n"+ "Nhân viên có mức lương thấp nhất là :" +  DSNV.findMinSalary().toString());
	}

}
