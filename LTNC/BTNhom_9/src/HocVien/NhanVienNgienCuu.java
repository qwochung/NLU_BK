package HocVien;

public class NhanVienNgienCuu extends NhanVien{
	double phuCap;

	public NhanVienNgienCuu(int id, String hoVaten, String trinhDo, double luong, double phuCap) {
		super(id, hoVaten, trinhDo, luong);
		this.phuCap = phuCap;
	}

	@Override
	public String toString() {
		return "NhanVienNgienCuu [phuCap=" + phuCap + ", id=" + id + ", hoVaten=" + hoVaten + ", trinhDo=" + trinhDo
				+ ", luong=" + luong + "]";
	}

	@Override
	public double getLuong() {
		// TODO Auto-generated method stub
		return luong + phuCap ;
	}

	

}
