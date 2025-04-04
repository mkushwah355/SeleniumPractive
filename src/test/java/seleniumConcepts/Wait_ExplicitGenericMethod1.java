package seleniumConcepts;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Using Explicit wait generic method in this test case
public class Wait_ExplicitGenericMethod1 {
	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com";
	Wait_ExplicitGenericMethod2 EGM;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	public void test() {
		
		WebElement homeLoginButton= driver.findElement(By.xpath("//a[@href='/login']"));
		homeLoginButton.click();
		
//Explicit wait(Below) without generic method	
/*		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("test@email.com");*/
		
//Using explicit wait generic method for email field which should be available after 5 sec.		
//Create object to call the method of "Wait_ExplicitGenericMethod2"	class generic methods
		EGM= new  Wait_ExplicitGenericMethod2(driver);
		WebElement email= EGM.getExplicitWait(By.id("email"),5);
		email.sendKeys("test@email.com");
	
		
		
		WebElement password= driver.findElement(By.xpath("//input[@id='login-password']"));
		password.sendKeys("abcabc");
		WebElement loginButton= driver.findElement(By.id("login"));
		loginButton.click();
	}
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
