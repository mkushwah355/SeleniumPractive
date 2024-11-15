package seleniumConcepts;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Navigate to url and finding the height and width of web page through JavaScript.

public class JavaScriptExecutor_FindHeightWidthOfWindow {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	JavascriptExecutor js;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		js= (JavascriptExecutor)driver;
	}
	@Test
	public void test() throws InterruptedException {
		//driver.get(baseUrl);
		js.executeScript("window.locate='https://www.letskodeit.com/practice';");
		
		long height= (long)js.executeScript("return window.innerHeight");
		long width= (long)js.executeScript("return window.innerWidth");
		
		System.out.println("Height of window: "+height);
		System.out.println("Width of window: "+width);
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
