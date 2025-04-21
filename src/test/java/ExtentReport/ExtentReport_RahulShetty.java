package ExtentReport;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport_RahulShetty {
	ExtentReports extent;

	@BeforeTest
	public void config() {
		String path = System.getProperty("user.dir") + "\\ExtentReport\\RahulShetty_Report.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Mayank Web Automation Results");
		reporter.config().setDocumentTitle("Mayank Test Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mayank");
	}

	@Test
	public void testMethod1() {

		ExtentTest test = extent.createTest("Mayank Test case");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("Intentionaly failing");

		extent.flush();

	}

}
