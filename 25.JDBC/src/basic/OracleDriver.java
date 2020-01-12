package basic;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class OracleDriver implements Driver{
	/****************static block***************/
	/*
	 * ClassLoading시 최초로 실행되는 Block(코드)
	 */
	static {
		System.out.println("/****************static block start***************/");
		System.out.println("A. OracleDriver 생성");
		OracleDriver driver = new OracleDriver(); 
		try {
			DriverManager.deregisterDriver(driver);
			System.out.println("B. DriverManager에 객체 등록");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("/****************static block end***************/");
	}
	private OracleDriver() {
		System.out.println("OracleDriver() 생성자");
	}
	

	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		return null;
	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		return false;
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		return null;
	}

	@Override
	public int getMajorVersion() {
		return 0;
	}

	@Override
	public int getMinorVersion() {
		return 0;
	}

	@Override
	public boolean jdbcCompliant() {
		return false;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return null;
	}
	

}
