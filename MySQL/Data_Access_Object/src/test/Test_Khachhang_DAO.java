package test;

import java.time.LocalDate;

import Data_Access_Obj.KhacHangDAO;
import Model.KhachHang;

public class Test_Khachhang_DAO {
	public static void main(String[] args) {
		KhachHang khachHang1 = new KhachHang(1, "Nguyễn Linh", LocalDate.of(2022, 10, 22) , "HN");
		
		KhacHangDAO.getInstance().insert(khachHang1);
		
	}

}
