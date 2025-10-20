package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second
 */
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Second() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("user1");
//		int n1= Integer.parseInt(request.getParameter("num1"));
//		int n2= Integer.parseInt(request.getParameter("num2"));
//		int total=n1+n2;
		int sum= Integer.parseInt(request.getParameter("sum"));
		int dbl=sum*2;
		PrintWriter out =response.getWriter();
		out.println("<h2> Welcome "+user+" on Second page </h2>");
		out.println("<h2> Double of Addition : "+dbl+" on Second page </h2>");
//		out.println("<h2> Addition : "+total+" on Second page </h2>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
