package HocVien;

import java.util.ArrayList;

public class HocVien {
	ArrayList<NhanVien> DSNV	;

	public HocVien(ArrayList<NhanVien> danhSach) {
		super();
		this.DSNV = danhSach;
	}

	public HocVien() {
		super();
		this.DSNV = new ArrayList<NhanVien>();
	}
	
	
	public void themNV( NhanVien nhanVien) {
		this.DSNV.add(nhanVien);
		
	}
	
	
	
	public void inDanhSach( ) {
		for (NhanVien nhanVien : DSNV) {
			System.out.println(nhanVien.toString());
		}
	}

	
	public double tongLuong () {
		double result = 0;
		for (NhanVien nhanVien : DSNV) {
			result += nhanVien.getLuong();
		}
		return result;
	}
	
	
	
	public NhanVien findMinSalary() {
		NhanVien result = DSNV.get(0) ;
		for (NhanVien nhanVien : DSNV) {
			if (nhanVien.getLuong() <= result.getLuong() ) {
				result= nhanVien;
			}
		}
		return result;
	}
	
}
