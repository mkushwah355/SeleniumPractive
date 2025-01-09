package seleniumRealTime_FailedTCScreenshot;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class FailedTestCaseClass1 extends BaseTest {

	@BeforeMethod
	public void beforeMethod() {
		initialization();
	}

	@Test
	public void test11() {
		System.out.println("Test11 failed");
		Assert.assertEquals(false, true);
	}

	@Test
	public void test12() {
		System.out.println("Test12 failed");
		Assert.assertEquals(false, true);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
