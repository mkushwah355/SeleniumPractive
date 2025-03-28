package seleniumJavaConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","E:\\Automation\\selenium-java-4.18.1\\ChromeDriver 128\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String s1= driver.getTitle();
			System.out.println("page title is: "  + s1);
			driver.findElement(By.xpath("//*[@class='FPdoLc lJ9FBc']//center/input[1]")).submit();
			driver.close();
			
		

	}

}
