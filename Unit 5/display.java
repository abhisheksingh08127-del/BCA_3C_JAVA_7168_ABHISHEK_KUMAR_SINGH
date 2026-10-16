import java.sql.*;


class display
{
	public static void main(String srgs[])
	{	
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
			Statement stmt=cn.createStatement();
			ResultSet rs=stmt.executeQuery("Select * From stud");
			while(rs.next())
			{
				System.out.println(rs.getInt("GRNo")+" " +rs.getString("Name"));
			}
			cn.close();
		}

        	
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}
			
				
				
				
			