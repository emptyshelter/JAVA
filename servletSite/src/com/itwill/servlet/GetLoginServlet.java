package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetLoginServlet
 */
@WebServlet("/get_login.do")
public class GetLoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//super.service(request, response);
		if(request.getMethod().equalsIgnoreCase("GET")) {
			this.doGet(request, response);
		}else if(request.getMethod().equalsIgnoreCase("POST")) {
			this.doPost(request, response);
		}
	}
	/*
	 * 1. service  : GET or POST ��û�� ��ν���
	 * 2. doGet	   : GET  ��û�� ���ؼ��� ����
	 * 2. doPost   : POST  ��û�� ���ؼ��� ����
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("��û�޼ҵ�:"+request.getMethod());
		response.setContentType("text/html;charset=EUC-KR");
		PrintWriter out=response.getWriter();
		/*
		 * 1. �Ķ���� �ޱ�
			���̵�:<input type="text" name="id">
			�н�����:<input type="password" name="pass">
		 */
		request.setCharacterEncoding("EUC-KR");
		String id=request.getParameter("id");
		String pass=request.getParameter("pass");
		if(id==null || pass==null || id.equals("")|| pass.equals("")) {
			response.sendRedirect("05-01.login_get.html");
			return;
		}
		/*
		 * 2. �������� 
		 	id | pass
		  -------------
		   xxx | 1111
		   yyy | 2222
		 */
		boolean isMember1 = 
				id.equals("xxx")&&pass.equals("1111");
		boolean isMember2 = 
				id.equals("yyy")&&pass.equals("2222");
		/*
		 * 3. Ŭ���̾�Ʈ�� �������
		 */
		out.println("<h1>GET�α��ΰ��</h1><hr/>");
		if (isMember1 || isMember2) {
			//�α��μ���
			out.println("<h3>"+id+"�� �α��� ����</h3><hr/>");
			out.println("<a href='01.HelloServlet.html'>��������</a>");
		}else {
			//�α��ν���
			out.println("<h3>+"+id+"�� �α��� ����</h3><hr/>");
			out.println("<a href='05-01.login_get.html'>�ٽ÷α���</a>");
			
		}
	}

}
