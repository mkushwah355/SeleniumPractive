package seleniumConcepts;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Navigate to lets kode practice page then press Control+A to select the entire page through Actions class.
public class Keyboard_ActionsClass_KeysUpDown {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
