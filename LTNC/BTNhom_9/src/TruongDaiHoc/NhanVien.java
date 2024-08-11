package TruongDaiHoc;

public abstract class NhanVien  extends Nguoi{
	double luong;
	Date ngayNhanViec;
	PhongBan PBK;
	public NhanVien(String ten, int namSinh, double luong, Date ngayNhanViec, PhongBan pBK) {
		super(ten, namSinh);
		this.luong = luong;
		this.ngayNhanViec = ngayNhanViec;
		PBK = pBK;
	}
	
	public  double getLuong() {
		return luong;
	}

	


}



