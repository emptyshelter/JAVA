package com.itwill.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GugudanServlet
 */
public class GugudanServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=EUC-KR");
		PrintWriter out = response.getWriter();
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				out.print(j+" x "+i+" ="+(i*j)+"\t\t");
			}
			out.println();
		}
	}



}
