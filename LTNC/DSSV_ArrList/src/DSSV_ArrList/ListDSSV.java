package DSSV_ArrList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListDSSV {
	ArrayList<SinhVien> danhSach;

	public ListDSSV(ArrayList<SinhVien> danhSach) {
		super();
		this.danhSach = danhSach;
	}

	public ListDSSV() {
		this.danhSach = new ArrayList<SinhVien>();

	}

	public void themSinhVien(SinhVien sv) { // tạo phương thức thêm sinh viên
		this.danhSach.add(sv);
	}

	public void printDanhSach() { // tạo phương thức in tất cả sinh viên có trong danh sách
		if (danhSach.isEmpty() == true) {
			System.out.println("Không có sinh viên nào trong danh sách!!!");
		} else {
			for (SinhVien sinhVien : danhSach) {
				System.out.println(sinhVien.toString());
			}
		}
	}

	public boolean kiemTraDSRong() { // tạo phương thức kiểm tra DS có rỗng hay ko
		return this.danhSach.isEmpty();

	}

	public int soLuongSV() { // lấy ra số lượng sinh viên có trong danh sách
		return this.danhSach.size();
	}

	public void lamRongDS() { // làm rỗng danh sách
		this.danhSach.clear();
	}

	
	
	
	
	public void KtraTonTai(SinhVien sVien) { // kiểm tra 1 sinh viên cho trước có nằm trong ds ko
		
		if (this.danhSach.contains(sVien) == true) {
			System.out.println("Đã tồn tại sinh viên này. ");
		}
		else {
			System.out.println("Chưa tồn tại.");
		}
		
	}
	
	
	
	

	public void xoaSinhVien(SinhVien sVien) { // xóa 1 sinh viên ra khỏi ds dựa theo mssv
		this.danhSach.remove(sVien);
	}

	
	
	
	
	public void timSinhVien(String ten) { // tìm kiếm sinh viên dựa theo tên
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}

	}

	public void sapXep() { // sắp xếp danh sách theo thứ tụ điểm thấp đến cao
		Collections.sort(danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
			
				if (sv1.getDiem() < sv2.getDiem()) {
					return 1;
				}
				if (sv1.getDiem() > sv2.getDiem()) {
					return -1;
				} else {
					return 0;
				}

			}
		});

	}

}
