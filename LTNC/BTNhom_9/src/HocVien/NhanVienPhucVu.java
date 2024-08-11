package HocVien;

public class NhanVienPhucVu  extends NhanVien{

	public NhanVienPhucVu(int id, String hoVaten, String trinhDo, double luong) {
		super(id, hoVaten, trinhDo, luong);
	
	}

	@Override
	public String toString() {
		return "NhanVienPhucVu [id=" + id + ", hoVaten=" + hoVaten + ", trinhDo=" + trinhDo + ", luong=" + luong + "]";
	}

	@Override
	public double getLuong() {
		// TODO Auto-generated method stub
		return luong;
	}
	
}
