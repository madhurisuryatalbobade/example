package dabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class CoonectMySQL {
	
	@Test
	public void testdb() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver loaded!");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","root");
		
		System.out.println("Connected to MYSQL DB");
		
		Statement smt = con.createStatement();
		
		ResultSet rs = smt.executeQuery("select * from website_users;");
				
		while(rs.next())
		{
			String f_name = rs.getString("f_name");
			String l_name = rs.getString("l_name");
			String username = rs.getString("user_name");
			String password = rs.getString("password");
			
			System.out.println(f_name+"\t"+l_name+"\t"+username+"\t"+password);
		}
	}

}
