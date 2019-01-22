package com.chandu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chandu.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
		
		/*
		String name=request.getParameter("name");
		request.setAttribute("name", name);
		
		RequestDispatcher requestDispatcher= request.getRequestDispatcher("/WEB-INF/views/login.jsp");
		requestDispatcher.forward(request, response);
		*/
		
		/*
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Yahoo!!!!!!!!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("My First Servlet");
		out.println("</body>");
		out.println("</html>");
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		request.setAttribute("name", name);
		
		LoginService service = new LoginService();
		
		String forward = "/WEB-INF/views/welcome.jsp";
		
		if(service.AuthenticateUser(name, password)==false)
		{
			forward ="/WEB-INF/views/login.jsp";
			request.setAttribute("errorMessage", "Failed to login!!");
		}
		
		RequestDispatcher requestDispatcher= request.getRequestDispatcher(forward);
		requestDispatcher.forward(request, response);
		
		
	}

}