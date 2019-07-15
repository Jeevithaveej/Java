package jdbcFirstEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","JJeevitha","Ravi");
		
		Statement stmt=conn.createStatement();
		boolean b=stmt.execute("create table dhiwin(eno number(10),ename varchar2(30))");
		
		int up=stmt.executeUpdate("insert into data values(1,'jee')");
		
		conn.close();
		System.out.println("table created"+b);
		
	}

}
