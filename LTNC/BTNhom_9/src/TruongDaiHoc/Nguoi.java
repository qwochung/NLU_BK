package TruongDaiHoc;

public abstract class Nguoi {
	String 	ten;
	int namSinh;
	public Nguoi(String ten, int namSinh) {
		super();
		this.ten = ten;
		this.namSinh = namSinh;
	}
	protected abstract boolean typeNguoi();
	@Override
	
	
	public abstract String toString() ;
	
	
	public abstract double getLuong() ;
	
	
	 public abstract double getLuongNhanVien();
	
}
