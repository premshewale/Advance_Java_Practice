package com.demo.day;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MathOperation
 */
public class MathOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MathOperation() {
      
        // TODO Auto-generated constructor stub
    	
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int num=Integer.parseInt(request.getParameter("num"));
		String button=request.getParameter("btn");
		PrintWriter out=response.getWriter();
		 response.setContentType("text/html");
		if(button.equals("Factorial")){
			out.println("<h2>Factorial is "+factorial(num)+"</h2>");
		}else if(button.equals("Square")){
			out.println("<h2>square is "+square(num)+"</h2>");
		}else if(button.equals("Cube")){
			out.println("<h2>cube is "+cube(num)+"</h2>");
		}else if(button.equals("CheckPrime")){
			int fact=prime(num);
			if(fact==1){
				out.println("<h2>Number is prime </h2>");
			}else{
				out.println("<h2>Number is Not prime </h2>");
			}
		}
	}
	
	private int factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
	}
	private int square(int n){
		int square=n*n;
		return square;
	}private int cube(int n){
		int cube=n*n*n;
		return cube;
	}private int prime(int n){
		int a,flag;
		flag=0;
		a=2;
			
		while(a<n){
			if(n%a==0){
				flag=1;
			}a++;
		}if(flag == 0){
			return 1;
		}else{
			return 0;
		}
			
	}
	
}
