import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ExceptionCatchMain {
	public static void main(String[] args) {
		System.out.println("stmt start");
		
		try {
			System.out.println("stmt1");
			Class.forName("First");
			System.out.println("stmt2");
			String str=null;
			str.charAt(0);
			System.out.println("stmt3");
			DriverManager.getConnection("");
			System.out.println("stmt4");
			System.out.println("stmt5");
			Socket socket=new Socket("www.naver.com",80);
			System.out.println("stmt6");
		}catch (ClassNotFoundException e) {
			System.out.println("catch--> ClassNotFoundException msg:"+e.getMessage());
		}catch (SQLException e) {
			System.out.println("catch--> SQLException msg:"+e.getMessage());
		}catch (UnknownHostException e) {
			System.out.println("catch--> UnknownHostException msg:"+e.getMessage());
		}catch (IOException e) {
			System.out.println("catch--> IOException msg:"+e.getMessage());
		}catch (Exception e) {
			System.out.println("catch--> Exception msg:"+e.getMessage());
		}
		System.out.println("-----------------------------------");
		
		try {
			System.out.println("stmt1");
			Class.forName("First2");
			System.out.println("stmt2");
			String str=null;                                            
			str.charAt(0);
			System.out.println("stmt3");
			DriverManager.getConnection("");
			System.out.println("stmt4");
			System.out.println("stmt5");
			Socket socket=new Socket("www.naver.com",80);
			System.out.println("stmt6");
		}catch (Exception e) {
			System.out.println("catch--> Exception msg:"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("stmt end");
	}

}
