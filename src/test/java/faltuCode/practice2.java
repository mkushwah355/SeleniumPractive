package faltuCode;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Clicking on "Switch Window Example" button and typing "python" on new window text field and closing the window.
//And switching back to parent window.
public class practice2 {

	WebDriver driver;
	String baseUrl = "https://rahulshettyacademy.com/AutomationPractice/";

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	@Test
	public void test() throws InterruptedException {
			
		String title=driver.getTitle();
		System.out.println(title);
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		
	}

}
