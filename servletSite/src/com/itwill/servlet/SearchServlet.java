package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/search.do")
public class SearchServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = response.getWriter();
		/*
		 * 1. ��û�ÿ� ���۵Ǵ� �Ķ���� �ޱ�
		 * 		- �Ķ���� �̸��� input element�� name�Ӽ��� ��ġ�Ͽ����Ѵ�.
		 * 			<input type="text" name="searchkeyword">
		 * 		- search.do?searchkeyword=java
		 * << GET��� �Ķ��Ÿ �� �ѱ����ڵ� >>
		      A. server.xml LINE 63 --> URIEncoding="EUC-KR" �Ӽ��߰�
		       <Connector connectionTimeout="20000" port="80"
					protocol="HTTP/1.1" redirectPort="8443" 
					URIEncoding="EUC-KR"/>
		      B.��û��ü�� �������ڵ����� 
		 */
		String searchKeyword = request.getParameter("searchkeyword");
		if (searchKeyword == null || searchKeyword.equals("")) {
			response.sendRedirect("05-00.search_form.html");
			return;
		}
		/*
		 * 2. ��������(DB)
		 */
		
		/*
		 * 3. Ŭ���̾�Ʈ�� �������
		 */
		out.println("<h1>"+searchKeyword+"�� �˻� ���</h1><hr>");
		out.println("<ol>");
		for (int i = 0; i < 20; i++) {
			out.println("<li>"+searchKeyword+"�� �˻� ������ </li>");
		}
		out.println("</ol>");
		out.println("<a href='05-00.search_form.html'>�˻��������� ���ư���</a>");
	}

}
