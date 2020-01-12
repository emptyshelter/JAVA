import java.io.InputStream;
import java.net.Socket;
import java.sql.DriverManager;

public class ExceptionThrowMain {
	public static void main(String[] args) throws Exception  {
		System.out.println("stmt1");
		Class.forName("First");
		System.out.println("stmt3");
		DriverManager.getConnection("");
		System.out.println("stmt4");
		System.out.println("stmt5");
		Socket socket=new Socket("www.naver.com",80);
		InputStream in=socket.getInputStream();
		System.out.println(socket);
		System.out.println("stmt6");
	}
	/*
	public static void main(String[] args) 
			throws  ClassNotFoundException,
					SQLException, 
					UnknownHostException, 
					IOException {
		
		System.out.println("stmt1");
		Class.forName("First");
		System.out.println("stmt2");
		
		System.out.println("stmt3");
		DriverManager.getConnection("");
		System.out.println("stmt4");
		
		System.out.println("stmt5");
		Socket socket=new Socket("www.naver.com",80);
		InputStream in=socket.getInputStream();
		System.out.println(socket);
		System.out.println("stmt6");
	}
	*/

}
