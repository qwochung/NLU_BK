package Task2;

public abstract class An_Pham {
	String tieu_De; 
	int so_Trang, nam_SX;
	String ten_TG;
	double gia_Tien;
	public An_Pham(String tieu_De, int so_Trang, int nam_SX, String ten_TG, double gia_Tien) {
		super();
		this.tieu_De = tieu_De;
		this.so_Trang = so_Trang;
		this.nam_SX = nam_SX;
		this.ten_TG = ten_TG;
		this.gia_Tien = gia_Tien;
	}
	@Override
	public abstract String toString() ;
	/**
	 * @return the tieu_De
	 */
	public String getTieu_De() {
		return tieu_De;
	}
	/**
	 * @param tieu_De the tieu_De to set
	 */
	public void setTieu_De(String tieu_De) {
		this.tieu_De = tieu_De;
	}
	/**
	 * @return the so_Trang
	 */
	public int getSo_Trang() {
		return so_Trang;
	}
	/**
	 * @param so_Trang the so_Trang to set
	 */
	public void setSo_Trang(int so_Trang) {
		this.so_Trang = so_Trang;
	}
	/**
	 * @return the nam_SX
	 */
	public int getNam_SX() {
		return nam_SX;
	}
	/**
	 * @param nam_SX the nam_SX to set
	 */
	public void setNam_SX(int nam_SX) {
		this.nam_SX = nam_SX;
	}
	/**
	 * @return the ten_TG
	 */
	public String getTen_TG() {
		return ten_TG;
	}
	/**
	 * @param ten_TG the ten_TG to set
	 */
	public void setTen_TG(String ten_TG) {
		this.ten_TG = ten_TG;
	}
	/**
	 * @return the gia_Tien
	 */
	public double getGia_Tien() {
		return gia_Tien;
	}
	/**
	 * @param gia_Tien the gia_Tien to set
	 */
	public void setGia_Tien(double gia_Tien) {
		this.gia_Tien = gia_Tien;
	}
	

}
