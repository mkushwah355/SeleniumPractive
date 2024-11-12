package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//using generic method "isElementPresent()" to find the presence of element on web page.
public class GenericMethodToFindElementPresentOrNot1 {
	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	GenericMethodToFindElementPresentOrNot2 GM;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get(baseUrl);
		GM=new GenericMethodToFindElementPresentOrNot2(driver);
	}

	@Test
	public void testMethod() {
		
		boolean result1 = GM.isElementPresent("name", "id");
		System.out.println("Is Element Present: " + result1);
		
		boolean result2 = GM.isElementPresent("name-not-present", "id");
		System.out.println("Is Element Present: " + result2);

	}
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
