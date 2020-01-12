import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketExcetionCatchMain {

	public static void main(String[] args){
		
		System.out.println("stmt1");
		try {
			System.out.println("try1");
			Socket socket = new Socket("asdasddg",88);
			System.out.println("try2");
			
		}catch (UnknownHostException e) {
			System.out.println("UnknownHostException catch1");
			System.out.println("msg:"+e.getMessage());	
			System.out.println("UnknownHostException catch2");
		}catch (IOException e) {
			System.out.println("IOException catch1");
			System.out.println("msg:"+e.getMessage());	
			System.out.println("IOException catch2");
		}
		
		System.out.println("stmt2");
		
	}

}
