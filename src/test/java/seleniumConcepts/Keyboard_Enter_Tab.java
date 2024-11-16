package seleniumConcepts;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Navigate to lets kode practice page 
//then click on "Login" button through keyboard "Enter" button. Same for "Tab" to change the field  
public class Keyboard_Enter_Tab {

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
			driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
			driver.findElement(By.id("email")).sendKeys("test@email.com");
			driver.findElement(By.id("email")).sendKeys(Keys.TAB);
			driver.findElement(By.id("login-password")).sendKeys("abc123");
			Thread.sleep(3000);
			driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
