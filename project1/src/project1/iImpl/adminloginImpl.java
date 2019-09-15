package project1.iImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import project1.user;
import project1.interfaces.iadminlogin;

public class adminloginImpl extends user implements iadminlogin {
	Connection con=null;
	PreparedStatement pre=null;
	public boolean isValid=false;
	
	user us=new user();
	public adminloginImpl()  {
		
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
	
	public boolean login(String name, String password)
	{
		try {
			Statement st=con.createStatement();
			isValid=false;
			System.out.println("entered admin login method !!!!");
			String query="select * from admin where email='"+name+"'and password='"+password+"'";
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

	@Override
	public boolean adminlogin(String name, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	}