package seleniumConcepts;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Switch to iframe with name, id or index of frame. Then type "python" in search text box.
//then switch back to parent window(i.e. defaultContent() is method to return to parent window).
public class SwitchTo_iFrame {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	JavascriptExecutor js;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		js = (JavascriptExecutor) driver;
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(3000);
// Switch to frame by Id
			driver.switchTo().frame("courses-iframe");
// Switch to frame by name
			//driver.switchTo().frame("iframe-name");
// Switch to frame by numbers
			//driver.switchTo().frame(0);
		
//finding the search field on iframe and typing "python" in it.		
	WebElement element= driver.findElement(By.xpath("//input[@id='search']"));
				element.sendKeys("python");
				
//Scroll the page until element visible
				js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(3000);
		
//Switching back to parent window and find input field and type "test successful"
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		driver.findElement(By.id("name")).sendKeys("test succesful");		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
