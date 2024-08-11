package TruongDaiHoc;

import java.util.ArrayList;


public class TruongDaiHoc {
	ArrayList<Nguoi> danhSach = new ArrayList<Nguoi	>();

	public TruongDaiHoc(ArrayList<Nguoi> danhSach) {
		super();
		this.danhSach = danhSach;
	}

	public TruongDaiHoc() {
		super();
	}

	
	public void themNguoi(Nguoi e) {
		this.danhSach.add(e);
	}
	
	
	// kiểm tra xem thuộc loại nào. Nếu là sinh viên trả về true, nhân viên trả về false
	public boolean typeNguoi( Nguoi o) {
		return o.typeNguoi();
	}
	
	
	public void inDSSinhVien() {
		System.out.println(" \nDanh sách sinh viên là: ");
		for (Nguoi nguoi : danhSach) {
			if (typeNguoi(nguoi) == true) {
				
				System.out.println(nguoi.toString());
			}
			
		}
	}
	
	
	public void inDSNhanVien() {
		System.out.println("\n Danh sách nhân viên là: ");
		for (Nguoi nguoi : danhSach) {
			if (typeNguoi(nguoi) == false) {
				
				System.out.println(nguoi.toString());
			}
			
		}
	}
	
	
	public void inDSLuong() {
		System.out.println(" \nDanh sách lương cơ bản của nhân viên là: ");
		for (Nguoi nguoi : danhSach) {
			if (typeNguoi(nguoi) == false) {
				
				System.out.println(nguoi.ten + " :" + nguoi.getLuong());
			}
			
		}
	}
	
	
	
	// tính lương
	public void getLuongNhanVien() {
		System.out.println(" \nDanh sách lương cơ bản + phụ cấp của nhân viên là: ");
		for (Nguoi nguoi : danhSach) {
			if (nguoi.typeNguoi() == false) {
				System.out.println( nguoi.ten + " :" + nguoi.getLuongNhanVien());
			}
		}
	
	}
	
	
	public Nguoi  findMaxLuong() {
		Nguoi resultNguoi = danhSach.get(0);
		for (Nguoi nguoi : danhSach) {
			
			if (nguoi.getLuongNhanVien() >= resultNguoi.getLuongNhanVien())  {
				resultNguoi = nguoi;
			}
			
		}
		
		return resultNguoi;
	}
	
	public boolean checkType( Nguoi o) {
		return o.typeNguoi()	;
	}
	
}
