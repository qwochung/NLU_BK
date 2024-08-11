package TruongDaiHoc;

public class GiangVien extends NhanVienCLCao {
		double thuLaoGG;

		public GiangVien(String ten, int namSinh, double luong, Date ngayNhanViec, PhongBan pBK, String trinhDo,
				String nganh, String noiDaoTao, double thuLaoGG) {
			super(ten, namSinh, luong, ngayNhanViec, pBK, trinhDo, nganh, noiDaoTao);
			this.thuLaoGG = thuLaoGG;
		}

		@Override
		protected boolean typeNguoi() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String toString() {
			return "GiangVien [thuLaoGG=" + thuLaoGG + ", trinhDo=" + trinhDo + ", nganh=" + nganh + ", noiDaoTao="
					+ noiDaoTao + ", luong=" + luong + ", ngayNhanViec=" + ngayNhanViec + ", PBK=" + PBK + ", ten="
					+ ten + ", namSinh=" + namSinh + "]";
		}

		@Override
		public double getLuongNhanVien() {
			// TODO Auto-generated method stub
			return luong + thuLaoGG;
		}

		
}
