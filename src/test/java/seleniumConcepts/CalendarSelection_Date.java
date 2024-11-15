package seleniumConcepts;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Navigating to southwest web site and selecting depart date as "15" from calendar
public class CalendarSelection_Date {
	
	WebDriver driver;
	String baseUrl = "https://www.southwest.com/";
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
	
  @Test
  public void test() throws InterruptedException {
//clicking on depart calendar field.	  
	  WebElement departDateCalendar= driver.findElement(By.xpath("//div[@class='date-input-group search-form--fields-dates search-form--fields-dates_input']//div[1]//label[1]//div[1]//div[1]//div[1]//div[1]//span[1]//span[1]"));
	  departDateCalendar.click();
	  Thread.sleep(4000);
//selecting the date from calendar
	  
	  WebElement departDate= driver.findElement(By.xpath("//button[@id='calendar-71-2024-11-15']"));
	  departDate.click();
	  	  
	  System.out.println("depart date is: "+departDate.getText());
	  
  }
  
  @AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
