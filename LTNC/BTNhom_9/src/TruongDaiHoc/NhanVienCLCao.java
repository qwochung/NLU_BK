package TruongDaiHoc;

public abstract class NhanVienCLCao extends NhanVien{
	String trinhDo;
	String nganh;
	String noiDaoTao;
	public NhanVienCLCao(String ten, int namSinh, double luong, Date ngayNhanViec, PhongBan pBK, String trinhDo,
			String nganh, String noiDaoTao) {
		super(ten, namSinh, luong, ngayNhanViec, pBK);
		this.trinhDo = trinhDo;
		this.nganh = nganh;
		this.noiDaoTao = noiDaoTao;
	}
	

}
