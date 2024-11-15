package seleniumConcepts;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Storing the list of elements of tab and print name of each tab after iterating them.
public class FindElements_List_Tab {

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
			WebElement iframe= driver.findElement(By.className("demo-frame"));
			driver.switchTo().frame(iframe);
			
			WebElement tabList= driver.findElement(By.xpath("//div[@id='tabs']"));
			
			List<WebElement> liTagList= tabList.findElements(By.tagName("li"));
//List<WebElement> list= findElements(By.xpath("div[@id='tabs']//ul/li"));	//this will also work
			for(WebElement list:liTagList) {
				list.click();
				Thread.sleep(2000);
			
				System.out.println("Name of each tab: "+list.getText());
			}		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
