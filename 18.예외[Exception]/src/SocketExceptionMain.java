import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketExceptionMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("stmt1");
		Socket socket=new Socket("www.naver.com",80);
		InputStream in=socket.getInputStream();
		int readChar = in.read();
		System.out.println((char)readChar);
		System.out.println("stmt2");
	}

}
