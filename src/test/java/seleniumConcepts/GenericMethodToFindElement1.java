package seleniumConcepts;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//using the generic method "getElement()" to find element.
public class GenericMethodToFindElement1 {
	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	GenericMethodToFindElement2 GM;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get(baseUrl);
		GM=new GenericMethodToFindElement2(driver);
	}

	@Test
	public void testMethod() {
		WebElement element = GM.getElement("name", "id");   //generic method to find elements
		element.sendKeys("test");

	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
