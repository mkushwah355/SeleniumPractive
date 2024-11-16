package seleniumConcepts;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Navigate to lets kode practice page then press Control+A to select the entire page 
public class Keyboard_Chord_Command {

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
		//driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		//driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		//Thread.sleep(2000);
		String selectAll = Keys.chord(Keys.CONTROL, "a");
		driver.findElement(By.id("openwindow")).sendKeys(selectAll);
		Thread.sleep(4000);
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
