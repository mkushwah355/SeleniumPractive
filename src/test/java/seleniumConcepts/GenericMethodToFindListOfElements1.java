package seleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//using the generic method "getListOfElement()" to find list of element.
public class GenericMethodToFindListOfElements1 {
	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	GenericMethodToFindListOfElements2 GM;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get(baseUrl);
		GM=new GenericMethodToFindListOfElements2(driver);
	}

	@Test
	public void testMethod() {
		List<WebElement> elementList = GM.getListOfElement("//input[@type='text']", "xpath");   //generic method to find list of elements
		int size = elementList.size();
		System.out.println("Size of the element list is: " + size);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
