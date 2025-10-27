package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.bean.LoginBean;
import com.demo.service.ChangePasswordService;
import com.demo.service.ChangePasswordServiceImpl;
import com.demo.service.RegistrationService;
import com.demo.service.RegistrationServiceImpl;

/**
 * Servlet implementation class ChangePassword1
 */
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String newpass = request.getParameter("newpass");
        RequestDispatcher rd;
        System.out.println("in value 1 "+newpass+user+pass);
        ChangePasswordService passwordService = new ChangePasswordServiceImpl();
        LoginBean loginBean = passwordService.updatePassword(user, pass, newpass);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (loginBean != null) {
            // Password changed successfully
        	   
           rd= request.getRequestDispatcher("passwordWasChange");
            rd.forward(request, response);
        } else {
            System.out.println("Failed to change password");
            String user1 = request.getParameter("user");
    		
    		PrintWriter out1= response.getWriter();
    		response.setContentType("text/html");
    		out1.println("<h2>Please Provide correct old Password "+user1+"</h2>");
            }
    }
}


