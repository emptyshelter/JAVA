package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddressUpdatePKMain {

	public static void main(String[] args) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user="javaspring20";
		String password="javaspring20";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		String updateSql =  "UPDATE ADDRESS SET ADDRESS='서울시민' where no = ?";
		PreparedStatement pstmt = con.prepareStatement(updateSql);
		pstmt.setInt(1, 8);
		int result = pstmt.executeUpdate();
		System.out.println(result+"개가 업데이트되었습니다.");
	
		pstmt.close();
		con.close();

		

	}

}
