package chat.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class OracleConnectMain {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.15.20",1521);
		System.out.println(socket);
		
	}

}
