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
//Navigating to southwest web site and selecting depart date as "22" from all the group of dates.
public class CalendarSelection_DateFromGroupOfDates {
	
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
	  
//First we have to search the class or tag under which all the month dates available.	
	  WebElement departDate= driver.findElement(By.xpath("//*[@id=\"calendar-71\"]/div/div[1]/div[10]"));
	  
//Then search the tag under which all the dates are declared in DOM. 
//“button” is tag name in below scenario. 
//Store all the “button” tag list in “List”.
	  List<WebElement> allValidDate= departDate.findElements(By.tagName("button"));
	  
//Iterate the list after comparing it with desired date.	  
	  Thread.sleep(4000);
	  for(WebElement date:allValidDate) {
		  if(date.getText().equals("22")) {
			 date.click();
			   break;
		  }
	  }
	  	  
	  
  }
  
  @AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
