package TruongDaiHoc;

public class SinhVien extends Nguoi {
	float diem1;
	float diem2;
	float diem3;
	public SinhVien(String ten, int namSinh, float diem1, float diem2, float diem3) {
		super(ten, namSinh);
		this.diem1 = diem1;
		this.diem2 = diem2;
		this.diem3 = diem3;
	}
	@Override
	protected boolean typeNguoi() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public String toString() {
		return "SinhVien [diem1=" + diem1 + ", diem2=" + diem2 + ", diem3=" + diem3 + ", ten=" + ten + ", namSinh="
				+ namSinh + "]";
	}
	@Override
	public double getLuong() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getLuongNhanVien() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
