package project1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project1.user;
import project1.iImpl.adminloginImpl;


@WebServlet("/adminloginservlet")
public class adminloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public adminloginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    user us=new user();
	adminloginImpl se=new adminloginImpl();

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		boolean res=se.login(request.getParameter("email"), request.getParameter("pass"));
		if(se.isValid)
		{

			out.println("Admin Logged IN !!!!!!!");
			
		}
		else
		{
			out.println("Admin Details not found in database  !!!!");
		}
}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
