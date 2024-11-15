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
//Navigate to url and click on the checkbox with JavaScriptExecutor
public class JavaScriptExecutor_Click {

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
//click on bmw checkbox 
		WebElement checkBoxElement=driver.findElement(By.id("bmwcheck"));
		js.executeScript("arguments[0].click();", checkBoxElement);
		
	
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
