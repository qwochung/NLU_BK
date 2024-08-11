package TruongDaiHoc;

public class Test {
	public static void main(String[] args) {
		 
		
		//tạo ra class TruongDaiHoc
		TruongDaiHoc danhSach = new TruongDaiHoc()	;
		
		// tạo sinh viên
		Nguoi SV1= new SinhVien (" Quốc Hưng", 2004, 7.8f, 8.0f, 8.0f);
		Nguoi SV2= new SinhVien (" Văn Hòa", 2004, 7.0f, 9.0f, 8.7f);
		
		
		// tạo nhân viên quản lí
		
		Nguoi QL1 = new NVQuanLy ("Thanh Xuân ", 1990, 2.0, new Date(10, 2, 2020), new PhongBan("PB1", " Nhân sự"), "Đại học", "Quản trị" , "TP.HCM", 1.0)	;
		Nguoi QL2 = new NVQuanLy ("Thu Hương ", 1995, 2.0, new Date(10, 1, 2020), new PhongBan("PB2", " Đào tạo"), "Đại học", "Quản trị" , "TP.HCM", 1.0)	;
		
		
		// tạo giảng viên
		
		Nguoi GV1 = new GiangVien ("Hà" , 1999, 3.0, new Date(29, 1, 2019), new PhongBan("PB2", "Phòng đào tạo"), "Thạc sỹ"	, "CNTT", "Hà Nội" , 3.9);
		Nguoi GV2 = new GiangVien ("Nguyệt" , 1999, 3.0, new Date(29, 10, 2019), new PhongBan("PB2", "Phòng đào tạo"), "Thạc sỹ"	, "Kinh tế", "Hà Nội" , 3.0);
		
		// thêm các người vào trong danh sách
		danhSach.themNguoi(QL1);
		danhSach.themNguoi(QL2);
		danhSach.themNguoi(GV1);
		danhSach.themNguoi(GV2);
		danhSach.themNguoi(SV1);
		danhSach.themNguoi(SV2);
		
		
		// in danh sách sinh viên
		danhSach.inDSSinhVien();
		
		//in danh sách nhân viên
		danhSach.inDSNhanVien();
		
		// in danh sách lương của nhân viên
		danhSach.inDSLuong();
		
		// tính lương nhân viên
		danhSach.getLuongNhanVien();
		
		
		//tìm người có mức lương cao nhất
		System.out.println(danhSach.findMaxLuong());
		
		
		// kiểm tra có phải là sinh vien hay ko
		System.out.println(danhSach.checkType(GV2));
		System.out.println(danhSach.checkType(SV1));
	}

}
