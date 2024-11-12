package seleniumConcepts;


import java.awt.Window;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectClass_HiddenElement_javaScriptExecutor {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	JavascriptExecutor js;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get(baseUrl);
	}

	@Test
	public void test() throws InterruptedException {
		WebElement textBox= driver.findElement(By.id("displayed-text"));
		System.out.println("Textbox is displayed: "+ textBox.isDisplayed());
		Thread.sleep(3000);
		
		WebElement hideButton= driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("Clicked on hide button");
		System.out.println("Textbox is displayed: "+ textBox.isDisplayed());
		Thread.sleep(3000);
//to use javaScript methods we need to JavascriptExecutor interface defined by Selenium.
//We need to cast the WebDriver to JavascriptExecutor to use the JavascriptExecutor interface methods.
//We cannot use JavascriptExecutor methods without casting the WebDriver.
		js= (JavascriptExecutor) driver; //casting the WebDriver instance to JavascriptExecutor
		js.executeScript("window.scrollBy(0, 5000);");
		
		WebElement showButton= driver.findElement(By.id("show-textbox"));
		showButton.click();
		System.out.println("Clicked on show button");
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
		
	
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
