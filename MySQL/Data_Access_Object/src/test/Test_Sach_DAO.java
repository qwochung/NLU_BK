package test;

import java.util.ArrayList;

import Data_Access_Obj.SachDAO;
import Model.Sach;

public class Test_Sach_DAO {
	public static void main(String[] args) {
//		Sach sach1 = new Sach("LTJV", "Lập Trình JAVA", 200000.0,2020);
//		Sach sach2 = new Sach("LTPY", "Lập Trình Python", 600000.0,2020);
		Sach sach3 = new Sach("LTPT", "Lập Trình Python", 18000.0,2025);		
		
		// test Insert
		
//		SachDAO.getInstance().insert(sach1);
//		SachDAO.getInstance().insert(sach2);
		SachDAO.getInstance().insert(sach3);
	
	
		
		// Test Update

//		SachDAO.getInstance().update(sach3);
		
		
		//TEST delete
//		SachDAO.getInstance().del(sach3);
		
		
		
		// Test Sellect
		
		
		ArrayList<Sach> list = SachDAO.getInstance().sellectAll()	;
		for (Sach sach : list) {
			System.out.println(sach.toString());
		}
		
//		System.out.println(SachDAO.getInstance().sellectByID(sach3).toString() );
		
	}
	
	
	

}
