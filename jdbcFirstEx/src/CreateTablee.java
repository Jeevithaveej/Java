import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTablee 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","JJeevitha","Ravi");
		
		Statement stmt=conn.createStatement();
		
		boolean b=stmt.execute("create table arul(eno number(10),ename varchar2(30))");
		
		conn.close();
		System.out.println("table created"+b);
		
	}


}
