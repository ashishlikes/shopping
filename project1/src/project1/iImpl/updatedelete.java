package project1.iImpl;


import project1.user;
import project1.interfaces.iService;
import project1.interfaces.iUpdatedelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updatedelete extends user implements iUpdatedelete {
	Connection con=null;
	PreparedStatement pre=null;
	public boolean isValid=false;
	
	user us=new user();
	public updatedelete()  {
		
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
	

@Override
public boolean delete(String email) {
	try {
		String query="delete from user where email='"+email+"'";
		PreparedStatement st=con.prepareStatement(query);
		isValid=false;
		System.out.println("entered delete method !!!!");
		int res=st.executeUpdate();
		System.out.println(query);
		
	
		
		if(res>0)
		{
	//		String s1=res.getString(1);
	//		String s2=res.getString(2);
			isValid=true;
	//		System.out.print(s1+s2);
		
		}  } catch (SQLException e) {
			e.printStackTrace();
		}
	return isValid;
	
}

@Override
public void update(String firstname, String lastname, String password, String email) {
	// TODO Auto-generated method stub
	System.out.println("inside update method");
	try {
		System.out.println(firstname+" "+lastname+" "+password+" "+email);
		pre=con.prepareStatement("UPDATE User SET firstname = ?, lastname= ?, password= ? WHERE email = ?");
	pre.setString(1, firstname);
	pre.setString(2, lastname);
	
	pre.setString(3, password);
	pre.setString(4, email);
	//st.setString(4, gender);
	
	int res=pre.executeUpdate();
	 if(res>0)
	 {
		 System.out.println(""+res+" updated successfully");
	 }
	 else
	 {
		 System.out.println("no row updated");
	 }
	}    catch  (SQLException e)  {
		e.printStackTrace();
	}
	
}

}