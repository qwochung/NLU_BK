package DSSV_ArrList;
import java.lang.Comparable;
import java.util.Objects;
public class SinhVien implements Comparable<SinhVien>{
	int mssv ;
	String hoVaTen	;
	int namsinh;
	double diem;
	public SinhVien(int mssv, String hoVaTen, int namsinh, double diem) {
		super();
		this.mssv = mssv;
		this.hoVaTen = hoVaTen;
		this.namsinh = namsinh;
		this.diem = diem;
	}
	
	
	
	
	
	
	public SinhVien(int mssv) {
		super();
		this.mssv = mssv;
	}






	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}






	@Override
	public String toString() {
		return "SinhVien [mssv=" + mssv + ", hoVaTen=" + hoVaTen + ", namsinh=" + namsinh + ", diem=" + diem + "]";
	}
	
	public int  compareTo( SinhVien sVien) {
		
		return this.mssv - sVien.mssv;
	}






	@Override
	public int hashCode() {
		return Objects.hash(mssv);
	}





//? tại sao phải override equa thì hàm contain mới kiểm tra được???
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return mssv == other.mssv;
	}






	

}
