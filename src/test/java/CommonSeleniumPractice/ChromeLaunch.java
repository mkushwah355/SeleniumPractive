package CommonSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mayan\\workspace\\libs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			String s1= driver.getTitle();
			System.out.println("page title is: "  + s1);
			driver.findElement(By.xpath("//*[@class='FPdoLc lJ9FBc']//center/input[1]")).submit();
			driver.close();
			
		

	}

}
