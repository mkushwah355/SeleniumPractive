package selenium_PageObjectModel_Expedia;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//It is a test case of "Packages" tab of "Expedia" website. 
//Navigating to website and filling the "Leaving from" and "Going to" input fields and clicking on "Search" button and getting the title of page.
//"Packages" tab element reusable methods created in "Packages_ExpediaPage_FindBy" page class.
//If creating test case in another package then we need to first import the class into the test case like "import seleniumPages.classes_PageObjectModel.Packages_ExpediaPage_FindBy" statement.

public class PackagesTab_TestCase1_Expedia {

	WebDriver driver;
	String baseUrl = "https://www.expedia.co.in/";
	PackagesTab_PageClass_FindBy_Expedia packagesTab;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
}

	@Test
	public void test() throws InterruptedException {
		packagesTab= new PackagesTab_PageClass_FindBy_Expedia(driver);
		
		packagesTab.clickPackagesTab();
		packagesTab.leavingFromButton.click();
		packagesTab.fillLeavingFromInput.sendKeys("New York");
		packagesTab.fillLeavingFromInput.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		packagesTab.goingToButton.click();
		packagesTab.fillGoingToInput.sendKeys("Chicago");
		packagesTab.fillGoingToInput.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		packagesTab.clickSearchButton();
		Thread.sleep(3000);
		System.out.println("Page title of Search result: "+packagesTab.getDriver(driver).getTitle());		
		
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
		
	}
	


}
