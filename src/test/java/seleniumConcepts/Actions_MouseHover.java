package seleniumConcepts;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Navigate to "Lets kode it" practice page and hover mouse and then click on "Top" option from the list.
public class Actions_MouseHover {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	JavascriptExecutor js;
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	@Test
	public void test1() throws InterruptedException {
		js=(JavascriptExecutor)driver;
//find locator of "Mouse hover"		
		WebElement element= driver.findElement(By.id("mousehover"));
		
//Scroll page until element visible		
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(3000);
		
//Actions class moveToElement() method to hover mouse		
		Actions actionsClass= new Actions(driver);
		actionsClass.moveToElement(element).perform();;
		Thread.sleep(3000);
		
//locator of "Top" option from list comes when hover mouse.		
		WebElement subElement= driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
		actionsClass.moveToElement(subElement).click().perform();
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
