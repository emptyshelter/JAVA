package client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketInfoMain {

	public static void main(String[] args) throws Exception {
		Socket socket1 = new Socket("192.168.15.31",80);
		System.out.println(socket1);
		InetAddress remoteAddress = socket1.getInetAddress();
		int remotePort = socket1.getPort();
		InetAddress localAddress = socket1.getLocalAddress();
		int locarPort = socket1.getLocalPort();
		System.out.println("remote ip:"+remoteAddress.getHostAddress());
		System.out.println("remote port:"+remotePort);
		System.out.println("local ip:"+localAddress.getHostAddress());
		System.out.println("local port:"+locarPort);
		
		
		Socket socket2 = new Socket("www.naver.com",80);
		System.out.println(socket2);
		System.out.println("remote ip:"+socket2.getInetAddress().getHostAddress());
		System.out.println("remote port:"+socket2.getPort());
		System.out.println("local ip:"+socket2.getLocalAddress().getHostAddress());
		System.out.println("local port:"+socket2.getLocalPort());

	}

}
