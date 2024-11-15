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
//Navigate to url and scroll up & down with specified range with JavaScripExecutor
public class JavaScriptExecutor_ScrollUpDown {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	JavascriptExecutor js;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		js=(JavascriptExecutor)driver;
	}

	@Test
	public void test() throws InterruptedException {
		//driver.get(baseUrl);
		js.executeScript("window.location='https://www.letskodeit.com/practice';");
	//Scroll down	
		js.executeScript("window.scrollBy(0,1900);");
		
	//Scroll up	
		js.executeScript("window.scrollBy(0,-1900);");
	
	//Scroll element into view	
		WebElement element= (WebElement)js.executeScript("return document.getElementById('mousehover');");
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-190);");
	
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
