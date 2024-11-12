package seleniumConcepts;


//Getting the text of "Open tab" button of web page.
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Method1_getText {

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
	public void test() {
		WebElement openTabButton= driver.findElement(By.id("name"));
		System.out.println("Text on the element is: "+openTabButton.getText());
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
