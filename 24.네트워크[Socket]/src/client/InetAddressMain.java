package client;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

	public static void main(String[] args) throws Exception {
		System.out.println("----local address---");
		InetAddress localIP = InetAddress.getLocalHost();
		System.out.println("local host name:"+localIP.getHostName());
		System.out.println("local host name:"+localIP.getHostAddress());
		InetAddress remoteIP = InetAddress.getByName("www.naver.com");
		System.out.println("remote host name:"+remoteIP.getHostName());
		System.out.println("remote host name:"+remoteIP.getHostAddress());
		InetAddress[] remoteIPs = InetAddress.getAllByName("www.google.com");
		for (InetAddress inetAddress : remoteIPs) {
			System.out.println(inetAddress);
		}
	

	}

}
