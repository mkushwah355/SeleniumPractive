package seleniumConcepts;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Navigating to the url and providing the window authentication through AutoIT.

public class AutoIT_WindowPopUp_WindowAuthentication_WithAutoIT {

	WebDriver driver;
	String baseUrl= "https://the-internet.herokuapp.com/basic_auth";
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
}

	@Test
	public void test() throws InterruptedException, IOException {	
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\git projects\\SeleniumPractive\\src\\test\\resources\\WindowAuth_AutoIT_Basic_Auth.exe");
		Thread.sleep(5000);
		driver.get(baseUrl);
		Thread.sleep(3000);
		
				
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
