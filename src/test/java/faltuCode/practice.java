package faltuCode;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;

class practice {

	public static void main(String[] arg) throws SQLException {
		
		
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qa_db","root","root");
		 
		 Statement stm= con.createStatement();
		 ResultSet rs= stm.executeQuery("SELECT * FROM qa_db.credentials where scenario='letscodeit'");
		 
		while(rs.next()) {
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.letskodeit.com/login");
			driver.findElement(By.xpath("//form[@name='loginform']//input[@id='email']")).sendKeys(rs.getString("username"));
			driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys(rs.getString("password"));
			driver.findElement(By.xpath("//button[@id='login']")).click();
			//System.out.println(rs.getString("username"));
			//System.out.println(rs.getString("password"));
		}
		 
	
	}
}
