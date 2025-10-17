package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class validate
 */
public class validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher rd;
		if(user.equals("seed") && pass.equals("seed")){
			rd =request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		}else{
			out.println("<h2 style=color:red> Wrong user id or password</h2>");
			rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
			
			
		}
		
		
	}

}
