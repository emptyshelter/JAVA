package basic;

import java.sql.Driver;
import java.sql.DriverManager;

public class DriverClassLoadingMain {

	public static void main(String[] args) throws Exception {
		String driverClass = "basic.OracleDriver";
		/*
		 * 1. basic.OracleDriver class loading
		 * 		A. Driver ��ü����
		 * 		B. DriverManager�� ��ü ���
		 */
		//Driver driver = new OracleDriver();
		Class clazz = Class.forName(driverClass);//�������� ���̱� ���ؼ�
		/*
		Driver driver = (Driver) clazz.newInstance();
		DriverManager.registerDriver(driver);
		*/
	
	}

}
