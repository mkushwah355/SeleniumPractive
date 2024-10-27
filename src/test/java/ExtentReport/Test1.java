package ExtentReport;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

 class Test1 {
	
	WebDriver driver;
	String baseUrl;
	ExtentReports report;
	ExtentTest test;
	
	
	@BeforeClass
	public void beforeClass() {
		baseUrl = "http://www.letskodeit.com/";
		report = ExtentReport_Instance.getInstance();
		test = report.startTest("Test1 ->Verify Welcome Text");
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Browser Started...");

//Browser started
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// Web Application opened		
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web application opened");
	}
	

	@Test
	public void test1_validLoginTest() throws InterruptedException {
//Clicked on signup link		
		WebElement signUpLink = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
		signUpLink.click();
		test.log(LogStatus.INFO, "Clicked on signup link");
//Failing the test case with wrong email id			
		WebElement emailField = driver.findElement(By.xpath("//form[@name='loginform']//input[@id='email']"));
		emailField.sendKeys("test1@email.com");
		test.log(LogStatus.INFO, "Enter email");
//Enter password
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='login-password']"));
		passwordField.sendKeys("abcabc");
		test.log(LogStatus.INFO, "Enter password");
//Clicked loginButton		
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='login']"));
		loginButton.click();
		test.log(LogStatus.INFO, "Clicked loginButton");
		
//Verify Welcome Text	
		
		WebElement welcomeText= driver.findElement(By.xpath("//h1[@class='dynamic-heading']"));
		Assert.assertTrue(welcomeText !=null);
		test.log(LogStatus.PASS, "Verify Welcome Text");
		
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) throws IOException {		
		
		if (testResult.getStatus() == ITestResult.FAILURE) {
			String path = Screenshots1.takeScreenshot(driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "Verify Welcome Text Failed", imagePath);
		}
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}
