package seleniumExceptions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//ElementNotInteractableException
public class Selenium_ElementNotInteractableException {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

	@Test
	public void test1LetsKodePracticePage() throws InterruptedException {
		//driver.get("https://www.letskodeit.com/login");
//Find the email field on page but take the xpath of "Form" tag and try to click on it.
//Click is allowed on element like we do normal click on webpage.		
		//driver.findElement(By.xpath("//form[@name='loginform']")).click();
//As "Form" tag is not taking any input action and will throw an exception saying "ElementNotInteractableException"
		//driver.findElement(By.xpath("//form[@name='loginform']")).sendKeys("abc");
//Now, try to enter the "abc" text in another element which is not taking input. It will throw "ElementNotInteractableException".	
		//driver.findElement(By.xpath("//h4[@class='dynamic-heading']")).sendKeys("abc");
//Now open the lets kode it courses page and find the locator of "search" field.	
		//driver.get("https://www.letskodeit.com/courses");
//Locator with id throw an "ElementNotInteractableException" bcs same id given to the "<form action id='search'>" tag. 		
		//driver.findElement(By.id("search")).sendKeys("Test");
//In this case, we need to use explicit locator i.e. xpath.
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Test");
		//Thread.sleep(3000);
		
	}

		@Test
		public void test2ExpediaPage() throws InterruptedException {
//Below commented code will go and insert the "SFO" location in "Leaving from" field of "Expedia" website.	
//But it will throw "ElementNotInteractableException" exception bcs "Leaving from" is hidden in DOM.
/*driver.get("https://www.expedia.com/");
driver.findElement(By.xpath("//span[text()='Flights']")).click();
driver.findElement(By.xpath("//label[text()='Leaving from']//following-sibling::input[@class='uitk-field-input is-hidden empty-placeholder']")).sendKeys("SFO");
*/
//Now, first click on "Leaving from" field and then find the locator an then enter the "SFO" text.			
		driver.get("https://www.expedia.com/");
		driver.findElement(By.xpath("//span[text()='Flights']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Leaving from']")).click();
		driver.findElement(
		By.xpath("//div[@class='uitk-field has-no-visible-label has-placeholder']//input[@aria-label='Leaving from']")).sendKeys("SFO");
	
		}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
