package QuanLyNhanVien;

import java.time.LocalDate;
import java.time.Period;

public class HopDong  extends LoaiNV {
	
	
	
	public HopDong(String maNV, String tenNV, boolean nu, LocalDate ngaySinh, double luongCB, LocalDate ngayVaoLam,
			LoaiNV loaiNV) {
		super(maNV, tenNV, nu, ngaySinh, luongCB, ngayVaoLam, loaiNV);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhLuong() {
		Period soThang = Period.between(ngayVaoLam, LocalDate.now());
		return soThang.getMonths()*luongCB;
	}

	@Override
	public double tinhThuong() {
		Period soThang = Period.between(ngayVaoLam, LocalDate.now());
		
		return soThang.getMonths()/12 *tinhLuong();
	}

}
