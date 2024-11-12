package seleniumConcepts;

//Navigating b/w pages with forward(),back() & refresh() method.

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigatingBetweenPages {
	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/home";
		
	@BeforeMethod	
	public void setUp() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();		
	}
	@Test
	public void test() throws InterruptedException {		
		driver.get(baseUrl);
		String title= driver.getTitle();
		System.out.println("Title of the page is: " + title);
		
		String currentUrl= driver.getCurrentUrl();
		System.out.println("Current url of the page is: " + currentUrl);
		
		Thread.sleep(2000);
		String url= "https://www.letskodeit.com/courses";
		driver.navigate().to(url);
		System.out.println("Navigating To courses");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current url of the page is: " + currentUrl);
		
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Navigate Back");
		currentUrl= driver.getCurrentUrl();
		System.out.println("Current url of the page is: " + currentUrl);
		
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Navigate Forward");
		currentUrl= driver.getCurrentUrl();
		System.out.println("Current url of the page is: " + currentUrl);
		
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Navigate Back");
		currentUrl= driver.getCurrentUrl();
		System.out.println("Current url of the page is: " + currentUrl);
		
		driver.navigate().refresh();
		System.out.println("Navigate Refresh");
		driver.get(currentUrl);
		System.out.println("Navigate Refresh");
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}	
	@AfterMethod
	
	public void cleanUp() {
		driver.quit();
		
	}

}

	
	
	