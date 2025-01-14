package seleniumConcepts;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Launch URL and find the element then enter the text in field using JavaScript executor
public class JavaScriptExecutor_Xpath_ID {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	JavascriptExecutor js;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	@Test
	public void test() throws InterruptedException {
		js= (JavascriptExecutor)driver;
//Navigate to base url		
		js.executeScript("window.location='https://www.letskodeit.com/practice';");
//finding the element with xpath & id using javaScript Executor.
		
//xpath= //input[@id='name']/preceding::legend[contains(text(),'Switch To')]/following::input[1]

		//with xpath
		WebElement textBox = (WebElement)
				js.executeScript("return document.evaluate(\"//input[@id='name']/preceding::legend[contains(text(),'Switch To')]/following::input[1]\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
		//with id
		//WebElement textBox= (WebElement)js.executeScript("return document.getElementById('name');");
		
		textBox.sendKeys("test");
		
	
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
