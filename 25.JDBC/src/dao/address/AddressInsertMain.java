package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddressInsertMain {

	public static void main(String[] args) throws Exception {
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
		String insertSql2="insert into address values(address_no_seq.nextval,'abcdf','박경호','123-4568','경기도 구리시')";
		pstmt= con.prepareStatement(insertSql2);
		pstmt.executeUpdate();
		String insertSql3="insert into address values(address_no_seq.nextval,'starts','최경호','123-4568','경기도 포천시')";
		pstmt= con.prepareStatement(insertSql3);
		pstmt.executeUpdate();
		String insertSql4="insert into address values(address_no_seq.nextval,'beauty','구경호','123-4568','경기도 이천시')";
		pstmt= con.prepareStatement(insertSql4);
		pstmt.executeUpdate();
		String insertSql5="insert into address values(address_no_seq.nextval,'xyzzx','이경호','123-4568','경기도 안양시')";
		pstmt= con.prepareStatement(insertSql5);
		pstmt.executeUpdate();
		String insertSql6="insert into address values(address_no_seq.nextval,'yyyyy','주경호','123-4568','경기도 안산시')";
		pstmt= con.prepareStatement(insertSql6);
		pstmt.executeUpdate();
		String insertSql7="insert into address values(address_no_seq.nextval,'super','양경호','123-4568','경기도 인천시')";
		pstmt= con.prepareStatement(insertSql7);
		pstmt.executeUpdate();
		String insertSql8="insert into address values(address_no_seq.nextval,'strong','인경호','123-4568','경기도 시흥시')";
		pstmt= con.prepareStatement(insertSql8);
		pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		

	}

}
