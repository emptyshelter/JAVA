package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// #2-1. Ŭ���̾�Ʈ�� ������ ����Ÿ�� Ÿ��(����)����
		response.setContentType("text/html;charset=EUC-KR");
		// #2-2. Ŭ���̾�Ʈ������Ÿ�� �����ϱ����� ��½�Ʈ�� ����
		PrintWriter out=response.getWriter();
		// #2-3. Ŭ���̾�Ʈ�� ����Ÿ(HTML) ����
		for (int i = 0; i < 10; i++) {
			out.println("<h1>Hello Servlet!!!!(�ȳ缭��)"+(i+1)+"</h1><hr>");
		}

	}
}
