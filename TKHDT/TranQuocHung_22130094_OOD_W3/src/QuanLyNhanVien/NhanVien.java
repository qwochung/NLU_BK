package QuanLyNhanVien;

import java.time.LocalDate;

public class NhanVien {
	
	String maNV, tenNV;
	boolean nu;
	LocalDate ngaySinh; 
	double luongCB;
	LocalDate ngayVaoLam;
	LoaiNV loaiNV;
	
	
	
	public NhanVien(String maNV, String tenNV, boolean nu, LocalDate ngaySinh, double luongCB, LocalDate ngayVaoLam,
			LoaiNV loaiNV) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.nu = nu;
		this.ngaySinh = ngaySinh;
		this.luongCB = luongCB;
		this.ngayVaoLam = ngayVaoLam;
		this.loaiNV = loaiNV;
	}



	public double tinhLuong() {
		 return loaiNV.tinhLuong();
	}
	public double tinhThuong() {
		return loaiNV.tinhThuong();
	}
	

}
