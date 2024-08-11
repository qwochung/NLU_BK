package Data_Access_Obj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import DataBase.JDBC_Util;
import Model.Sach;

public class SachDAO implements DAO_Interface<Sach> {

	public static SachDAO getInstance () {
		 return new SachDAO()	;
	}
	
	
	
	@Override
	public int insert(Sach t) {
		int ketQua = 0;
		try {
			// B1: Tạo kết nối
			Connection connection = JDBC_Util.getConnection()	;
			
			// B2 : Tạo đối tượng statement
			
//				Statement statement = connection.createStatement()	;
			
			String sql = "INSERT INTO sach ( id, tenSach, giaBan, namXuatBan) "
					+ "VALUES  (?,?,?,?)" ;
					
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, t.getId());
			preparedStatement.setString(2, t.getTenSach());
			preparedStatement.setDouble(3,  t.getGiaBan());
			preparedStatement.setInt(4, t.getNamSanXuat());
			
			// B3 : Thực thi câu lệnh
		
		
		
			 ketQua = preparedStatement.executeUpdate();
		
			// B4 : Sử lí kết quả
			
			System.out.println( " Bạn đã thực thi :"+sql );
			System.out.println( "Có "+ ketQua + " dòng bị thay đổi" );
		
			
			
			// B5: Ngắt kết nối
			JDBC_Util.closeConnection(connection);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int del(Sach t) {
		int ketQua = 0;
		try {
			// B1: Tạo kết nối
			Connection connection = JDBC_Util.getConnection()	;
			
			// B2 : Tạo đối tượng statement
			String sql = "DELETE FROM sach " +
					" WHERE id = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, t.getId());
			
			// B3 : Thực thi câu lệnh
			
			System.out.println(sql);
			
			ketQua = preparedStatement.executeUpdate();
		
			// B4 : Sử lí kết quả
			
			System.out.println( " Bạn đã thực thi :"+sql );
			System.out.println( "Có "+ ketQua + " dòng bị thay đổi" );
		
			
			
			// B5: Ngắt kết nối
			JDBC_Util.closeConnection(connection);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;		
		
			}

	@Override
	public int update(Sach t) {
		int ketQua = 0;
		try {
			// B1: Tạo kết nối
			Connection connection = JDBC_Util.getConnection()	;
			
			// B2 : Tạo đối tượng statement
			String sql = "UPDATE sach " +
					"SET " + 
					"tenSach = ? "
					+"giaBan = ? " 
					+", namXuatBan = ? " 
					+" WHERE id = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			
			// B3 : Thực thi câu lệnh
			
			System.out.println(sql);
			
			ketQua = preparedStatement.executeUpdate();
		
			// B4 : Sử lí kết quả
			
			System.out.println( " Bạn đã thực thi :"+sql );
			System.out.println( "Có "+ ketQua + " dòng bị thay đổi" );
		
			
			
			// B5: Ngắt kết nối
			JDBC_Util.closeConnection(connection);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;		
	}

	@Override
	public ArrayList<Sach> sellectAll() {
		ArrayList<Sach > ketqua = new ArrayList<Sach>();
		try {
			// B1: Tạo kết nối
			Connection connection = JDBC_Util.getConnection()	;
			
			// B2 : Tạo đối tượng statement
			String sql = "SELECT *FROM sach";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			
			
			// B3 : Thực thi câu lệnh
			
			System.out.println(sql);
			ResultSet resultset = preparedStatement.executeQuery();
			
		
			// B4 : Sử lí kết quả
			
			while (resultset.next()) {
				String id = resultset.getString("id");
				String tenSach = resultset.getString("tenSach");
				float giaBan = resultset.getFloat("giaBan");
				int namXuatBan = resultset.getInt("namXuatBan");
				
				Sach sach = new Sach(id, tenSach, giaBan, namXuatBan);
				ketqua.add(sach);

				
			}
			
		
			
			
			// B5: Ngắt kết nối
			JDBC_Util.closeConnection(connection);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ketqua;
	}

	@Override
	public Sach sellectByID(Sach t) {
		Sach ketqua =null;
		try {
			// B1: Tạo kết nối
			Connection connection = JDBC_Util.getConnection()	;
			
			// B2 : Tạo đối tượng statement
			
			String sql = "SELECT *FROM sach WHERE id =?" ;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, t.getId());
			
			
			// B3 : Thực thi câu lệnh
			
			System.out.println(sql);
			ResultSet resultset = preparedStatement.executeQuery();
			
		
			// B4 : Sử lí kết quả
			
			while (resultset.next()) {
				String id = resultset.getString("id");
				String tenSach = resultset.getString("tenSach");
				float giaBan = resultset.getFloat("giaBan");
				int namXuatBan = resultset.getInt("namXuatBan");
				
				ketqua = new Sach(id, tenSach, giaBan, namXuatBan);

				
			}
			
		
			
			
			// B5: Ngắt kết nối
			JDBC_Util.closeConnection(connection);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ketqua;
	}

	@Override
	public ArrayList<Sach> sellectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
