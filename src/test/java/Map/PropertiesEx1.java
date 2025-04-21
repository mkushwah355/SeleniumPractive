package Map;
import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class PropertiesEx1 {
	public static void main (String []arg) throws Exception {
		
		Properties p= new Properties();
		FileInputStream fis= new FileInputStream("config.properties");
		p.load(fis); //it will load whatever available in config.properties file
		System.out.println(p); 
		
		String s= p.getProperty("name");
		System.out.println(s);// tom
		
		p.setProperty("name", "sam");
		FileOutputStream fos= new FileOutputStream("config.properties");
		p.store(fos, "updated by Mayank");
		
		// for DB connection
		/*		String url = p.getProperty("url");
				String user= p.getProperty("user");
				String pwd=p.getProperty("pwd");
				Connection con = DriverManager.getConnection(url,user,pwd);*/
}}
