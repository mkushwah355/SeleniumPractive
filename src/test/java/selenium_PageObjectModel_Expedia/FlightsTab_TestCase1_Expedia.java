package selenium_PageObjectModel_Expedia;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//It is a test case of "Flights" tab of "Expedia" website. 
//Navigating to website and filling the "Leaving from" and "Going to" input fields and clicking on "Search" button and getting the title of page.
//"Flights" tab element reusable methods created in "Flights_ExpediaPage" page class.
//If creating test case in another package then we need to first import the class into the test case like "import seleniumPages.classes.Flights_ExpediaPage;" statement.

public class FlightsTab_TestCase1_Expedia {

	WebDriver driver;
	String baseUrl = "https://www.expedia.co.in/";
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
}

	@Test
	public void test() throws InterruptedException {
		
//Calling the static methods by its class name.
//Clicking on "Flights" tab.	
		FlightsTab_PageClass_Expedia.clickOnFlightTab(driver).click();
//Clicking on "Leaving from" button input field and Fill the "New York" into input field			
		FlightsTab_PageClass_Expedia.clickOnleavingFromButtonBox(driver);		
		FlightsTab_PageClass_Expedia.fillLeavingFromTextBox(driver, "New York");
		
//Clicking on "Going to" button input field and Fill the "Chicago" into input field			
		FlightsTab_PageClass_Expedia.clickGoingToButtonBox(driver);
		FlightsTab_PageClass_Expedia.fillGoingToTextBox(driver, "Chicago");
		
//Clicking on "Search" button		
		FlightsTab_PageClass_Expedia.clickOnSearchButton(driver);
		
//Displaying the title of page which shown up after clicking on "Search" button.		
		System.out.println("Page title of Search result: "+FlightsTab_PageClass_Expedia.driverGetInstance(driver).getTitle());
		Thread.sleep(3000);
						
		
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
		
	}
	


}
