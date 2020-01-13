package web;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class WebServerMain {

	public static void main(String[] args) throws Exception{
		
		ServerSocket serverSocket=new ServerSocket(80);
		System.out.println("1.WebServer 80포트열고 클라이언트 요청처리대기");
		while (true) {
			Socket socket = serverSocket.accept();
			System.out.println(socket.getInetAddress().getHostAddress());
			PrintWriter out=
					new PrintWriter(
							new OutputStreamWriter(
									socket.getOutputStream()));
			
			System.out.println("2.WebServer 클라이언트에 html전송");
			int no = (int) ((Math.random()*3)+1);
			switch (no) {
			case 1:
				WelcomeServlet welcomeServlet = new WelcomeServlet();
				welcomeServlet.service(out);
				break;
			case 2:
				AddressListServlet addressListServlet = new AddressListServlet();
				addressListServlet.service(out);
				
				break;
			case 3:
				GuestListServlet guestListServlet=new GuestListServlet();
				guestListServlet.service(out);
				break;	
			} 
			socket.close();
		}
	}
}
