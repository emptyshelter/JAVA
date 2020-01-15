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
@WebServlet("/post_login.do")
public class PostLoginServlet extends HttpServlet {
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
	 * 1.service :GET or POST��û�� ��ν��� 
	 * 2.doGet   :GET  ��û�����ؼ������� 
	 * 2.doPost  :POST ��û�����ؼ������� 
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("05-02.login_post.html");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
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
			response.sendRedirect("05-02.login_post.html");
			return;
		}
		/*
		 * 2.��������(DB)
		 *  id |pass
		 *  ---------
		 *  xxx|1111
		 *  yyy|2222
		 */
		boolean isMember1 = 
				id.equals("xxx")&& pass.equals("1111");
		boolean isMember2 = 
				id.equals("yyy")&& pass.equals("2222");
		
		/*
		 * 3.Ŭ���̾�Ʈ�� �������
		 */
		out.println("<h1>POST�α��ΰ��</h1><hr/>");
		if(isMember1 || isMember2) {
			//�α��μ���
			out.println("<h3>"+id+"�� �α��μ���</h3><hr>");
			out.println("<a href='05-00.search_form.html'>��������</a>");
		}else {
			//�α��ν���
			out.println("<h3>"+id+"�� �α��ν���</h3><hr>");
			out.println("<a href='05-02.login_post.html'>�ٽ÷α���</a>");
		}
		
	}

}













