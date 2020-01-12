package web;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


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
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Hello WebServer!!!<h1>");
			out.println("<img src='https://imgnews.pstatic.net/image/215/2020/01/06/A202001060344_1_20200106191705109.jpg?type=w647'/>");
			
			out.println("</body>");
			out.println("</html>");
			out.flush();
			socket.close();
			}
			
		}
}
