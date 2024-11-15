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

//Navigate to "https://jqueryui.com/droppable/" web page and perform drag & drop operation.
public class Actions_DragDrop {

	WebDriver driver;
	String baseUrl = "https://jqueryui.com/droppable/";
	JavascriptExecutor js;
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	@Test
	public void test() throws InterruptedException {
		
//Switch to iframe which is present on this page		
		driver.switchTo().frame(0);
		WebElement fromElement= driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement toElement= driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(3000);
		
//Actions class drag & drop method		
		Actions actionsClass= new Actions(driver);
		actionsClass.dragAndDrop(fromElement, toElement).build().perform();
		Thread.sleep(3000);
		
//Manually drag & drop without dragAndDrop() method
		actionsClass.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
		//Thread.sleep(3000);
		
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
