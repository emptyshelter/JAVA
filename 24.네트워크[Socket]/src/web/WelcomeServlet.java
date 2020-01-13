package web;

import java.io.PrintWriter;

public class WelcomeServlet {
	public void service(PrintWriter out) {
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello WebServer!!!<h1>");
		out.println("<img src='https://imgnews.pstatic.net/image/215/2020/01/06/A202001060344_1_20200106191705109.jpg?type=w647'/>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}

}
