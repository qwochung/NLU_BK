package DS_SinhVien_arr;

import java.util.ArrayList;

public class DS_SinhVien_arr {
	ArrayList<SinhVien> DS_SinhVien_arr;

	/**
	 * @param dS_SinhVien_arr
	 */
	public DS_SinhVien_arr(ArrayList<SinhVien> dS_SinhVien_arr) {
		super();
		DS_SinhVien_arr = dS_SinhVien_arr; 
	}

	
	public DS_SinhVien_arr() {
		super();
		this.DS_SinhVien_arr = new ArrayList<SinhVien>();
	}
	
	
	
	
	
	
			
	


	// Thêm 1 SV vào danh sách 
	public void addSinhVien (SinhVien sv) {
		this.DS_SinhVien_arr.add(sv);
	}
	
	
	// In DS sinh viên
	public void inDS () {
		for (SinhVien sinhVien : DS_SinhVien_arr) {
			System.out.println(sinhVien);}
			
			
	
	}
	
	
	// Ktra DS có rỗng ko? 
	public boolean ktraRong () {
		return this.DS_SinhVien_arr.isEmpty();
	}
	
	
	// Lấy số lượng sv có trong DS 
	public int soLuongSV () {
		return this.DS_SinhVien_arr.size();
	}

	//Làm rỗng DS
	public void lamRongDS () {
		this.DS_SinhVien_arr.removeAll(DS_SinhVien_arr);
	}
	
	//Xóa 1 sinh viên khỏi danh sách
	public void removeSinhVien(String id) {
		
		for (SinhVien sv : DS_SinhVien_arr) {
			String a = sv.getMaSinhVien();
			if ( a.equals(id)) {
				System.out.println( sv);
				System.out.println( sv.getMaSinhVien());
				System.out.println( id);

				this.DS_SinhVien_arr.remove(sv);
				break ;
			}
				
			
		}
		
	}
	
	
	//Tìm kiếm sinh viên trong danh sách
	public void findOneSinhVien( String id ) {
		for (SinhVien  sv : DS_SinhVien_arr) {
			if ( id.equals(sv.getMaSinhVien ())     )
				System.out.println(sv);
		
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
