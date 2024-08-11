package Data_Access_Obj;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DataBase.JDBC_Util;
import Model.KhachHang;

public class KhacHangDAO implements DAO_Interface<KhachHang> {

	public static KhacHangDAO  getInstance() {
		return new KhacHangDAO() ;
		
	}
	
	
	
	@Override
	public int insert(KhachHang t) {
		
		try {
			// B1 : Tạo kết nối
			Connection connection = JDBC_Util.getConnection()	;
			
			
			// B2 : Tạo đối tượng statement
			Statement statement = connection.createStatement()	;
			
			
			// B3: Thực thi câu lệnh
			
			String sql = "INSERT INTO 	khachhang (id, hoVaTen, ngaySinh, diaChi )"
						+ " VALUES ( " + t.getId() + ", '" + t.getHoVaten() + "', '" 
						+ t.getNgaySinh() + "' , '" + t.getDiaChi() +"')";
			
			System.out.println(sql );
			statement.executeUpdate(sql);
			
			
			// B4:  Sử lí kết quả

			System.out.println( " Bạn đã thực thi :"+sql );
//			System.out.println( "Có "+ ketQua + " dòng bị thay đổi" );
					
			// B5 : Ngắt kết nối
			JDBC_Util.closeConnection(connection);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return 0;
	}

	@Override
	public int del(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<KhachHang> sellectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KhachHang sellectByID(KhachHang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhachHang> sellectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
