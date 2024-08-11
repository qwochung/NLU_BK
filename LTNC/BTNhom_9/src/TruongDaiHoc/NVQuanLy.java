package TruongDaiHoc;

public class NVQuanLy extends NhanVienCLCao {
	double phucapChucVu	;

	public NVQuanLy(String ten, int namSinh, double luong, Date ngayNhanViec, PhongBan pBK, String trinhDo,
			String nganh, String noiDaoTao, double phucapChucVu) {
		super(ten, namSinh, luong, ngayNhanViec, pBK, trinhDo, nganh, noiDaoTao);
		this.phucapChucVu = phucapChucVu;
	}

	@Override
	protected boolean typeNguoi() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "NVQuanLy [phucapChucVu=" + phucapChucVu + ", trinhDo=" + trinhDo + ", nganh=" + nganh + ", noiDaoTao="
				+ noiDaoTao + ", luong=" + luong + ", ngayNhanViec=" + ngayNhanViec + ", PBK=" + PBK + ", ten=" + ten
				+ ", namSinh=" + namSinh + "]";
	}

	@Override
	public double getLuongNhanVien() {
		// TODO Auto-generated method stub
		return luong + phucapChucVu;
	}
	
}
