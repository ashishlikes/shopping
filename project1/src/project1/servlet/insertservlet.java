package project1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project1.insert;
import project1.user;
import project1.iImpl.ServiceImpl;
import project1.iImpl.insertImpl;

/**
 * Servlet implementation class insertservlet
 */
@WebServlet("/insertservlet")
public class insertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public insertservlet() {
        
    }
    
    insert i=new insert();
	insertImpl se=new insertImpl();

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside servlet");
		response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			i.setBrand(request.getParameter("brand"));
			i.setName(request.getParameter("name"));
			i.setDescription(request.getParameter("size"));
			i.setSize(request.getParameter("prize"));
//			us.setGender(request.getParameter("gender"));
			
			se.insert(i.getBrand(), i.getName(), i.getDescription(), i.getSize());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
