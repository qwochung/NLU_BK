package DSSinhVien;

import java.util.ArrayList;

public class StudentManagement {
	ArrayList<SinhVien> DSSinhVien  ;
//	ArrayList<SinhVien> dSSinhVien = new ArrayList<>()	;
	
	
//	public StudentManagement() {
	public StudentManagement() {
		
//		this.DSSinhVien = new ArrayList<SinhVien> () ;
		DSSinhVien = new ArrayList<>();
		
		SinhVien sv1 = new SinhVien("Hung", 001,null, null);
		SinhVien sv2 = new SinhVien("Quan", 002,null, null);
		SinhVien sv3 = new SinhVien("Kha", 003,null, null);
		SinhVien sv4 = new SinhVien("Hai", 004,null, null);
	}
	
	

}
