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
public class SwitchTo_Window_FindOpenWindowGetTitle {

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
			
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		Set<String> openWindows= driver.getWindowHandles();		
		System.out.println("No of windows: "+ openWindows.size());
		
		for(String handles: openWindows) {
			driver.switchTo().window(handles);
			String windowTitle= driver.getTitle();
			System.out.println("Title of window: "+windowTitle);
		}
		

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
