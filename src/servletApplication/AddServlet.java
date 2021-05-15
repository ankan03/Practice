package servletApplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.security.SecurityConfig;

public class AddServlet extends HttpServlet {
//	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		int n1 = Integer.parseInt(request.getParameter("num1"));
//		int n2 = Integer.parseInt(request.getParameter("num2"));
//		int k = n1+n2;
//		System.out.println("Result: "+k);
//		
//		PrintWriter out = response.getWriter();
//		out.println("Result: "+k);
//	}
	
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		int n1 = Integer.parseInt(request.getParameter("num1"));
//		int n2 = Integer.parseInt(request.getParameter("num2"));
//		int k = n1+n2;
//		System.out.println("Result: "+k);
//		
//		PrintWriter out = response.getWriter();
//		out.println("Result: "+k);
//	}
	
//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		int n1 = Integer.parseInt(request.getParameter("num1"));
//		int n2 = Integer.parseInt(request.getParameter("num2"));
//		int k = n1+n2;
//		System.out.println("Result: "+k);
//		
//		//For showing output on the page
////		PrintWriter out = response.getWriter();
////		out.println("Result: "+k);
//		
//		
//		
//		
//		
//		
//		
//		//Sending request from one Servlet to another using RequestDispatcher
////		request.setAttribute("k", k);
////		RequestDispatcher requestDispatcher = request.getRequestDispatcher("sq");
////		requestDispatcher.forward(request, response);
//		
//		
//		
//		
//		
//		
//		
//		
//	
//		//Sending request from one Servlet to another using Redirect
////		response.sendRedirect("sq?k="+k);
//		
//		
//		
//		
//		
//		
//		
////		Sending request from one Servlet to another using HttpSession
////		HttpSession httpSession = request.getSession();
////		httpSession.setAttribute("k", k);
////		response.sendRedirect("sq");
//		
//		
//		
//		
//		
//		
//		
////		Sending request from one Servlet to another using Cookie
//		Cookie cookie = new Cookie("k", k+"");
//		response.addCookie(cookie);
//		response.sendRedirect("sq");
//	}

	
	
	
	
//	ServletConfig and ServletContext
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	//ServletContext(It is used for the values which will be same for each Servlet)
//	ServletContext servletContext = getServletContext();
////	String str = servletContext.getInitParameter("name");
//	String str = servletContext.getInitParameter("roll");
	
	
	
	//ServletConfig (It is used for the values which will be changed for each Servlet)[Its priority is greater than  ServletContext]
	ServletConfig servletConfig = getServletConfig();
	String str = servletConfig.getInitParameter("name");
	
	PrintWriter out = response.getWriter();
	out.println("Hi: "+str);
}
	
}