package project1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project1.iImpl.updatedelete;
import project1.user;

/**
 * Servlet implementation class updatedeleteservlet
 */
@WebServlet("/updatedeleteservlet")
public class updatedeleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatedeleteservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    user us=new user();
	updatedelete ud=new updatedelete();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		boolean res=ud.delete(request.getParameter("email"));
		if(res)
		{

			out.println("Record deleted !!!");
			
		}
		else
		{
			out.println("Not deleted !!!");
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
//			us.setGender(request.getParameter("gender"));
			
			ud.update(us.getFirstname(), us.getLastname(), us.getPassword(), us.getEmail());
		
		
	}

}

