package DSSinhVien;

import java.sql.Date;

public class SinhVien {
	String hoVaTen ;
	int id ;
	Date date ;
	danhSachMonHoc danhSachMonHoc ;
	public SinhVien(String hoVaTen, int id, Date date, DSSinhVien.danhSachMonHoc danhSachMonHoc) {
		super();
		this.hoVaTen = hoVaTen;
		this.id = id;
		this.date = date;
		this.danhSachMonHoc = danhSachMonHoc;
	}
	

}

