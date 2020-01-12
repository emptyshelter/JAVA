package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddressSelectAllMain {

	public static void main(String[] args) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user="javaspring20";
		String password="javaspring20";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		String findSql = "select * from address";
		PreparedStatement pstmt = con.prepareStatement(findSql);
		ResultSet rs = pstmt.executeQuery(findSql);
		System.out.println("------------------------------------------------");
		System.out.println("NO \t ID \t NAME \t PHONE \t\t ADDRESS");
		System.out.println("------------------------------------------------");
		while (rs.next()) {
			int no = rs.getInt("NO");
			String id = rs.getString("ID");
			String name = rs.getString("NAME");
			String phone = rs.getString("PHONE");
			String address= rs.getString("ADDRESS");
			System.out.println(no+"\t"+id+"\t"+name+"\t"+phone+"\t"+address);
		} 
		rs.close();
		pstmt.close();
		con.close();
		
		
		
		

	}

}
