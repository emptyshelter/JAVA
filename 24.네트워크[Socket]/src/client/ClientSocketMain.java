package client;

import java.net.Socket;

public class ClientSocketMain {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.56.1",3333);
		System.out.println("ClientSocketMain-->socket:"+socket);
	}

}
