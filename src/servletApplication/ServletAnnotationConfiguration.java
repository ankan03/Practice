package servletApplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/add")
public class ServletAnnotationConfiguration extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		int k = n1+n2;
		System.out.println("Result: "+k);
		
		//For showing output on the page
		PrintWriter out = response.getWriter();
		out.println("Result: "+k);
		
	}
}
