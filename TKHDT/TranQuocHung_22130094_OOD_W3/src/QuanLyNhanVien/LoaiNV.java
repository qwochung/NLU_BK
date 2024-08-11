package QuanLyNhanVien;

import java.time.LocalDate;

public abstract class LoaiNV  extends NhanVien{
	
	
	public LoaiNV(String maNV, String tenNV, boolean nu, LocalDate ngaySinh, double luongCB, LocalDate ngayVaoLam,
			LoaiNV loaiNV) {
		super(maNV, tenNV, nu, ngaySinh, luongCB, ngayVaoLam, loaiNV);
		// TODO Auto-generated constructor stub
	}

	public abstract double tinhLuong() ;
	public abstract double tinhThuong() ;

	
}
