package Task2;

import java.util.List;

public class Tham_Khao extends An_Pham {
	 String linh_Vuc;
	 List<Chuong_Sach> chuong_Sach;
	 
	 
	public Tham_Khao(String tieu_De, int so_Trang, int nam_SX, String ten_TG, double gia_Tien, String linh_Vuc,
			List<Chuong_Sach> chuong_Sach) {
		
		super(tieu_De, so_Trang, nam_SX, ten_TG, gia_Tien);
		this.linh_Vuc = linh_Vuc;
		this.chuong_Sach = chuong_Sach;
	}


	/**
	 * @return the linh_Vuc
	 */
	public String getLinh_Vuc() {
		return linh_Vuc;
	}


	/**
	 * @param linh_Vuc the linh_Vuc to set
	 */
	public void setLinh_Vuc(String linh_Vuc) {
		this.linh_Vuc = linh_Vuc;
	}


	/**
	 * @return the chuong_Sach
	 */
	public List<Chuong_Sach> getChuong_Sach() {
		return chuong_Sach;
	}


	/**
	 * @param chuong_Sach the chuong_Sach to set
	 */
	public void setChuong_Sach(List<Chuong_Sach> chuong_Sach) {
		this.chuong_Sach = chuong_Sach;
	}


	@Override
	public String toString() {
		return "\n"+ "Tham_Khao [linh_Vuc=" + linh_Vuc + ", chuong_Sach=" + chuong_Sach + ", tieu_De=" + tieu_De
				+ ", so_Trang=" + so_Trang + ", nam_SX=" + nam_SX + ", ten_TG=" + ten_TG + ", gia_Tien=" + gia_Tien
				+ "]";
	}
	 
	 
	 

	
	 
}
