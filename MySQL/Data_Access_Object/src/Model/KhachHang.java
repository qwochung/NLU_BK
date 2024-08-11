package Model;

import java.sql.Date;
import java.time.LocalDate;

public class KhachHang {
	int id;
	String hoVaten;
	LocalDate ngaySinh;
	String diaChi;
	public KhachHang(int id, String hoVaten, LocalDate ngaySinh, String diaChi) {
		super();
		this.id = id;
		this.hoVaten = hoVaten;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	public KhachHang() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoVaten() {
		return hoVaten;
	}
	public void setHoVaten(String hoVaten) {
		this.hoVaten = hoVaten;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
	
}
