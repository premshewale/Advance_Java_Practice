package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public First() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("user");
		int n1= Integer.parseInt(request.getParameter("num1"));
		int n2= Integer.parseInt(request.getParameter("num2"));
		int total=n1+n2;
		PrintWriter out =response.getWriter();
		out.println("<h2> Welcome "+user+" on first page </h2>");
		out.println("<h2> Addition : "+total+" on first page </h2>");
		out.println("<form action='Second' method='post'>"
				+"<input type='hidden' name='user1' value="+user+">"
						+ "<input type='hidden' name='sum' value="+total+">"
						+"<input type='submit' value='Go to Second'</form>");
		
		
		
	//	out.println("<h2><a href=Second?user1="+user+"&sum="+total+">Go to Second</a> </h2>");
//		RequestDispatcher rd =request.getRequestDispatcher("Second");
//		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
