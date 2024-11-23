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
//Navigate to url and insert "python" text in "Auto suggest Example" field with JavaScriptExecutor.
public class JavaScriptExecutor_InsertText {

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
//Insert "python" text in "Auto Suggest Example" input field.
//We can insert text to any input field forcefully with JavaScriptExecutor.
		
		WebElement inputTextField=driver.findElement(By.xpath("//input[@id='autosuggest']"));
		js.executeScript("arguments[0].value='python';", inputTextField);
		Thread.sleep(3000);
			
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
