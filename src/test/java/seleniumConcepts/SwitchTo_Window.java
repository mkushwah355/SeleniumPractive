package seleniumConcepts;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Clicking on "Switch Window Example" button and typing "python" on new window text field and closing the window.
//And switching back to parent window.
public class SwitchTo_Window {

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
	public void test() throws InterruptedException {
//Get the current window handle	
		String parentWindow= driver.getWindowHandle();
		System.out.println("Parent window Id: "+ parentWindow);
		
//Find open window button		
		WebElement openWindowButton= driver.findElement(By.xpath("//button[@id='openwindow']"));
		openWindowButton.click();
		
//Get all handles.
//getWindowHandles() returns "Set" of "String" not "WebElement" 		
		Set<String> handles= driver.getWindowHandles();
		
//Switching b/w handles		
		for(String handle:handles) {
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//input[@id='search']")).sendKeys("python");
				Thread.sleep(3000);
				driver.close();
				break;
			}
		}
//Switching back to parent window		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//div[@id='alert-example-div']//input[@id='name']")).sendKeys("test");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
