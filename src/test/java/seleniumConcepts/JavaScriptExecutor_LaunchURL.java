package seleniumConcepts;
import java.awt.Window;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Launch URL and enter the text in field using JavaScript executor
public class JavaScriptExecutor_LaunchURL {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	JavascriptExecutor js;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	@Test
	public void test() throws InterruptedException {
		js= (JavascriptExecutor)driver;
//Navigate to base url		
		//driver.get(baseUrl);
		js.executeScript("window.location='https://www.letskodeit.com/practice';");
		
// driver.get() method waits for the page to load completely before going to the next statement
// Adding Thread.sleep() because we are opening URL using js.executeScript() and it does not wait for the page to load completely
// If we do not add wait, then Selenium WebDriver will immediately try to find the element and it might have issues with just a little slow connection		
// WebElement textBox = driver.findElement(By.id("name"));
		Thread.sleep(3000);
//finding the element		
		WebElement textBox= (WebElement)js.executeScript("return document.getElementById('name');");
		textBox.sendKeys("test");
		
	
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
