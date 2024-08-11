package Task2;

public class Chuong_Sach {
	String tieu_De_Chuong;
	int so_Trang;
	public Chuong_Sach(String tieu_De_Chuong, int so_Trang) {
		super();
		this.tieu_De_Chuong = tieu_De_Chuong;
		this.so_Trang = so_Trang;
	}
	/**
	 * @return the tieu_De_Chuong
	 */
	public String getTieu_De_Chuong() {
		return tieu_De_Chuong;
	}
	/**
	 * @param tieu_De_Chuong the tieu_De_Chuong to set
	 */
	public void setTieu_De_Chuong(String tieu_De_Chuong) {
		this.tieu_De_Chuong = tieu_De_Chuong;
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
	@Override
	public String toString() {
		return "\n"+ "Chuong_Sach [tieu_De_Chuong=" + tieu_De_Chuong + ", so_Trang=" + so_Trang + "]";
	}
	
	

}
