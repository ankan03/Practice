package servletApplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {

//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		
//		//Receiving data sending by RequestDispatcher
////		int k = (int)request.getAttribute("k");
////		k=k*k;
////		PrintWriter out = response.getWriter();
////		out.println("Result :"+k);
//	}




public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
	
	//Receiving data sending by Redirect
//	int k = Integer.parseInt(request.getParameter("k"));
//	k=k*k;
//	PrintWriter out = response.getWriter();
//	out.println("Result :"+k);
	
	
	
	
	//Receiving data sending by HttpSession
//	HttpSession httpSession = request.getSession();
//	int k = (int)httpSession.getAttribute("k");
//	k=k*k;
//	PrintWriter out = response.getWriter();
//	out.println("Result :"+k);	
//	
//	}
	
	
	
	//Receiving data sending by Cookies
		Cookie cookie[] = request.getCookies();
		int k=0;
		for (Cookie cookie2 : cookie) {
			if(cookie2.getName().equals("k"))
				k = Integer.parseInt(cookie2.getValue());
		}
		k=k*k;
		PrintWriter out = response.getWriter();
		out.println("Result :"+k);	
		
		}

}

