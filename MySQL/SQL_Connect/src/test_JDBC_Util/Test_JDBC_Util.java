package test_JDBC_Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import DataBase.JDBC_Util;

public class Test_JDBC_Util {
	public static void main(String[] args) {
		
		try {
			// BƯỚC 1 : TẠO KẾT NỐI
			Connection connection = JDBC_Util.getConnection()	;
			
			System.out.println(connection);
			
			DataBase.JDBC_Util.printInfo(connection);
			
			
			
			
			
			
			// BƯỚC 2 : TẠO RA ĐỐI TƯỢNG STATEMENT
			Statement statement = connection.createStatement()	;
			
			
			
			
			
			
			
			// BƯỚC 3 : THỰC THI CÂU LỆNH SQL
			
			String sql = "INSERT INTO sinhvien (MaSV, HoTen,NgaySinh, NamNhapHoc,MaCT, GioiTinh) "
					+ "VALUES ( \"09\", \"Quách Tỉnh\", \"2000-05-20\", 2022, \"CNTT\",1)";
			
			int check =  statement.executeUpdate(sql);
			
			System.out.println( "Số dòng thay đổi :" + check);
			
			
			
			
			
			
			// BƯỚC 4: XỬ LÍ KẾT QUẢ 
			if (check >0 ) {
				System.out.println( "Thêm dữ liệu thành công!");
				
			}
			else {
				System.out.println("Thêm dữ liệu thất bại!");
			}
			
			
			
			
			
			
			
			// BƯỚC 5 : NGẮT KẾT NỐI
			JDBC_Util.closeConnection(connection);
			
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
