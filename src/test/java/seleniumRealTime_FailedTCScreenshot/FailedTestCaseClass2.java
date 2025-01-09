package seleniumRealTime_FailedTCScreenshot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
public class FailedTestCaseClass2 extends BaseTest {

	@BeforeMethod
	public void beforeMethod() {
		initialization();

	}

	@Test
	public void test21() {
		System.out.println("Test21 failed");
		Assert.assertEquals(false, true);
	}

	@Test
	public void test22() {
		System.out.println("Test22 passed");
		Assert.assertEquals(true, true);
	}


	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
