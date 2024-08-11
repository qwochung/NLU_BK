package Task2;

import java.util.List;

public class Nha_Sach {
	List<An_Pham> dsAn_Phams ;

	public Nha_Sach(List<An_Pham> dsAn_Phams) {
		super();
		this.dsAn_Phams = dsAn_Phams;
	}

	/**
	 * @return the dsAn_Phams
	 */
	public List<An_Pham> getDsAn_Phams() {
		return dsAn_Phams;
	}

	/**
	 * @param dsAn_Phams the dsAn_Phams to set
	 */
	public void setDsAn_Phams(List<An_Pham> dsAn_Phams) {
		this.dsAn_Phams = dsAn_Phams;
	}

	@Override
	public String toString() {
		return "Nha_Sach [dsAn_Phams=" + dsAn_Phams.toString() ;
	}
	
	
	
	
	
	public String loai_An_Pham( An_Pham an_Pham) {
		return an_Pham instanceof Tap_Chi ? "Tạp chí" : "Tham khảo";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		An_Pham tc1 = new Tap_Chi("Xe Hơi", 10, 2023, "No Name", 12000, "Tạp chí 1");
		An_Pham tc2 = new Tap_Chi("Du lịch", 11, 2013, "No Name", 14000, "Tạp chí 2");
		An_Pham tc3 = new Tap_Chi("Ăn uống", 15, 2022, "No Name", 16000, "Tạp chí 2");
		An_Pham tc4 = new Tap_Chi("Tin tức", 13, 2019, "No Name", 18000, "Tạp chí 1");
		
		Chuong_Sach chuong1 = new Chuong_Sach("Giải Phẫu", 50);
		Chuong_Sach chuong2 = new Chuong_Sach("Thần Kinh", 90);
		Chuong_Sach chuong3 = new Chuong_Sach("Xương Khớp", 50);
		
		Chuong_Sach chuong4 = new Chuong_Sach("Toán", 30);
		Chuong_Sach chuong5 = new Chuong_Sach("Lý", 50);
		
		
		An_Pham tk1 = new Tham_Khao("Sách y học", 200, 2012, "Bác sĩ...", 200000, "Y học", List.of(chuong1, chuong2, chuong3));
		An_Pham tk2 = new Tham_Khao("Sách giáo dục", 110, 2017, "Thầy...", 100000, "Y học", List.of(chuong5, chuong4));
		
		
		
		
		Nha_Sach nha_Sach = new Nha_Sach(List.of(tc1, tc2,tc3,tc4,tk1,tk2));
		
		
//		System.out.println(nha_Sach.toString());
		System.out.println(nha_Sach.loai_An_Pham(tk1));
	}

}
