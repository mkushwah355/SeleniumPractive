package seleniumRealTime_FailedTCScreenshot;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class verifyPageTitle extends BaseTest {
	@BeforeMethod
	public void beforeMethod() {
		initialization();
	}

	@Test
	public void test31() {
		String title= driver.getTitle();
		//System.out.println(title);
		Assert.assertEquals(title, "Google");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
