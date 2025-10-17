package com.demo.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddIt extends HttpServlet {
 
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n1= Integer.parseInt(request.getParameter("num1"));
		int n2= Integer.parseInt(request.getParameter("num2"));
		int total=n1+n2;
		System.out.println("total"+total);
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		out.println("<h2>Addition is "+total+"</h2>");
	}
	

}

