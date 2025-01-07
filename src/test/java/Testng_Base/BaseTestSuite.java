package Testng_Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseTestSuite {

	@BeforeClass
	public void beforeClass() {
		System.out.println("BaseTestSuite->Before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("BaseTestSuite->After class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BaseTestSuite->Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("BaseTestSuite->After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BaseTestSuite->Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("BaseTestSuite->After Suite");
	}

}
