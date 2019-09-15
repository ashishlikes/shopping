package project1.iImpl;

import project1.user;
import project1.interfaces.iService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServiceImpl extends user implements iService {
	Connection con=null;
	PreparedStatement pre=null;
	public boolean isValid=false;
	
	user us=new user();
	public ServiceImpl()  {
		
		System.out.println("inside const");
		try {
			
			Class.forName("org.h2.Driver");
			System.out.println("creating connection");
			con=DriverManager.getConnection("jdbc:h2:~/test","sa","");
			System.out.println("connection created successfully");
			
	  }
		catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
public void register(String firstn, String lastn, String email, String password) {
	System.out.println("inside register method");
	try {
		System.out.println(firstn+" "+lastn+" "+email+" "+password);
		pre=con.prepareStatement("Insert into USER values(?,?,?,?)");
	pre.setString(1, firstn);
	pre.setString(2, lastn);
	pre.setString(3, email);
	pre.setString(4, password);
	//st.setString(5, gender);
	
	int res=pre.executeUpdate();
	 if(res!=0)
	 {
		 System.out.println(""+res+" added successfully");
	 }
	 else
	 {
		 System.out.println("no row added");
	 }
	}    catch  (SQLException e)  {
		e.printStackTrace();
	}
	
	
}
public boolean login(String name, String password)
{
	try {
		Statement st=con.createStatement();
		isValid=false;
		System.out.println("entered login method !!!!");
		String query="select * from user where email='"+name+"'and password='"+password+"'";
		ResultSet res=st.executeQuery(query);
		System.out.println(query);
		
	
		
		if(res.next())
		{
			String s1=res.getString(1);
			String s2=res.getString(2);
			isValid=true;
			System.out.print(s1+s2);
		
		}  } catch (SQLException e) {
			e.printStackTrace();
		}
	return isValid;
}

}
