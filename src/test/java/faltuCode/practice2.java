package faltuCode;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Clicking on "Switch Window Example" button and typing "python" on new window text field and closing the window.
//And switching back to parent window.
public class practice2 {

	WebDriver driver;
	String baseUrl = "https://jqueryui.com/tabs/";

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	@Test
	public void test() throws InterruptedException {
			
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

	        // Wait for the tabs to be visible
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabs")));

	        // Iterate through the tabs
	        for (int i = 1; i <= 3; i++) {
	            // Click on each tab using its index
	            WebElement tab = driver.findElement(By.xpath("//a[@href='#tabs-" + i + "']"));
	            tab.click();

	            // Wait for the tab content to be visible
	            WebElement tabContent = driver.findElement(By.id("tabs-" + i));
	            wait.until(ExpectedConditions.visibilityOf(tabContent));

	            // Print the content of the current tab
	            System.out.println("Content of Tab " + i + ": " + tabContent.getText());
	        }
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
