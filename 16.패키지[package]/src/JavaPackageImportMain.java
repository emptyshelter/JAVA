import java.awt.Frame;
import java.awt.List;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.Connection;

import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.order.Order;
import com.itwill.shop.order.OrderService;

public class JavaPackageImportMain {
	public static void main(String[] args) {
		/*
		 * java.lang package�� �Ҽӵ� Ŭ�������� import���� ��������
		 */
		System.out.println("===========java.lang package============");
		java.lang.String str1 = "str1";
		String str2 = "str2";
		
		System sys;
		Math math;
		System.out.println("=================java.lang �̿��� package=============");
		Frame f;
		List list; 
		InputStream in;
		OutputStream out;
		Socket s;
		Connection con;
		
		System.out.println("=================���� package=============");
		ShopService shopService;
		Member member;
		Order o;
		OrderService os;
		
		
	}

}
