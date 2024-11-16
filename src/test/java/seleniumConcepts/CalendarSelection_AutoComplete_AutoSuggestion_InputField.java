/*package seleniumConcepts;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Navigate to go ibibo web site and enter the partial text in "From" field which shows auto suggestions.
public class CalendarSelection_AutoComplete_AutoSuggestion_InputField {
	
	WebDriver driver;
	String baseUrl = "https://www.goibibo.com/";
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
	
  @Test
  public void test() throws InterruptedException {
	  
	  WebElement alertOfferBanner= driver.findElement(By.xpath("//span[@role='presentation']"));
	  alertOfferBanner.click();
	  
	 int iframe= driver.findElements(By.tagName("iframe")).size();
	 System.out.println("Number of iframes available on page: "+ iframe);
	// driver.switchTo().frame(3);
	  
	  String partialText= "Del";
	  String textToSelect= "";
	  
	  WebElement textField= driver.findElement(By.xpath("//div[@class='sc-12foipm-25 fbAAhv']/input"));
	  textField.sendKeys(partialText);
	  
	  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3000));
	  WebElement textField=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sc-12foipm-25 fbAAhv']/input")));
	  textField.sendKeys(partialText);
	  
	 System.out.println(textField.isEnabled());
	  System.out.println(textField.isDisplayed());
	  
	  WebElement ulElement= driver.findElement(By.id("autoSuggest-list"));
	  
	  List<WebElement> liElement=ulElement.findElements(By.tagName("li"));
	  
	  for(WebElement element:liElement) {
		  System.out.println(element.getText());
	  }	  
  }
  
  @AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
*/