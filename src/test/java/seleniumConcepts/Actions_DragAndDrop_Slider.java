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

//Navigate to "https://jqueryui.com/droppable/" web page and perform slider operation.
public class Actions_DragAndDrop_Slider {

	WebDriver driver;
	String baseUrl = "https://jqueryui.com/slider/";
	
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
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //this will also work
		Thread.sleep(3000);
		
//Actions class drag & drop method		
		WebElement element = driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions actionsClass = new Actions(driver);
		
//Dragging the slider horizontally in specified position.		
		actionsClass.dragAndDropBy(element, 100, 0).perform();
		

}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
