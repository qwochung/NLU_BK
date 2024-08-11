package QuanLyNhanVien;

import java.util.List;

public class Phong {
	String tenPB, maPB;
	List<NhanVien> dsNhanVien;
	
	public Phong(String tenPB, String maPB, List<NhanVien> dsNhanVien) {
		super();
		this.tenPB = tenPB;
		this.maPB = maPB;
		this.dsNhanVien = dsNhanVien;
	}

	String getTenPB() {
		return tenPB;
	}

	void setTenPB(String tenPB) {
		this.tenPB = tenPB;
	}

	String getMaPB() {
		return maPB;
	}

	void setMaPB(String maPB) {
		this.maPB = maPB;
	}

	List<NhanVien> getDsNhanVien() {
		return dsNhanVien;
	}

	void setDsNhanVien(List<NhanVien> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
	}
	
	
	
}
