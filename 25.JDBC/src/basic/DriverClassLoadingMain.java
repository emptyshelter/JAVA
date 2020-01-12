package basic;

import java.sql.Driver;
import java.sql.DriverManager;

public class DriverClassLoadingMain {

	public static void main(String[] args) throws Exception {
		String driverClass = "basic.OracleDriver";
		/*
		 * 1. basic.OracleDriver class loading
		 * 		A. Driver 객체생성
		 * 		B. DriverManager에 객체 등록
		 */
		//Driver driver = new OracleDriver();
		Class clazz = Class.forName(driverClass);//의존성을 줄이기 위해서
		/*
		Driver driver = (Driver) clazz.newInstance();
		DriverManager.registerDriver(driver);
		*/
	
	}

}
