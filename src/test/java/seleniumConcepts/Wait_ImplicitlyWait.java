package seleniumConcepts;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Wait_ImplicitlyWait {
	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com";

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Test
	public void testMethod() throws InterruptedException {
		
		WebElement homeLoginButton= driver.findElement(By.xpath("//a[@href='/login']"));
		homeLoginButton.click();
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("test@email.com");
		WebElement password= driver.findElement(By.xpath("//input[@id='login-password']"));
		password.sendKeys("abcabc");
		WebElement loginButton= driver.findElement(By.id("login"));
		loginButton.click();
		Thread.sleep(5000);
		WebElement myCourseTitle= driver.findElement(By.xpath("//h1[@class='dynamic-heading']"));
		String actualMyCourseTitle= myCourseTitle.getText();
		Assert.assertEquals(actualMyCourseTitle, "My Courses");

	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
