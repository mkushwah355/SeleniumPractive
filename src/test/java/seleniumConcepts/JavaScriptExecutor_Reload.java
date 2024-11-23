package seleniumConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Reloading the page using JavaScriptExecutor
public class JavaScriptExecutor_Reload {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	JavascriptExecutor js;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		js=(JavascriptExecutor)driver;
		
}

	@Test
	public void test() throws InterruptedException {
			
			WebElement bmwCheckBox= driver.findElement(By.id("bmwcheck"));
			Thread.sleep(3000);
			bmwCheckBox.click();
//reload page through JavaScripExecutor			
			js.executeScript("location.reload()");
						
			Thread.sleep(3000);
			
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
