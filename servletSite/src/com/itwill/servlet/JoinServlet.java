package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.servlet.joindb.Join;
import com.itwill.servlet.joindb.JoinDao;
import com.itwill.servlet.joindb.JoinDaoImpl;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("05-03.form.html");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * hobby=a&hobby&b&hobby=c
		 */
		response.setContentType("text/html;charset=EUC-KR");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String password = request.getParameter("pass");
		String name = request.getParameter("name");
		String[] hobbies=request.getParameterValues("hobby");
		String address = request.getParameter("addr");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		if(id==null|| id.equals("")||password==null || password.equals("")) {
			response.sendRedirect("05-03.form.html");
			return;
		}
		JoinDao join = new JoinDaoImpl();
		try {
			join.insert(new Join(0, id, name, job, address, gender));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>가입정보 확인</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<table border=\"1\" width=\"550px\" height=\"250px\" align=\"center\">");
		out.println("<tr>");
		out.println("<th colspan =\"2\"> 가입정보</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th> 아이디 </th>");
		out.println("<td>"+id+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th> 이름 </th>");
		if (name == null || name.equals("")) {
			out.println("<td>이름이 없다고...?</td>");
		}else {
			out.println("<td>"+name+"</td>");
		}
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th> 주소 </th>");
		if (address == null|| address.equals("")) {
			out.println("<td>집이 없어요...</td>");
		}else {
			out.println("<td>"+address+"</td>");
		}
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th> 성별 </th>");
		out.println("<td>"+gender+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th> 직업 </th>");
		out.println("<td>"+job+"</td>");
		out.println("<tr>");
		out.print("<td style=\"text-align: center\" rowspan=\""+(hobbies.length)+"\">취미</td>");
		out.println("<td>");
		for (int i = 0; i < hobbies.length; i++) {
			out.println(hobbies[i]+"<br>");
		}
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<br/>");
		out.println("<p bgcolor=\"#CCFF33\">");
		out.println("<a href='http://www.naver.com/'><B> 시작하기 <B>&nbsp;&nbsp;&nbsp;&nbsp; </a>");
		out.println("<a href='05-03.form.html'>다시작성하기 </a>");
//		out.println("</center>");
//		out.println("</body>");
		
	}

}
