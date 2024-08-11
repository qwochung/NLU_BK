package DS_SinhVien_arr;



//import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {
	String maSinhVien;
	String hoTen;
	int namSinh;
	double diemTB;
	/**
	 * @param maSinhVien
	 * @param hoTen
	 * @param namSinh
	 * @param diemTB
	 */
	public SinhVien(String maSinhVien, String hoTen, int namSinh, double diemTB) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public int getNamSinh() {
		return namSinh;
	}
	
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public double getDiemTB() {
		return diemTB;
	}
	
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
	
	
	@Override
	public String toString() {
		return "maSinhVien : " + maSinhVien + ", HoTen : " + hoTen +
				", namSinh : " + namSinh + ", diemTB : " + diemTB ;
	}
	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return this.maSinhVien.compareTo(o.maSinhVien);
	}
	
	
	
	

	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
