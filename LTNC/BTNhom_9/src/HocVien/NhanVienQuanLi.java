package HocVien;

public class NhanVienQuanLi extends NhanVien {
	String chuyenMon ;
	double phuCap;
	public NhanVienQuanLi(int id, String hoVaten, String trinhDo, double luong, String chuyenMon, double phuCap) {
		super(id, hoVaten, trinhDo, luong);
		this.chuyenMon = chuyenMon;
		this.phuCap = phuCap;
	}
	public String getChuyenMon() {
		return chuyenMon;
	}
	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	@Override
	public String toString() {
		return "NhanVienQuanLi [chuyenMon=" + chuyenMon + ", phuCap=" + phuCap + ", id=" + id + ", hoVaten=" + hoVaten
				+ ", trinhDo=" + trinhDo + ", luong=" + luong + "]";
	}
	@Override
	public double getLuong() {
		// TODO Auto-generated method stub
		return luong + phuCap;
	}
	
	
	
	
	
}
