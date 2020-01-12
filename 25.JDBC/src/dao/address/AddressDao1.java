package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
Dao(Data Access Object)
 - 멤버들의 데이터를 저장하고있는 테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위메쏘드를 가지고있는 클래스
 - AddressService객체의 요청(메쏘드호출)을 받아서 
   Data Access(DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 */
public class AddressDao1 {
	public void insert() throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user="javaspring20";
		String password="javaspring20";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		String insertSql1=
				"insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')";
		PreparedStatement pstmt = con.prepareStatement(insertSql1);
		pstmt.executeUpdate();
		pstmt.close();
		con.close();	
		}
	public void delete() throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user="javaspring20";
		String password="javaspring20";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		String deleteSql = "DELETE ADDRESS WHERE no = ?";
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		pstmt.setInt(1, 7);
		pstmt.close();
		con.close();
	}
	public void update() throws Exception {
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
	public void selectByPk() throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user="javaspring20";
		String password="javaspring20";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
//		String findSql = "select * from address where name like '%경호'";
		String findSql = "select * from address where no =?";
		PreparedStatement pstmt = con.prepareStatement(findSql);
		pstmt.setInt(1, 13);
		ResultSet rs = pstmt.executeQuery();
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
	public void selectAll() throws Exception {
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
