package Task2;

public class Tap_Chi extends An_Pham {
	String ten_Tap_Chi;

	public Tap_Chi(String tieu_De, int so_Trang, int nam_SX, String ten_TG, double gia_Tien, String ten_Tap_Chi) {
		
		super(tieu_De, so_Trang, nam_SX, ten_TG, gia_Tien);
		this.ten_Tap_Chi = ten_Tap_Chi;
	}

	@Override
	public String toString() {
		return "\n"+"Tap_Chi [ten_Tap_Chi=" + ten_Tap_Chi + ", tieu_De=" + tieu_De + ", so_Trang=" + so_Trang + ", nam_SX="
				+ nam_SX + ", ten_TG=" + ten_TG + ", gia_Tien=" + gia_Tien + "]";
	}

	/**
	 * @return the ten_Tap_Chi
	 */
	public String getTen_Tap_Chi() {
		return ten_Tap_Chi;
	}

	/**
	 * @param ten_Tap_Chi the ten_Tap_Chi to set
	 */
	public void setTen_Tap_Chi(String ten_Tap_Chi) {
		this.ten_Tap_Chi = ten_Tap_Chi;
	}
	

}
