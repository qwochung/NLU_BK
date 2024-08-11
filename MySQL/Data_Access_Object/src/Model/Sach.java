package Model;

public class Sach {
	String id ;
	String tenSach;
	double giaBan;
	int namSanXuat;
	public Sach(String id, String tenSach, double giaBan, int namSanXuat) {
		super();
		this.id = id;
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namSanXuat = namSanXuat;
	}
	public Sach() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	@Override
	public String toString() {
		return "Sach [id=" + id + ", tenSach=" + tenSach + ", giaBan=" + giaBan + ", namSanXuat=" + namSanXuat + "]";
	}

}
