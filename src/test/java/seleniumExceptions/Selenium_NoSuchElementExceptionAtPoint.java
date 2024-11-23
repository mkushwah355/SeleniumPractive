package seleniumExceptions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//Scenarios, when we see "NoSuchElementException"
public class Selenium_NoSuchElementExceptionAtPoint {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com";
	JavascriptExecutor js;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
}

	@Test
	public void test() throws InterruptedException {
		
// 1. Timing Issues//As of now its not throwing any error with Lets kode it practice page
				driver.findElement(By.xpath("//a[@href='/login']")).click();
				/*WebElement emailField= driver.findElement(By.id("email"));
				emailField.sendKeys("test@email.com");*/
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
				WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
				emailField.sendKeys("testing");
				Thread.sleep(3000);
// 2. Incorrect locator or type of locator////As of now its not throwing any error with Lets kode it practice page
				driver.findElement(By.xpath("//a[@href='/login']")).click(); 	
				
		// 3. Element is in iFrame
//Below commented code throw "Element not intractable" exception bcs we are not scrolling the page. 
			/*	driver.get("https://www.letskodeit.com/practice");
				Thread.sleep(3000);
				driver.switchTo().frame("courses-iframe");
				WebElement iframeSearchBox = driver.findElement(By.xpath("//input[@id='search']"));
				iframeSearchBox.sendKeys("Java");
				driver.switchTo().defaultContent();	*/	

				js=(JavascriptExecutor)driver;
				driver.get("https://www.letskodeit.com/practice");
				js.executeScript("window.scrollBy(0,900);");
				Thread.sleep(3000);
				driver.switchTo().frame("courses-iframe");
				WebElement iframeSearchBox = driver.findElement(By.xpath("//input[@id='search']"));
				iframeSearchBox.sendKeys("Java");
				driver.switchTo().defaultContent();		
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
