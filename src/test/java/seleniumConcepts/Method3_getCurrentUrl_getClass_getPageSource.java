package seleniumConcepts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//getCurrentUrl();, getClass();, getPageSource();
public class Method3_getCurrentUrl_getClass_getPageSource {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
}

	@Test
	public void test() throws InterruptedException {
// to get the URL of the page currently loaded in the browser.
			String getCurrenUrl= driver.getCurrentUrl();
			System.out.println("Currrent url is: "+getCurrenUrl);
			
//Returns the runtime class of this Object. 
//The returned Class object is the object that is locked by static synchronized methods of the represented class.			
			System.out.println("Runtime class of this Object: "+driver.getClass());

//The source of the current page.(returns the DOM page structure i.e. html & JavaScript code)			
			String getPageSource=driver.getPageSource();
			System.out.println("DOM structure of current page: "+getPageSource);
			
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
