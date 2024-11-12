package seleniumConcepts;

//find the list of radio button elements and select one by one after iterating.	

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WorkingWithElementsList {
	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
		
	@BeforeMethod	
	public void setUp() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();	
		driver.get(baseUrl);
	}
	
	@Test
  public void test() throws InterruptedException {
		
		List<WebElement> radioButtonList= driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		boolean isChecked = false;   //isChecked is user defined variable and it is not selenium method.
		for(int i=0;i<radioButtonList.size();i++) {
			isChecked= radioButtonList.get(i).isSelected(); //checking each and every button is selected or not
			
			if(!isChecked) {     //if button is not checked then click one by one
				radioButtonList.get(i).click();
			Thread.sleep(4000);	
			}			
		}		
 }
 

  @AfterMethod
  public void afterMethod() {	  
	  driver.quit();
  }

}
