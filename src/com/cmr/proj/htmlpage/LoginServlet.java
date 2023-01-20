package com.cmr.proj.htmlpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	   public LoginServlet() {
	        // TODO Auto-generated constructor stub
	    }
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usertype=request.getParameter("usertype");
		String password=request.getParameter("password");
		String username=request.getParameter("username");
		
		
		
		if("Manager".equals(usertype) && username.equals(password)) {
		
			//RequestDispatcher rd= request.getRequestDispatcher("home.html");
			RequestDispatcher rd= request.getRequestDispatcher("Task.html");
			rd.include(request, response);
		}
		else if("Employee".equals(usertype) && username.equals(password)) { 
	
			RequestDispatcher rd= request.getRequestDispatcher("Task.html");
			rd.include(request, response);
		}else {
			PrintWriter pw=response.getWriter();
			pw.println("<h1>Invalid username or password</h1>");
		}
	
	}

	}

