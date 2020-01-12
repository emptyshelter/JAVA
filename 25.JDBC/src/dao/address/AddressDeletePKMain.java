package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddressDeletePKMain {

	public static void main(String[] args) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user="javaspring20";
		String password="javaspring20";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
//		String deleteSql = "DELETE ADDRESS WHERE ID = 'guard'";
		String deleteSql = "DELETE ADDRESS WHERE no = ?";
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		pstmt.setInt(1, 7);
		pstmt.close();
		con.close();
		

	}

}
