package jdbcFirstEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class Validation 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your uname");
		String uname=sc.next();
		System.out.println("Enter your password");
		String password=sc.next();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","JJeevitha","Ravi");
		
		PreparedStatement ps=conn.prepareStatement("select * from gmail where uname=? and password=?");
		ps.setString(1, uname);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Please enter valid Uname and Password");
			System.out.println();
			System.out.println("Register here");
			System.out.println("Enter your username");
			String uname1=sc.next();
			System.out.println("Enter your password");
			String pass1=sc.next();
			
			
			PreparedStatement ps1=conn.prepareStatement("insert into gmail values(?,?)");
			ps1.setString(1, uname1);
			ps1.setString(2, pass1);
			
			int a=ps1.executeUpdate();
			if(a>0)
			{
				System.out.println("Login successful");
			}
		}
		
		sc.close();
		conn.close();
		
	}

}
