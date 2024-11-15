package seleniumConcepts;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Find number of iframes and links on webpage
public class SwitchTo_iFrame_FindNoOfFrames {

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
		
//Find no. of iframes available on web page.		
//int iframes= driver.findElements(By.tagName("iframe")).size(); //this will also work
		List<WebElement> iframes= driver.findElements(By.tagName("iframe"));
			
		int noOfIframes=iframes.size();			
		System.out.println("No.of iframes avaiable on webpage: "+noOfIframes);
		
//Find no. of iframes available on web page.
		List<WebElement> links= driver.findElements(By.tagName("a"));
		int noOfLinks=links.size();
		System.out.println("No.of links avaiable on webpage: "+noOfLinks);					
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
