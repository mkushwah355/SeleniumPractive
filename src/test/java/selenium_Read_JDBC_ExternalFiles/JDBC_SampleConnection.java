package selenium_Read_JDBC_ExternalFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; 
import java.sql.ResultSet;


public class JDBC_SampleConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		try {
			
		
		//Step-1: Register the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step-2:Establish connection		
		Connection conn= DriverManager.getConnection(" jdbc:mysql://localhost:3306/sonoo", "username", "password");
		
		//Step-3:Create statement to write a SQL query
		Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select* from Employee");
		
		while (rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		conn.close();
}		
		
		catch(Exception e) {
			System.out.println(e);
}}}
