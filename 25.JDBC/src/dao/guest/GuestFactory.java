package dao.guest;

import java.sql.Connection;
import java.sql.DriverManager;

public class GuestFactory {
	public GuestFactory() {
		// TODO Auto-generated constructor stub
	}
	public static Connection getConnection() throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
		String user="javaspring20";
		String password="javaspring20";
		Connection con = 
				DriverManager.getConnection(url, user, password);
		return con;
	}
	public static Connection getConnection(String driverClass, 
										   String url , 
										   String user, 
										   String password) throws Exception {
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
	public static void releaseConnection(Connection con) throws Exception {
		con.close();
	}

}
