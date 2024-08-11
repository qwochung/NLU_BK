package QuanLyNhanVien;

import java.util.Map;

public class MyCompany {
	Map<String, Phong> dsPhong;
	Map<String,NhanVien> dsNhanVien;
	public MyCompany(Map<String, Phong> dsPhong, Map<String, NhanVien> dsNhanVien) {
		super();
		this.dsPhong = dsPhong;
		this.dsNhanVien = dsNhanVien;
	}
	Map<String, Phong> getDsPhong() {
		return dsPhong;
	}
	void setDsPhong(Map<String, Phong> dsPhong) {
		this.dsPhong = dsPhong;
	}
	Map<String, NhanVien> getDsNhanVien() {
		return dsNhanVien;
	}
	void setDsNhanVien(Map<String, NhanVien> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
	}
	
	
	
	
}
