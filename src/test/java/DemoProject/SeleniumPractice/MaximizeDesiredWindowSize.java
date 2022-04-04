package DemoProject.SeleniumPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeDesiredWindowSize {
	
	public static void main (String []arg) throws Exception{
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mayan\\workspace\\libs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		Dimension b=new Dimension(300,1020);
		driver.manage().window().setSize(b);
		
		Thread.sleep(6000);
		
		Point d= new Point(0,3000);
		driver.manage().window().setPosition(d);
		
		Thread.sleep(6000);
		driver.quit();
	}
	

}
