package seleniumConcepts;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Navigating to the url and clicking on "Basic auth" link.
//Providing the window authentication through selenium get(url) method.

public class AutoIT_WindowPopUp_WindowAuthentication_WithSelenium {

	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
}

	@Test
	public void test() throws InterruptedException, IOException {	
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a")).click();
				
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
