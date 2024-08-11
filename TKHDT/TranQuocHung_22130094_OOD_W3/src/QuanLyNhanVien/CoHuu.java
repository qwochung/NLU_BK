package QuanLyNhanVien;

import java.time.LocalDate;
import java.time.Period;

public class CoHuu  extends LoaiNV {
	
	double hsLuong;
	double tienBaoHiem;
	

	public CoHuu(String maNV, String tenNV, boolean nu, LocalDate ngaySinh, double luongCB, LocalDate ngayVaoLam,
			LoaiNV loaiNV, double hsLuong, double tienBaoHiem) {
		super(maNV, tenNV, nu, ngaySinh, luongCB, ngayVaoLam, loaiNV);
		this.hsLuong = hsLuong;
		this.tienBaoHiem = tienBaoHiem;
	}


	@Override
	public double tinhLuong() {
		double luongMoiThang = luongCB*hsLuong - tienBaoHiem;
		Period soThang = Period.between(ngayVaoLam, LocalDate.now());
		return soThang.getMonths()*luongMoiThang;
	}


	@Override
	public double tinhThuong() {
		Period soThang = Period.between(ngayVaoLam, LocalDate.now());
		double luongMoiThang = luongCB*hsLuong;
		return soThang.getMonths()/12 * soThang.getMonths()*luongMoiThang;
	}

}
