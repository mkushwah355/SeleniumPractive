package seleniumCommonPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeDesiredWindowSize {
	
	public static void main (String []arg) throws Exception{
		
	
		System.setProperty("webdriver.chrome.driver","E:\\\\Automation\\\\selenium-java-4.18.1\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//to maximize the window in full size
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		//to open window in desired size
		Dimension b=new Dimension(300,1020);
		driver.manage().window().setSize(b);
		
		Thread.sleep(6000);
		//to minimize open window
		Point d= new Point(0,3000);
		driver.manage().window().setPosition(d);
		
		Thread.sleep(6000);
		driver.quit();
	}
	

}
