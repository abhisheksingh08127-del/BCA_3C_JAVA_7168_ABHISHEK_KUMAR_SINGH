import java.sql.*;
import java.util.*;

class insert
{
	public static void main(String srgs[])
	{	
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
			Statement stmt=cn.createStatement();
			Scanner sc=new Scanner(System.in);
			int GRNo=0;
			String Name="";
			System.out.println("Enter GRNo.");
			GRNo=sc.nextInt();
			System.out.println("Enter Name.");
			Name=sc.next();
			
			try
			{
				int x=stmt.executeUpdate("insert into stud values("+GRNo+",'"+Name+"')");
				System.out.println("No. of rows inserted:"+x);
			}
			catch(Exception e)
			{
				System.out.println("Exception:"+e);
			}
			cn.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
				
				
				
			