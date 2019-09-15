package project1.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import project1.iImpl.ServiceImpl;
import project1.user;


public class userservlet extends HttpServlet  {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public userservlet()   {
		
	}
	user us=new user();
	ServiceImpl se=new ServiceImpl();
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		boolean res=se.login(request.getParameter("email"), request.getParameter("pass"));
		if(se.isValid)
		{

			out.println("Logged IN !!!!!!!");
			
		}
		else
		{
			out.println("Invalid credentials  !!!!");
		}
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Inside servlet");
	response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		us.setEmail(request.getParameter("email"));
		us.setPassword(request.getParameter("pass"));
		us.setFirstname(request.getParameter("firstname"));
		us.setLastname(request.getParameter("lastname"));
//		us.setGender(request.getParameter("gender"));
		
		se.register(us.getFirstname(), us.getLastname(), us.getEmail(), us.getPassword());
}
}
