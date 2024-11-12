package seleniumConcepts;

//Getting the attribute name of "Open tab" button of web page.
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Method2_getAttribute {

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
		WebElement openTabButton= driver.findElement(By.id("opentab"));
		System.out.println("Value of attribute is: "+openTabButton.getAttribute("class"));
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
