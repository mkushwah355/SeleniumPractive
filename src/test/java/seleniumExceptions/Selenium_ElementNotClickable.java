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

public class Selenium_ElementNotClickable {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com";
	JavascriptExecutor js;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
}

	@Test
	public void test() throws InterruptedException {
//This code is not working now as there is not webpage where we can replicate this exception.
		
		// Element is loaded in DOM, but it is overlapped by another element.	
		// Element is not visible because of another element
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("testing");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
		//It will wait until other element goes away
		boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		if (invisible) {
			WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
			loginButton.click();
		}
		//We are forcefully clicking the login button through JavaScriptExecutor
		//bcs the exception is coming on clicking the element but not in finding the element.
		WebElement loginButtonJS = driver.findElement(By.xpath("//input[@value='Login']"));
		js.executeScript("arguments[0].click();", loginButtonJS);
		
		
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
