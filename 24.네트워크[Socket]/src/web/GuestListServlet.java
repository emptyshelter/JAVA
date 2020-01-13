package web;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class GuestListServlet {
	public void service(PrintWriter out) throws Exception{
		FileInputStream fis = 
				new FileInputStream("C:\\JAVA_SPRING\\workspaceEE\\24.네트워크[Socket]\\src\\web\\guest_list.html");
		InputStreamReader isr = new InputStreamReader(fis);
		while (true) {
			int readChar = isr.read();
			if(readChar== -1)break;
			out.print((char)readChar);
		}
		out.flush();
		
	}

}
